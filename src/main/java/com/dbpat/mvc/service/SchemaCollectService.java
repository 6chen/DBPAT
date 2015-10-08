package com.dbpat.mvc.service;

import com.dbpat.mvc.mapper.DbmsTypePerClctTabMapper;
import com.dbpat.mvc.mapper.TargetVoMapper;
import com.dbpat.mvc.model.DbmsTypePerClctTab;
import com.dbpat.mvc.model.TargetVo;
import com.dbpat.util.SchemaCollector;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SchemaCollectService {

    @Autowired
    SqlSessionFactory sqlSessionFactory;

    @Autowired
    TargetVoMapper targetVoMapper;

    @Autowired
    DbmsTypePerClctTabMapper dbmsTypePerClctTabMapper;

    @Autowired
    SchemaCollector schemaCollector;

    private Map<String, Object> collectParm = new HashMap<String, Object>();

    public void setCollectParm(Map<String, Object> parmMap) throws ClassNotFoundException, SQLException {

        //Set Biz&Target value
        collectParm.put("bizAreaId", parmMap.get("bizAreaId"));
        collectParm.put("trgtId", parmMap.get("trgtId"));

        //Get current/target DB connection
        SqlSession curSqlSession = sqlSessionFactory.openSession();
        Connection targetConn = curSqlSession.getConnection();
        collectParm.put("targetConn", targetConn);

        //Get targetVo information
        TargetVo targetVo = targetVoMapper.selectTargetVoById(parmMap);

        //Get source DB connection
        String url = "";
        if ("ORACLE".equals(targetVo.getDbmsType().getDbmsTypNm())){
            url = "jdbc:oracle:thin:@" + targetVo.getIp() + ":" + targetVo.getPrt() + ":" + targetVo.getServ();
        }
        Class.forName(targetVo.getDbmsType().getDbmsDrv());
        Connection sourceConn = DriverManager.getConnection(url, targetVo.getUsrId(), targetVo.getPw());
        collectParm.put("sourceConn", sourceConn);

        //Set Collect Schema
        collectParm.put("schema", targetVo.getSchm());

        System.out.println(targetVo.getDbmsType().getDbmsTypNm());
        System.out.println(targetVo.getDbmsType().getDbmsDrv());
        System.out.println(targetVo.getIp());
        System.out.println(targetVo.getPrt());
        System.out.println(targetVo.getServ());
        System.out.println(targetVo.getUsrId());
        System.out.println(targetVo.getPw());
        System.out.println(url);

        List<DbmsTypePerClctTab> dbmsTypePerClctTabs =  dbmsTypePerClctTabMapper.selectAllClctTabById(targetVo.getDbmsType().getDbmsTypId());
        collectParm.put("dbmsTypePerClctTabs", dbmsTypePerClctTabs);


        for (DbmsTypePerClctTab dbmsTypePerClctTab : dbmsTypePerClctTabs){
            System.out.println(dbmsTypePerClctTab.getDbmsTypId());
            System.out.println(dbmsTypePerClctTab.getSeq());
            System.out.println(dbmsTypePerClctTab.getClctTabNm());
            System.out.println(dbmsTypePerClctTab.getExportSql());
            System.out.println(dbmsTypePerClctTab.getImportSql());
            System.out.println("------");
        }

//        PreparedStatement srcstmt = sourceConn.prepareStatement("select * from emp");
//        ResultSet rs = srcstmt.executeQuery();
//        while (rs.next()){
//            System.out.println(rs.getString("empno"));
//        }



//        BizAreaMapper bizAreaMapper = curSqlSession.getMapper(BizAreaMapper.class);
//
//        List<BizArea> bizAreas = bizAreaMapper.selectAllBizArea();
//
//        for (BizArea bizArea:bizAreas){
//            System.out.println(bizArea);
//        }
    }

    public void exeCollect() throws SQLException {
        schemaCollector.schemaCollect(collectParm);
    }
}
