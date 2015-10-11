package com.dbpat.mvc.model;

import org.springframework.stereotype.Component;

@Component
public class Rule {
    private String rlId;
    private String rlNm;
    private String rlCls;
    private String rlDescr;
    private String rlSetId;

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

    public String getRlSetId() {
        return rlSetId;
    }

    public void setRlSetId(String rlSetId) {
        this.rlSetId = rlSetId;
    }

    @Override
    public String toString() {
        return "Rule{" +
                "rlId='" + rlId + '\'' +
                ", rlNm='" + rlNm + '\'' +
                ", rlCls='" + rlCls + '\'' +
                ", rlDescr='" + rlDescr + '\'' +
                ", rlSetId='" + rlSetId + '\'' +
                '}';
    }
}
