package com.dbpat.springmvc.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by YUSIN on 16/1/21.
 */
@Component
public class DbmsTypePerClctTabVo{

    private Integer seq;

    @Autowired
    CollectTabPo collectTabPo;

    @Override
    public String toString() {
        return "DbmsTypePerClctTabVo{" +
                "collectTabPo=" + collectTabPo +
                ", seq=" + seq +
                '}';
    }

    public CollectTabPo getCollectTabPo() {
        return collectTabPo;
    }

    public void setCollectTabPo(CollectTabPo collectTabPo) {
        this.collectTabPo = collectTabPo;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }
}
