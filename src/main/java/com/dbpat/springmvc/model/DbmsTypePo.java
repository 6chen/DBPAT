package com.dbpat.springmvc.model;

import org.springframework.stereotype.Component;

/**
 * Created by YUSIN on 16/1/14.
 */
@Component
public class DbmsTypePo {
    protected String dbmsTypId;
    protected String dbmsTypNm;
    protected String dbmsVer;
    protected String dbmsDrv;

    @Override
    public String toString() {
        return "DbmsTypePo{" +
                "dbmsTypId='" + dbmsTypId + '\'' +
                ", dbmsTypNm='" + dbmsTypNm + '\'' +
                ", dbmsVer='" + dbmsVer + '\'' +
                ", dbmsDrv='" + dbmsDrv + '\'' +
                '}';
    }

    public String getDbmsDrv() {
        return dbmsDrv;
    }

    public void setDbmsDrv(String dbmsDrv) {
        this.dbmsDrv = dbmsDrv;
    }

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
}
