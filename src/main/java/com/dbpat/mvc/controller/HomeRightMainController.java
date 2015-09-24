package com.dbpat.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by YUSIN on 9/24/15.
 */
@Controller
@RequestMapping("/home_right_main.action")
public class HomeRightMainController {
    @RequestMapping(method = RequestMethod.GET)
    public String showHomeRightMain(){
        return "basehome/home_right_main";
    }

}
