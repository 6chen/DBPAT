package com.dbpat.mvc.mapper;

import com.dbpat.mvc.model.Rule;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RuleMapper {
    List<Rule> selectRuleByRuleSetIdy(String rlSetId);

    Rule selectRuleByRuleId(String rlId);

    void insertRule(Rule rule);

    void deleteRuleByRuleId(String rlId);

    void updateRuleByRuleId(Rule rule);
}
