package com.dbpat.mvc.service;

import com.dbpat.mvc.mapper.BizAreaMapper;
import com.dbpat.mvc.model.BizArea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BizAreaService {

    @Autowired
    private BizAreaMapper bizAreaMapper;

    public List<BizArea> findAllBizArea() {
        return bizAreaMapper.selectAllBizArea();
    }

    public void addBizArea(BizArea bizArea){bizAreaMapper.insertBizArea(bizArea);}

    public void deleteBizArea(BizArea bizArea){
        bizAreaMapper.deleteBizAreaById(bizArea);
    }
}
