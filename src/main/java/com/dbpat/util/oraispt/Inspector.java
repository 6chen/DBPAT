package com.dbpat.util.oraispt;


import com.dbpat.springmvc.model.RulePo;
import com.dbpat.util.oraclesql.AntlrEngine;
import com.dbpat.util.oraclesql.OracleSqlParser;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Inspector {

    private InspectRule inspectRule;
    private Map<String, Object> prmtMap;

    public Integer doUseQueryProcess() {
        RulePo queryProcessRulePo = (RulePo) prmtMap.get("queryProcessRulePo");

        try {
            this.inspectRule = (InspectRule) Class.forName(queryProcessRulePo.getRlCls()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //검사 검사작업을 수행하여 성공여부를 리턴한다.
        //0이 리턴되면 실폐이고 1를 리턴하면 성공이다.
        return inspectRule.apply(prmtMap);
    }

    public Integer doUseParseProcess() {
        RulePo parseProcessRulePo = (RulePo) prmtMap.get("parseProcessRulePo");

        // 파싱해햐할  SQL를 가져와서
//        String sqlString = (String) prmtMap.get("sqlString");

//        prmtMap.put("sqlString", sqlString);
        try {
//            //파싱하기 위해 필요한 파싱엔진을 가져옴
//            AntlrEngine antlrEngine = new AntlrEngine();
//            antlrEngine.doParsing(sqlString);
//            OracleSqlParser parser = antlrEngine.getParser();
//            ParseTree tree = antlrEngine.getTree();
//            prmtMap.put("parser", parser);
//            prmtMap.put("tree", tree);

            this.inspectRule = (InspectRule) Class.forName(parseProcessRulePo.getRlCls()).newInstance();
//        } catch (IOException e) {
//            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return inspectRule.apply(prmtMap);
    }

    public InspectRule getInspectRule() {
        return inspectRule;
    }

    public void setInspectRule(InspectRule inspectRule) {
        this.inspectRule = inspectRule;
    }

    public Map<String, Object> getPrmtMap() {
        return prmtMap;
    }

    public void setPrmtMap(Map<String, Object> prmtMap) {
        this.prmtMap = prmtMap;
    }
}
