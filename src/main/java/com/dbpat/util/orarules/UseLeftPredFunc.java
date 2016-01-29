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
public class UseLeftPredFunc implements InspectRule{
    @Override
    public void apply(OracleSqlParser parser, ParseTree tree) {
        // WHERE절 안에 있는 모든 조건들을 찾아낸다
        String xpath = "//where_clause//condition_expr";

        List<ParseTree> predicateNodeList = new ArrayList<ParseTree>();

        predicateNodeList.addAll(XPath.findAll(tree, xpath, parser));

        // 모든 조건들의 연산자 좌측에 있는 서브 트리를 찾아낸다
        List<ParseTree> lefPredicateNodeList = new ArrayList<ParseTree>();

        for (ParseTree predicateNode : predicateNodeList){
            lefPredicateNodeList.add(predicateNode.getChild(0).getChild(0));
        }


        // 모든 조건들의 연산자 좌측에 있는 서브 트리 중에서 함수를 적용한 부분 있는지를 체크

        // 일반적인 함수（aggregate_function）
//        String aggregateFuncXpath = "//aggregate_function";

        // 정규 표현식 함수를 포함하는 함수들(function_expression)
//        String funcExprXpath = "//function_expression";

        // Trim를 포함하는 특수 유형인 함수들 (special_function)
//        String specialFuncXpath = "//special_function";

        List<String> funcInspectXpathList = new ArrayList<String>();
        funcInspectXpathList.add("//aggregate_function");
        funcInspectXpathList.add("//function_expression");
        funcInspectXpathList.add("//special_function");

        List<ParseTree> violateNodeList = new ArrayList<ParseTree>();


        for (ParseTree lefPredicateNode : lefPredicateNodeList){
            for (String funcInspectXpath : funcInspectXpathList){
                violateNodeList.addAll(XPath.findAll(lefPredicateNode, funcInspectXpath, parser));
            }
        }

        for (ParseTree violateNode : violateNodeList){
            System.out.println(violateNode.getText());
        }
    }
}
