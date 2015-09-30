package com.dbpat.mvc.mapper;

import org.springframework.stereotype.Repository;

import java.util.Map;


@Repository
public interface TargetMapper {
    void insertTarget(Map<String, Object> prmtMap);
}
