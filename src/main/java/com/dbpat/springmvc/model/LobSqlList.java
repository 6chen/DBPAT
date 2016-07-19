package com.dbpat.springmvc.model;

import org.springframework.stereotype.Component;

/**
 * Created by YUSIN on 16/4/17.
 */
@Component
public class LobSqlList {
    private String sqlString;

    @Override
    public String toString() {
        return "LobSqlList{" +
                "sqlString='" + sqlString + '\'' +
                '}';
    }

    public String getSqlString() {
        return sqlString;
    }

    public void setSqlString(String sqlString) {
        this.sqlString = sqlString;
    }
}
