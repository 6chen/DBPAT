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
public class UseNestedDECODE implements InspectRule {
    @Override
    public Integer apply(Map<String, Object> prmtMap) {

        //전달해 온 변수들을 모두 받아온다.
        OracleSqlParser parser = (OracleSqlParser) prmtMap.get("parser");
        ParseTree tree = (ParseTree) prmtMap.get("tree");

        String xpath = "//function_expression";

        List<ParseTree> nodeList = new ArrayList<ParseTree>();

        nodeList.addAll(XPath.findAll(tree, xpath, parser));

        Integer violateCnt = 0;

        for (ParseTree node : nodeList){
//            System.out.println(node.getText());
//            System.out.println(node.getText().toUpperCase().startsWith("DECODE"));
//            System.out.println(node.getText().matches("DECODE(.*)DECODE(.*)"));

            if(node.getText().toUpperCase().matches("DECODE(.*)DECODE(.*)")){
//                System.out.println(node.getText());
                violateCnt++;
            }

        }

        return violateCnt;
    }
}
