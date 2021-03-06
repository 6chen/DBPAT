package com.dbpat.springmvc.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by YUSIN on 16/1/18.
 */
@Component
public class JobTargetVo extends JobPo {
    private Integer execSeq;

    private Integer clctedYn;

    @Autowired
    private BizAreaPo bizAreaPo;

    @Autowired
    private TargetPo targetPo;

    @Override
    public String toString() {
        return "JobTargetVo{" +
                "bizAreaPo=" + bizAreaPo +
                ", execSeq=" + execSeq +
                ", targetPo=" + targetPo +
                ", clctedYn=" + clctedYn +
                '}';
    }

    public Integer getExecSeq() {
        return execSeq;
    }

    public void setExecSeq(Integer execSeq) {
        this.execSeq = execSeq;
    }

    public BizAreaPo getBizAreaPo() {
        return bizAreaPo;
    }

    public void setBizAreaPo(BizAreaPo bizAreaPo) {
        this.bizAreaPo = bizAreaPo;
    }

    public TargetPo getTargetPo() {
        return targetPo;
    }

    public void setTargetPo(TargetPo targetPo) {
        this.targetPo = targetPo;
    }

    public Integer getClctedYn() {
        return clctedYn;
    }

    public void setClctedYn(Integer clctedYn) {
        this.clctedYn = clctedYn;
    }
}
