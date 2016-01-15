package com.dbpat.springmvc.mapper;

import com.dbpat.springmvc.model.RuleSetPo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by YUSIN on 16/1/15.
 */
@Repository
public interface RuleMpr {

//    규칙 집합에 관련된 메소드
    List<RuleSetPo> selectAllRuleSet();

    void insertRuleSet(RuleSetPo ruleSetPo);

    void updateRuleSet(RuleSetPo ruleSetPo);

    void deleteRuleSet(String ruleSetId);

//    규칙에 관련된 메소드
}
