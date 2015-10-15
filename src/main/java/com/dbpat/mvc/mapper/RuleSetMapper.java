package com.dbpat.mvc.mapper;

import com.dbpat.mvc.model.RuleSet;
import com.dbpat.mvc.model.RuleSetRuleCntVo;
import com.dbpat.mvc.model.RuleSetVo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RuleSetMapper {

    List<RuleSet> selectAllRuleSet();

    List<RuleSetRuleCntVo> selectAllRuleSetRuleCntVo();

    List<RuleSetVo> selectAllRuleSetVo();

    RuleSet selectRuleSetById(String rlSetId);

    void insertRuleSet(RuleSet ruleSet);

    void deleteRuleSetById(String rlSetId);

    void updateRuleSetById(RuleSet ruleSet);
}
