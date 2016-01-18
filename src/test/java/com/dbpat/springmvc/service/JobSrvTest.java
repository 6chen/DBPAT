package com.dbpat.springmvc.service;

import com.dbpat.springmvc.model.JobTargetBizVo;
import com.dbpat.springmvc.model.JobTargetVo;
import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by YUSIN on 16/1/18.
 */
public class JobSrvTest extends TestCase {

    ApplicationContext ctx;

    public void setUp() throws Exception {
        ctx = new ClassPathXmlApplicationContext("applicationContext-mybatis.xml");
    }

    public void testFindJobTargetVoByJbId() throws Exception {
        JobSrv jobSrv = (JobSrv) ctx.getBean("jobSrv");

//        List<JobTargetVo> jobTargetVoList = jobSrv.findJobTargetVoByJbId("607DCFF311FC4EBC8E7A32EA97AD8E49");
//
//        System.out.println(jobTargetVoList.size());
//        System.out.println(jobTargetVoList);

//        List<JobTargetBizVo> jobTargetBizVolist = jobSrv.findJobTargetBizVoByJbId("607DCFF311FC4EBC8E7A32EA97AD8E49");
//
//        System.out.println(jobTargetBizVolist.size());
//        System.out.println(jobTargetBizVolist);
    }
}