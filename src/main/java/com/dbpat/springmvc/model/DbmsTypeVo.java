package com.dbpat.springmvc.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by YUSIN on 16/1/22.
 */
@Component
public class DbmsTypeVo extends DbmsTypePo{

    @Autowired
    List<DbmsTypePerClctTabVo> dbmsTypePerClctTabVoList;

    public List<DbmsTypePerClctTabVo> getDbmsTypePerClctTabVoList() {
        return dbmsTypePerClctTabVoList;
    }

    public void setDbmsTypePerClctTabVoList(List<DbmsTypePerClctTabVo> dbmsTypePerClctTabVoList) {
        this.dbmsTypePerClctTabVoList = dbmsTypePerClctTabVoList;
    }

    @Override
    public String toString() {
        return "DbmsTypeVo{" +
                "dbmsTypePerClctTabVoList=" + dbmsTypePerClctTabVoList +
                '}';
    }
}
