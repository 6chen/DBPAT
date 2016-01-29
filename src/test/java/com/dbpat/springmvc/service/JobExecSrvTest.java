package com.dbpat.springmvc.service;

import com.dbpat.springmvc.model.*;
import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
//        JobExecSrv jobExecSrv = (JobExecSrv) ctx.getBean("jobExecSrv");
//        DbmsTypeVo dbmsTypeVo = jobExecSrv.findDbmsTypeVoByDbmsTypId("329EB5FEE1C6480DA4B95331358091AE");
//
//        System.out.println(dbmsTypeVo);
//
//        System.out.println(dbmsTypeVo.getDbmsTypePerClctTabVoList().size());
//
//        for (DbmsTypePerClctTabVo dbmsTypePerClctTabVo : dbmsTypeVo.getDbmsTypePerClctTabVoList()) {
//            System.out.println(dbmsTypePerClctTabVo.getSeq() + ": " + dbmsTypePerClctTabVo.getCollectTabPo().getClctTabNm());
//        }
//        Map<String, Object> prmtMap = new HashMap<String, Object>();
//
//        prmtMap.put("jbId","C44B62EEB496438181422B5AC586DF36");
//        prmtMap.put("jbExecCnt",2);
//
//        List<CollectJobExecDetailPo> collectJobExecDetailPoList = jobExecSrv.findCollectJobExecDetailPo(prmtMap);
//
//
//        System.out.println(collectJobExecDetailPoList.size());
//        System.out.println(collectJobExecDetailPoList);

//        RuleSrv ruleSrv = (RuleSrv) ctx.getBean("ruleSrv");
//
//        List<RuleSetVo> ruleSetVoList = ruleSrv.findAllRuleSetVoByJbId("7030579008C44AAFB52D79903243DC42");
//
//        System.out.println(ruleSetVoList.size());
//
//        System.out.println(ruleSetVoList);
//
//        for (RuleSetVo ruleSetVo : ruleSetVoList) {
//            System.out.println(ruleSetVo.getRlSetId());
//            System.out.println(ruleSetVo.getRlSetNm());
//            System.out.println(ruleSetVo.getRlSetDescr());
//            System.out.println(ruleSetVo.getRulePoList());
//        }


        JobExecSrv jobExecSrv = (JobExecSrv) ctx.getBean("jobExecSrv");

//        jobExecSrv.startInspectJobByJbId();

        jobExecSrv.startInspectJobByJbId("51DC1404391B4D18B31A081F9152B042");
    }
}