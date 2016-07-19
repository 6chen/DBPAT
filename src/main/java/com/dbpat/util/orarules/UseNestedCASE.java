package com.dbpat.util.orarules;

import com.dbpat.util.oraclesql.OracleSqlParser;
import com.dbpat.util.oraispt.InspectRule;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.xpath.XPath;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by YUSIN on 16/1/6.
 */
public class UseNestedCASE implements InspectRule {
    @Override
    public Integer apply(Map<String, Object> prmtMap) {

        //전달해 온 변수들을 모두 받아온다.
        OracleSqlParser parser = (OracleSqlParser) prmtMap.get("parser");
        ParseTree tree = (ParseTree) prmtMap.get("tree");

        String xpath = "//case_expression//nested_expression//case_expression";

        List<ParseTree> nodeList = new ArrayList<ParseTree>();

        nodeList.addAll(XPath.findAll(tree, xpath, parser));

        return nodeList.size();
    }
}