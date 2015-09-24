package com.dbpat.mvc.model;

import org.springframework.stereotype.Component;

/**
 * Created by YUSIN on 9/24/15.
 */
@Component
public class BizArea {
    private String bizAreaId;
    private String bizAreaNm;
    private String bizAreaDescr;

    public String getBizAreaId() {
        return bizAreaId;
    }

    public void setBizAreaId(String bizAreaId) {
        this.bizAreaId = bizAreaId;
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

    @Override
    public String toString() {
        return "BizArea{" +
                "bizAreaId='" + bizAreaId + '\'' +
                ", bizAreaNm='" + bizAreaNm + '\'' +
                ", bizAreaDescr='" + bizAreaDescr + '\'' +
                '}';
    }
}
