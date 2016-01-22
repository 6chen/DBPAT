package com.dbpat.springmvc.service;

import com.dbpat.springmvc.model.DbmsTypePerClctTabVo;
import com.dbpat.springmvc.model.DbmsTypeVo;
import com.dbpat.springmvc.model.ExecJobTargetVo;
import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by YUSIN on 16/1/21.
 */
public class JobExecSrvTest extends TestCase {
    ApplicationContext ctx;

    public void setUp() throws Exception {
        ctx = new ClassPathXmlApplicationContext("applicationContext-mybatis.xml");
    }

    public void testFindCollectJobVoByJbId() throws Exception {
        JobExecSrv jobExecSrv = (JobExecSrv) ctx.getBean("jobExecSrv");

        jobExecSrv.startCollectJobByJbId("C44B62EEB496438181422B5AC586DF36");

    }

    public void testFindDbmsTypePerClctTabVoByDbmsTypId() throws Exception {
        JobExecSrv jobExecSrv = (JobExecSrv) ctx.getBean("jobExecSrv");
        DbmsTypeVo dbmsTypeVo = jobExecSrv.findDbmsTypeVoByDbmsTypId("329EB5FEE1C6480DA4B95331358091AE");

        System.out.println(dbmsTypeVo);

        System.out.println(dbmsTypeVo.getDbmsTypePerClctTabVoList().size());

        for (DbmsTypePerClctTabVo dbmsTypePerClctTabVo : dbmsTypeVo.getDbmsTypePerClctTabVoList()) {
            System.out.println(dbmsTypePerClctTabVo.getSeq() + ": " + dbmsTypePerClctTabVo.getCollectTabPo().getClctTabNm());
        }
    }
}