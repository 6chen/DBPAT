package com.dbpat.springmvc.mapper;

import com.dbpat.springmvc.model.BizAreaPo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by YUSIN on 16/1/13.
 */
@Repository
public interface BizAreaMpr {
    List<BizAreaPo> selectAllBizArea();

    BizAreaPo selectBizAreaById(String bizAreaId);

    void insertBizArea(BizAreaPo bizAreaPo);

    void updateBizAreaEndTmById(String bizAreaId);

    void insertModifiedBizArea(BizAreaPo bizAreaPo);
}
