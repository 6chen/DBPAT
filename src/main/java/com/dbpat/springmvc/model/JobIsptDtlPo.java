package com.dbpat.springmvc.model;

import org.springframework.stereotype.Component;

/**
 * Created by YUSIN on 16/1/31.
 */
@Component
public class JobIsptDtlPo {
    protected String jbId;
    protected String bizAreaId;
    protected String trgtId;
    protected Integer jbExecCnt;
    protected String sqlId;
    protected String jbParsingEdTm;
    protected String jbParsingStTm;

    @Override
    public String toString() {
        return "JobIsptDtlPo{" +
                "bizAreaId='" + bizAreaId + '\'' +
                ", jbId='" + jbId + '\'' +
                ", trgtId='" + trgtId + '\'' +
                ", jbExecCnt=" + jbExecCnt +
                ", sqlId='" + sqlId + '\'' +
                ", jbParsingEdTm='" + jbParsingEdTm + '\'' +
                ", jbParsingStTm='" + jbParsingStTm + '\'' +
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

    public String getJbId() {
        return jbId;
    }

    public void setJbId(String jbId) {
        this.jbId = jbId;
    }

    public String getJbParsingEdTm() {
        return jbParsingEdTm;
    }

    public void setJbParsingEdTm(String jbParsingEdTm) {
        this.jbParsingEdTm = jbParsingEdTm;
    }

    public String getJbParsingStTm() {
        return jbParsingStTm;
    }

    public void setJbParsingStTm(String jbParsingStTm) {
        this.jbParsingStTm = jbParsingStTm;
    }

    public String getSqlId() {
        return sqlId;
    }

    public void setSqlId(String sqlId) {
        this.sqlId = sqlId;
    }

    public String getTrgtId() {
        return trgtId;
    }

    public void setTrgtId(String trgtId) {
        this.trgtId = trgtId;
    }
}
