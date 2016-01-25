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
}
