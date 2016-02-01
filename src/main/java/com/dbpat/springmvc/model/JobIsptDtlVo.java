package com.dbpat.springmvc.model;

import org.springframework.stereotype.Component;

/**
 * Created by YUSIN on 16/2/1.
 */
@Component
public class JobIsptDtlVo {
    protected String jbId;
    protected String bizAreaId;
    protected String bizAreaNm;
    protected String trgtId;
    protected String trgtNm;
    protected Integer jbExecCnt;
    protected String sqlId;
    protected String sqlText;
    protected String rlId;
    protected String rlNm;
    protected Integer isptRlt;
    protected String jbIsptEdTm;
    protected String jbIsptStTm;

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

    public String getRlNm() {
        return rlNm;
    }

    public void setRlNm(String rlNm) {
        this.rlNm = rlNm;
    }

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
