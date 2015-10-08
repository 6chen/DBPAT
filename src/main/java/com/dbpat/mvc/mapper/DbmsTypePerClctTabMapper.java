package com.dbpat.mvc.mapper;

import com.dbpat.mvc.model.DbmsTypePerClctTab;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DbmsTypePerClctTabMapper {
    List<DbmsTypePerClctTab> selectAllClctTabById(String dbmsTypId);
}
