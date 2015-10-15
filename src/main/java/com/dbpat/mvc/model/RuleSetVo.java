package com.dbpat.mvc.model;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RuleSetVo {
    private String rlSetId;
    private String rlSetNm;
    private String rlSetDescr;
    private List<Rule> ruleLst;

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

    public List<Rule> getRuleLst() {
        return ruleLst;
    }

    public void setRuleLst(List<Rule> ruleLst) {
        this.ruleLst = ruleLst;
    }

    @Override
    public String toString() {
        return "RuleSetVo{" +
                "rlSetId='" + rlSetId + '\'' +
                ", rlSetNm='" + rlSetNm + '\'' +
                ", rlSetDescr='" + rlSetDescr + '\'' +
                ", ruleLst=" + ruleLst +
                '}';
    }
}
