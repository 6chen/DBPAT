package com.dbpat.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by YUSIN on 16/1/21.
 */
@Controller
public class ExecJobCtlr {


    // 수집 작업에 관련된 것
    @RequestMapping(value = "/show_clct_job_main.action", method = RequestMethod.GET)
    public String showClctJobMain(){
        return "execution/collect_job/collect_job_main";
    }

    // 검사 작업에 관련된 것
    @RequestMapping(value = "/show_ispt_job_main.action", method = RequestMethod.GET)
    public String showIsptJobMain(){
        return "execution/inspect_job/inspect_job_main";
    }
}
