package com.dbpat.springmvc.mapper;

import com.dbpat.springmvc.model.ExecJobVo;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * Created by YUSIN on 16/1/21.
 */
@Repository
public interface JobExecMpr {
    ExecJobVo selectExecJobVoByJbId(String jbId);

    Integer selectJobExecHistCnt(Map<String, Object> prmtMap);

    void insertNewJobWithStTm(Map<String, Object> prmtMap);

    void updateNewJobEdTm(Map<String, Object> prmtMap);

    void insertNewJobExecItmStTm(Map<String, Object> prmtMap);

    void updateNewJobExecItmEdTm(Map<String, Object> prmtMap);
}
