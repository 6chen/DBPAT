package com.dbpat.springmvc.service;

import com.dbpat.springmvc.mapper.JobMpr;
import com.dbpat.springmvc.model.JobPo;
import com.dbpat.springmvc.model.JobTargetBizVo;
import com.dbpat.springmvc.model.JobTargetVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by YUSIN on 16/1/18.
 */
@Service
public class JobSrv {

    @Autowired
    JobMpr jobMpr;

    public List<JobPo> findAllJobByTyp(String jbTyp){
        return jobMpr.selectAllJobByTyp(jbTyp);
    }

    public JobPo findJobByJbId(String jbId){
        return jobMpr.selectJobByJbId(jbId);
    }

    public List<JobTargetVo> findJobTargetVoByJbId(String jbId){
        return jobMpr.selectJobTargetVoByJbId(jbId);
    }
//
//    public List<JobTargetBizVo> findJobTargetBizVoByJbId(String jbId){
//        return jobMpr.selectJobTargetBizVoByJbId(jbId);
//    }

    public void addJob(JobPo jobPo){
        jobMpr.insertJob(jobPo);
    }

    public void modifyJob(JobPo jobPo){
        jobMpr.updateJob(jobPo);
    }

    public void removeJob(String jbId){
        jobMpr.deleteJob(jbId);
    }

    public void removeJobTargetVo(Map<String, Object> prmtMap){
        jobMpr.deleteJobTargetVo(prmtMap);
    }
}
