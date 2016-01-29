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

    public void doUseQueryProcess() {
        List<RulePo> queryProcessRulePoList = (List<RulePo>) prmtMap.get("queryProcessRulePoList");

        for (RulePo rulePo : queryProcessRulePoList) {
            try {
                this.inspectRule = (InspectRule) Class.forName(rulePo.getRlCls()).newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            inspectRule.apply(prmtMap);
        }
        return;
    }

    public void doUseParseProcess() {
        List<RulePo> parseProcessRulePoList = (List<RulePo>) prmtMap.get("parseProcessRulePoList");

        // 파싱해햐할  SQL를 모두 가져와서
        List<String> sqlStringList = new ArrayList<String>();

        for (String sqlString : sqlStringList) {

            prmtMap.put("sqlString", sqlString);
            try {
                //파싱하기 위해 필요한 파싱엔진을 가져옴
                AntlrEngine antlrEngine = new AntlrEngine();
                antlrEngine.doParsing(sqlString);
                OracleSqlParser parser = antlrEngine.getParser();
                ParseTree tree = antlrEngine.getTree();
                prmtMap.put("parser", parser);
                prmtMap.put("tree", tree);

                for (RulePo rulePo : parseProcessRulePoList) {
                    this.inspectRule = (InspectRule) Class.forName(rulePo.getRlCls()).newInstance();
                    Integer inspectResult = inspectRule.apply(prmtMap);

                    //결과에 따라 로그를 기록함.
                    //결과 개수가 0이면 해당 규칙을 준수한 것이다.
                    //결과 개수가 0보다 크면 해당 규칙을 위배한 항목이 있다는 것이다.

                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return;
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
