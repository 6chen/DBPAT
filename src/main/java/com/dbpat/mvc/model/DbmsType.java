package com.dbpat.mvc.model;

import org.springframework.stereotype.Component;

@Component
public class DbmsType {
    private String dbmsTypId;
    private String dbmsTypNm;
    private String dbmsVer;
    private String dbmsDrv;

    public String getDbmsTypId() {
        return dbmsTypId;
    }

    public void setDbmsTypId(String dbmsTypId) {
        this.dbmsTypId = dbmsTypId;
    }

    public String getDbmsTypNm() {
        return dbmsTypNm;
    }

    public void setDbmsTypNm(String dbmsTypNm) {
        this.dbmsTypNm = dbmsTypNm;
    }

    public String getDbmsVer() {
        return dbmsVer;
    }

    public void setDbmsVer(String dbmsVer) {
        this.dbmsVer = dbmsVer;
    }

    public String getDbmsDrv() {
        return dbmsDrv;
    }

    public void setDbmsDrv(String dbmsDrv) {
        this.dbmsDrv = dbmsDrv;
    }

    @Override
    public String toString() {
        return "DbmsType{" +
                "dbmsTypId='" + dbmsTypId + '\'' +
                ", dbmsTypNm='" + dbmsTypNm + '\'' +
                ", dbmsVer='" + dbmsVer + '\'' +
                ", dbmsDrv='" + dbmsDrv + '\'' +
                '}';
    }
}
