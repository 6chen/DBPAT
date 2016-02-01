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
    protected String rlId;
    protected Integer isptRlt;
    protected String jbIsptEdTm;
    protected String jbIsptStTm;

    @Override
    public String toString() {
        return "JobIsptDtlPo{" +
                "bizAreaId='" + bizAreaId + '\'' +
                ", jbId='" + jbId + '\'' +
                ", trgtId='" + trgtId + '\'' +
                ", jbExecCnt=" + jbExecCnt +
                ", sqlId='" + sqlId + '\'' +
                ", rlId='" + rlId + '\'' +
                ", isptRlt=" + isptRlt +
                ", jbIsptEdTm='" + jbIsptEdTm + '\'' +
                ", jbIsptStTm='" + jbIsptStTm + '\'' +
                '}';
    }

    public String getBizAreaId() {
        return bizAreaId;
    }

    public void setBizAreaId(String bizAreaId) {
        this.bizAreaId = bizAreaId;
    }

    public Integer getIsptRlt() {
        return isptRlt;
    }

    public void setIsptRlt(Integer isptRlt) {
        this.isptRlt = isptRlt;
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

    public String getJbIsptEdTm() {
        return jbIsptEdTm;
    }

    public void setJbIsptEdTm(String jbIsptEdTm) {
        this.jbIsptEdTm = jbIsptEdTm;
    }

    public String getJbIsptStTm() {
        return jbIsptStTm;
    }

    public void setJbIsptStTm(String jbIsptStTm) {
        this.jbIsptStTm = jbIsptStTm;
    }

    public String getRlId() {
        return rlId;
    }

    public void setRlId(String rlId) {
        this.rlId = rlId;
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
