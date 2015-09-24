package com.dbpat.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by YUSIN on 9/24/15.
 */
@Controller
@RequestMapping("/home_Left_Nav.action")
public class HomeLeftNavController {
    @RequestMapping(method = RequestMethod.GET)
    public String showHomeLeftNav(){
        return "basehome/home_left_nav";
    }
}
