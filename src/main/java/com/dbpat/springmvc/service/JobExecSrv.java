package com.dbpat.springmvc.service;

import com.dbpat.springmvc.mapper.DbmsTypeClctTabMpr;
import com.dbpat.springmvc.mapper.JobExecMpr;
import com.dbpat.springmvc.mapper.RuleMpr;
import com.dbpat.springmvc.model.*;
import com.dbpat.util.InspectJob;
import com.dbpat.util.oraispt.Inspector;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by YUSIN on 16/1/21.
 */
@Service
public class JobExecSrv {

    @Autowired
    JobExecMpr jobExecMpr;

    @Autowired
    DbmsTypeClctTabMpr dbmsTypeClctTabMpr;

    @Autowired
    SqlSessionFactory sqlSessionFactory;

    @Autowired
    RuleMpr ruleMpr;

    public ExecJobVo findExecJobVoByJbId(String jbId) {
        return jobExecMpr.selectExecJobVoByJbId(jbId);
    }

//    public List<ExecJobVo> findExecJobVoByJbTyp(String jbTyp){
//        return jobExecMpr.selectExecJobVoByJbTyp(jbTyp);
//    }

    public DbmsTypeVo findDbmsTypeVoByDbmsTypId(String dbmsTypId) {
        return dbmsTypeClctTabMpr.selectDbmsTypeVoByDbmsTypId(dbmsTypId);
    }

    public List<JobExecHistVo> findJobALlHistByJbId(String jbId) {
        return jobExecMpr.selectJobALlHistByJbId(jbId);
    }

    public List<JobExecHistVo> findJobPerHistByJbBizTrgtId(Map<String, Object> prmtMap) {
        return jobExecMpr.selectJobPerHistByJbBizTrgtId(prmtMap);
    }

    public List<CollectJobExecDetailPo> findCollectJobExecDetailPo(Map<String, Object> prmtMap) {
        System.out.println(prmtMap.get("jbId"));

        return jobExecMpr.selectCollectJobExecDetailPo(prmtMap);
    }

