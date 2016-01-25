package com.dbpat.springmvc.controller;

import com.dbpat.springmvc.mapper.JobMpr;
import com.dbpat.springmvc.model.*;
import com.dbpat.springmvc.service.JobExecSrv;
import com.dbpat.springmvc.service.JobSrv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by YUSIN on 16/1/21.
 */
@Controller
public class ExecJobCtlr {

    @Autowired
    JobSrv jobSrv;

    @Autowired
    JobExecSrv jobExecSrv;

    // 수집 작업에 관련된 것
    @RequestMapping(value = "/show_clct_job_main.action", method = RequestMethod.GET)
    public String showClctJobMain(ModelMap modelMap) {
        String jbTyp = "01";
        List<JobPo> jobPoList = jobSrv.findAllJobByTyp(jbTyp);

        modelMap.put("jobPoList", jobPoList);
        return "execution/collect_job/collect_job_main";
    }

    @RequestMapping(value = "/show_clct_job_target_list.action", method = RequestMethod.GET)
    public String showClctJobTargetList(String jbId, ModelMap modelMap) {
        System.out.println(jbId);
        List<JobTargetVo> jobTargetVoList = jobSrv.findJobTargetVoByJbId(jbId);
        modelMap.put("jobTargetVoList", jobTargetVoList);
        modelMap.put("jbId", jbId);
        return "execution/collect_job/collect_job_target_list";
    }

    @RequestMapping(value = "/show_clct_job_all_hist.action", method = RequestMethod.GET)
    public String showClctJobAllHist(String jbId, ModelMap modelMap) {
        List<JobExecHistVo> JobExecHistVoList = jobExecSrv.findJobALlHistByJbId(jbId);
        modelMap.put("JobExecHistVoList", JobExecHistVoList);
        return "execution/collect_job/collect_job_all_hist";
    }

    @RequestMapping(value = "/show_clct_job_per_trgt_hist.action", method = RequestMethod.GET)
    public String showClctJobPerTrgtHist(String jbId, String bizAreaId, String trgtId, ModelMap modelMap) {
        Map<String, Object> prmtMap = new HashMap<String, Object>();
        prmtMap.put("jbId", jbId);
        prmtMap.put("bizAreaId", bizAreaId);
        prmtMap.put("trgtId", trgtId);
        List<JobExecHistVo> JobExecHistVoList = jobExecSrv.findJobPerHistByJbBizTrgtId(prmtMap);
        modelMap.put("JobExecHistVoList", JobExecHistVoList);
        return "execution/collect_job/collect_job_all_hist";
    }

    @RequestMapping(value = "/collect_job_exec_page", method = RequestMethod.GET)
    public
    @ResponseBody
    String collectJobExecPage(String jbId) {
        System.out.println(jbId);
        jobExecSrv.startCollectJobByJbId(jbId);
        return "{\"success\":true}";
    }

    @RequestMapping(value = "/show_clct_job_exec_detail.action", method = RequestMethod.GET)
    public String showClctJobExecDetail(String jbId, Integer jbExecCnt, ModelMap modelMap) {
        Map<String, Object> prmtMap = new HashMap<String, Object>();
        prmtMap.put("jbId", jbId);
        prmtMap.put("jbExecCnt", jbExecCnt);
        List<CollectJobExecDetailPo> collectJobExecDetailPoList = jobExecSrv.findCollectJobExecDetailPo(prmtMap);
        modelMap.put("collectJobExecDetailPoList", collectJobExecDetailPoList);
        return "execution/collect_job/collect_job_exec_detail";
    }

    // 검사 작업에 관련된 것
    @RequestMapping(value = "/show_ispt_job_main.action", method = RequestMethod.GET)
    public String showIsptJobMain() {
        return "execution/inspect_job/inspect_job_main";
    }
}
