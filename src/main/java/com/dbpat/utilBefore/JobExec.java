package com.dbpat.utilBefore;

import java.util.Map;

public interface JobExec {
    void setJob(Map<String, Object> jobParamMap);

    void doJob();
}
