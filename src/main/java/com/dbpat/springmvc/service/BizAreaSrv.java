package com.dbpat.springmvc.service;

import com.dbpat.springmvc.mapper.BizAreaMpr;
import com.dbpat.springmvc.model.BizAreaPo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by YUSIN on 16/1/13.
 */
@Service
public class BizAreaSrv {

    @Autowired
    private BizAreaMpr bizAreaMpr;

    public List<BizAreaPo> findAllBizArea(){
        return bizAreaMpr.selectAllBizArea();
    }

    public BizAreaPo findBizAreaById(String bizAreaId){
        return bizAreaMpr.selectBizAreaById(bizAreaId);
    }

    public List<BizAreaPo> findAllBizAreaNoAdd(String jbId){
        return bizAreaMpr.selectAllBizAreaNoAdd(jbId);
    }

    public void addBizArea(BizAreaPo bizAreaPo){
        bizAreaMpr.insertBizArea(bizAreaPo);
    }

    public void modifyBizArea(BizAreaPo bizAreaPo){
        bizAreaMpr.updateBizArea(bizAreaPo);
    }

    public void removeBizArea(BizAreaPo bizAreaPo){
        bizAreaMpr.deleteBizArea(bizAreaPo);
    }
}