    public boolean startCollectJobByJbId(String jbId) {
        ExecJobVo collectJobExecVo = jobExecMpr.selectExecJobVoByJbId(jbId);

        Map<String, Object> prmtMap = new HashMap<String, Object>();
        prmtMap.put("jbId", collectJobExecVo.getJbId());

        //작업 중에 모든 대상업 가져와서 반복 출력
        for (ExecJobTargetVo execJobTargetVo : collectJobExecVo.getExecJobTargetVoList()) {

            //타켓 디비 연결 생성
            SqlSession curSqlSession = sqlSessionFactory.openSession();
            Connection targetConn = curSqlSession.getConnection();

            prmtMap.put("bizAreaId", execJobTargetVo.getBizAreaPo().getBizAreaId());
            prmtMap.put("trgtId", execJobTargetVo.getTrgtId());
            prmtMap.put("schema", execJobTargetVo.getSchm());

            //작업 실행 이력에서 작업을 실행한 적이 있는지를 조회한 수 값을 저장
            Integer execCnt = jobExecMpr.selectJobExecHistCnt(prmtMap);

            System.out.println(execCnt);

            //만약에 처음으로 실행하는 작업이라면 실행 차수를 1로 정의함
            //만약에 처음으로 실행하는 작업이 아니라면 실행 차수를 (실행했던 횟수 + 1)로 정의함
            Integer jbExecCnt = (execCnt == 0) ? 1 : execCnt + 1;
            prmtMap.put("jbExecCnt", jbExecCnt);

            //본 작업 대상의 수집 작업의  시작하는 시간을 로깅
            jobExecMpr.insertNewJobWithStTm(prmtMap);

            //수집 대상 디비 연결 드라이버 정보 및 수집할 테이블들을 가져오기
            DbmsTypeVo dbmsTypeVo = dbmsTypeClctTabMpr.selectDbmsTypeVoByDbmsTypId(execJobTargetVo.getDbmsTypId());


            //소스 디비 연결 생성
            String url = "";
            Connection sourceConn = null;
            if ("ORACLE".equals(dbmsTypeVo.getDbmsTypNm())) {
                url = "jdbc:oracle:thin:@" + execJobTargetVo.getIp() + ":" + execJobTargetVo.getPrt() + ":" + execJobTargetVo.getSid();
            }

            try {
                Class.forName(dbmsTypeVo.getDbmsDrv());
                sourceConn = DriverManager.getConnection(url, execJobTargetVo.getUsrId(), execJobTargetVo.getPw());

                //DBMS테이블에 따라 수집해야 할 테이블의 리스트를 가져오기
                List<DbmsTypePerClctTabVo> dbmsTypePerClctTabVoList = dbmsTypeVo.getDbmsTypePerClctTabVoList();

                //수집할 테이블 리스트를 루프
                for (DbmsTypePerClctTabVo dbmsTypePerClctTabVo : dbmsTypePerClctTabVoList) {

                    //하나의 리스트 중에서 수집할 테이블의 객체를 하나씩 가지고 있다. 그 객체를 가져온다.
                    CollectTabPo collectTabPo = dbmsTypePerClctTabVo.getCollectTabPo();
                    prmtMap.put("jbExecItmId", collectTabPo.getClctTabId());

                    //수집 테이블 리스트 중에 해당 테이블 수집작업을 시작할 때 하는 로깅
                    jobExecMpr.insertNewJobExecItmStTm(prmtMap);

                    //수집 테이블 객체안에 저장되어 있는 테이블의 이행 스크립트를 가져온다.
                    String exportSql = collectTabPo.getExportSql();
                    String importSql = collectTabPo.getImportSql();

//                    System.out.println(collectTabPo.getClctTabNm() + " --> 시작");


                    //이행(소스 디비에서 추출하고 타켓 디비에 삽입하는)과정의 핵심 코드 부분
                    try {
                        //실행할 SQL문장을 준비
                        PreparedStatement exportStmt = null;
                        exportStmt = sourceConn.prepareStatement(exportSql);
                        PreparedStatement importStmt = targetConn.prepareStatement(importSql);

                        //소스 디비를 추출하는 스크립트에서 추출할 스키마 바인드변수를 설정
                        exportStmt.setObject(1, execJobTargetVo.getSchm().toUpperCase());
                        //소스 디비에서 추출하는 스크립트를 실행하여 결과 집합을 가져온다.
                        ResultSet resultSet = exportStmt.executeQuery();

                        //결과 집합의 메타정보를 가져와서 결과집합의 컬럼 개수를 얻어 놓고
                        //컬럼 개수를 얻어오는 이유:
                        //나중에 타켓 디비에 삽입하는 문장에서 루르 돌면서 INSERT INTO <TABLE_NAME> VALUES(?,?,.....)부분의 바이드 변수를 차례대로 설정해 주기 위함이다
                        ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
                        int columnCount = resultSetMetaData.getColumnCount();

                        int batchRows = 0;
                        while (resultSet.next()) {
                            //결과집합을 한건씩 읽어오면서 타켓 디비로 삽입하는 INSERT의 바이드변수를 설정한다
                            //처음에 설정하는 두 개 바이드 변수는 고정적인 거라서 그냥 넣어준다.
                            importStmt.setObject(1, collectJobExecVo.getJbId());
                            importStmt.setObject(2, execJobTargetVo.getBizAreaPo().getBizAreaId());
                            importStmt.setObject(3, execJobTargetVo.getTrgtId());
                            importStmt.setObject(4, jbExecCnt);

                            //5번째부터 앞서 얻어온 결과 집합의 컬럼 개수를 이용해서 순서대로 반복 설정한다.
                            for (int j = 0; j < columnCount; j++) {
                                //여기서 j+5의 이유는 앞에 4개 변수의 값이 고정적인 거라서 미리 설정했고, 여기서 6번째부터 설정
                                importStmt.setObject(j + 5, resultSet.getObject(j + 1));
                            }

                            //바인드 변수 값을 설정한 후에 배치에 넣어서 나중에 배치 방식으로 디비에게 보내준다.
                            //유저 콜 때문에 발생하는 성능 문제를 해소하기 위함.
                            importStmt.addBatch();
                            if (++batchRows%200 == 0 ) importStmt.executeBatch();
                        }
                        resultSet.close();
                        exportStmt.close();

                        importStmt.executeBatch();
                        importStmt.close();

                        targetConn.commit();
                        targetConn.setAutoCommit(true);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }

                    //여기까지 한 테이블의 정보를 수집 완료
                    //수집 테이블 리스트 중에 해당 테이블 수집작업을 시작할 때 하는 로깅
                    jobExecMpr.updateNewJobExecItmEdTm(prmtMap);

//                    System.out.println(collectTabPo.getClctTabNm());
                }

                //여기까지 모든 테이블의 정보를 수집 완료
                targetConn.close();
                sourceConn.close();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            // 여기까지 작업 안에 있는 하나의 대상에 대해서 모든 수집 작업 완료
            //본 작업 대상의 수집 작업의 종료하는 시간을 로깅
            jobExecMpr.updateNewJobEdTm(prmtMap);
        }



        //여기까지 모든 작업 수행완료
        return true;
    }

    public boolean startInspectJobByJbId(String jbId) {

        //검사작업은
        ExecJobVo inspectJobExecVo = jobExecMpr.selectExecJobVoByJbId(jbId);

        System.out.println(inspectJobExecVo);

        Map<String, Object> prmtMap = new HashMap<String, Object>();
        prmtMap.put("jbId", inspectJobExecVo.getJbId());

        //모든 검사규칙을 가져옴
        //모든 규칙에 대해서 분류하며 쿼리 프로세스 규칙 리스트 및 파싱 프로세스 규칙 리스트를 생성한 후에 Inspector에게 전달
        //그 이유는 : 하나의 SQL에 대해서 한 번만 파싱하여 파스 트리에 대해서 여러 개 규칙을 적용하기 위함이다.
        List<RulePo> queryProcessRulePoList = ruleMpr.selectQueryRuleByJbId(jbId);
        List<RulePo> parseProcessRulePoList = ruleMpr.selectInspectRuleByJbId(jbId);

        System.out.println("queryProcessRulePoList = " + queryProcessRulePoList);
        System.out.println("parseProcessRulePoList = " + parseProcessRulePoList);

        Inspector inspector = new Inspector();

        System.out.println(inspector);

        //작업 중에 모든 대상업 가져와서 반복 출력
        for (ExecJobTargetVo execJobTargetVo : inspectJobExecVo.getExecJobTargetVoList()) {
            prmtMap.put("bizAreaId", execJobTargetVo.getBizAreaPo().getBizAreaId());
            prmtMap.put("trgtId", execJobTargetVo.getTrgtId());
            prmtMap.put("schema", execJobTargetVo.getSchm());

            //작업 실행 이력에서 작업을 실행한 적이 있는지를 조회한 수 값을 저장
            Integer execCnt = jobExecMpr.selectJobExecHistCnt(prmtMap);

//            System.out.println(execCnt);

            //만약에 처음으로 실행하는 작업이라면 실행 차수를 1로 정의함
            //만약에 처음으로 실행하는 작업이 아니라면 실행 차수를 (실행했던 횟수 + 1)로 정의함
            Integer jbExecCnt = (execCnt == 0) ? 1 : execCnt + 1;
            prmtMap.put("jbExecCnt", jbExecCnt);

            //본 작업 대상의 수집 작업의  시작하는 시간을 로깅
//            jobExecMpr.insertNewJobWithStTm(prmtMap);

            if (queryProcessRulePoList != null) {
                prmtMap.put("queryProcessRulePoList", queryProcessRulePoList);
//                inspector.setPrmtMap(prmtMap);
//            inspector.doUseQueryProcess();
            }

            if (parseProcessRulePoList != null) {
                prmtMap.put("parseProcessRulePoList", parseProcessRulePoList);
//                inspector.setPrmtMap(prmtMap);
                //            inspector.doUseParseProcess();
            }


            // 여기까지 작업 안에 있는 하나의 대상에 대해서 모든 수집 작업 완료
            //본 작업 대상의 수집 작업의 종료하는 시간을 로깅
//            jobExecMpr.updateNewJobEdTm(prmtMap);
        }

        //여기까지 모든 작업 수행완료

        return true;
    }

}
