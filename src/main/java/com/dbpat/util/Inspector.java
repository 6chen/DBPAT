package com.dbpat.util;


import com.dbpat.springmvc.mapper.JobExecMpr;
import com.dbpat.util.oraclesql.AntlrEngine;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.List;

/**
 * Created by YUSIN on 16/1/7.
 */


public class Inspector {

    private String sqlString;
    private InspectRule inspectRule;
    private final String RULE_CLASS_PATH = "com.dbpat.util.orarules.";

//
//
//
//    public Inspector(String sqlString, InspectRule inspectRule) {
//        this.inspectRule = inspectRule;
//        this.sqlString = sqlString;
//    }

    public void doInspectBatch(List<String> inspectSqlList, List<String> inspectRuleList) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        for (String inspectSql : inspectSqlList){
            System.out.println("Start to inspect SQL: " + inspectSql);
            this.sqlString = inspectSql;

            AntlrEngine antlrEngine = new AntlrEngine();
            antlrEngine.doParsing(sqlString);

            for (String inspectRule : inspectRuleList){
                System.out.println("Start to inspect by -> " + inspectRule);
                this.inspectRule = (InspectRule) Class.forName(RULE_CLASS_PATH + inspectRule).newInstance();

                System.out.println("====> Start");
                this.inspectRule.apply(antlrEngine.getParser(), antlrEngine.getTree());
                System.out.println("====> Finish");
            }
            System.out.println();
        }
    }
}
