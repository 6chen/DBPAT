package com.dbpat.springmvc.model;

import org.springframework.stereotype.Component;

/**
 * Created by YUSIN on 16/1/18.
 */
@Component
public class JobPo {
    protected String jbId;
    protected String jbNm;
    protected String jbTyp;
    protected String jbStTm;
    protected String jbUptTm;

    @Override
    public String toString() {
        return "JobPo{" +
                "jbId='" + jbId + '\'' +
                ", jbNm='" + jbNm + '\'' +
                ", jbTyp='" + jbTyp + '\'' +
                ", jbStTm='" + jbStTm + '\'' +
                ", jbUptTm='" + jbUptTm + '\'' +
                '}';
    }

    public String getJbId() {
        return jbId;
    }

    public void setJbId(String jbId) {
        this.jbId = jbId;
    }

    public String getJbNm() {
        return jbNm;
    }

    public void setJbNm(String jbNm) {
        this.jbNm = jbNm;
    }

    public String getJbStTm() {
        return jbStTm;
    }

    public void setJbStTm(String jbStTm) {
        this.jbStTm = jbStTm;
    }

    public String getJbTyp() {
        return jbTyp;
    }

    public void setJbTyp(String jbTyp) {
        this.jbTyp = jbTyp;
    }

    public String getJbUptTm() {
        return jbUptTm;
    }

    public void setJbUptTm(String jbUptTm) {
        this.jbUptTm = jbUptTm;
    }
}
