package com.dbpat.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by YUSIN on 9/24/15.
 */
@Controller
@RequestMapping("/home.action")
public class HomeController {
    @RequestMapping(method = RequestMethod.GET)
    public String showHome(){
        return "basehome/home_page";
    }
}
