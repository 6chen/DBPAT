package com.dbpat.springmvc.mapper;

import com.dbpat.springmvc.model.DbmsTypePerClctTabVo;
import com.dbpat.springmvc.model.DbmsTypeVo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by YUSIN on 16/1/22.
 */
@Repository
public interface DbmsTypeClctTabMpr {
    DbmsTypeVo selectDbmsTypeVoByDbmsTypId(String dbmsTypId);
}
