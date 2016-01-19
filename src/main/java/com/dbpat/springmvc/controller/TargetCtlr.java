package com.dbpat.springmvc.controller;

import com.dbpat.springmvc.model.BizAreaPo;
import com.dbpat.springmvc.model.DbmsTypePo;
import com.dbpat.springmvc.model.TargetPo;
import com.dbpat.springmvc.service.BizAreaSrv;
import com.dbpat.springmvc.service.DbmsTypeSrv;
import com.dbpat.springmvc.service.TargetSrv;
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

    @Autowired
    private TargetSrv targetSrv;

    @Autowired
    private DbmsTypeSrv dbmsTypeSrv;

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
    public String showTgrtTrgtPart(ModelMap modelMap) {
        List<DbmsTypePo> dbmsTypePoList = dbmsTypeSrv.findAllDbmsType();
        modelMap.put("dbmsTypePoList", dbmsTypePoList);
        return "definition/target/target_trgt_part";
    }

    @RequestMapping(value = "/show_target_trgt_list", method = RequestMethod.GET)
    public String showTgrtTrgtList(String bizAreaId, ModelMap modelMap) {
        if (bizAreaId != null){
            List<TargetPo> targetPoList = targetSrv.findAllTrgtByBizAreaId(bizAreaId);
            modelMap.put("targetPoList", targetPoList);
            List<DbmsTypePo> dbmsTypePoList = dbmsTypeSrv.findAllDbmsType();
            modelMap.put("dbmsTypePoList", dbmsTypePoList);
        }
        return "definition/target/target_trgt_list";
    }

    @RequestMapping(value = "/add_new_target", method = RequestMethod.POST)
    public @ResponseBody String addNewTarget(TargetPo targetPo) {
        targetSrv.addTrgtPo(targetPo);
        return "{\"success\":true}";
    }

    @RequestMapping(value = "/find_one_target", method = RequestMethod.POST)
    public @ResponseBody TargetPo findOneTarget(String bizAreaId, String trgtId) {
        return targetSrv.findOneTrgt(bizAreaId, trgtId);
    }

    @RequestMapping(value = "/modify_target", method = RequestMethod.POST)
    public @ResponseBody String modifyTarget(TargetPo targetPo) {
        targetSrv.modifyTrgtPo(targetPo);
        return "{\"success\":true}";
    }

    @RequestMapping(value = "/remove_target", method = RequestMethod.POST)
    public @ResponseBody String removeTarget(String bizAreaId, String trgtId) {
        targetSrv.removeTrgtPo(bizAreaId, trgtId);
        return "{\"success\":true}";
    }

    // DBMS 유형에 관련된 부분


}
