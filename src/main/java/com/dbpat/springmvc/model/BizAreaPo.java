package com.dbpat.springmvc.model;

import org.springframework.stereotype.Component;

/**
 * Created by YUSIN on 16/1/13.
 */
@Component
public class BizAreaPo {
    private String bizAreaId;
    private String bizAreaNm;
    private String bizAreaDescr;
    private String bizAreaStTm;
    private String bizAreaUptTm;

    public String getBizAreaId() {
        return bizAreaId;
    }

    public void setBizAreaId(String bizAreaId) {
        this.bizAreaId = bizAreaId;
    }

    public String getBizAreaStTm() {
        return bizAreaStTm;
    }

    public void setBizAreaStTm(String bizAreaStTm) {
        this.bizAreaStTm = bizAreaStTm;
    }

    public String getBizAreaNm() {
        return bizAreaNm;
    }

    public void setBizAreaNm(String bizAreaNm) {
        this.bizAreaNm = bizAreaNm;
    }

    public String getBizAreaDescr() {
        return bizAreaDescr;
    }

    public void setBizAreaDescr(String bizAreaDescr) {
        this.bizAreaDescr = bizAreaDescr;
    }

    public String getBizAreaUptTm() {
        return bizAreaUptTm;
    }

    public void setBizAreaUptTm(String bizAreaUptTm) {
        this.bizAreaUptTm = bizAreaUptTm;
    }

    @Override
    public String toString() {
        return "BizAreaPo{" +
                "bizAreaId='" + bizAreaId + '\'' +
                ", bizAreaNm='" + bizAreaNm + '\'' +
                ", bizAreaDescr='" + bizAreaDescr + '\'' +
                ", bizAreaStTm='" + bizAreaStTm + '\'' +
                ", bizAreaUptTm='" + bizAreaUptTm + '\'' +
                '}';
    }
}
