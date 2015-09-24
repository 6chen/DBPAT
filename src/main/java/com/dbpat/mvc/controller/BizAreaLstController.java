package com.dbpat.mvc.controller;

import com.dbpat.mvc.model.BizArea;
import com.dbpat.mvc.service.BizAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by YUSIN on 9/24/15.
 */
@Controller
@RequestMapping("/biz_area_list.action")
public class BizAreaLstController {

    @Autowired
    BizAreaService bizAreaService;

    @RequestMapping(method = RequestMethod.GET)
    public String showBizAreaLst(ModelMap modelMap){

        List<BizArea> bizAreas = bizAreaService.findAllBizArea();
        modelMap.addAttribute("bizAreas", bizAreas);
        return "biz_area/biz_area_lst";
    }
}
