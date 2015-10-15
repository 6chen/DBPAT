package com.dbpat.mvc.service;

import com.dbpat.mvc.mapper.RuleSetMapper;
import com.dbpat.mvc.model.RuleSet;
import com.dbpat.mvc.model.RuleSetRuleCntVo;
import com.dbpat.mvc.model.RuleSetVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RuleSetService {

    @Autowired
    RuleSetMapper ruleSetMapper;

    public List<RuleSet> findAllRuleSet() {
        return ruleSetMapper.selectAllRuleSet();
    }

    public List<RuleSetVo> findAllRuleSetVo() {
        return ruleSetMapper.selectAllRuleSetVo();
    }

    public RuleSet findRuleSetById(String rlSetId) {
        return ruleSetMapper.selectRuleSetById(rlSetId);
    }

    public List<RuleSetRuleCntVo> findAllRuleSetRuleCntVo(){
        return ruleSetMapper.selectAllRuleSetRuleCntVo();
    }

    public void addRuleSet(RuleSet ruleSet) {
        ruleSetMapper.insertRuleSet(ruleSet);
    }

    public void removeRuleSetById(String rlSetId) {
        ruleSetMapper.deleteRuleSetById(rlSetId);
    }

    public void modifyRuleSetById(RuleSet ruleSet) {
        ruleSetMapper.updateRuleSetById(ruleSet);
    }
}
