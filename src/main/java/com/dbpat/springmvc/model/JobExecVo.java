package com.dbpat.springmvc.model;

import com.dbpat.util.JobExecI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by YUSIN on 16/1/21.
 */
@Component
public class JobExecVo extends JobPo implements JobExecI{

    protected Integer execSeq;

    @Autowired
    protected List<BizAreaPo> bizAreaPoList;

    @Autowired
    protected List<TargetPo> targetPoList;

    @Autowired
    protected List<DbmsTypePerClctTabVo> dbmsTypePerClctTabVoList;

    @Override
    public boolean execJob() {
        return false;
    }


    @Override
    public String toString() {
        return "JobExecVo{" +
                "bizAreaPoList=" + bizAreaPoList +
                ", execSeq=" + execSeq +
                ", targetPoList=" + targetPoList +
                ", dbmsTypePerClctTabVoList=" + dbmsTypePerClctTabVoList +
                '}';
    }

    public List<BizAreaPo> getBizAreaPoList() {
        return bizAreaPoList;
    }

    public void setBizAreaPoList(List<BizAreaPo> bizAreaPoList) {
        this.bizAreaPoList = bizAreaPoList;
    }

    public List<DbmsTypePerClctTabVo> getDbmsTypePerClctTabVoList() {
        return dbmsTypePerClctTabVoList;
    }

    public void setDbmsTypePerClctTabVoList(List<DbmsTypePerClctTabVo> dbmsTypePerClctTabVoList) {
        this.dbmsTypePerClctTabVoList = dbmsTypePerClctTabVoList;
    }

    public List<TargetPo> getTargetPoList() {
        return targetPoList;
    }

    public void setTargetPoList(List<TargetPo> targetPoList) {
        this.targetPoList = targetPoList;
    }

    public Integer getExecSeq() {
        return execSeq;
    }

    public void setExecSeq(Integer execSeq) {
        this.execSeq = execSeq;
    }
}
