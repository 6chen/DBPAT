package com.dbpat.springmvc.mapper;

import com.dbpat.springmvc.model.DbmsTypePo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by YUSIN on 16/1/14.
 */
@Repository
public interface DbmsTypeMpr {
    List<DbmsTypePo> selectAllDbmsType();
}
