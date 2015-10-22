package com.dbpat.mvc.controller;

import com.dbpat.mvc.model.*;
import com.dbpat.mvc.service.SchemaJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by mtkim on 2015-10-06.
 */

@Controller
public class SchemaJoblstController {

    @Autowired
    SchemaJobService schemaJobService;

    @Autowired
    Job job;

    @Autowired
    JobTrgt jobTrgt;

    @Autowired
    Target target;

    @RequestMapping(value = "/showSchemaLst.action", method = RequestMethod.GET)
    public String showSchemacollectLst(ModelMap modelMap) {

        List<Job> jobs = schemaJobService.findAllJobLst();
        modelMap.addAttribute("jobs", jobs);
        return "job/schema_collect_lst";
    }

    @RequestMapping(value = "/addJoblst.action", method = RequestMethod.POST)
    public
    @ResponseBody
    String addJoblst(HttpServletRequest request) {
        job.setJobNm(request.getParameter("newSchemaName"));
        job.setJobstartDt(request.getParameter("newScadule"));
        schemaJobService.insertJobLst(job);
        return "{\"success\":true}";
    }

    @RequestMapping(value = "/deletejob.action", method = RequestMethod.POST)
    public String deletejob(Job job){
        schemaJobService.deleteSchema(job);
        return "redirect:showSchemaLst.action";
    }


    @RequestMapping(value = "/findSchemaById.action", method = RequestMethod.GET)
    public @ResponseBody Job findSchemaById(Job job){

        Job returnSchema = schemaJobService.findJobById(job);

        return returnSchema;
    }

    @RequestMapping(value = "/modifySchemaById.action", method = RequestMethod.POST)
    public @ResponseBody String modifySchemaById(Job job){
        schemaJobService.modifySchemaById(job);
        return "{\"success\":true}";
    }

    @RequestMapping(value = "/showTargetBizLst.action", method = RequestMethod.GET)
    public String showTargetBizLst(Job job, ModelMap modelMap) {
//        System.out.println(job);
        List<JobTrgtVo> jobTrgtVos = schemaJobService.selectAllTrgtLst(job);

//        for (JobTrgtVo jobTrgtVo:jobTrgtVos){
//            System.out.println(jobTrgtVo);
//        }
        modelMap.addAttribute("jobTrgtVos", jobTrgtVos);
        return "redirect:showSchemaLst.action";
    }

}


