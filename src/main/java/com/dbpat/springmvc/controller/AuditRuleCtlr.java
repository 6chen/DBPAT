package com.dbpat.springmvc.controller;

import com.dbpat.springmvc.model.RuleSetPo;
import com.dbpat.springmvc.service.RuleSrv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by YUSIN on 16/1/12.
 */

@Controller
public class AuditRuleCtlr {

    @Autowired
    RuleSrv ruleSrv;

    @RequestMapping(value = "/show_audit_rule_main", method = RequestMethod.GET)
    public String showAuditRuleMain(){
        return "definition/audit_rule/audit_rule_main";
    }


//    규칙 집합 부분
    @RequestMapping(value = "/show_audit_rule_set_part", method = RequestMethod.GET)
    public String showAuditRuleSetPart(){
        return "definition/audit_rule/audit_rule_set_part";
    }

    @RequestMapping(value = "/show_audit_rule_set_list", method = RequestMethod.GET)
    public String showAuditRuleSetList(ModelMap modelMap){
        List<RuleSetPo> ruleSetPoList = ruleSrv.findAllRuleSet();
        modelMap.put("ruleSetPoList", ruleSetPoList);
        return "definition/audit_rule/audit_rule_set_list";
    }

    @RequestMapping(value = "/add_new_rule_set", method = RequestMethod.POST)
    public @ResponseBody
    String addNewRuleSet(RuleSetPo ruleSetPo) {
        ruleSrv.addRuleSet(ruleSetPo);
        return "{\"success\":true}";
    }

    @RequestMapping(value = "/modify_old_rule_set", method = RequestMethod.POST)
    public @ResponseBody String modifyOldRuleSet(RuleSetPo ruleSetPo) {
        ruleSrv.modifyRuleSet(ruleSetPo);
        return "{\"success\":true}";
    }

    @RequestMapping(value = "/remove_rule_set", method = RequestMethod.GET)
    public @ResponseBody String removeRuleSet(String ruleSetId) {
        ruleSrv.removeRuleSet(ruleSetId);
        return "{\"success\":true}";
    }



//    규칙 부분
    @RequestMapping(value = "/show_audit_rule_part", method = RequestMethod.GET)
    public String showAuditRulePart(){
        return "definition/audit_rule/audit_rule_part";
    }

    @RequestMapping(value = "/show_audit_rule_list", method = RequestMethod.GET)
    public String showAuditRuleList(){
        return "definition/audit_rule/audit_rule_list";
    }

//    규칙 상세 보기 부분
    @RequestMapping(value = "/show_audit_rule_detail_part", method = RequestMethod.GET)
    public String showAuditRuleDetailPart(){
        return "definition/audit_rule/audit_rule_detail_part";
    }
}
