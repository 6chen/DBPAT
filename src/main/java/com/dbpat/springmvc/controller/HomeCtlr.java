package com.dbpat.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by YUSIN on 16/1/12.
 */

@Controller
public class HomeCtlr {
    @RequestMapping(value = "/home.action", method = RequestMethod.GET)
    public String showHome(){
        return "basehome/home_page";
    }

    @RequestMapping(value = "/show_home_contents", method = RequestMethod.GET)
    public String showHomeContents(){
        return "basehome/home_contents";
    }
}