package com.dbpat.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by YUSIN on 16/1/12.
 */

@Controller
public class AuditRuleCtlr {
    @RequestMapping(value = "/show_audit_rule_main", method = RequestMethod.GET)
    public String showAuditRuleMain(){
        return "definition/audit_rule/audit_rule_main";
    }

    @RequestMapping(value = "/show_audit_rule_set_part", method = RequestMethod.GET)
    public String showAuditRuleSetPart(){
        return "definition/audit_rule/audit_rule_set_part";
    }

    @RequestMapping(value = "/show_audit_rule_set_list", method = RequestMethod.GET)
    public String showAuditRuleSetList(){
        return "definition/audit_rule/audit_rule_set_list";
    }

    @RequestMapping(value = "/show_audit_rule_part", method = RequestMethod.GET)
    public String showAuditRulePart(){
        return "definition/audit_rule/audit_rule_part";
    }

    @RequestMapping(value = "/show_audit_rule_list", method = RequestMethod.GET)
    public String showAuditRuleList(){
        return "definition/audit_rule/audit_rule_list";
    }

    @RequestMapping(value = "/show_audit_rule_detail_part", method = RequestMethod.GET)
    public String showAuditRuleDetailPart(){
        return "definition/audit_rule/audit_rule_detail_part";
    }
}
