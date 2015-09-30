package com.dbpat.mvc.mapper;

import com.dbpat.mvc.model.BizArea;
import com.dbpat.mvc.model.TargetVo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TargetVoMapper {
    List<TargetVo> selectAllTrgtVo(BizArea bizArea);
}
