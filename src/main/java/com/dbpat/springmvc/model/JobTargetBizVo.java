package com.dbpat.springmvc.model;

/**
 * Created by YUSIN on 16/1/18.
 */
public class JobTargetBizVo {
    private String jbId;
    private Integer execSeq;
    private String bizAreaNm;
    private String trgtNm;

    @Override
    public String toString() {
        return "JobTargetBizVo{" +
                "jbId='" + jbId + '\'' +
                ", execSeq=" + execSeq +
                ", bizAreaNm='" + bizAreaNm + '\'' +
                ", trgtNm='" + trgtNm + '\'' +
                '}';
    }

    public String getBizAreaNm() {
        return bizAreaNm;
    }

    public void setBizAreaNm(String bizAreaNm) {
        this.bizAreaNm = bizAreaNm;
    }

    public Integer getExecSeq() {
        return execSeq;
    }

    public void setExecSeq(Integer execSeq) {
        this.execSeq = execSeq;
    }

    public String getJbId() {
        return jbId;
    }

    public void setJbId(String jbId) {
        this.jbId = jbId;
    }

    public String getTrgtNm() {
        return trgtNm;
    }

    public void setTrgtNm(String trgtNm) {
        this.trgtNm = trgtNm;
    }
}
