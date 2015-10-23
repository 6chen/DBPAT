package com.dbpat.mvc.model;

import org.springframework.stereotype.Component;

@Component
public class JobTrgtHist extends JobTrgt {

    private String jobStrtTm;
    private String jobEdTm;
    private String dbmsTypId;
    private String seq;
    private String rlId;

    public String getJobStrtTm() {
        return jobStrtTm;
    }

    public void setJobStrtTm(String jobStrtTm) {
        this.jobStrtTm = jobStrtTm;
    }

    public String getJobEdTm() {
        return jobEdTm;
    }

    public void setJobEdTm(String jobEdTm) {
        this.jobEdTm = jobEdTm;
    }

    public String getDbmsTypId() {
        return dbmsTypId;
    }

    public void setDbmsTypId(String dbmsTypId) {
        this.dbmsTypId = dbmsTypId;
    }

    public String getSeq() {
        return seq;
    }

    public void setSeq(String seq) {
        this.seq = seq;
    }

    public String getRlId() {
        return rlId;
    }

    public void setRlId(String rlId) {
        this.rlId = rlId;
    }

    @Override
    public String toString() {
        return "JobTrgtHist{" +
                "jobStrtTm='" + jobStrtTm + '\'' +
                ", jobEdTm='" + jobEdTm + '\'' +
                ", dbmsTypId='" + dbmsTypId + '\'' +
                ", seq='" + seq + '\'' +
                ", rlId='" + rlId + '\'' +
                '}';
    }
}
