package com.dbpat.springmvc.mapper;

import com.dbpat.springmvc.model.TargetPo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by YUSIN on 16/1/14.
 */
@Repository
public interface TargtMpr {
    List<TargetPo> selectAllTrgtByBizAreaId(String bizAreaId);

    TargetPo selectOneTrgt(Map<String, Object> prmtMap);

    void insertTrgtPo(TargetPo targetPo);

    void updateTrgtPo(TargetPo targetPo);

    void deleteTrgtPo(Map<String, Object> prmtMap);

}
