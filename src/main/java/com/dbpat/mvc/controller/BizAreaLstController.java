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

    @RequestMapping(value = "/showBizAreaLst.action", method = RequestMethod.GET)
    public String showBizAreaLst(ModelMap modelMap) {

        List<BizArea> bizAreas = bizAreaService.findAllBizArea();
        modelMap.addAttribute("bizAreas", bizAreas);
        return "biz_area/biz_area_lst";
    }

    @RequestMapping(value = "/addBizArea.action", method = RequestMethod.POST)
    public
    @ResponseBody
    String addBizArea(HttpServletRequest request) {
        bizArea.setBizAreaNm(request.getParameter("newBizAreaName"));
        bizArea.setBizAreaDescr(request.getParameter("newBizAreaDesc"));
        bizAreaService.addBizArea(bizArea);
        return "{\"success\":true}";
    }

    @RequestMapping(value = "/deleteBizArea.action", method = RequestMethod.POST)
    public String deleteBizArea(BizArea bizArea){
        bizAreaService.deleteBizArea(bizArea);
        return "redirect:showBizAreaLst.action";
    }

    @RequestMapping(value = "/findBizAreaById.action", method = RequestMethod.GET)
    public @ResponseBody BizArea findBizAreaById(BizArea bizArea){

        BizArea returnBizArea = bizAreaService.findBizAreaById(bizArea);

        System.out.println(returnBizArea);
        return returnBizArea;
    }

    @RequestMapping(value = "/modifyBizAreaById.action", method = RequestMethod.POST)
    public @ResponseBody String modifyBizAreaById(BizArea bizArea){
        bizAreaService.modifyBizAreaById(bizArea);
        return "{\"success\":true}";
    }

}
