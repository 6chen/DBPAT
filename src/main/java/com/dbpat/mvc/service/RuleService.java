package com.dbpat.mvc.service;

import com.dbpat.mvc.mapper.RuleMapper;
import com.dbpat.mvc.model.Rule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RuleService {

    @Autowired
    RuleMapper ruleMapper;

    public List<Rule> findRuleByRuleSetIdy(String rlSetId){
        return ruleMapper.selectRuleByRuleSetIdy(rlSetId);
    }

    public Rule findRuleByRuleId(String rlId){
        return ruleMapper.selectRuleByRuleId(rlId);
    }

    public void addRule(Rule rule){
        ruleMapper.insertRule(rule);
    }

    public void removeRuleByRuleId(String rlId){
        ruleMapper.deleteRuleByRuleId(rlId);
    }

    public void modifyRuleByRuleId(Rule rule){
        ruleMapper.updateRuleByRuleId(rule);
    }
}
