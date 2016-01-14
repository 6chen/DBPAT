package com.dbpat.springmvc.controller;

import com.dbpat.springmvc.model.BizAreaPo;
import com.dbpat.springmvc.service.BizAreaSrv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * Created by YUSIN on 16/1/12.
 */
@Controller
public class TargetCtlr {

    @Autowired
    private BizAreaSrv bizAreaSrv;

    @RequestMapping(value = "/show_target_main", method = RequestMethod.GET)
    public String showHomeRightMain() {
        return "definition/target/target_main";
    }

    // 업무 영역에 관련된 부분

    @RequestMapping(value = "/show_target_biz_part", method = RequestMethod.GET)
    public String showTgrtBizPart() {
        return "definition/target/target_biz_part";
    }

    @RequestMapping(value = "/show_target_biz_list", method = RequestMethod.GET)
    public String showTgrtBizList(ModelMap modelMap) {
        List<BizAreaPo> bizAreaPoList = bizAreaSrv.findAllBizArea();
        modelMap.put("bizAreaPoList", bizAreaPoList);
        return "definition/target/target_biz_list";
    }

    @RequestMapping(value = "/find_biz_area_by_id", method = RequestMethod.POST)
    public @ResponseBody BizAreaPo findBizAreaById(String bizAreaId) {
        return bizAreaSrv.findBizAreaById(bizAreaId);
    }

    @RequestMapping(value = "/add_new_biz", method = RequestMethod.POST)
    public @ResponseBody String addNewBizArea(BizAreaPo bizAreaPo) {
        bizAreaSrv.addBizArea(bizAreaPo);
        return "{\"success\":true}";
    }

    @RequestMapping(value = "/modify_biz", method = RequestMethod.POST)
    public @ResponseBody String modifyBizArea(BizAreaPo bizAreaPo) {
        bizAreaSrv.modifyBizArea(bizAreaPo);
        return "{\"success\":true}";
    }

    @RequestMapping(value = "/remove_biz", method = RequestMethod.POST)
    public @ResponseBody String removeBizArea(BizAreaPo bizAreaPo) {
        bizAreaSrv.removeBizArea(bizAreaPo);
        return "{\"success\":true}";
    }


    // 검사 대상에 관련된 부분

    @RequestMapping(value = "/show_target_trgt_part", method = RequestMethod.GET)
    public String showTgrtTrgtPart() {
        return "definition/target/target_trgt_part";
    }

    @RequestMapping(value = "/show_target_trgt_list", method = RequestMethod.GET)
    public String showTgrtTrgtList() {
        return "definition/target/target_trgt_list";
    }



}
