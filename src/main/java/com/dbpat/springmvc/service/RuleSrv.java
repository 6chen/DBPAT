package com.dbpat.springmvc.service;

import com.dbpat.springmvc.mapper.RuleMpr;
import com.dbpat.springmvc.model.RulePo;
import com.dbpat.springmvc.model.RuleSetPo;
import com.dbpat.springmvc.model.RuleSetVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by YUSIN on 16/1/15.
 */
@Service
public class RuleSrv {

    @Autowired
    RuleMpr ruleMpr;

    // 규칙 집합에 관련된 부분
    public List<RuleSetPo> findAllRuleSet(){
        return ruleMpr.selectAllRuleSet();
    }

    public void addRuleSet(RuleSetPo ruleSetPo){
        ruleMpr.insertRuleSet(ruleSetPo);
    }

    public void modifyRuleSet(RuleSetPo ruleSetPo){
        ruleMpr.updateRuleSet(ruleSetPo);
    }

    public void removeRuleSet(String ruleSetId){
        ruleMpr.deleteRuleSet(ruleSetId);
    }

    public List<RuleSetVo> findAllRuleSetVoByJbId(String jbId){
        return ruleMpr.selectAllRuleSetVoByJbId(jbId);
    }

    // 규칙에 관련된 부분

    public List<RulePo> findAllRule(){
        return ruleMpr.selectAllRule();
    }

    public List<RulePo> findAllRuleByRuleSetId(String ruleSetId){
        return ruleMpr.selectAllRuleByRuleSetId(ruleSetId);
    }

    public RulePo findRuleByRuleId(String ruleId){
        return ruleMpr.selectRuleByRuleId(ruleId);
    }

    public void addRule(RulePo rulePo){
        ruleMpr.insertRule(rulePo);
    }

    public void modifyRule(RulePo rulePo){
        ruleMpr.updateRule(rulePo);
    }

    public void removeRule(String ruleId){
        ruleMpr.deleteRule(ruleId);
    }
}
