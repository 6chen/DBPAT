package com.dbpat.mvc.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TargetVo extends Target{

    @Autowired
    private BizArea bizArea;

    @Autowired
    private DbmsType dbmsType;

    public BizArea getBizArea() {
        return bizArea;
    }

    public void setBizArea(BizArea bizArea) {
        this.bizArea = bizArea;
    }

    public DbmsType getDbmsType() {
        return dbmsType;
    }

    public void setDbmsType(DbmsType dbmsType) {
        this.dbmsType = dbmsType;
    }

    @Override
    public String toString() {
        return "TargetVo{" +
                "bizArea=" + bizArea +
                ", trgtId='" + trgtId + '\'' +
                ", trgtNm='" + trgtNm + '\'' +
                ", trgtTyp='" + trgtTyp + '\'' +
                ", ip='" + ip + '\'' +
                ", prt='" + prt + '\'' +
                ", usrId='" + usrId + '\'' +
                ", pw='" + pw + '\'' +
                ", serv='" + serv + '\'' +
                ", schm='" + schm + '\'' +
                ", path='" + path + '\'' +
                ", clctCycl=" + clctCycl +
                ", dbmsType=" + dbmsType +
                '}';
    }
}
