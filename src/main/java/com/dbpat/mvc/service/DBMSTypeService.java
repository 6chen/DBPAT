package com.dbpat.mvc.service;

import com.dbpat.mvc.mapper.DbmsTypeMapper;
import com.dbpat.mvc.model.DbmsType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DBMSTypeService {

    @Autowired
    private DbmsTypeMapper dbmsTypeMapper;

    public List<DbmsType> findAllDbmsType(){
        return dbmsTypeMapper.selectAllDbmsType();
    }
}
