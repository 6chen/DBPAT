package com.dbpat.mvc.mapper;

import com.dbpat.mvc.model.DbmsType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DbmsTypeMapper {
    List<DbmsType> selectAllDbmsType();
}
