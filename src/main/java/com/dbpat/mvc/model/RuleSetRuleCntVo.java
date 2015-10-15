package com.dbpat.mvc.model;

import org.springframework.stereotype.Component;

@Component
public class RuleSetRuleCntVo {
    private String rlSetId;
    private String rlSetNm;
    private String rlSetDescr;
    private Integer rlSetRlCnt;

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

    public Integer getRlSetRlCnt() {
        return rlSetRlCnt;
    }

    public void setRlSetRlCnt(Integer rlSetRlCnt) {
        this.rlSetRlCnt = rlSetRlCnt;
    }

    @Override
    public String toString() {
        return "RuleSetRuleCntVo{" +
                "rlSetId='" + rlSetId + '\'' +
                ", rlSetNm='" + rlSetNm + '\'' +
                ", rlSetDescr='" + rlSetDescr + '\'' +
                ", rlSetRlCnt=" + rlSetRlCnt +
                '}';
    }
}
