package com.dbpat.mvc.controller;

import com.dbpat.mvc.model.Rule;
import com.dbpat.mvc.model.RuleSet;
import com.dbpat.mvc.model.RuleSetRuleCntVo;
import com.dbpat.mvc.model.RuleSetVo;
import com.dbpat.mvc.service.RuleService;
import com.dbpat.mvc.service.RuleSetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class RuleLstController {

    @Autowired
    RuleSetService ruleSetService;

    @Autowired
    RuleService ruleService;

    @RequestMapping(value = "/showAuditRuleLst", method = RequestMethod.GET)
    public String showAuditRuleLst() {
        return "rule/audit_rule";
    }

    @RequestMapping(value = "/shwoRuleSetLst", method = RequestMethod.GET)
    public String shwoRuleSetLst(ModelMap modelMap) {

        List<RuleSetRuleCntVo> ruleSetRuleCntVos = ruleSetService.findAllRuleSetRuleCntVo();

//        List<RuleSet> ruleSets = ruleSetService.findAllRuleSet();
        modelMap.put("ruleSetRuleCntVos", ruleSetRuleCntVos);
        return "rule/ruleset_lst";
    }

    @RequestMapping(value = "/findRuleSetById", method = RequestMethod.GET)
    public
    @ResponseBody
    RuleSet findRuleSetById(String rlSetId) {
        return ruleSetService.findRuleSetById(rlSetId);
    }

    @RequestMapping(value = "/addRuleSet", method = RequestMethod.POST)
    public @ResponseBody String addRuleSet(RuleSet ruleSet){
        System.out.println(ruleSet);
        ruleSetService.addRuleSet(ruleSet);
        return "{\"success\":true}";
    }

    @RequestMapping(value = "/removeRuleSetById", method = RequestMethod.GET)
    public @ResponseBody String removeRuleSetById(String rlSetId){
        ruleSetService.removeRuleSetById(rlSetId);
        return "{\"success\":true}";
    }

    @RequestMapping(value = "/modifyRuleSetById", method = RequestMethod.POST)
    public @ResponseBody String modifyRuleSetById(RuleSet ruleSet){
        ruleSetService.modifyRuleSetById(ruleSet);
        return "{\"success\":true}";
    }

    @RequestMapping(value = "/showRuleLstById", method = RequestMethod.GET)
    public String showRuleLstById(String rlSetId, ModelMap modelMap){
        List<Rule> rules =  ruleService.findRuleByRuleSetIdy(rlSetId);
        modelMap.put("rules", rules);
        return "rule/rule_lst";
    }

    @RequestMapping(value = "/showRuleDetailAdd", method = RequestMethod.GET)
    public String showRuleDetailAdd(){
        return "rule/rule_detail_add";
    }

    @RequestMapping(value = "/showRuleDetailModify", method = RequestMethod.GET)
    public String showRuleDetailModify(String rlId, ModelMap modelMap){
        Rule rule = ruleService.findRuleByRuleId(rlId);
        modelMap.put("rule",rule);
        return "rule/rule_detail_modify";
    }

    @RequestMapping(value = "/addRule", method = RequestMethod.POST)
    public @ResponseBody String addRule(Rule rule){
        ruleService.addRule(rule);
        return "{\"success\":true}";
    }

    @RequestMapping(value = "/deleteRule", method = RequestMethod.GET)
    public @ResponseBody String deleteRule(String rlId){
        ruleService.removeRuleByRuleId(rlId);
        return "{\"success\":true}";
    }

    @RequestMapping(value = "/modifyRule", method = RequestMethod.POST)
    public @ResponseBody String modifyRule(Rule rule){
        System.out.println(rule);
        ruleService.modifyRuleByRuleId(rule);
        return "{\"success\":true}";
    }

}
