package com.dbpat.springmvc.model;

import org.springframework.stereotype.Component;

/**
 * Created by YUSIN on 16/1/19.
 */
@Component
public class JobRuleSetRelPo {
    private String jbId;
    private String rlSetId;
    private String rlSetNm;
    private String ckdYn;


    public String getCkdYn() {
        return ckdYn;
    }

    public String getRlSetNm() {
        return rlSetNm;
    }

    public void setRlSetNm(String rlSetNm) {
        this.rlSetNm = rlSetNm;
    }

    public void setCkdYn(String ckdYn) {
        this.ckdYn = ckdYn;
    }

    public String getJbId() {
        return jbId;
    }

    public void setJbId(String jbId) {
        this.jbId = jbId;
    }

    public String getRlSetId() {
        return rlSetId;
    }

    public void setRlSetId(String rlSetId) {
        this.rlSetId = rlSetId;
    }
}
