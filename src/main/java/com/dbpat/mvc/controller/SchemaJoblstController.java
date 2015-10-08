package com.dbpat.mvc.controller;

import com.dbpat.mvc.model.BizArea;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by mtkim on 2015-10-06.
 */

@Controller
public class SchemaJoblstController {

    @RequestMapping(value = "/showSchemaLst.action", method = RequestMethod.GET)
    public String showSchemacollectLst() {

//        List<BizArea> bizAreas = bizAreaService.findAllBizArea();
//        modelMap.addAttribute("bizAreas", bizAreas);
        return "job/schema_collect_lst";
    }
}


