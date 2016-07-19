package com.dbpat.springmvc.service;

import com.dbpat.springmvc.model.LobSqlList;
import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by YUSIN on 16/4/17.
 */
public class LobTestSrvTest extends TestCase {

    ApplicationContext ctx;

    public void setUp() throws Exception {
        ctx = new ClassPathXmlApplicationContext("applicationContext-mybatis.xml");
    }

    public void testFindAllSqlList() throws Exception {
        LobTestSrv lobTestSrv = (LobTestSrv) ctx.getBean("lobTestSrv");
        List<LobSqlList> lobSqlLists =  lobTestSrv.findAllSqlList();
        for (LobSqlList lobSqlList : lobSqlLists) {
            System.out.println(lobSqlList);
        }
    }
}