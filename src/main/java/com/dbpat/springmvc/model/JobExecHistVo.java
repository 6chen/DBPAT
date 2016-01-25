package com.dbpat.springmvc.model;

import org.springframework.stereotype.Component;

/**
 * Created by YUSIN on 16/1/25.
 */
@Component
public class JobExecHistVo  extends JobExecHistPo{
    private Integer elapseTm;

    public Integer getElapseTm() {
        return elapseTm;
    }

    public void setElapseTm(Integer elapseTm) {
        this.elapseTm = elapseTm;
    }
}
