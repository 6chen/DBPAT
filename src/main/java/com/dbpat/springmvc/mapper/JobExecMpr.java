package com.dbpat.springmvc.mapper;

import com.dbpat.springmvc.model.CollectJobExecDetailPo;
import com.dbpat.springmvc.model.ExecJobVo;
import com.dbpat.springmvc.model.JobExecHistPo;
import com.dbpat.springmvc.model.JobExecHistVo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by YUSIN on 16/1/21.
 */
@Repository
public interface JobExecMpr {
    ExecJobVo selectExecJobVoByJbId(String jbId);

//    List<ExecJobVo> selectExecJobVoByJbTyp(String jbTyp);

    Integer selectJobExecHistCnt(Map<String, Object> prmtMap);

    List<JobExecHistVo> selectJobALlHistByJbId(String jbId);

    List<JobExecHistVo> selectJobPerHistByJbBizTrgtId(Map<String, Object> prmtMap);

    List<CollectJobExecDetailPo> selectCollectJobExecDetailPo(Map<String, Object> prmtMap);

    void insertNewJobWithStTm(Map<String, Object> prmtMap);

    void updateNewJobEdTm(Map<String, Object> prmtMap);

    void insertNewJobExecItmStTm(Map<String, Object> prmtMap);

    void updateNewJobExecItmEdTm(Map<String, Object> prmtMap);
}
