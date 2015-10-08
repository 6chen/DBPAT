package com.dbpat.util;

import com.dbpat.mvc.model.DbmsTypePerClctTab;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.List;
import java.util.Map;

@Component
public class SchemaCollector {
    public void schemaCollect(Map<String, Object> collectParm) throws SQLException {
        String bizAreaId = (String) collectParm.get("bizAreaId");
        String trgtId = (String) collectParm.get("trgtId");
        Connection sourceConn = (Connection) collectParm.get("sourceConn");
        Connection targetConn = (Connection) collectParm.get("targetConn");
        String schema = (String) collectParm.get("schema");
        List<DbmsTypePerClctTab> dbmsTypePerClctTabs = (List<DbmsTypePerClctTab>) collectParm.get("dbmsTypePerClctTabs");

        for (DbmsTypePerClctTab dbmsTypePerClctTab : dbmsTypePerClctTabs){
            String exportSql = dbmsTypePerClctTab.getExportSql();
            String importSql = dbmsTypePerClctTab.getImportSql();

            PreparedStatement exportStmt = sourceConn.prepareStatement(exportSql);
            PreparedStatement importStmt = targetConn.prepareStatement(importSql);

            exportStmt.setObject(1, schema);

            ResultSet resultSet = exportStmt.executeQuery();

            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
            int columnCount = resultSetMetaData.getColumnCount();

            while(resultSet.next()){
                importStmt.setObject(1, bizAreaId);
                importStmt.setObject(2, trgtId);

                for (int j = 0; j < columnCount; j++) {
                    importStmt.setObject(j+3, resultSet.getObject(j+1));
                }

                importStmt.addBatch();
            }

            importStmt.executeBatch();
            targetConn.commit();
        }

        targetConn.close();
        sourceConn.close();
        System.out.println("=====Complelete=====");
    }

}
