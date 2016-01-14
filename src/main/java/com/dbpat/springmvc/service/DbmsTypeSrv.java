package com.dbpat.springmvc.service;

import com.dbpat.springmvc.mapper.DbmsTypeMpr;
import com.dbpat.springmvc.model.DbmsTypePo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by YUSIN on 16/1/14.
 */
@Service
public class DbmsTypeSrv {

    @Autowired
    private DbmsTypeMpr dbmsTypeMpr;

    public List<DbmsTypePo> findAllDbmsType(){
        return dbmsTypeMpr.selectAllDbmsType();
    }
}
