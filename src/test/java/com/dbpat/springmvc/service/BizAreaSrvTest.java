package com.dbpat.springmvc.service;

import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by YUSIN on 16/1/13.
 */
public class BizAreaSrvTest extends TestCase {

    ApplicationContext ctx;

    public void setUp() throws Exception {
        ctx = new ClassPathXmlApplicationContext("applicationContext-mybatis.xml");
    }

    public void testFindAllBizArea() throws Exception {
        BizAreaSrv bizAreaSrv = (BizAreaSrv) ctx.getBean("bizAreaSrv");
        System.out.println(bizAreaSrv.findAllBizArea());
    }
}