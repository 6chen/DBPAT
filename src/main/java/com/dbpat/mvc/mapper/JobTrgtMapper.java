package com.dbpat.mvc.mapper;

import com.dbpat.mvc.model.JobTrgt;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by YUSIN on 10/22/15.
 */
@Repository
public interface JobTrgtMapper {
    List<JobTrgt> selectAllJobTrgtByJobId(String jobId);
}
