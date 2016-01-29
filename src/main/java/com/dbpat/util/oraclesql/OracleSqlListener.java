// Generated from /Users/YUSIN/IdeaProjects/Antlr4Practise/AntlrV4CSV/OracleSql.g4 by ANTLR 4.5.1

package com.dbpat.util.oraclesql;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link OracleSqlParser}.
 */
public interface OracleSqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(OracleSqlParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(OracleSqlParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#delete_statement}.
	 * @param ctx the parse tree
	 */
	void enterDelete_statement(OracleSqlParser.Delete_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#delete_statement}.
	 * @param ctx the parse tree
	 */
	void exitDelete_statement(OracleSqlParser.Delete_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#merge_statement}.
	 * @param ctx the parse tree
	 */
	void enterMerge_statement(OracleSqlParser.Merge_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#merge_statement}.
	 * @param ctx the parse tree
	 */
	void exitMerge_statement(OracleSqlParser.Merge_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#merge_update_clause}.
	 * @param ctx the parse tree
	 */
	void enterMerge_update_clause(OracleSqlParser.Merge_update_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#merge_update_clause}.
	 * @param ctx the parse tree
	 */
	void exitMerge_update_clause(OracleSqlParser.Merge_update_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#merge_insert_clause}.
	 * @param ctx the parse tree
	 */
	void enterMerge_insert_clause(OracleSqlParser.Merge_insert_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#merge_insert_clause}.
	 * @param ctx the parse tree
	 */
	void exitMerge_insert_clause(OracleSqlParser.Merge_insert_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#insert_statement}.
	 * @param ctx the parse tree
	 */
	void enterInsert_statement(OracleSqlParser.Insert_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#insert_statement}.
	 * @param ctx the parse tree
	 */
	void exitInsert_statement(OracleSqlParser.Insert_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#single_table_insert}.
	 * @param ctx the parse tree
	 */
	void enterSingle_table_insert(OracleSqlParser.Single_table_insertContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#single_table_insert}.
	 * @param ctx the parse tree
	 */
	void exitSingle_table_insert(OracleSqlParser.Single_table_insertContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#insert_into_clause}.
	 * @param ctx the parse tree
	 */
	void enterInsert_into_clause(OracleSqlParser.Insert_into_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#insert_into_clause}.
	 * @param ctx the parse tree
	 */
	void exitInsert_into_clause(OracleSqlParser.Insert_into_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#values_clause}.
	 * @param ctx the parse tree
	 */
	void enterValues_clause(OracleSqlParser.Values_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#values_clause}.
	 * @param ctx the parse tree
	 */
	void exitValues_clause(OracleSqlParser.Values_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#returning_clause}.
	 * @param ctx the parse tree
	 */
	void enterReturning_clause(OracleSqlParser.Returning_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#returning_clause}.
	 * @param ctx the parse tree
	 */
	void exitReturning_clause(OracleSqlParser.Returning_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#multi_table_insert}.
	 * @param ctx the parse tree
	 */
	void enterMulti_table_insert(OracleSqlParser.Multi_table_insertContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#multi_table_insert}.
	 * @param ctx the parse tree
	 */
	void exitMulti_table_insert(OracleSqlParser.Multi_table_insertContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#conditional_insert_clause}.
	 * @param ctx the parse tree
	 */
	void enterConditional_insert_clause(OracleSqlParser.Conditional_insert_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#conditional_insert_clause}.
	 * @param ctx the parse tree
	 */
	void exitConditional_insert_clause(OracleSqlParser.Conditional_insert_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#dml_table_expression_clause}.
	 * @param ctx the parse tree
	 */
	void enterDml_table_expression_clause(OracleSqlParser.Dml_table_expression_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#dml_table_expression_clause}.
	 * @param ctx the parse tree
	 */
	void exitDml_table_expression_clause(OracleSqlParser.Dml_table_expression_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#error_logging_clause}.
	 * @param ctx the parse tree
	 */
	void enterError_logging_clause(OracleSqlParser.Error_logging_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#error_logging_clause}.
	 * @param ctx the parse tree
	 */
	void exitError_logging_clause(OracleSqlParser.Error_logging_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#data_item}.
	 * @param ctx the parse tree
	 */
	void enterData_item(OracleSqlParser.Data_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#data_item}.
	 * @param ctx the parse tree
	 */
	void exitData_item(OracleSqlParser.Data_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#update_statement}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_statement(OracleSqlParser.Update_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#update_statement}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_statement(OracleSqlParser.Update_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#update_set_clause}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_set_clause(OracleSqlParser.Update_set_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#update_set_clause}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_set_clause(OracleSqlParser.Update_set_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#update_set_clause_part1}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_set_clause_part1(OracleSqlParser.Update_set_clause_part1Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#update_set_clause_part1}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_set_clause_part1(OracleSqlParser.Update_set_clause_part1Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#update_set_clause_part2}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_set_clause_part2(OracleSqlParser.Update_set_clause_part2Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#update_set_clause_part2}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_set_clause_part2(OracleSqlParser.Update_set_clause_part2Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelect_statement(OracleSqlParser.Select_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelect_statement(OracleSqlParser.Select_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#subquery_factoring_clause}.
	 * @param ctx the parse tree
	 */
	void enterSubquery_factoring_clause(OracleSqlParser.Subquery_factoring_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#subquery_factoring_clause}.
	 * @param ctx the parse tree
	 */
	void exitSubquery_factoring_clause(OracleSqlParser.Subquery_factoring_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#subquery_factoring_clause_part_first}.
	 * @param ctx the parse tree
	 */
	void enterSubquery_factoring_clause_part_first(OracleSqlParser.Subquery_factoring_clause_part_firstContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#subquery_factoring_clause_part_first}.
	 * @param ctx the parse tree
	 */
	void exitSubquery_factoring_clause_part_first(OracleSqlParser.Subquery_factoring_clause_part_firstContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#subquery_factoring_clause_part_next}.
	 * @param ctx the parse tree
	 */
	void enterSubquery_factoring_clause_part_next(OracleSqlParser.Subquery_factoring_clause_part_nextContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#subquery_factoring_clause_part_next}.
	 * @param ctx the parse tree
	 */
	void exitSubquery_factoring_clause_part_next(OracleSqlParser.Subquery_factoring_clause_part_nextContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#search_clause}.
	 * @param ctx the parse tree
	 */
	void enterSearch_clause(OracleSqlParser.Search_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#search_clause}.
	 * @param ctx the parse tree
	 */
	void exitSearch_clause(OracleSqlParser.Search_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#cycle_clause}.
	 * @param ctx the parse tree
	 */
	void enterCycle_clause(OracleSqlParser.Cycle_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#cycle_clause}.
	 * @param ctx the parse tree
	 */
	void exitCycle_clause(OracleSqlParser.Cycle_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#select_list}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list(OracleSqlParser.Select_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#select_list}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list(OracleSqlParser.Select_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#displayed_column_part_first}.
	 * @param ctx the parse tree
	 */
	void enterDisplayed_column_part_first(OracleSqlParser.Displayed_column_part_firstContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#displayed_column_part_first}.
	 * @param ctx the parse tree
	 */
	void exitDisplayed_column_part_first(OracleSqlParser.Displayed_column_part_firstContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#displayed_column_part_next}.
	 * @param ctx the parse tree
	 */
	void enterDisplayed_column_part_next(OracleSqlParser.Displayed_column_part_nextContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#displayed_column_part_next}.
	 * @param ctx the parse tree
	 */
	void exitDisplayed_column_part_next(OracleSqlParser.Displayed_column_part_nextContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#displayed_column}.
	 * @param ctx the parse tree
	 */
	void enterDisplayed_column(OracleSqlParser.Displayed_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#displayed_column}.
	 * @param ctx the parse tree
	 */
	void exitDisplayed_column(OracleSqlParser.Displayed_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#sql_expression}.
	 * @param ctx the parse tree
	 */
	void enterSql_expression(OracleSqlParser.Sql_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#sql_expression}.
	 * @param ctx the parse tree
	 */
	void exitSql_expression(OracleSqlParser.Sql_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#expr_add}.
	 * @param ctx the parse tree
	 */
	void enterExpr_add(OracleSqlParser.Expr_addContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#expr_add}.
	 * @param ctx the parse tree
	 */
	void exitExpr_add(OracleSqlParser.Expr_addContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#expr_mul}.
	 * @param ctx the parse tree
	 */
	void enterExpr_mul(OracleSqlParser.Expr_mulContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#expr_mul}.
	 * @param ctx the parse tree
	 */
	void exitExpr_mul(OracleSqlParser.Expr_mulContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#expr_sign}.
	 * @param ctx the parse tree
	 */
	void enterExpr_sign(OracleSqlParser.Expr_signContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#expr_sign}.
	 * @param ctx the parse tree
	 */
	void exitExpr_sign(OracleSqlParser.Expr_signContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#expr_expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr_expr(OracleSqlParser.Expr_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#expr_expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr_expr(OracleSqlParser.Expr_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#expr_paren}.
	 * @param ctx the parse tree
	 */
	void enterExpr_paren(OracleSqlParser.Expr_parenContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#expr_paren}.
	 * @param ctx the parse tree
	 */
	void exitExpr_paren(OracleSqlParser.Expr_parenContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#nested_expression}.
	 * @param ctx the parse tree
	 */
	void enterNested_expression(OracleSqlParser.Nested_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#nested_expression}.
	 * @param ctx the parse tree
	 */
	void exitNested_expression(OracleSqlParser.Nested_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#function_expression}.
	 * @param ctx the parse tree
	 */
	void enterFunction_expression(OracleSqlParser.Function_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#function_expression}.
	 * @param ctx the parse tree
	 */
	void exitFunction_expression(OracleSqlParser.Function_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#call_parameters}.
	 * @param ctx the parse tree
	 */
	void enterCall_parameters(OracleSqlParser.Call_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#call_parameters}.
	 * @param ctx the parse tree
	 */
	void exitCall_parameters(OracleSqlParser.Call_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#call_parameter}.
	 * @param ctx the parse tree
	 */
	void enterCall_parameter(OracleSqlParser.Call_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#call_parameter}.
	 * @param ctx the parse tree
	 */
	void exitCall_parameter(OracleSqlParser.Call_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#parameter_name}.
	 * @param ctx the parse tree
	 */
	void enterParameter_name(OracleSqlParser.Parameter_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#parameter_name}.
	 * @param ctx the parse tree
	 */
	void exitParameter_name(OracleSqlParser.Parameter_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#special_function}.
	 * @param ctx the parse tree
	 */
	void enterSpecial_function(OracleSqlParser.Special_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#special_function}.
	 * @param ctx the parse tree
	 */
	void exitSpecial_function(OracleSqlParser.Special_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#case_expression}.
	 * @param ctx the parse tree
	 */
	void enterCase_expression(OracleSqlParser.Case_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#case_expression}.
	 * @param ctx the parse tree
	 */
	void exitCase_expression(OracleSqlParser.Case_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#cursor_expression}.
	 * @param ctx the parse tree
	 */
	void enterCursor_expression(OracleSqlParser.Cursor_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#cursor_expression}.
	 * @param ctx the parse tree
	 */
	void exitCursor_expression(OracleSqlParser.Cursor_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#simple_case_expression}.
	 * @param ctx the parse tree
	 */
	void enterSimple_case_expression(OracleSqlParser.Simple_case_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#simple_case_expression}.
	 * @param ctx the parse tree
	 */
	void exitSimple_case_expression(OracleSqlParser.Simple_case_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#searched_case_expression}.
	 * @param ctx the parse tree
	 */
	void enterSearched_case_expression(OracleSqlParser.Searched_case_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#searched_case_expression}.
	 * @param ctx the parse tree
	 */
	void exitSearched_case_expression(OracleSqlParser.Searched_case_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#else_case_expression}.
	 * @param ctx the parse tree
	 */
	void enterElse_case_expression(OracleSqlParser.Else_case_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#else_case_expression}.
	 * @param ctx the parse tree
	 */
	void exitElse_case_expression(OracleSqlParser.Else_case_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#object_access_expression}.
	 * @param ctx the parse tree
	 */
	void enterObject_access_expression(OracleSqlParser.Object_access_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#object_access_expression}.
	 * @param ctx the parse tree
	 */
	void exitObject_access_expression(OracleSqlParser.Object_access_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#simple_expression}.
	 * @param ctx the parse tree
	 */
	void enterSimple_expression(OracleSqlParser.Simple_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#simple_expression}.
	 * @param ctx the parse tree
	 */
	void exitSimple_expression(OracleSqlParser.Simple_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#query_block}.
	 * @param ctx the parse tree
	 */
	void enterQuery_block(OracleSqlParser.Query_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#query_block}.
	 * @param ctx the parse tree
	 */
	void exitQuery_block(OracleSqlParser.Query_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#subquery}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(OracleSqlParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#subquery}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(OracleSqlParser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#timestamp_expression}.
	 * @param ctx the parse tree
	 */
	void enterTimestamp_expression(OracleSqlParser.Timestamp_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#timestamp_expression}.
	 * @param ctx the parse tree
	 */
	void exitTimestamp_expression(OracleSqlParser.Timestamp_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#interval_x_to_y}.
	 * @param ctx the parse tree
	 */
	void enterInterval_x_to_y(OracleSqlParser.Interval_x_to_yContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#interval_x_to_y}.
	 * @param ctx the parse tree
	 */
	void exitInterval_x_to_y(OracleSqlParser.Interval_x_to_yContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#precision}.
	 * @param ctx the parse tree
	 */
	void enterPrecision(OracleSqlParser.PrecisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#precision}.
	 * @param ctx the parse tree
	 */
	void exitPrecision(OracleSqlParser.PrecisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#extract_datetime_expression}.
	 * @param ctx the parse tree
	 */
	void enterExtract_datetime_expression(OracleSqlParser.Extract_datetime_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#extract_datetime_expression}.
	 * @param ctx the parse tree
	 */
	void exitExtract_datetime_expression(OracleSqlParser.Extract_datetime_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#datetime_expression}.
	 * @param ctx the parse tree
	 */
	void enterDatetime_expression(OracleSqlParser.Datetime_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#datetime_expression}.
	 * @param ctx the parse tree
	 */
	void exitDatetime_expression(OracleSqlParser.Datetime_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#interval_expression}.
	 * @param ctx the parse tree
	 */
	void enterInterval_expression(OracleSqlParser.Interval_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#interval_expression}.
	 * @param ctx the parse tree
	 */
	void exitInterval_expression(OracleSqlParser.Interval_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#special_expression}.
	 * @param ctx the parse tree
	 */
	void enterSpecial_expression(OracleSqlParser.Special_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#special_expression}.
	 * @param ctx the parse tree
	 */
	void exitSpecial_expression(OracleSqlParser.Special_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#cluster_set_clause}.
	 * @param ctx the parse tree
	 */
	void enterCluster_set_clause(OracleSqlParser.Cluster_set_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#cluster_set_clause}.
	 * @param ctx the parse tree
	 */
	void exitCluster_set_clause(OracleSqlParser.Cluster_set_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#cast_expression}.
	 * @param ctx the parse tree
	 */
	void enterCast_expression(OracleSqlParser.Cast_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#cast_expression}.
	 * @param ctx the parse tree
	 */
	void exitCast_expression(OracleSqlParser.Cast_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#datatype_name}.
	 * @param ctx the parse tree
	 */
	void enterDatatype_name(OracleSqlParser.Datatype_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#datatype_name}.
	 * @param ctx the parse tree
	 */
	void exitDatatype_name(OracleSqlParser.Datatype_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_literal(OracleSqlParser.Boolean_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_literal(OracleSqlParser.Boolean_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#t_alias}.
	 * @param ctx the parse tree
	 */
	void enterT_alias(OracleSqlParser.T_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#t_alias}.
	 * @param ctx the parse tree
	 */
	void exitT_alias(OracleSqlParser.T_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#c_alias}.
	 * @param ctx the parse tree
	 */
	void enterC_alias(OracleSqlParser.C_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#c_alias}.
	 * @param ctx the parse tree
	 */
	void exitC_alias(OracleSqlParser.C_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#column_spec}.
	 * @param ctx the parse tree
	 */
	void enterColumn_spec(OracleSqlParser.Column_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#column_spec}.
	 * @param ctx the parse tree
	 */
	void exitColumn_spec(OracleSqlParser.Column_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#pseudo_column}.
	 * @param ctx the parse tree
	 */
	void enterPseudo_column(OracleSqlParser.Pseudo_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#pseudo_column}.
	 * @param ctx the parse tree
	 */
	void exitPseudo_column(OracleSqlParser.Pseudo_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(OracleSqlParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(OracleSqlParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#function_spec}.
	 * @param ctx the parse tree
	 */
	void enterFunction_spec(OracleSqlParser.Function_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#function_spec}.
	 * @param ctx the parse tree
	 */
	void exitFunction_spec(OracleSqlParser.Function_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#table_reference_list}.
	 * @param ctx the parse tree
	 */
	void enterTable_reference_list(OracleSqlParser.Table_reference_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#table_reference_list}.
	 * @param ctx the parse tree
	 */
	void exitTable_reference_list(OracleSqlParser.Table_reference_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#table_reference}.
	 * @param ctx the parse tree
	 */
	void enterTable_reference(OracleSqlParser.Table_referenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#table_reference}.
	 * @param ctx the parse tree
	 */
	void exitTable_reference(OracleSqlParser.Table_referenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#query_table_expression}.
	 * @param ctx the parse tree
	 */
	void enterQuery_table_expression(OracleSqlParser.Query_table_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#query_table_expression}.
	 * @param ctx the parse tree
	 */
	void exitQuery_table_expression(OracleSqlParser.Query_table_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#flashback_query_clause}.
	 * @param ctx the parse tree
	 */
	void enterFlashback_query_clause(OracleSqlParser.Flashback_query_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#flashback_query_clause}.
	 * @param ctx the parse tree
	 */
	void exitFlashback_query_clause(OracleSqlParser.Flashback_query_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#sample_clause}.
	 * @param ctx the parse tree
	 */
	void enterSample_clause(OracleSqlParser.Sample_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#sample_clause}.
	 * @param ctx the parse tree
	 */
	void exitSample_clause(OracleSqlParser.Sample_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#partition_extension_clause}.
	 * @param ctx the parse tree
	 */
	void enterPartition_extension_clause(OracleSqlParser.Partition_extension_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#partition_extension_clause}.
	 * @param ctx the parse tree
	 */
	void exitPartition_extension_clause(OracleSqlParser.Partition_extension_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#subquery_restricrion_clause}.
	 * @param ctx the parse tree
	 */
	void enterSubquery_restricrion_clause(OracleSqlParser.Subquery_restricrion_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#subquery_restricrion_clause}.
	 * @param ctx the parse tree
	 */
	void exitSubquery_restricrion_clause(OracleSqlParser.Subquery_restricrion_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#table_collection_clause}.
	 * @param ctx the parse tree
	 */
	void enterTable_collection_clause(OracleSqlParser.Table_collection_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#table_collection_clause}.
	 * @param ctx the parse tree
	 */
	void exitTable_collection_clause(OracleSqlParser.Table_collection_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void enterJoin_clause(OracleSqlParser.Join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void exitJoin_clause(OracleSqlParser.Join_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#inner_cross_join_clause}.
	 * @param ctx the parse tree
	 */
	void enterInner_cross_join_clause(OracleSqlParser.Inner_cross_join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#inner_cross_join_clause}.
	 * @param ctx the parse tree
	 */
	void exitInner_cross_join_clause(OracleSqlParser.Inner_cross_join_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#outer_join_clause}.
	 * @param ctx the parse tree
	 */
	void enterOuter_join_clause(OracleSqlParser.Outer_join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#outer_join_clause}.
	 * @param ctx the parse tree
	 */
	void exitOuter_join_clause(OracleSqlParser.Outer_join_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#query_partition_clause}.
	 * @param ctx the parse tree
	 */
	void enterQuery_partition_clause(OracleSqlParser.Query_partition_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#query_partition_clause}.
	 * @param ctx the parse tree
	 */
	void exitQuery_partition_clause(OracleSqlParser.Query_partition_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#outer_join_type}.
	 * @param ctx the parse tree
	 */
	void enterOuter_join_type(OracleSqlParser.Outer_join_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#outer_join_type}.
	 * @param ctx the parse tree
	 */
	void exitOuter_join_type(OracleSqlParser.Outer_join_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#sample_percent}.
	 * @param ctx the parse tree
	 */
	void enterSample_percent(OracleSqlParser.Sample_percentContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#sample_percent}.
	 * @param ctx the parse tree
	 */
	void exitSample_percent(OracleSqlParser.Sample_percentContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#seed_value}.
	 * @param ctx the parse tree
	 */
	void enterSeed_value(OracleSqlParser.Seed_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#seed_value}.
	 * @param ctx the parse tree
	 */
	void exitSeed_value(OracleSqlParser.Seed_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#outer_join_sign}.
	 * @param ctx the parse tree
	 */
	void enterOuter_join_sign(OracleSqlParser.Outer_join_signContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#outer_join_sign}.
	 * @param ctx the parse tree
	 */
	void exitOuter_join_sign(OracleSqlParser.Outer_join_signContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(OracleSqlParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(OracleSqlParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#schema_name}.
	 * @param ctx the parse tree
	 */
	void enterSchema_name(OracleSqlParser.Schema_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#schema_name}.
	 * @param ctx the parse tree
	 */
	void exitSchema_name(OracleSqlParser.Schema_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#package_name}.
	 * @param ctx the parse tree
	 */
	void enterPackage_name(OracleSqlParser.Package_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#package_name}.
	 * @param ctx the parse tree
	 */
	void exitPackage_name(OracleSqlParser.Package_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#dblink_name}.
	 * @param ctx the parse tree
	 */
	void enterDblink_name(OracleSqlParser.Dblink_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#dblink_name}.
	 * @param ctx the parse tree
	 */
	void exitDblink_name(OracleSqlParser.Dblink_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#column_specs}.
	 * @param ctx the parse tree
	 */
	void enterColumn_specs(OracleSqlParser.Column_specsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#column_specs}.
	 * @param ctx the parse tree
	 */
	void exitColumn_specs(OracleSqlParser.Column_specsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#partition}.
	 * @param ctx the parse tree
	 */
	void enterPartition(OracleSqlParser.PartitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#partition}.
	 * @param ctx the parse tree
	 */
	void exitPartition(OracleSqlParser.PartitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#partition_key_value}.
	 * @param ctx the parse tree
	 */
	void enterPartition_key_value(OracleSqlParser.Partition_key_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#partition_key_value}.
	 * @param ctx the parse tree
	 */
	void exitPartition_key_value(OracleSqlParser.Partition_key_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#subpartition_key_value}.
	 * @param ctx the parse tree
	 */
	void enterSubpartition_key_value(OracleSqlParser.Subpartition_key_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#subpartition_key_value}.
	 * @param ctx the parse tree
	 */
	void exitSubpartition_key_value(OracleSqlParser.Subpartition_key_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#constraint}.
	 * @param ctx the parse tree
	 */
	void enterConstraint(OracleSqlParser.ConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#constraint}.
	 * @param ctx the parse tree
	 */
	void exitConstraint(OracleSqlParser.ConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#collection_expression}.
	 * @param ctx the parse tree
	 */
	void enterCollection_expression(OracleSqlParser.Collection_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#collection_expression}.
	 * @param ctx the parse tree
	 */
	void exitCollection_expression(OracleSqlParser.Collection_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhere_clause(OracleSqlParser.Where_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhere_clause(OracleSqlParser.Where_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#hierarchical_query_clause}.
	 * @param ctx the parse tree
	 */
	void enterHierarchical_query_clause(OracleSqlParser.Hierarchical_query_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#hierarchical_query_clause}.
	 * @param ctx the parse tree
	 */
	void exitHierarchical_query_clause(OracleSqlParser.Hierarchical_query_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#group_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterGroup_by_clause(OracleSqlParser.Group_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#group_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitGroup_by_clause(OracleSqlParser.Group_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#group_by_exprs}.
	 * @param ctx the parse tree
	 */
	void enterGroup_by_exprs(OracleSqlParser.Group_by_exprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#group_by_exprs}.
	 * @param ctx the parse tree
	 */
	void exitGroup_by_exprs(OracleSqlParser.Group_by_exprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#group_by_expr}.
	 * @param ctx the parse tree
	 */
	void enterGroup_by_expr(OracleSqlParser.Group_by_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#group_by_expr}.
	 * @param ctx the parse tree
	 */
	void exitGroup_by_expr(OracleSqlParser.Group_by_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#rollup_cube_clause}.
	 * @param ctx the parse tree
	 */
	void enterRollup_cube_clause(OracleSqlParser.Rollup_cube_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#rollup_cube_clause}.
	 * @param ctx the parse tree
	 */
	void exitRollup_cube_clause(OracleSqlParser.Rollup_cube_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#grouping_sets_clause}.
	 * @param ctx the parse tree
	 */
	void enterGrouping_sets_clause(OracleSqlParser.Grouping_sets_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#grouping_sets_clause}.
	 * @param ctx the parse tree
	 */
	void exitGrouping_sets_clause(OracleSqlParser.Grouping_sets_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#grouping_sets_exprs}.
	 * @param ctx the parse tree
	 */
	void enterGrouping_sets_exprs(OracleSqlParser.Grouping_sets_exprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#grouping_sets_exprs}.
	 * @param ctx the parse tree
	 */
	void exitGrouping_sets_exprs(OracleSqlParser.Grouping_sets_exprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#grouping_sets_expr}.
	 * @param ctx the parse tree
	 */
	void enterGrouping_sets_expr(OracleSqlParser.Grouping_sets_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#grouping_sets_expr}.
	 * @param ctx the parse tree
	 */
	void exitGrouping_sets_expr(OracleSqlParser.Grouping_sets_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#sql_condition}.
	 * @param ctx the parse tree
	 */
	void enterSql_condition(OracleSqlParser.Sql_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#sql_condition}.
	 * @param ctx the parse tree
	 */
	void exitSql_condition(OracleSqlParser.Sql_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#condition_or}.
	 * @param ctx the parse tree
	 */
	void enterCondition_or(OracleSqlParser.Condition_orContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#condition_or}.
	 * @param ctx the parse tree
	 */
	void exitCondition_or(OracleSqlParser.Condition_orContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#condition_and}.
	 * @param ctx the parse tree
	 */
	void enterCondition_and(OracleSqlParser.Condition_andContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#condition_and}.
	 * @param ctx the parse tree
	 */
	void exitCondition_and(OracleSqlParser.Condition_andContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#condition_not}.
	 * @param ctx the parse tree
	 */
	void enterCondition_not(OracleSqlParser.Condition_notContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#condition_not}.
	 * @param ctx the parse tree
	 */
	void exitCondition_not(OracleSqlParser.Condition_notContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#condition_expr}.
	 * @param ctx the parse tree
	 */
	void enterCondition_expr(OracleSqlParser.Condition_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#condition_expr}.
	 * @param ctx the parse tree
	 */
	void exitCondition_expr(OracleSqlParser.Condition_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#condition_exists}.
	 * @param ctx the parse tree
	 */
	void enterCondition_exists(OracleSqlParser.Condition_existsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#condition_exists}.
	 * @param ctx the parse tree
	 */
	void exitCondition_exists(OracleSqlParser.Condition_existsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#condition_is}.
	 * @param ctx the parse tree
	 */
	void enterCondition_is(OracleSqlParser.Condition_isContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#condition_is}.
	 * @param ctx the parse tree
	 */
	void exitCondition_is(OracleSqlParser.Condition_isContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#condition_comparison}.
	 * @param ctx the parse tree
	 */
	void enterCondition_comparison(OracleSqlParser.Condition_comparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#condition_comparison}.
	 * @param ctx the parse tree
	 */
	void exitCondition_comparison(OracleSqlParser.Condition_comparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#condition_group_comparison}.
	 * @param ctx the parse tree
	 */
	void enterCondition_group_comparison(OracleSqlParser.Condition_group_comparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#condition_group_comparison}.
	 * @param ctx the parse tree
	 */
	void exitCondition_group_comparison(OracleSqlParser.Condition_group_comparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#condition_in}.
	 * @param ctx the parse tree
	 */
	void enterCondition_in(OracleSqlParser.Condition_inContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#condition_in}.
	 * @param ctx the parse tree
	 */
	void exitCondition_in(OracleSqlParser.Condition_inContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#condition_is_any}.
	 * @param ctx the parse tree
	 */
	void enterCondition_is_any(OracleSqlParser.Condition_is_anyContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#condition_is_any}.
	 * @param ctx the parse tree
	 */
	void exitCondition_is_any(OracleSqlParser.Condition_is_anyContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#condition_is_empty}.
	 * @param ctx the parse tree
	 */
	void enterCondition_is_empty(OracleSqlParser.Condition_is_emptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#condition_is_empty}.
	 * @param ctx the parse tree
	 */
	void exitCondition_is_empty(OracleSqlParser.Condition_is_emptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#condition_is_of_type}.
	 * @param ctx the parse tree
	 */
	void enterCondition_is_of_type(OracleSqlParser.Condition_is_of_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#condition_is_of_type}.
	 * @param ctx the parse tree
	 */
	void exitCondition_is_of_type(OracleSqlParser.Condition_is_of_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#condition_is_present}.
	 * @param ctx the parse tree
	 */
	void enterCondition_is_present(OracleSqlParser.Condition_is_presentContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#condition_is_present}.
	 * @param ctx the parse tree
	 */
	void exitCondition_is_present(OracleSqlParser.Condition_is_presentContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#condition_like}.
	 * @param ctx the parse tree
	 */
	void enterCondition_like(OracleSqlParser.Condition_likeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#condition_like}.
	 * @param ctx the parse tree
	 */
	void exitCondition_like(OracleSqlParser.Condition_likeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#condition_memeber}.
	 * @param ctx the parse tree
	 */
	void enterCondition_memeber(OracleSqlParser.Condition_memeberContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#condition_memeber}.
	 * @param ctx the parse tree
	 */
	void exitCondition_memeber(OracleSqlParser.Condition_memeberContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#condition_between}.
	 * @param ctx the parse tree
	 */
	void enterCondition_between(OracleSqlParser.Condition_betweenContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#condition_between}.
	 * @param ctx the parse tree
	 */
	void exitCondition_between(OracleSqlParser.Condition_betweenContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#condition_regexp_like}.
	 * @param ctx the parse tree
	 */
	void enterCondition_regexp_like(OracleSqlParser.Condition_regexp_likeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#condition_regexp_like}.
	 * @param ctx the parse tree
	 */
	void exitCondition_regexp_like(OracleSqlParser.Condition_regexp_likeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#condition_submultiset}.
	 * @param ctx the parse tree
	 */
	void enterCondition_submultiset(OracleSqlParser.Condition_submultisetContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#condition_submultiset}.
	 * @param ctx the parse tree
	 */
	void exitCondition_submultiset(OracleSqlParser.Condition_submultisetContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#condition_equals_path}.
	 * @param ctx the parse tree
	 */
	void enterCondition_equals_path(OracleSqlParser.Condition_equals_pathContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#condition_equals_path}.
	 * @param ctx the parse tree
	 */
	void exitCondition_equals_path(OracleSqlParser.Condition_equals_pathContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#condition_under_path}.
	 * @param ctx the parse tree
	 */
	void enterCondition_under_path(OracleSqlParser.Condition_under_pathContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#condition_under_path}.
	 * @param ctx the parse tree
	 */
	void exitCondition_under_path(OracleSqlParser.Condition_under_pathContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#levels}.
	 * @param ctx the parse tree
	 */
	void enterLevels(OracleSqlParser.LevelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#levels}.
	 * @param ctx the parse tree
	 */
	void exitLevels(OracleSqlParser.LevelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#correlation_integer}.
	 * @param ctx the parse tree
	 */
	void enterCorrelation_integer(OracleSqlParser.Correlation_integerContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#correlation_integer}.
	 * @param ctx the parse tree
	 */
	void exitCorrelation_integer(OracleSqlParser.Correlation_integerContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#path_string}.
	 * @param ctx the parse tree
	 */
	void enterPath_string(OracleSqlParser.Path_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#path_string}.
	 * @param ctx the parse tree
	 */
	void exitPath_string(OracleSqlParser.Path_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#type_names}.
	 * @param ctx the parse tree
	 */
	void enterType_names(OracleSqlParser.Type_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#type_names}.
	 * @param ctx the parse tree
	 */
	void exitType_names(OracleSqlParser.Type_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(OracleSqlParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(OracleSqlParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(OracleSqlParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(OracleSqlParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#nested_table}.
	 * @param ctx the parse tree
	 */
	void enterNested_table(OracleSqlParser.Nested_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#nested_table}.
	 * @param ctx the parse tree
	 */
	void exitNested_table(OracleSqlParser.Nested_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#nested_table_column_name}.
	 * @param ctx the parse tree
	 */
	void enterNested_table_column_name(OracleSqlParser.Nested_table_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#nested_table_column_name}.
	 * @param ctx the parse tree
	 */
	void exitNested_table_column_name(OracleSqlParser.Nested_table_column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#sql_expressions}.
	 * @param ctx the parse tree
	 */
	void enterSql_expressions(OracleSqlParser.Sql_expressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#sql_expressions}.
	 * @param ctx the parse tree
	 */
	void exitSql_expressions(OracleSqlParser.Sql_expressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#grouping_sets_expression_list}.
	 * @param ctx the parse tree
	 */
	void enterGrouping_sets_expression_list(OracleSqlParser.Grouping_sets_expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#grouping_sets_expression_list}.
	 * @param ctx the parse tree
	 */
	void exitGrouping_sets_expression_list(OracleSqlParser.Grouping_sets_expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#grouping_expression_list}.
	 * @param ctx the parse tree
	 */
	void enterGrouping_expression_list(OracleSqlParser.Grouping_expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#grouping_expression_list}.
	 * @param ctx the parse tree
	 */
	void exitGrouping_expression_list(OracleSqlParser.Grouping_expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterExpression_list(OracleSqlParser.Expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitExpression_list(OracleSqlParser.Expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#cell_reference}.
	 * @param ctx the parse tree
	 */
	void enterCell_reference(OracleSqlParser.Cell_referenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#cell_reference}.
	 * @param ctx the parse tree
	 */
	void exitCell_reference(OracleSqlParser.Cell_referenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#condition_paren}.
	 * @param ctx the parse tree
	 */
	void enterCondition_paren(OracleSqlParser.Condition_parenContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#condition_paren}.
	 * @param ctx the parse tree
	 */
	void exitCondition_paren(OracleSqlParser.Condition_parenContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#model_clause}.
	 * @param ctx the parse tree
	 */
	void enterModel_clause(OracleSqlParser.Model_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#model_clause}.
	 * @param ctx the parse tree
	 */
	void exitModel_clause(OracleSqlParser.Model_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#cell_reference_options}.
	 * @param ctx the parse tree
	 */
	void enterCell_reference_options(OracleSqlParser.Cell_reference_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#cell_reference_options}.
	 * @param ctx the parse tree
	 */
	void exitCell_reference_options(OracleSqlParser.Cell_reference_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#return_rows_clause}.
	 * @param ctx the parse tree
	 */
	void enterReturn_rows_clause(OracleSqlParser.Return_rows_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#return_rows_clause}.
	 * @param ctx the parse tree
	 */
	void exitReturn_rows_clause(OracleSqlParser.Return_rows_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#reference_model}.
	 * @param ctx the parse tree
	 */
	void enterReference_model(OracleSqlParser.Reference_modelContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#reference_model}.
	 * @param ctx the parse tree
	 */
	void exitReference_model(OracleSqlParser.Reference_modelContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#reference_model_name}.
	 * @param ctx the parse tree
	 */
	void enterReference_model_name(OracleSqlParser.Reference_model_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#reference_model_name}.
	 * @param ctx the parse tree
	 */
	void exitReference_model_name(OracleSqlParser.Reference_model_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#main_model}.
	 * @param ctx the parse tree
	 */
	void enterMain_model(OracleSqlParser.Main_modelContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#main_model}.
	 * @param ctx the parse tree
	 */
	void exitMain_model(OracleSqlParser.Main_modelContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#main_model_name}.
	 * @param ctx the parse tree
	 */
	void enterMain_model_name(OracleSqlParser.Main_model_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#main_model_name}.
	 * @param ctx the parse tree
	 */
	void exitMain_model_name(OracleSqlParser.Main_model_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#model_column_clauses}.
	 * @param ctx the parse tree
	 */
	void enterModel_column_clauses(OracleSqlParser.Model_column_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#model_column_clauses}.
	 * @param ctx the parse tree
	 */
	void exitModel_column_clauses(OracleSqlParser.Model_column_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#model_columns}.
	 * @param ctx the parse tree
	 */
	void enterModel_columns(OracleSqlParser.Model_columnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#model_columns}.
	 * @param ctx the parse tree
	 */
	void exitModel_columns(OracleSqlParser.Model_columnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#model_column}.
	 * @param ctx the parse tree
	 */
	void enterModel_column(OracleSqlParser.Model_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#model_column}.
	 * @param ctx the parse tree
	 */
	void exitModel_column(OracleSqlParser.Model_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#model_rules_clause}.
	 * @param ctx the parse tree
	 */
	void enterModel_rules_clause(OracleSqlParser.Model_rules_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#model_rules_clause}.
	 * @param ctx the parse tree
	 */
	void exitModel_rules_clause(OracleSqlParser.Model_rules_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#model_rules_exprs}.
	 * @param ctx the parse tree
	 */
	void enterModel_rules_exprs(OracleSqlParser.Model_rules_exprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#model_rules_exprs}.
	 * @param ctx the parse tree
	 */
	void exitModel_rules_exprs(OracleSqlParser.Model_rules_exprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#model_rules_expr}.
	 * @param ctx the parse tree
	 */
	void enterModel_rules_expr(OracleSqlParser.Model_rules_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#model_rules_expr}.
	 * @param ctx the parse tree
	 */
	void exitModel_rules_expr(OracleSqlParser.Model_rules_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#cell_assignment}.
	 * @param ctx the parse tree
	 */
	void enterCell_assignment(OracleSqlParser.Cell_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#cell_assignment}.
	 * @param ctx the parse tree
	 */
	void exitCell_assignment(OracleSqlParser.Cell_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#cell_assignment_exprs}.
	 * @param ctx the parse tree
	 */
	void enterCell_assignment_exprs(OracleSqlParser.Cell_assignment_exprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#cell_assignment_exprs}.
	 * @param ctx the parse tree
	 */
	void exitCell_assignment_exprs(OracleSqlParser.Cell_assignment_exprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#cell_assignment_expr}.
	 * @param ctx the parse tree
	 */
	void enterCell_assignment_expr(OracleSqlParser.Cell_assignment_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#cell_assignment_expr}.
	 * @param ctx the parse tree
	 */
	void exitCell_assignment_expr(OracleSqlParser.Cell_assignment_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#measure_column}.
	 * @param ctx the parse tree
	 */
	void enterMeasure_column(OracleSqlParser.Measure_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#measure_column}.
	 * @param ctx the parse tree
	 */
	void exitMeasure_column(OracleSqlParser.Measure_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#single_column_for_loop}.
	 * @param ctx the parse tree
	 */
	void enterSingle_column_for_loop(OracleSqlParser.Single_column_for_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#single_column_for_loop}.
	 * @param ctx the parse tree
	 */
	void exitSingle_column_for_loop(OracleSqlParser.Single_column_for_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(OracleSqlParser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(OracleSqlParser.PatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(OracleSqlParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(OracleSqlParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#literals}.
	 * @param ctx the parse tree
	 */
	void enterLiterals(OracleSqlParser.LiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#literals}.
	 * @param ctx the parse tree
	 */
	void exitLiterals(OracleSqlParser.LiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#multi_column_for_loop}.
	 * @param ctx the parse tree
	 */
	void enterMulti_column_for_loop(OracleSqlParser.Multi_column_for_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#multi_column_for_loop}.
	 * @param ctx the parse tree
	 */
	void exitMulti_column_for_loop(OracleSqlParser.Multi_column_for_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#bracket_literals}.
	 * @param ctx the parse tree
	 */
	void enterBracket_literals(OracleSqlParser.Bracket_literalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#bracket_literals}.
	 * @param ctx the parse tree
	 */
	void exitBracket_literals(OracleSqlParser.Bracket_literalsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#bracket_literals_list}.
	 * @param ctx the parse tree
	 */
	void enterBracket_literals_list(OracleSqlParser.Bracket_literals_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#bracket_literals_list}.
	 * @param ctx the parse tree
	 */
	void exitBracket_literals_list(OracleSqlParser.Bracket_literals_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#union_clause}.
	 * @param ctx the parse tree
	 */
	void enterUnion_clause(OracleSqlParser.Union_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#union_clause}.
	 * @param ctx the parse tree
	 */
	void exitUnion_clause(OracleSqlParser.Union_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_clause(OracleSqlParser.Order_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_clause(OracleSqlParser.Order_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#order_by_clause_part_first}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_clause_part_first(OracleSqlParser.Order_by_clause_part_firstContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#order_by_clause_part_first}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_clause_part_first(OracleSqlParser.Order_by_clause_part_firstContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#order_by_clause_part_next}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_clause_part_next(OracleSqlParser.Order_by_clause_part_nextContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#order_by_clause_part_next}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_clause_part_next(OracleSqlParser.Order_by_clause_part_nextContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#analytic_function_name}.
	 * @param ctx the parse tree
	 */
	void enterAnalytic_function_name(OracleSqlParser.Analytic_function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#analytic_function_name}.
	 * @param ctx the parse tree
	 */
	void exitAnalytic_function_name(OracleSqlParser.Analytic_function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#analytic_function_call}.
	 * @param ctx the parse tree
	 */
	void enterAnalytic_function_call(OracleSqlParser.Analytic_function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#analytic_function_call}.
	 * @param ctx the parse tree
	 */
	void exitAnalytic_function_call(OracleSqlParser.Analytic_function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#analytic_function}.
	 * @param ctx the parse tree
	 */
	void enterAnalytic_function(OracleSqlParser.Analytic_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#analytic_function}.
	 * @param ctx the parse tree
	 */
	void exitAnalytic_function(OracleSqlParser.Analytic_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#count_function}.
	 * @param ctx the parse tree
	 */
	void enterCount_function(OracleSqlParser.Count_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#count_function}.
	 * @param ctx the parse tree
	 */
	void exitCount_function(OracleSqlParser.Count_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#analytic_clause}.
	 * @param ctx the parse tree
	 */
	void enterAnalytic_clause(OracleSqlParser.Analytic_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#analytic_clause}.
	 * @param ctx the parse tree
	 */
	void exitAnalytic_clause(OracleSqlParser.Analytic_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#windowing_clause_part}.
	 * @param ctx the parse tree
	 */
	void enterWindowing_clause_part(OracleSqlParser.Windowing_clause_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#windowing_clause_part}.
	 * @param ctx the parse tree
	 */
	void exitWindowing_clause_part(OracleSqlParser.Windowing_clause_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#windowing_clause}.
	 * @param ctx the parse tree
	 */
	void enterWindowing_clause(OracleSqlParser.Windowing_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#windowing_clause}.
	 * @param ctx the parse tree
	 */
	void exitWindowing_clause(OracleSqlParser.Windowing_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#aggregate_function_name}.
	 * @param ctx the parse tree
	 */
	void enterAggregate_function_name(OracleSqlParser.Aggregate_function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#aggregate_function_name}.
	 * @param ctx the parse tree
	 */
	void exitAggregate_function_name(OracleSqlParser.Aggregate_function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#aggregate_function}.
	 * @param ctx the parse tree
	 */
	void enterAggregate_function(OracleSqlParser.Aggregate_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#aggregate_function}.
	 * @param ctx the parse tree
	 */
	void exitAggregate_function(OracleSqlParser.Aggregate_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#percent_rank_aggregate}.
	 * @param ctx the parse tree
	 */
	void enterPercent_rank_aggregate(OracleSqlParser.Percent_rank_aggregateContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#percent_rank_aggregate}.
	 * @param ctx the parse tree
	 */
	void exitPercent_rank_aggregate(OracleSqlParser.Percent_rank_aggregateContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#dense_rank_aggregate}.
	 * @param ctx the parse tree
	 */
	void enterDense_rank_aggregate(OracleSqlParser.Dense_rank_aggregateContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#dense_rank_aggregate}.
	 * @param ctx the parse tree
	 */
	void exitDense_rank_aggregate(OracleSqlParser.Dense_rank_aggregateContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#percent_rank_analytic}.
	 * @param ctx the parse tree
	 */
	void enterPercent_rank_analytic(OracleSqlParser.Percent_rank_analyticContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#percent_rank_analytic}.
	 * @param ctx the parse tree
	 */
	void exitPercent_rank_analytic(OracleSqlParser.Percent_rank_analyticContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#percent_cont_disc_analytic}.
	 * @param ctx the parse tree
	 */
	void enterPercent_cont_disc_analytic(OracleSqlParser.Percent_cont_disc_analyticContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#percent_cont_disc_analytic}.
	 * @param ctx the parse tree
	 */
	void exitPercent_cont_disc_analytic(OracleSqlParser.Percent_cont_disc_analyticContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#dense_rank_analytic}.
	 * @param ctx the parse tree
	 */
	void enterDense_rank_analytic(OracleSqlParser.Dense_rank_analyticContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#dense_rank_analytic}.
	 * @param ctx the parse tree
	 */
	void exitDense_rank_analytic(OracleSqlParser.Dense_rank_analyticContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#first_last}.
	 * @param ctx the parse tree
	 */
	void enterFirst_last(OracleSqlParser.First_lastContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#first_last}.
	 * @param ctx the parse tree
	 */
	void exitFirst_last(OracleSqlParser.First_lastContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#listagg}.
	 * @param ctx the parse tree
	 */
	void enterListagg(OracleSqlParser.ListaggContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#listagg}.
	 * @param ctx the parse tree
	 */
	void exitListagg(OracleSqlParser.ListaggContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#for_update_clause}.
	 * @param ctx the parse tree
	 */
	void enterFor_update_clause(OracleSqlParser.For_update_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#for_update_clause}.
	 * @param ctx the parse tree
	 */
	void exitFor_update_clause(OracleSqlParser.For_update_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#for_update_clause_part_first}.
	 * @param ctx the parse tree
	 */
	void enterFor_update_clause_part_first(OracleSqlParser.For_update_clause_part_firstContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#for_update_clause_part_first}.
	 * @param ctx the parse tree
	 */
	void exitFor_update_clause_part_first(OracleSqlParser.For_update_clause_part_firstContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#for_update_clause_part_next}.
	 * @param ctx the parse tree
	 */
	void enterFor_update_clause_part_next(OracleSqlParser.For_update_clause_part_nextContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#for_update_clause_part_next}.
	 * @param ctx the parse tree
	 */
	void exitFor_update_clause_part_next(OracleSqlParser.For_update_clause_part_nextContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#pivot_clause}.
	 * @param ctx the parse tree
	 */
	void enterPivot_clause(OracleSqlParser.Pivot_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#pivot_clause}.
	 * @param ctx the parse tree
	 */
	void exitPivot_clause(OracleSqlParser.Pivot_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#pivot_for_clause}.
	 * @param ctx the parse tree
	 */
	void enterPivot_for_clause(OracleSqlParser.Pivot_for_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#pivot_for_clause}.
	 * @param ctx the parse tree
	 */
	void exitPivot_for_clause(OracleSqlParser.Pivot_for_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#pivot_in_clause}.
	 * @param ctx the parse tree
	 */
	void enterPivot_in_clause(OracleSqlParser.Pivot_in_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#pivot_in_clause}.
	 * @param ctx the parse tree
	 */
	void exitPivot_in_clause(OracleSqlParser.Pivot_in_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#unpivot_clause}.
	 * @param ctx the parse tree
	 */
	void enterUnpivot_clause(OracleSqlParser.Unpivot_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#unpivot_clause}.
	 * @param ctx the parse tree
	 */
	void exitUnpivot_clause(OracleSqlParser.Unpivot_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#unpivot_in_clause}.
	 * @param ctx the parse tree
	 */
	void enterUnpivot_in_clause(OracleSqlParser.Unpivot_in_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#unpivot_in_clause}.
	 * @param ctx the parse tree
	 */
	void exitUnpivot_in_clause(OracleSqlParser.Unpivot_in_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(OracleSqlParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(OracleSqlParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#sql_identifier}.
	 * @param ctx the parse tree
	 */
	void enterSql_identifier(OracleSqlParser.Sql_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#sql_identifier}.
	 * @param ctx the parse tree
	 */
	void exitSql_identifier(OracleSqlParser.Sql_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(OracleSqlParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(OracleSqlParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#bind_variable}.
	 * @param ctx the parse tree
	 */
	void enterBind_variable(OracleSqlParser.Bind_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#bind_variable}.
	 * @param ctx the parse tree
	 */
	void exitBind_variable(OracleSqlParser.Bind_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#hint}.
	 * @param ctx the parse tree
	 */
	void enterHint(OracleSqlParser.HintContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#hint}.
	 * @param ctx the parse tree
	 */
	void exitHint(OracleSqlParser.HintContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#quoted_string}.
	 * @param ctx the parse tree
	 */
	void enterQuoted_string(OracleSqlParser.Quoted_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#quoted_string}.
	 * @param ctx the parse tree
	 */
	void exitQuoted_string(OracleSqlParser.Quoted_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#doublevertbar}.
	 * @param ctx the parse tree
	 */
	void enterDoublevertbar(OracleSqlParser.DoublevertbarContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#doublevertbar}.
	 * @param ctx the parse tree
	 */
	void exitDoublevertbar(OracleSqlParser.DoublevertbarContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#not_equal}.
	 * @param ctx the parse tree
	 */
	void enterNot_equal(OracleSqlParser.Not_equalContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#not_equal}.
	 * @param ctx the parse tree
	 */
	void exitNot_equal(OracleSqlParser.Not_equalContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#leq}.
	 * @param ctx the parse tree
	 */
	void enterLeq(OracleSqlParser.LeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#leq}.
	 * @param ctx the parse tree
	 */
	void exitLeq(OracleSqlParser.LeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#geq}.
	 * @param ctx the parse tree
	 */
	void enterGeq(OracleSqlParser.GeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#geq}.
	 * @param ctx the parse tree
	 */
	void exitGeq(OracleSqlParser.GeqContext ctx);
}