package com.dbpat.springmvc.controller;

import com.dbpat.springmvc.mapper.JobMpr;
import com.dbpat.springmvc.model.*;
import com.dbpat.springmvc.service.BizAreaSrv;
import com.dbpat.springmvc.service.JobSrv;
import com.dbpat.springmvc.service.TargetSrv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by YUSIN on 16/1/12.
 */
@Controller
public class JobCtlr {

    @Autowired
    JobSrv jobSrv;

    @Autowired
    BizAreaSrv bizAreaSrv;

    @Autowired
    TargetSrv targetSrv;

    @RequestMapping(value = "/show_job_main", method = RequestMethod.GET)
    public String showHomeRightMain() {
        return "definition/job/job_main";
    }

    //    작업 조회 조건 부분
    @RequestMapping(value = "/show_job_select_method_part", method = RequestMethod.GET)
    public String showJobSelectMethodPart(ModelMap modelMap) {
        List<BizAreaPo> bizAreaPoList = bizAreaSrv.findAllBizArea();
        modelMap.put("bizAreaPoList", bizAreaPoList);
        return "definition/job/job_select_method_part";
    }

    @RequestMapping(value = "/show_job_collect_job_list", method = RequestMethod.GET)
    public String showJobCollectJobList(String bizAreaId, String trgtId, ModelMap modelMap) {
        String jbTyp = "01";
        List<JobPo> jobPoList = null;

        if (bizAreaId == null && trgtId == null) {
            jobPoList = jobSrv.findAllJobByTyp(jbTyp);
        } else {
            Map<String, Object> prmtMap = new HashMap<String, Object>();
            prmtMap.put("bizAreaId", bizAreaId);
            prmtMap.put("trgtId", trgtId);
            prmtMap.put("jbTyp", jbTyp);
            jobPoList = jobSrv.findJbPoByBizIdTrgtId(prmtMap);
        }
        modelMap.put("jobPoList", jobPoList);
        return "definition/job/job_collect_job_list";
    }

    @RequestMapping(value = "/add_new_job", method = RequestMethod.POST)
    public
    @ResponseBody
    String addNewBizArea(JobPo jobPo) {
        jobSrv.addJob(jobPo);
        return "{\"success\":true}";
    }

    @RequestMapping(value = "/find_job_by_id", method = RequestMethod.GET)
    public
    @ResponseBody
    JobPo findJobById(String jbId) {
        return jobSrv.findJobByJbId(jbId);
    }

    @RequestMapping(value = "/modify_job", method = RequestMethod.POST)
    public
    @ResponseBody
    String modifyJob(JobPo jobPo) {
        jobSrv.modifyJob(jobPo);
        return "{\"success\":true}";
    }

    @RequestMapping(value = "/remove_job", method = RequestMethod.GET)
    public
    @ResponseBody
    String removeJob(String jbId) {
        jobSrv.removeJob(jbId);
        return "{\"success\":true}";
    }

    @RequestMapping(value = "get_target_list_by_biz_area_id", method = RequestMethod.GET)
    public
    @ResponseBody
    List<TargetPo> getTargetListByBizAreaId(String bizAreaId) {
        return targetSrv.findAllTrgtByBizAreaId(bizAreaId);
    }


    //    수집 작업 부분
    @RequestMapping(value = "/show_job_collect_job_part", method = RequestMethod.GET)
    public String showJobCollectJobPart() {
        return "definition/job/job_collect_job_part";
    }

    @RequestMapping(value = "/show_job_inspect_job_list", method = RequestMethod.GET)
    public String showJobInspectJobList(String bizAreaId, String trgtId, ModelMap modelMap) {
        String jbTyp = "02";
        List<JobPo> jobPoList = null;

        if (bizAreaId == null && trgtId == null) {
            jobPoList = jobSrv.findAllJobByTyp(jbTyp);
        } else {
            Map<String, Object> prmtMap = new HashMap<String, Object>();
            prmtMap.put("bizAreaId", bizAreaId);
            prmtMap.put("trgtId", trgtId);
            prmtMap.put("jbTyp", jbTyp);
            jobPoList = jobSrv.findJbPoByBizIdTrgtId(prmtMap);
        }
        modelMap.put("jobPoList", jobPoList);
        return "definition/job/job_inspect_job_list";
    }

