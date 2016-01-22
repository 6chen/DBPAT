package com.dbpat.utilBefore;

import com.dbpat.mvc.mapper.JobTrgtMapper;
import com.dbpat.mvc.model.Job;
import com.dbpat.mvc.model.JobTrgt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class JobExecSelector {

    @Autowired
    JobTrgtMapper jobTrgtMapper;

    @Autowired
    SchemaCollectJob schemaCollectJob;

    public JobExec getJobExecutor(Job job) {

        Map<String, Object> jobParamMap = new HashMap<String, Object>();

        jobParamMap.put("job", job);

        List<JobTrgt> jobTrgtList = jobTrgtMapper.selectAllJobTrgtByJobId(job.getJobId());
        jobParamMap.put("jobTrgtList", jobTrgtList);

        JobExec jobExec = null;

        if (job.getJobType().equals("01")) {
            schemaCollectJob.setJob(jobParamMap);
            jobExec = schemaCollectJob;
        } else if (job.getJobType().equals("02")) {

        } else if (job.getJobType().equals("03")) {

        }

        return jobExec;
    }
}
