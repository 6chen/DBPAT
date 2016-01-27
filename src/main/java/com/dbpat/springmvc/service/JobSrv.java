package com.dbpat.springmvc.service;

import com.dbpat.springmvc.mapper.JobMpr;
import com.dbpat.springmvc.model.JobPo;
import com.dbpat.springmvc.model.JobRuleSetRelPo;
import com.dbpat.springmvc.model.JobTargetVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by YUSIN on 16/1/18.
 */
@Service
public class JobSrv {

    @Autowired
    JobMpr jobMpr;

    public List<JobPo> findAllJobByTyp(String jbTyp) {
        return jobMpr.selectAllJobByTyp(jbTyp);
    }

    public JobPo findJobByJbId(String jbId) {
        return jobMpr.selectJobByJbId(jbId);
    }

    public List<JobTargetVo> findJobTargetVoByJbId(String jbId) {
        return jobMpr.selectJobTargetVoByJbId(jbId);
    }

    public List<JobTargetVo> findJobTargetVoByJbIdWithClctChk(String jbId){
        return jobMpr.selectJobTargetVoByJbIdWithClctChk(jbId);
    }

    public List<JobRuleSetRelPo> findJbRlSetByJbId(String jbId) {
        return jobMpr.selectJbRlSetByJbId(jbId);
    }

    public List<JobPo> findJbPoByBizIdTrgtId(Map<String, Object> prmtMap){
        return jobMpr.selectJbPoByBizIdTrgtId(prmtMap);
    }

    public void addJob(JobPo jobPo) {
        jobMpr.insertJob(jobPo);
    }

    public void addJobTarget(Map<String, Object> prmtMap) {
        jobMpr.insertJobTarget(prmtMap);
    }

    ;

    public void modifyJob(JobPo jobPo) {
        jobMpr.updateJob(jobPo);
    }

    public void removeJob(String jbId) {
        jobMpr.deleteJob(jbId);
    }

    public void removeJobTargetVo(Map<String, Object> prmtMap) {
        jobMpr.deleteJobTargetVo(prmtMap);
    }

    public void saveJobRuleSet(String jbId, List<String> newRuleSetList) {
        Map<String, Object> prmtMap = new HashMap<String, Object>();
        prmtMap.put("jbId", jbId);

        List<JobRuleSetRelPo> jobRuleSetRelPoList = jobMpr.selectAllJobRuleSetRelPo(jbId);

        Set<String> newRuleSetSet = new HashSet<String>();
        newRuleSetSet.addAll(newRuleSetList);

        Set<String> oldRuleSetSet = new HashSet<String>();
        for (JobRuleSetRelPo jobRuleSetRelPo : jobRuleSetRelPoList) {
            oldRuleSetSet.add(jobRuleSetRelPo.getRlSetId());
        }

        if (oldRuleSetSet.size() > newRuleSetSet.size()) {
            oldRuleSetSet.removeAll(newRuleSetSet);
            System.out.println("old>new");
            for (String rlSetId : oldRuleSetSet) {
                System.out.println(rlSetId);
                prmtMap.put("rlSetId", rlSetId);
                jobMpr.deleteJobRuleSet(prmtMap);
            }

        } else if (oldRuleSetSet.size() < newRuleSetSet.size()) {
            newRuleSetSet.removeAll(oldRuleSetSet);
            System.out.println("old<new");
            for (String rlSetId : newRuleSetSet) {
                System.out.println(rlSetId);
                prmtMap.put("rlSetId", rlSetId);
                jobMpr.insertJobRuleSet(prmtMap);
            }
        } else {
            return;
        }
    }
}
