package com.dbpat.mvc.controller;

import com.dbpat.mvc.model.BizArea;
import com.dbpat.mvc.service.BizAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class BizAreaLstController {

    @Autowired
    BizAreaService bizAreaService;

    @Autowired
    BizArea bizArea;

    @RequestMapping(value = "/biz_area_list.action", method = RequestMethod.GET)
    public String showBizAreaLst(ModelMap modelMap) {

        List<BizArea> bizAreas = bizAreaService.findAllBizArea();
        modelMap.addAttribute("bizAreas", bizAreas);
        return "biz_area/biz_area_lst";
    }

    @RequestMapping(value = "/biz_area_add.action", method = RequestMethod.POST)
    public
    @ResponseBody
    String addBizArea(HttpServletRequest request) {
        bizArea.setBizAreaId("BIZ0002");
        bizArea.setBizAreaNm(request.getParameter("newBizAreaName"));
        bizArea.setBizAreaDescr(request.getParameter("newBizAreaDesc"));
        System.out.println(bizArea);
        bizAreaService.addBizArea(bizArea);
        return "{\"success\":true}";
    }

}
