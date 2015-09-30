package com.dbpat.mvc.mapper;

import com.dbpat.mvc.model.BizTargetDBMS;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BizTargetDBMSMapper {
    List<BizTargetDBMS> selectAllBizTargetDBMS();

}
