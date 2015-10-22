package com.dbpat.mvc.mapper;

import com.dbpat.mvc.model.Job;
import com.dbpat.mvc.model.JobTrgtVo;
import com.dbpat.mvc.model.Target;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by mtkim on 2015-10-21.
 */
@Repository
public interface JobTrgtVoMapper {

    List<JobTrgtVo> selectAllTargetLst(Job job);
}
