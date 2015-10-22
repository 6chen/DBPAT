package com.dbpat.mvc.service;

import com.dbpat.mvc.mapper.BizAreaMapper;
import com.dbpat.mvc.mapper.JobMapper;
import com.dbpat.mvc.mapper.JobTrgtVoMapper;
import com.dbpat.mvc.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by mtkim on 2015-10-12.
 */
@Service
public class SchemaJobService {

    @Autowired
    private JobMapper jobMapper;

    @Autowired
    private JobTrgtVoMapper jobTrgtVoMapper;

    public List<Job> findAllJobLst() {
        return jobMapper.selectAllSchemaJob();
    }

    public void insertJobLst(Job job){jobMapper.insertJob(job);}

    public void deleteSchema(Job job){
        jobMapper.deleteSchemaById(job);
    }

    public Job findJobById(Job job){
        return jobMapper.selectBySchemaId(job);
    }

    public void modifySchemaById(Job job){
        jobMapper.updateSchemaById(job);
    }

    public  List<JobTrgtVo> selectAllTrgtLst(Job job){
        return jobTrgtVoMapper.selectAllTargetLst(job);
    }
}
