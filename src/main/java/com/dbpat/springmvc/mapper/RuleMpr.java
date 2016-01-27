package com.dbpat.springmvc.mapper;

import com.dbpat.springmvc.model.RulePo;
import com.dbpat.springmvc.model.RuleSetPo;
import com.dbpat.springmvc.model.RuleSetVo;
import org.apache.ibatis.annotations.Param;
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
    List<RulePo> selectAllRule();

    List<RulePo> selectAllRuleByRuleSetId(String ruleSetId);

    RulePo selectRuleByRuleId(String ruleId);


    List<RuleSetVo> selectAllRuleSetVoByJbId(String jbId);

    void insertRule(RulePo rulePo);

    void updateRule(RulePo rulePo);

    void deleteRule(String ruleId);
}
