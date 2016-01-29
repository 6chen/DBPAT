package com.dbpat.springmvc.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by YUSIN on 16/1/21.
 */
@Component
public class ExecJobVo extends JobPo{

    @Autowired
    protected List<ExecJobTargetVo> execJobTargetVoList;

    public List<ExecJobTargetVo> getExecJobTargetVoList() {
        return execJobTargetVoList;
    }

    public void setExecJobTargetVoList(List<ExecJobTargetVo> execJobTargetVoList) {
        this.execJobTargetVoList = execJobTargetVoList;
    }

    @Override
    public String toString() {
        return "ExecJobVo{" +
                "execJobTargetVoList=" + execJobTargetVoList +
                '}';
    }

}
