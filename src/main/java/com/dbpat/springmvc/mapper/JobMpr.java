package com.dbpat.springmvc.mapper;

import com.dbpat.springmvc.model.JobPo;
import com.dbpat.springmvc.model.JobRuleSetRelPo;
import com.dbpat.springmvc.model.JobTargetBizVo;
import com.dbpat.springmvc.model.JobTargetVo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by YUSIN on 16/1/18.
 */
@Repository
public interface JobMpr {
    List<JobPo> selectAllJobByTyp(String jbTyp);

    JobPo selectJobByJbId(String jbId);

    List<JobTargetVo> selectJobTargetVoByJbId(String jbId);

    List<JobRuleSetRelPo> selectJbRlSetByJbId(String jbId);

    void insertJob(JobPo jobPo);

    void insertJobTarget(Map<String, Object> prmtMap);

    void updateJob(JobPo jobPo);

    void deleteJob(String jbId);

    void deleteJobTargetVo(Map<String, Object> prmtMap);


    // Job Rule Set Relationship

    List<JobRuleSetRelPo> selectAllJobRuleSetRelPo(String jbId);

    void deleteJobRuleSet(Map<String, Object> prmtMap);

    void insertJobRuleSet(Map<String, Object> prmtMap);

}
