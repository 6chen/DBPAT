package com.dbpat.mvc.service;

import com.dbpat.mvc.mapper.TargetMapper;
import com.dbpat.mvc.mapper.TargetVoMapper;
import com.dbpat.mvc.model.BizArea;
import com.dbpat.mvc.model.Target;
import com.dbpat.mvc.model.TargetVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TargetService {

    @Autowired
    TargetMapper targetMapper;

    @Autowired
    TargetVoMapper targetVoMapper;

    public List<TargetVo> findTargetByBizId(BizArea bizArea){
        return targetVoMapper.selectAllTrgtVo(bizArea);
    }

    public void insertTarget(Map<String, Object> prmtMap){
        targetMapper.insertTarget(prmtMap);
    }
}
