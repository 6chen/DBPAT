package com.dbpat.springmvc.model;

import org.springframework.stereotype.Component;

/**
 * Created by YUSIN on 16/1/13.
 */
@Component
public class BizAreaPo {
    private String BizAreaId;
    private String BizAreaStTm;
    private String BizAreaEdTm;
    private String BizAreaNm;
    private String BizAreaDescr;

    public String getBizAreaId() {
        return BizAreaId;
    }

    public void setBizAreaId(String bizAreaId) {
        BizAreaId = bizAreaId;
    }

    public String getBizAreaStTm() {
        return BizAreaStTm;
    }

    public void setBizAreaStTm(String bizAreaStTm) {
        BizAreaStTm = bizAreaStTm;
    }

    public String getBizAreaEdTm() {
        return BizAreaEdTm;
    }
    public void setBizAreaEdTm(String bizAreaEdTm) {
        BizAreaEdTm = bizAreaEdTm;
    }

    public String getBizAreaNm() {
        return BizAreaNm;
    }

    public void setBizAreaNm(String bizAreaNm) {
        BizAreaNm = bizAreaNm;
    }

    public String getBizAreaDescr() {
        return BizAreaDescr;
    }

    public void setBizAreaDescr(String bizAreaDescr) {
        BizAreaDescr = bizAreaDescr;
    }

    @Override
    public String toString() {
        return "BizAreaPo{" +
                "BizAreaId='" + BizAreaId + '\'' +
                ", BizAreaStTm='" + BizAreaStTm + '\'' +
                ", BizAreaEdTm='" + BizAreaEdTm + '\'' +
                ", BizAreaNm='" + BizAreaNm + '\'' +
                ", BizAreaDescr='" + BizAreaDescr + '\'' +
                '}';
    }
}
