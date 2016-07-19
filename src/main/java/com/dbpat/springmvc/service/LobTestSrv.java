package com.dbpat.springmvc.service;

import com.dbpat.springmvc.mapper.LobSqlListMpr;
import com.dbpat.springmvc.model.LobSqlList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by YUSIN on 16/4/17.
 */
@Service
public class LobTestSrv {

    @Autowired
    LobSqlListMpr lobSqlListMpr;


    List<LobSqlList> findAllSqlList(){
        return lobSqlListMpr.selectAllList();
    };
}
