package com.dbpat.util;

import org.springframework.stereotype.Component;

import java.util.Map;

//@Component
public interface JobExec {
    void setJob(Map<String, Object> jobParamMap);
    void doJob();
}
