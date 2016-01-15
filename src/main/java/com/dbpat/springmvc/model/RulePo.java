package com.dbpat.springmvc.model;

import org.springframework.stereotype.Component;

/**
 * Created by YUSIN on 16/1/15.
 */
@Component
public class RulePo {
    private String rlId;
    private String rlNm;
    private String rlCls;
    private String rlDescr;
    private String rlSetId;
    private String rlStTm;
    private String rlUptTm;

    @Override
    public String toString() {
        return "RulePo{" +
                "rlId='" + rlId + '\'' +
                ", rlNm='" + rlNm + '\'' +
                ", rlCls='" + rlCls + '\'' +
                ", rlDescr='" + rlDescr + '\'' +
                ", rlSetId='" + rlSetId + '\'' +
                ", rlStTm='" + rlStTm + '\'' +
                ", rlUptTm='" + rlUptTm + '\'' +
                '}';
    }

    public String getRlCls() {
        return rlCls;
    }

    public void setRlCls(String rlCls) {
        this.rlCls = rlCls;
    }

    public String getRlDescr() {
        return rlDescr;
    }

    public void setRlDescr(String rlDescr) {
        this.rlDescr = rlDescr;
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

    public String getRlSetId() {
        return rlSetId;
    }

    public void setRlSetId(String rlSetId) {
        this.rlSetId = rlSetId;
    }

    public String getRlStTm() {
        return rlStTm;
    }

    public void setRlStTm(String rlStTm) {
        this.rlStTm = rlStTm;
    }

    public String getRlUptTm() {
        return rlUptTm;
    }

    public void setRlUptTm(String rlUptTm) {
        this.rlUptTm = rlUptTm;
    }
}
