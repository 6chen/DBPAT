package com.dbpat.util;

import com.dbpat.mvc.mapper.DbmsTypePerClctTabMapper;
import com.dbpat.mvc.mapper.JobTrgtHistMapper;
import com.dbpat.mvc.mapper.TargetVoMapper;
import com.dbpat.mvc.model.DbmsTypePerClctTab;
import com.dbpat.mvc.model.TargetVo;
import com.dbpat.mvc.service.SchemaJobService;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;

@Component
public class SchemaCollector {

    @Autowired
    SqlSessionFactory sqlSessionFactory;

    @Autowired
    TargetVoMapper targetVoMapper;

    @Autowired
    DbmsTypePerClctTabMapper dbmsTypePerClctTabMapper;

    @Autowired
    SchemaJobService schemaJobService;

    @Autowired
    JobTrgtHistMapper jobTrgtHistMapper;

    private Map<String, Object> collectParm = new HashMap<String, Object>();


    public void setCollector(Map<String, Object> collectorParamMap) throws ClassNotFoundException, SQLException {

        collectParm = collectorParamMap;

        //Get current/target DB connection
        SqlSession curSqlSession = sqlSessionFactory.openSession();
        Connection targetConn = curSqlSession.getConnection();
        collectParm.put("targetConn", targetConn);

        //Get targetVo information
        TargetVo targetVo = targetVoMapper.selectTargetVoById(collectorParamMap);

        //Get source DB connection
        String url = "";
        if ("ORACLE".equals(targetVo.getDbmsType().getDbmsTypNm())) {
            url = "jdbc:oracle:thin:@" + targetVo.getIp() + ":" + targetVo.getPrt() + ":" + targetVo.getServ();
        }
        Class.forName(targetVo.getDbmsType().getDbmsDrv());
        Connection sourceConn = DriverManager.getConnection(url, targetVo.getUsrId(), targetVo.getPw());
        collectParm.put("sourceConn", sourceConn);

        //Set Collect Schema
        collectParm.put("schema", targetVo.getSchm());

        List<DbmsTypePerClctTab> dbmsTypePerClctTabs = dbmsTypePerClctTabMapper.selectAllClctTabById(targetVo.getDbmsType().getDbmsTypId());
        collectParm.put("dbmsTypePerClctTabs", dbmsTypePerClctTabs);
    }

    public void doCollect() {
        String jobId = (String) collectParm.get("jbId");
        String bizAreaId = (String) collectParm.get("bizAreaId");
        String trgtId = (String) collectParm.get("trgtId");
        String jbSeq = (String) collectParm.get("jbSeq");
        Connection sourceConn = (Connection) collectParm.get("sourceConn");
        Connection targetConn = (Connection) collectParm.get("targetConn");
        String schema = (String) collectParm.get("schema");

        List<DbmsTypePerClctTab> dbmsTypePerClctTabs = (List<DbmsTypePerClctTab>) collectParm.get("dbmsTypePerClctTabs");
        try {
            for (DbmsTypePerClctTab dbmsTypePerClctTab : dbmsTypePerClctTabs) {
                collectParm.put("dbmsTypId", dbmsTypePerClctTab.getDbmsTypId());
                collectParm.put("seq", dbmsTypePerClctTab.getSeq());

                //Job Target History Start Time
                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String jbStrtTm = format.format(new Date());
                collectParm.put("jbStrtTm", jbStrtTm);

                System.out.println(jbStrtTm);

                String exportSql = dbmsTypePerClctTab.getExportSql();
                String importSql = dbmsTypePerClctTab.getImportSql();

                PreparedStatement exportStmt = null;

                exportStmt = sourceConn.prepareStatement(exportSql);

                PreparedStatement importStmt = targetConn.prepareStatement(importSql);

                exportStmt.setObject(1, schema);

                ResultSet resultSet = exportStmt.executeQuery();

                ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
                int columnCount = resultSetMetaData.getColumnCount();

                while (resultSet.next()) {
                    importStmt.setObject(1, bizAreaId);
                    importStmt.setObject(2, trgtId);

                    for (int j = 0; j < columnCount; j++) {
                        importStmt.setObject(j + 3, resultSet.getObject(j + 1));
                    }

                    importStmt.addBatch();
                }

                importStmt.executeBatch();
                targetConn.commit();

                System.out.println("--> No." + dbmsTypePerClctTab.getSeq() + ": '" + dbmsTypePerClctTab.getClctTabNm() + "' Successfully Imported!");

                //Job Target History End Time
                String jbEdTm = format.format(new Date());
                collectParm.put("jbEdTm", jbEdTm);

                System.out.println(jbEdTm);

                //Job Target History Logging
                jobTrgtHistMapper.insertSchmColctJobTrgtHist(collectParm);

            }

            targetConn.close();
            sourceConn.close();

            System.out.println("=====All Complelete=====");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
