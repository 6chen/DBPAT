package com.dbpat.springmvc.model;

import org.springframework.stereotype.Component;

/**
 * Created by YUSIN on 16/1/14.
 */
@Component
public class TargetPo {
    protected String bizAreaId;
    protected String trgtId;
    protected String trgtNm;
    protected String trgtTyp;
    protected String ip;
    protected String prt;
    protected String dbmsTypId;
    protected String usrId;
    protected String pw;
    protected String sid;
    protected String schm;
    protected String trgtStTm;
    protected String trgtUptTm;

    @Override
    public String toString() {
        return "TargetPo{" +
                "bizAreaId='" + bizAreaId + '\'' +
                ", trgtId='" + trgtId + '\'' +
                ", trgtNm='" + trgtNm + '\'' +
                ", trgtTyp='" + trgtTyp + '\'' +
                ", ip='" + ip + '\'' +
                ", prt='" + prt + '\'' +
                ", dbmsTypId='" + dbmsTypId + '\'' +
                ", usrId='" + usrId + '\'' +
                ", pw='" + pw + '\'' +
                ", sid='" + sid + '\'' +
                ", schm='" + schm + '\'' +
                ", trgtStTm='" + trgtStTm + '\'' +
                ", trgtUptTm='" + trgtUptTm + '\'' +
                '}';
    }

    public String getBizAreaId() {
        return bizAreaId;
    }

    public void setBizAreaId(String bizAreaId) {
        this.bizAreaId = bizAreaId;
    }

    public String getDbmsTypId() {
        return dbmsTypId;
    }

    public void setDbmsTypId(String dbmsTypId) {
        this.dbmsTypId = dbmsTypId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPrt() {
        return prt;
    }

    public void setPrt(String prt) {
        this.prt = prt;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getSchm() {
        return schm;
    }

    public void setSchm(String schm) {
        this.schm = schm;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getTrgtId() {
        return trgtId;
    }

    public void setTrgtId(String trgtId) {
        this.trgtId = trgtId;
    }

    public String getTrgtNm() {
        return trgtNm;
    }

    public void setTrgtNm(String trgtNm) {
        this.trgtNm = trgtNm;
    }

    public String getTrgtStTm() {
        return trgtStTm;
    }

    public void setTrgtStTm(String trgtStTm) {
        this.trgtStTm = trgtStTm;
    }

    public String getTrgtTyp() {
        return trgtTyp;
    }

    public void setTrgtTyp(String trgtTyp) {
        this.trgtTyp = trgtTyp;
    }

    public String getTrgtUptTm() {
        return trgtUptTm;
    }

    public void setTrgtUptTm(String trgtUptTm) {
        this.trgtUptTm = trgtUptTm;
    }

    public String getUsrId() {
        return usrId;
    }

    public void setUsrId(String usrId) {
        this.usrId = usrId;
    }


}
