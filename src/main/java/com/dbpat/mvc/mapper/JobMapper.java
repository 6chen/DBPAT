package com.dbpat.mvc.mapper;

import com.dbpat.mvc.model.BizArea;
import com.dbpat.mvc.model.Job;
import com.dbpat.mvc.model.JobTrgt;
import com.dbpat.mvc.model.Target;

import java.util.List;
import java.util.Map;

/**
 * Created by mtkim on 2015-10-12.
 */
public interface JobMapper {

    List<Job> selectAllSchemaJob();

    void insertJob(Job job);

    void deleteSchemaById(Job job);

    Job selectBySchemaId(Job job);

    void updateSchemaById(Job job);


}
