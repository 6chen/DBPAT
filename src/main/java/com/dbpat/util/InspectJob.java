package com.dbpat.util;

import java.io.IOException;
import java.util.List;

/**
 * Created by YUSIN on 16/1/7.
 */
public class InspectJob {
    private String JobName;
    private List<String> inspectSqlList;
    private List<String> inspectRuleList;


    public List<String> getInspectRuleList() {
        return inspectRuleList;
    }

    public void setInspectRuleList(List<String> inspectRuleList) {
        this.inspectRuleList = inspectRuleList;
    }

    public List<String> getInspectSqlList() {
        return inspectSqlList;
    }

    public void setInspectSqlList(List<String> inspectSqlList) {
        this.inspectSqlList = inspectSqlList;
    }

    public String getJobName() {
        return JobName;
    }

    public void setJobName(String jobName) {
        JobName = jobName;
    }

    public void doJob() throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {
        Inspector inspector = new Inspector();
        inspector.doInspectBatch(this.inspectSqlList, this.getInspectRuleList());
    }
}
