package com.dbpat.mvc.controller;

import com.dbpat.mvc.model.RuleSet;
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

    @RequestMapping(value = "/showAuditRuleLst", method = RequestMethod.GET)
    public String showAuditRuleLst() {

        return "rule/audit_rule";
    }

    @RequestMapping(value = "/shwoRuleSetLst", method = RequestMethod.GET)
    public String shwoRuleSetLst(ModelMap modelMap) {
        List<RuleSet> ruleSets = ruleSetService.findAllRuleSet();
        modelMap.put("ruleSets", ruleSets);
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


}
