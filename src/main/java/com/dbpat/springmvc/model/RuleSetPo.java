package com.dbpat.springmvc.model;

import org.springframework.stereotype.Component;

/**
 * Created by YUSIN on 16/1/15.
 */
@Component
public class RuleSetPo {
    private String rlSetId;
    private String rlSetNm;
    private String rlSetDescr;
    private String rlSetStTm;
    private String rlSetUptTm;

    @Override
    public String toString() {
        return "RuleSetPo{" +
                "rlSetId='" + rlSetId + '\'' +
                ", rlSetNm='" + rlSetNm + '\'' +
                ", rlSetDescr='" + rlSetDescr + '\'' +
                ", rlSetStTm='" + rlSetStTm + '\'' +
                ", rlSetUptTm='" + rlSetUptTm + '\'' +
                '}';
    }

    public String getRlSetDescr() {
        return rlSetDescr;
    }

    public void setRlSetDescr(String rlSetDescr) {
        this.rlSetDescr = rlSetDescr;
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

    public String getRlSetStTm() {
        return rlSetStTm;
    }

    public void setRlSetStTm(String rlSetStTm) {
        this.rlSetStTm = rlSetStTm;
    }

    public String getRlSetUptTm() {
        return rlSetUptTm;
    }

    public void setRlSetUptTm(String rlSetUptTm) {
        this.rlSetUptTm = rlSetUptTm;
    }
}
