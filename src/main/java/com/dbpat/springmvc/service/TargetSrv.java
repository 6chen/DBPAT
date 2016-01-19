package com.dbpat.springmvc.service;

import com.dbpat.springmvc.mapper.TargtMpr;
import com.dbpat.springmvc.model.TargetPo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by YUSIN on 16/1/14.
 */
@Service
public class TargetSrv {

    @Autowired
    TargtMpr targtMpr;

    public List<TargetPo> findAllTrgtByBizAreaId (String bizAreaId){
        return targtMpr.selectAllTrgtByBizAreaId(bizAreaId);
    }

    public TargetPo findOneTrgt(String bizAreaId, String trgtId){
        Map<String, Object> prmtMap = new HashMap<String, Object>();
        prmtMap.put("bizAreaId", bizAreaId);
        prmtMap.put("trgtId", trgtId);
        return targtMpr.selectOneTrgt(prmtMap);
    }

    public List<TargetPo> findAllTrgtByBizAreaIdNoAdd(Map<String, Object> prmtMap){
        return targtMpr.selectAllTrgtByBizAreaIdNoAdd(prmtMap);
    }

    public void addTrgtPo(TargetPo targetPo){
        targtMpr.insertTrgtPo(targetPo);
    }

    public void modifyTrgtPo(TargetPo targetPo){
        targtMpr.updateTrgtPo(targetPo);
    }

    public void removeTrgtPo(String bizAreaId, String trgtId){
        Map<String, Object> prmtMap = new HashMap<String, Object>();
        prmtMap.put("bizAreaId", bizAreaId);
        prmtMap.put("trgtId", trgtId);
        targtMpr.deleteTrgtPo(prmtMap);
    }
}
