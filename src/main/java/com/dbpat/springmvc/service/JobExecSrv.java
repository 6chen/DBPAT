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
//        System.out.println(prmtMap.get("jbId"));

        return jobExecMpr.selectCollectJobExecDetailPo(prmtMap);
    }

    public List<OraSqlPo> findSqlPo(Map<String, Object> prmtMap) {
        return jobExecMpr.selectSqlPo(prmtMap);
    }

    public List<JobIsptDtlVo> findViolatedRtl(Map<String, Object> prmtMap){
        return jobExecMpr.selectViolatedRtl(prmtMap);
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
                            if (++batchRows % 200 == 0) importStmt.executeBatch();
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

        // 입력받은 작업 아이디를 통해서 작업에 관련된 모든 정보를 가져옴
        ExecJobVo inspectJobExecVo = jobExecMpr.selectExecJobVoByJbId(jbId);

//        System.out.println(inspectJobExecVo);

        //맵을 하나 생성하여 나중에 처리할 때 필요한 값을 저장하여 전달해 주도록 함
        Map<String, Object> prmtMap = new HashMap<String, Object>();
        prmtMap.put("jbId", inspectJobExecVo.getJbId());

        //모든 검사규칙을 가져옴
        //모든 규칙에 대해서 분류하며 쿼리 프로세스 규칙 리스트 및 파싱 프로세스 규칙 리스트를 생성한 후에 Inspector에게 전달
        //그 이유는 : 하나의 SQL에 대해서 한 번만 파싱하여 파스 트리에 대해서 여러 개 규칙을 적용하기 위함이다.
        List<RulePo> queryProcessRulePoList = ruleMpr.selectQueryRuleByJbId(jbId);
        List<RulePo> parseProcessRulePoList = ruleMpr.selectInspectRuleByJbId(jbId);

//        System.out.println("queryProcessRulePoList = " + queryProcessRulePoList);
//        System.out.println("parseProcessRulePoList = " + parseProcessRulePoList);

        //검사를 하기 위해 인스펙터를 생성함
        Inspector inspector = new Inspector();

//        System.out.println(inspector);

        //작업의 모든 대상을 가져와서 반복 출력하면서 인스펙터에게 잔달함
        for (ExecJobTargetVo execJobTargetVo : inspectJobExecVo.getExecJobTargetVoList()) {
            prmtMap.put("bizAreaId", execJobTargetVo.getBizAreaPo().getBizAreaId());
            prmtMap.put("trgtId", execJobTargetVo.getTrgtId());
            prmtMap.put("schema", execJobTargetVo.getSchm());

            //작업 실행 이력에서 작업을 실행한 적이 있는지를 조회한 수 값을 저장
            //만약에 처음으로 실행하는 작업이라면 실행 차수를 1로 정의함
            //만약에 처음으로 실행하는 작업이 아니라면 실행 차수를 (실행했던 횟수 + 1)로 정의함
            Integer execCnt = jobExecMpr.selectJobExecHistCnt(prmtMap);
            Integer jbExecCnt = (execCnt == 0) ? 1 : execCnt + 1;
            prmtMap.put("jbExecCnt", jbExecCnt);

            //본 작업 대상의 검사 작업의  시작하는 시간을 로깅
            jobExecMpr.insertNewJobWithStTm(prmtMap);

            // 쿼리 프로세스 및 파싱 프로세스 작업하는 방식이 따르기 때문에 등록된 규칙집합이 있는지를 따로 체크한 후에
            // 인스펙스 안에 해당 메서드를 호출함
            if (queryProcessRulePoList != null) {
                for (RulePo queryProcessRulePo : queryProcessRulePoList) {

                    //지금 검사하려고 할 규칙의 규칙 아이디를 가져옴
//                    prmtMap.put("jbExecItmId", queryProcessRulePo.getRlId());
                    //규칙에 대해서 검사 작업시작할 때 하는 로깅
//                    jobExecMpr.insertNewJobExecItmStTm(prmtMap);

                    prmtMap.put("queryProcessRulePo", queryProcessRulePo);
                    inspector.setPrmtMap(prmtMap);
                    Integer successYn = 0;
                    //수행 성공 여부 값에 의하여 성공인지 실폐인지를 로그 기록하는 용도다.
                    //그렇지만 여기서 가져오긴 하지만 쿼리 프로세스가 해당 규칙의 로직 SQL를 수행하여 검사하기 때문에
                    //수행 이력을 SQL로 바로 기록하기 때문에 여기서 다른 처리를 하지 않는다.
                    //혹시 나중에 처리할 필요가 있으면 잠시 나둔다.
                    successYn = inspector.doUseQueryProcess();

                    System.out.println(successYn);
                }
//                prmtMap.put("queryProcessRulePoList", queryProcessRulePoList);

//                prmtMap.remove("queryProcessRulePo");
            }

            if (parseProcessRulePoList != null) {
//                prmtMap.put("parseProcessRulePoList", parseProcessRulePoList);
                //파싱 프로세스의 대상은 SQL이기 때문에 인스팩터에게 수집한 SQL리스트도 같이 전달해 줘야 됨.
                List<OraSqlPo> oraSqlPoList = jobExecMpr.selectSqlPo(prmtMap);

                //SQL리스트 안에 있는 모든 SQL를 하나씩 꺼내면서 변수 맵에 넣어서 인스펙트 변수맵을 설정한 후에 검사한다.
                //선정된 모든 검사 규칙 리스트도 같이 넣었기 때문에 SQL하나씩 해당 규칙을 적용할 거이다.
                for (OraSqlPo oraSqlPo : oraSqlPoList) {
                    prmtMap.put("sqlId", oraSqlPo.getSqlId());
                    prmtMap.put("sqlString", oraSqlPo.getSqlText());
                    for (RulePo parseProcessRulePo : parseProcessRulePoList) {
                        prmtMap.put("parseProcessRulePo", parseProcessRulePo);
                        prmtMap.put("rlId", parseProcessRulePo.getRlId());

                        jobExecMpr.insertJobIsptDtlStTm(prmtMap);
                        inspector.setPrmtMap(prmtMap);
                        Integer isptRlt = 0;
                        isptRlt = inspector.doUseParseProcess();
                        prmtMap.put("isptRlt", isptRlt);
                        jobExecMpr.updateJobIsptDtlEdTm(prmtMap);

                        //결과에 따라 로그를 기록함.
                        //결과 개수가 0이면 해당 규칙을 준수한 것이다.
                        //결과 개수가 0보다 크면 해당 규칙을 위배한 항목이 있다는 것이다.

                        System.out.println(oraSqlPo.getSqlText());
                        System.out.println(parseProcessRulePo.getRlNm());
                        System.out.println(isptRlt);

                        System.out.println("======================");
                    }

                }
            }


            //본 작업 대상의 검사 작업의 종료하는 시간을 로깅
            jobExecMpr.updateNewJobEdTm(prmtMap);
        }

        //여기까지 모든 작업 수행완료

        return true;
    }

}
