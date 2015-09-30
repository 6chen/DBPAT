package com.dbpat.mvc.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BizTargetDBMS {

    @Autowired
    private BizArea bizArea;

    @Autowired
    private Target target;

    @Autowired
    private DbmsType dbmsType;

    public BizArea getBizArea() {
        return bizArea;
    }

    public void setBizArea(BizArea bizArea) {
        this.bizArea = bizArea;
    }

    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }

    public DbmsType getDbmsType() {
        return dbmsType;
    }

    public void setDbmsType(DbmsType dbmsType) {
        this.dbmsType = dbmsType;
    }

    @Override
    public String toString() {
        return "BizTargetDBMS{" +
                "bizArea=" + bizArea +
                ", target=" + target +
                ", dbmsType=" + dbmsType +
                '}';
    }
}
