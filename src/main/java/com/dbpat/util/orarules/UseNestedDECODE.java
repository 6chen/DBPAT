package com.dbpat.util.orarules;

import com.dbpat.util.InspectRule;
import com.dbpat.util.oraclesql.OracleSqlParser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.xpath.XPath;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by YUSIN on 16/1/6.
 */
public class UseNestedDECODE implements InspectRule{
    @Override
    public void apply(OracleSqlParser parser, ParseTree tree) {
        String xpath = "//function_expression";

        List<ParseTree> nodeList = new ArrayList<ParseTree>();

        nodeList.addAll(XPath.findAll(tree, xpath, parser));

        for (ParseTree node : nodeList){
//            System.out.println(node.getText());
//            System.out.println(node.getText().toUpperCase().startsWith("DECODE"));
//            System.out.println(node.getText().matches("DECODE(.*)DECODE(.*)"));

            if(node.getText().toUpperCase().matches("DECODE(.*)DECODE(.*)")){
                System.out.println(node.getText());
            }

        }
    }
}
