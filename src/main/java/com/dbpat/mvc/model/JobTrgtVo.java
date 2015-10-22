package com.dbpat.mvc.model;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by mtkim on 2015-10-21.
 */
public class JobTrgtVo extends JobTrgt {
    @Autowired
    private Target target;

    @Autowired
    private Job job;

    @Override
    public String toString() {
        return "JobTrgtVo{" +
                "target=" + target +
                ", job=" + job +
                '}';
    }

    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }
}
