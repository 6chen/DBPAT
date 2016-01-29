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
public class UseNestedSubqeury implements InspectRule{
    @Override
    public void apply(OracleSqlParser parser, ParseTree tree) {
        String xpath = "//select_statement//subquery/select_statement//subquery/select_statement";

        List<ParseTree> nodeList = new ArrayList<ParseTree>();

        nodeList.addAll(XPath.findAll(tree, xpath, parser));

        System.out.println(nodeList.size());

//        nodeList.forEach(System.out::println);

        for (ParseTree node : nodeList){
            System.out.println(node.getText());
        }
    }
}
