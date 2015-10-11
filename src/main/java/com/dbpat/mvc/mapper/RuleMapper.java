package com.dbpat.mvc.mapper;

import com.dbpat.mvc.model.Rule;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RuleMapper {
    List<Rule> selectRuleByRuleSetIdy(String rlSetId);
}
