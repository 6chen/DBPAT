package com.dbpat.mvc.model;

import org.springframework.stereotype.Component;

@Component
public class JobTrgt {
    @Override
    public String toString() {
        return "JobTrgt{" +
                "jobId='" + jobId + '\'' +
                ", bizAreaId='" + bizAreaId + '\'' +
                ", jbSeq=" + jbSeq +
                ", trgtId='" + trgtId + '\'' +
                '}';
    }

    protected String jobId;
    protected String bizAreaId;
    protected String jbSeq;
    protected String trgtId;

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getBizAreaId() {
        return bizAreaId;
    }

    public void setBizAreaId(String bizAreaId) {
        this.bizAreaId = bizAreaId;
    }

    public String getJbSeq() {
        return jbSeq;
    }

    public void setJbSeq(String jbSeq) {
        this.jbSeq = jbSeq;
    }

    public String getTrgtId() {
        return trgtId;
    }

    public void setTrgtId(String trgtId) {
        this.trgtId = trgtId;
    }
}
