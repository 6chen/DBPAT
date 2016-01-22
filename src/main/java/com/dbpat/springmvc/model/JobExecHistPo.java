package com.dbpat.springmvc.model;

import org.springframework.stereotype.Component;

/**
 * Created by YUSIN on 16/1/22.
 */
@Component
public class JobExecHistPo {
    protected String jbId;
    protected String bizAreaId;
    protected String trgtId;
    protected Integer jbExecCnt;
    protected String jbExecEd;
    protected String jbExecSt;

    @Override
    public String toString() {
        return "JobExecHistPo{" +
                "bizAreaId='" + bizAreaId + '\'' +
                ", jbId='" + jbId + '\'' +
                ", trgtId='" + trgtId + '\'' +
                ", jbExecCnt=" + jbExecCnt +
                ", jbExecEd='" + jbExecEd + '\'' +
                ", jbExecSt='" + jbExecSt + '\'' +
                '}';
    }

    public String getBizAreaId() {
        return bizAreaId;
    }

    public void setBizAreaId(String bizAreaId) {
        this.bizAreaId = bizAreaId;
    }

    public Integer getJbExecCnt() {
        return jbExecCnt;
    }

    public void setJbExecCnt(Integer jbExecCnt) {
        this.jbExecCnt = jbExecCnt;
    }

    public String getJbExecEd() {
        return jbExecEd;
    }

    public void setJbExecEd(String jbExecEd) {
        this.jbExecEd = jbExecEd;
    }

    public String getJbExecSt() {
        return jbExecSt;
    }

    public void setJbExecSt(String jbExecSt) {
        this.jbExecSt = jbExecSt;
    }

    public String getJbId() {
        return jbId;
    }

    public void setJbId(String jbId) {
        this.jbId = jbId;
    }

    public String getTrgtId() {
        return trgtId;
    }

    public void setTrgtId(String trgtId) {
        this.trgtId = trgtId;
    }
}
