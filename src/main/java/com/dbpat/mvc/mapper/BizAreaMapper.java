package com.dbpat.mvc.mapper;

import com.dbpat.mvc.model.BizArea;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BizAreaMapper {
    List<BizArea> selectAllBizArea();

    void insertBizArea(BizArea bizArea);

    void deleteBizAreaById(BizArea bizArea);
}
