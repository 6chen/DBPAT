package com.dbpat.mvc.mapper;

import com.dbpat.mvc.model.BizArea;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by YUSIN on 9/24/15.
 */
@Repository
public interface BizAreaMapper {
    List<BizArea> selectAllBizArea();
}
