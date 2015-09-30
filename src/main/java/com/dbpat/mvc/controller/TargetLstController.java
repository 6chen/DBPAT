package com.dbpat.mvc.controller;

import com.dbpat.mvc.model.BizArea;
import com.dbpat.mvc.model.DbmsType;
import com.dbpat.mvc.model.Target;
import com.dbpat.mvc.model.TargetVo;
import com.dbpat.mvc.service.BizAreaService;
import com.dbpat.mvc.service.DBMSTypeService;
import com.dbpat.mvc.service.TargetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
public class TargetLstController {

    @Autowired
    BizAreaService bizAreaService;

    @Autowired
    TargetService targetService;

    @Autowired
    DBMSTypeService dbmsTypeService;

    @RequestMapping(value = "/showTargetLst.action", method = RequestMethod.GET)
    public String showTargetLst(BizArea bizArea, ModelMap modelMap) {


        if (bizArea.getBizAreaNm() == null){
            BizArea bizAreaSearch = bizAreaService.findBizAreaById(bizArea);
            modelMap.addAttribute("bizArea", bizAreaSearch);
        }else{
            modelMap.addAttribute("bizArea", bizArea);
        }

        List<TargetVo> targetVos = targetService.findTargetByBizId(bizArea);

        List<TargetVo> dbmsTargetVos = new ArrayList<TargetVo>();
        List<TargetVo> wasTargetVos = new ArrayList<TargetVo>();
        List<TargetVo> srcFIleTargetVos = new ArrayList<TargetVo>();

        for (TargetVo targetVo : targetVos) {
            if (targetVo.getTrgtTyp().equals("01")) {
                targetVo.setTrgtTyp("DBMS");
                dbmsTargetVos.add(targetVo);
            } else if (targetVo.getTrgtTyp().equals("02")) {
                targetVo.setTrgtTyp("WAS");
                wasTargetVos.add(targetVo);
            } else if (targetVo.getTrgtTyp().equals("03")) {
                targetVo.setTrgtTyp("Source File");
                srcFIleTargetVos.add(targetVo);
            }
        }

        modelMap.addAttribute("dbmsTargetVos", dbmsTargetVos);
        modelMap.addAttribute("wasTargetVos", wasTargetVos);
        modelMap.addAttribute("srcFIleTargetVos", srcFIleTargetVos);

        List<DbmsType> dbmsTypes = dbmsTypeService.findAllDbmsType();
        modelMap.addAttribute("dbmsTypes",dbmsTypes);

        return "biz_area/target_lst";
    }

    @RequestMapping(value = "/addDbmsTarget.action", method = RequestMethod.POST)
    public @ResponseBody String addDbmsTarget(String bizAreaId, Target target, String dbmsTypId){
        Map<String, Object> prmtMap = new HashMap<String, Object>();
        prmtMap.put("bizAreaId", bizAreaId);
        prmtMap.put("trgtNm", target.getTrgtNm());
        prmtMap.put("trgtTyp", target.getTrgtTyp());
        prmtMap.put("ip", target.getIp());
        prmtMap.put("prt", target.getPrt());
        prmtMap.put("usrId", target.getUsrId());
        prmtMap.put("pw", target.getPw());
        prmtMap.put("serv", target.getServ());
        prmtMap.put("schm", target.getSchm());
        prmtMap.put("dbmsTypId", dbmsTypId);
        targetService.insertTarget(prmtMap);

        return "{\"success\":true,\"bizAreaId\":\"" + bizAreaId + "\"}";
    }
}
