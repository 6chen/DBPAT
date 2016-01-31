package com.dbpat.springmvc.model;

import org.springframework.stereotype.Component;

/**
 * Created by YUSIN on 16/1/31.
 */
@Component
public class OraSqlPo {
    private String sqlId;
    private String sqlText;

    public String getSqlId() {
        return sqlId;
    }

    public void setSqlId(String sqlId) {
        this.sqlId = sqlId;
    }

    public String getSqlText() {
        return sqlText;
    }

    public void setSqlText(String sqlText) {
        this.sqlText = sqlText;
    }

    @Override
    public String toString() {
        return "OraSqlPo{" +
                "sqlId='" + sqlId + '\'' +
                ", sqlText='" + sqlText + '\'' +
                '}';
    }
}
