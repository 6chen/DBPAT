package com.dbpat.mvc.mapper;

import com.dbpat.mvc.model.Target;
import org.springframework.stereotype.Repository;

import java.util.Map;


@Repository
public interface TargetMapper {
    void insertTarget(Map<String, Object> prmtMap);

    void deleteTarget(Map<String, Object> prmtMap);

    void updateTarget(Map<String, Object> prmtMap);


}
