package com.dbpat.springmvc.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by YUSIN on 16/1/25.
 */
@Component
public class CollectJobExecDetailPo {
    protected String jbId;
    protected Integer jbExecCnt;
    protected String bizAreaId;
    protected String bizAreaNm;
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
    protected String clctTabId;
    protected String clctTabNm;
    protected String jbItmExecStTm;
    protected String jbItmExecEdTm;


    @Override
    public String toString() {
        return "CollectJobExecDetailPo{" +
                "bizAreaId='" + bizAreaId + '\'' +
                ", jbId='" + jbId + '\'' +
                ", jbExecCnt=" + jbExecCnt +
                ", bizAreaNm='" + bizAreaNm + '\'' +
                ", trgtId='" + trgtId + '\'' +
                ", trgtNm='" + trgtNm + '\'' +
                ", clctTabId='" + clctTabId + '\'' +
                ", clctTabNm='" + clctTabNm + '\'' +
                ", jbItmExecStTm='" + jbItmExecStTm + '\'' +
                ", jbItmExecEdTm='" + jbItmExecEdTm + '\'' +
                '}';
    }

    public String getBizAreaId() {
        return bizAreaId;
    }

    public void setBizAreaId(String bizAreaId) {
        this.bizAreaId = bizAreaId;
    }

    public String getBizAreaNm() {
        return bizAreaNm;
    }

    public void setBizAreaNm(String bizAreaNm) {
        this.bizAreaNm = bizAreaNm;
    }

    public String getClctTabId() {
        return clctTabId;
    }

    public void setClctTabId(String clctTabId) {
        this.clctTabId = clctTabId;
    }

    public String getClctTabNm() {
        return clctTabNm;
    }

    public void setClctTabNm(String clctTabNm) {
        this.clctTabNm = clctTabNm;
    }

    public Integer getJbExecCnt() {
        return jbExecCnt;
    }

    public void setJbExecCnt(Integer jbExecCnt) {
        this.jbExecCnt = jbExecCnt;
    }

    public String getJbId() {
        return jbId;
    }

    public void setJbId(String jbId) {
        this.jbId = jbId;
    }

    public String getJbItmExecEdTm() {
        return jbItmExecEdTm;
    }

    public void setJbItmExecEdTm(String jbItmExecEdTm) {
        this.jbItmExecEdTm = jbItmExecEdTm;
    }

    public String getJbItmExecStTm() {
        return jbItmExecStTm;
    }

    public void setJbItmExecStTm(String jbItmExecStTm) {
        this.jbItmExecStTm = jbItmExecStTm;
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

    public String getTrgtTyp() {
        return trgtTyp;
    }

    public void setTrgtTyp(String trgtTyp) {
        this.trgtTyp = trgtTyp;
    }

    public String getUsrId() {
        return usrId;
    }

    public void setUsrId(String usrId) {
        this.usrId = usrId;
    }
}
