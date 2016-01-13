package com.dbpat.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by YUSIN on 16/1/12.
 */
@Controller
public class TargetCtlr {
    @RequestMapping(value = "/show_target_main", method = RequestMethod.GET)
    public String showHomeRightMain() {
        return "definition/target/target_main";
    }

    @RequestMapping(value = "/show_target_biz_part", method = RequestMethod.GET)
    public String showTgrtBizPart() {
        return "definition/target/target_biz_part";
    }

    @RequestMapping(value = "/show_target_biz_list", method = RequestMethod.GET)
    public String showTgrtBizList() {
        return "definition/target/target_biz_list";
    }

    @RequestMapping(value = "/show_target_trgt_part", method = RequestMethod.GET)
    public String showTgrtTrgtPart() {
        return "definition/target/target_trgt_part";
    }

    @RequestMapping(value = "/show_target_trgt_list", method = RequestMethod.GET)
    public String showTgrtTrgtList() {
        return "definition/target/target_trgt_list";
    }
}
