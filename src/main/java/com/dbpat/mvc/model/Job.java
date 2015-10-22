package com.dbpat.mvc.model;

import org.springframework.stereotype.Component;

/**
 * Created by mtkim on 2015-10-12.
 */
@Component
public class Job {
    private String jobId;
    private String jobNm;
    private String jobstartDt;
    private String jobType;



    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getJobNm() {
        return jobNm;
    }

    public void setJobNm(String jobNm) {
        this.jobNm = jobNm;
    }

    public String getJobstartDt() {
        return jobstartDt;
    }

    public void setJobstartDt(String jobstartDt) {
        this.jobstartDt = jobstartDt;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public String getJobCycle() {
        return jobCycle;
    }

    public void setJobCycle(String jobCycle) {
        this.jobCycle = jobCycle;
    }

    private String jobCycle;


    @Override
    public String toString() {
        return "Job{" +
                "jobId='" + jobId + '\'' +
                ", jobNm='" + jobNm + '\'' +
                ", jobstartDt='" + jobstartDt + '\'' +
                ", jobType='" + jobType + '\'' +
                ", jobCycle='" + jobCycle + '\'' +
                '}';
    }



}