    //    검사 작업 부분
    @RequestMapping(value = "/show_job_inspect_job_part", method = RequestMethod.GET)
    public String showJobInspectJobPart() {
        return "definition/job/job_inspect_job_part";
    }

    @RequestMapping(value = "/show_selected_job_rule_set_list", method = RequestMethod.GET)
    public
    @ResponseBody
    List<JobRuleSetRelPo> showSelectedJobRuleSetList(String jbId) {
        return jobSrv.findJbRlSetByJbId(jbId);
    }


    @RequestMapping(value = "/job_rule_set_save", method = RequestMethod.POST)
    public
    @ResponseBody
    String jobRuleSetSave(@RequestParam("jbId") String jbId, @RequestParam("selectedRuleSetArr[]") List<String> selectedRuleSetList) {
        jobSrv.saveJobRuleSet(jbId, selectedRuleSetList);
        return "{\"success\":true}";
    }


    //    적용된 작업 대상 부분
    @RequestMapping(value = "/show_job_target_part", method = RequestMethod.GET)
    public String showJobTargetPart() {
        return "definition/job/job_target_part";
    }

    @RequestMapping(value = "/show_job_target_list", method = RequestMethod.GET)
    public String showJobTargetList(String jbId, ModelMap modelMap) {
        if (jbId != null) {
            List<JobTargetVo> jobTargetVoList = jobSrv.findJobTargetVoByJbId(jbId);
            modelMap.put("jobTargetVoList", jobTargetVoList);
        }
        return "definition/job/job_target_list";
    }

    @RequestMapping(value = "/add_new_job_target", method = RequestMethod.POST)
    public
    @ResponseBody
    String addNewJobTarget(String jbId, String bizAreaId, String trgtId) {
        Map<String, Object> prmtMap = new HashMap<String, Object>();
        prmtMap.put("jbId", jbId);
        prmtMap.put("bizAreaId", bizAreaId);
        prmtMap.put("trgtId", trgtId);
        jobSrv.addJobTarget(prmtMap);
        return "{\"success\":true}";
    }

    @RequestMapping(value = "/remove_job_target", method = RequestMethod.GET)
    public
    @ResponseBody
    String removeJobTarget(String jbIdExecSeqStr) {
        String[] jbIdExecSeqArr = jbIdExecSeqStr.split(",");
        Map<String, Object> prmtMap = new HashMap<String, Object>();
        prmtMap.put("jbId", jbIdExecSeqArr[0]);
        prmtMap.put("execSeq", jbIdExecSeqArr[1]);
        jobSrv.removeJobTargetVo(prmtMap);
        return "{\"success\":true}";
    }

    @RequestMapping(value = "/get_target_biz_list_no_add", method = RequestMethod.GET)
    public
    @ResponseBody
    List<BizAreaPo> getTgrtBizListNoAdd(String jbId) {
        List<BizAreaPo> bizAreaPoList = bizAreaSrv.findAllBizAreaNoAdd(jbId);
        return bizAreaPoList;
    }

    @RequestMapping(value = "/get_target_list_by_biz_area_id_no_add", method = RequestMethod.GET)
    public
    @ResponseBody
    List<TargetPo> getTgrtListByIdNoAdd(String jbId, String bizAreaId) {
        System.out.println(jbId);
        System.out.println(bizAreaId);
        Map<String, Object> prmtMap = new HashMap<String, Object>();
        prmtMap.put("jbId", jbId);
        prmtMap.put("bizAreaId", bizAreaId);
        return targetSrv.findAllTrgtByBizAreaIdNoAdd(prmtMap);
    }

    //    검사 작업에 적용된 검사 규칙 부분
    @RequestMapping(value = "/show_job_rule_part", method = RequestMethod.GET)
    public String showJobRulePart() {
        return "definition/job/job_rule_part";
    }
}
