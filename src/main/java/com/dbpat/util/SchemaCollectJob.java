package com.dbpat.util;

import com.dbpat.mvc.model.Job;
import com.dbpat.mvc.model.JobTrgt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class SchemaCollectJob implements JobExec {

    Job job;

    List<JobTrgt> jobTrgtList;

    @Autowired
    SchemaCollector schemaCollector;

    @Override
    public void setJob(Map<String, Object> jobParamMap) {
        job = (Job) jobParamMap.get("job");
        jobTrgtList = (List<JobTrgt>) jobParamMap.get("jobTrgtList");
    }

    @Override
    public void doJob() {
        System.out.println("Job Id : " + job.getJobId() + "'s Collection Job is Start!");

        for (JobTrgt jobTrgt : jobTrgtList) {
            System.out.println("-> BizAreaId : " + jobTrgt.getBizAreaId() + " & TrgtId : " + jobTrgt.getTrgtId() + " begin...");
            Map<String, Object> collectorParamMap = new HashMap<String, Object>();
            collectorParamMap.put("job", job);
            collectorParamMap.put("bizAreaId", jobTrgt.getBizAreaId());
            collectorParamMap.put("trgtId", jobTrgt.getTrgtId());
            collectorParamMap.put("jbSeq", jobTrgt.getJbSeq());
            try {
                schemaCollector.setCollector(collectorParamMap);
                schemaCollector.doCollect();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                collectorParamMap.clear();
            }

            System.out.println("-> BizAreaId : " + jobTrgt.getBizAreaId() + " & TrgtId : " + jobTrgt.getTrgtId() + " end...");
        }

        System.out.println("Job Id : " + job.getJobId() + "'s Collection Job is Finish!");

    }
}
