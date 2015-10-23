package com.dbpat.mvc.mapper;

import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface JobTrgtHistMapper {
    void insertSchmColctJobTrgtHist(Map<String, Object> paramMap);
}
