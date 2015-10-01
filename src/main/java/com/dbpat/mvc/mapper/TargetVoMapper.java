package com.dbpat.mvc.mapper;

import com.dbpat.mvc.model.BizArea;
import com.dbpat.mvc.model.Target;
import com.dbpat.mvc.model.TargetVo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface TargetVoMapper {
    List<TargetVo> selectAllTrgtVo(BizArea bizArea);

    TargetVo selectTargetVoById(Map<String, Object> prmtMap);
}
