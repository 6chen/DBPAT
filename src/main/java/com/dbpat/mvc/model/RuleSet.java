package com.dbpat.mvc.model;

import org.springframework.stereotype.Component;

@Component
public class RuleSet {
    private String rlSetId;
    private String rlSetNm;
    private String rlSetDescr;

    @Override
    public String toString() {
        return "RuleSet{" +
                "rlSetId='" + rlSetId + '\'' +
                ", rlSetNm='" + rlSetNm + '\'' +
                ", rlSetDescr='" + rlSetDescr + '\'' +
                '}';
    }

    public String getRlSetId() {
        return rlSetId;
    }

    public void setRlSetId(String rlSetId) {
        this.rlSetId = rlSetId;
    }

    public String getRlSetNm() {
        return rlSetNm;
    }

    public void setRlSetNm(String rlSetNm) {
        this.rlSetNm = rlSetNm;
    }

    public String getRlSetDescr() {
        return rlSetDescr;
    }

    public void setRlSetDescr(String rlSetDescr) {
        this.rlSetDescr = rlSetDescr;
    }
}
