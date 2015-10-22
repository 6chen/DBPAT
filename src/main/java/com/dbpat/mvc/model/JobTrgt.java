package com.dbpat.mvc.model;

import org.springframework.stereotype.Component;

/**
 * Created by mtkim on 2015-10-20.
 */

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

    private String jobId;
    private String bizAreaId;
    protected Integer jbSeq;
    private String trgtId;

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

    public Integer getJbSeq() {
        return jbSeq;
    }

    public void setJbSeq(Integer jbSeq) {
        this.jbSeq = jbSeq;
    }

    public String getTrgtId() {
        return trgtId;
    }

    public void setTrgtId(String trgtId) {
        this.trgtId = trgtId;
    }
}
