package com.dbpat.springmvc.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by YUSIN on 16/1/21.
 */
@Component
public class RuleSetVo extends RuleSetPo{

    @Autowired
    List<RulePo> rulePoList;

    public List<RulePo> getRulePoList() {
        return rulePoList;
    }

    public void setRulePoList(List<RulePo> rulePoList) {
        this.rulePoList = rulePoList;
    }

    @Override
    public String toString() {
        return "RuleSetVo{" +
                "rulePoList=" + rulePoList +
                '}';
    }
}
