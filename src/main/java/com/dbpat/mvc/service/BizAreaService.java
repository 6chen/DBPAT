package com.dbpat.mvc.service;

import com.dbpat.mvc.mapper.BizAreaMapper;
import com.dbpat.mvc.model.BizArea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by YUSIN on 9/24/15.
 */
@Service
public class BizAreaService {

    @Autowired
    private BizAreaMapper bizAreaMapper;

    public List<BizArea> findAllBizArea(){
        return bizAreaMapper.selectAllBizArea();
    };
}
