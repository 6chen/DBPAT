package com.dbpat.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by YUSIN on 16/1/12.
 */
@Controller
@RequestMapping("/show_job_main.action")
public class JobCtlr {
    @RequestMapping(method = RequestMethod.GET)
    public String showHomeRightMain() {
        return "definition/job/job_main";
    }

}
