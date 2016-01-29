// Generated from /Users/YUSIN/IdeaProjects/Antlr4Practise/AntlrV4CSV/OracleSql.g4 by ANTLR 4.5.1

package com.dbpat.util.oraclesql;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link OracleSqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface OracleSqlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(OracleSqlParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#delete_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_statement(OracleSqlParser.Delete_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#merge_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_statement(OracleSqlParser.Merge_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#merge_update_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_update_clause(OracleSqlParser.Merge_update_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#merge_insert_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_insert_clause(OracleSqlParser.Merge_insert_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#insert_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_statement(OracleSqlParser.Insert_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#single_table_insert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_table_insert(OracleSqlParser.Single_table_insertContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#insert_into_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_into_clause(OracleSqlParser.Insert_into_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#values_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues_clause(OracleSqlParser.Values_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#returning_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturning_clause(OracleSqlParser.Returning_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#multi_table_insert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulti_table_insert(OracleSqlParser.Multi_table_insertContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#conditional_insert_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_insert_clause(OracleSqlParser.Conditional_insert_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#dml_table_expression_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDml_table_expression_clause(OracleSqlParser.Dml_table_expression_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#error_logging_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_logging_clause(OracleSqlParser.Error_logging_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#data_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_item(OracleSqlParser.Data_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#update_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_statement(OracleSqlParser.Update_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#update_set_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_set_clause(OracleSqlParser.Update_set_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#update_set_clause_part1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_set_clause_part1(OracleSqlParser.Update_set_clause_part1Context ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#update_set_clause_part2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_set_clause_part2(OracleSqlParser.Update_set_clause_part2Context ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#select_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_statement(OracleSqlParser.Select_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#subquery_factoring_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery_factoring_clause(OracleSqlParser.Subquery_factoring_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#subquery_factoring_clause_part_first}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery_factoring_clause_part_first(OracleSqlParser.Subquery_factoring_clause_part_firstContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#subquery_factoring_clause_part_next}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery_factoring_clause_part_next(OracleSqlParser.Subquery_factoring_clause_part_nextContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#search_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearch_clause(OracleSqlParser.Search_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#cycle_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCycle_clause(OracleSqlParser.Cycle_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#select_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list(OracleSqlParser.Select_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#displayed_column_part_first}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisplayed_column_part_first(OracleSqlParser.Displayed_column_part_firstContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#displayed_column_part_next}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisplayed_column_part_next(OracleSqlParser.Displayed_column_part_nextContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#displayed_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisplayed_column(OracleSqlParser.Displayed_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#sql_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_expression(OracleSqlParser.Sql_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#expr_add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_add(OracleSqlParser.Expr_addContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#expr_mul}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_mul(OracleSqlParser.Expr_mulContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#expr_sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_sign(OracleSqlParser.Expr_signContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#expr_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_expr(OracleSqlParser.Expr_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#expr_paren}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_paren(OracleSqlParser.Expr_parenContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#nested_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNested_expression(OracleSqlParser.Nested_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#function_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_expression(OracleSqlParser.Function_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#call_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_parameters(OracleSqlParser.Call_parametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#call_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_parameter(OracleSqlParser.Call_parameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#parameter_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_name(OracleSqlParser.Parameter_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#special_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecial_function(OracleSqlParser.Special_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#case_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_expression(OracleSqlParser.Case_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#cursor_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_expression(OracleSqlParser.Cursor_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#simple_case_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_case_expression(OracleSqlParser.Simple_case_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#searched_case_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearched_case_expression(OracleSqlParser.Searched_case_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#else_case_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_case_expression(OracleSqlParser.Else_case_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#object_access_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_access_expression(OracleSqlParser.Object_access_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#simple_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_expression(OracleSqlParser.Simple_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#query_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_block(OracleSqlParser.Query_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery(OracleSqlParser.SubqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#timestamp_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimestamp_expression(OracleSqlParser.Timestamp_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#interval_x_to_y}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval_x_to_y(OracleSqlParser.Interval_x_to_yContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#precision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecision(OracleSqlParser.PrecisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#extract_datetime_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtract_datetime_expression(OracleSqlParser.Extract_datetime_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#datetime_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatetime_expression(OracleSqlParser.Datetime_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#interval_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval_expression(OracleSqlParser.Interval_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#special_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecial_expression(OracleSqlParser.Special_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#cluster_set_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCluster_set_clause(OracleSqlParser.Cluster_set_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#cast_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast_expression(OracleSqlParser.Cast_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#datatype_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatatype_name(OracleSqlParser.Datatype_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#boolean_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_literal(OracleSqlParser.Boolean_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#t_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_alias(OracleSqlParser.T_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#c_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_alias(OracleSqlParser.C_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#column_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_spec(OracleSqlParser.Column_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#pseudo_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPseudo_column(OracleSqlParser.Pseudo_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(OracleSqlParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#function_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_spec(OracleSqlParser.Function_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#table_reference_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_reference_list(OracleSqlParser.Table_reference_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#table_reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_reference(OracleSqlParser.Table_referenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#query_table_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_table_expression(OracleSqlParser.Query_table_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#flashback_query_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlashback_query_clause(OracleSqlParser.Flashback_query_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#sample_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSample_clause(OracleSqlParser.Sample_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#partition_extension_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_extension_clause(OracleSqlParser.Partition_extension_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#subquery_restricrion_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery_restricrion_clause(OracleSqlParser.Subquery_restricrion_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#table_collection_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_collection_clause(OracleSqlParser.Table_collection_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#join_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_clause(OracleSqlParser.Join_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#inner_cross_join_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInner_cross_join_clause(OracleSqlParser.Inner_cross_join_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#outer_join_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOuter_join_clause(OracleSqlParser.Outer_join_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#query_partition_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_partition_clause(OracleSqlParser.Query_partition_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#outer_join_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOuter_join_type(OracleSqlParser.Outer_join_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#sample_percent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSample_percent(OracleSqlParser.Sample_percentContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#seed_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeed_value(OracleSqlParser.Seed_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#outer_join_sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOuter_join_sign(OracleSqlParser.Outer_join_signContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(OracleSqlParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#schema_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema_name(OracleSqlParser.Schema_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#package_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_name(OracleSqlParser.Package_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#dblink_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDblink_name(OracleSqlParser.Dblink_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#column_specs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_specs(OracleSqlParser.Column_specsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#partition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition(OracleSqlParser.PartitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#partition_key_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_key_value(OracleSqlParser.Partition_key_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#subpartition_key_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubpartition_key_value(OracleSqlParser.Subpartition_key_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint(OracleSqlParser.ConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#collection_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollection_expression(OracleSqlParser.Collection_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#where_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_clause(OracleSqlParser.Where_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#hierarchical_query_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierarchical_query_clause(OracleSqlParser.Hierarchical_query_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#group_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_by_clause(OracleSqlParser.Group_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#group_by_exprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_by_exprs(OracleSqlParser.Group_by_exprsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#group_by_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_by_expr(OracleSqlParser.Group_by_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#rollup_cube_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollup_cube_clause(OracleSqlParser.Rollup_cube_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#grouping_sets_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrouping_sets_clause(OracleSqlParser.Grouping_sets_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#grouping_sets_exprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrouping_sets_exprs(OracleSqlParser.Grouping_sets_exprsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#grouping_sets_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrouping_sets_expr(OracleSqlParser.Grouping_sets_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#sql_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_condition(OracleSqlParser.Sql_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#condition_or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_or(OracleSqlParser.Condition_orContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#condition_and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_and(OracleSqlParser.Condition_andContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#condition_not}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_not(OracleSqlParser.Condition_notContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#condition_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_expr(OracleSqlParser.Condition_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#condition_exists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_exists(OracleSqlParser.Condition_existsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#condition_is}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_is(OracleSqlParser.Condition_isContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#condition_comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_comparison(OracleSqlParser.Condition_comparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#condition_group_comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_group_comparison(OracleSqlParser.Condition_group_comparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#condition_in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_in(OracleSqlParser.Condition_inContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#condition_is_any}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_is_any(OracleSqlParser.Condition_is_anyContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#condition_is_empty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_is_empty(OracleSqlParser.Condition_is_emptyContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#condition_is_of_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_is_of_type(OracleSqlParser.Condition_is_of_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#condition_is_present}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_is_present(OracleSqlParser.Condition_is_presentContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#condition_like}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_like(OracleSqlParser.Condition_likeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#condition_memeber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_memeber(OracleSqlParser.Condition_memeberContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#condition_between}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_between(OracleSqlParser.Condition_betweenContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#condition_regexp_like}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_regexp_like(OracleSqlParser.Condition_regexp_likeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#condition_submultiset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_submultiset(OracleSqlParser.Condition_submultisetContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#condition_equals_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_equals_path(OracleSqlParser.Condition_equals_pathContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#condition_under_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_under_path(OracleSqlParser.Condition_under_pathContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#levels}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLevels(OracleSqlParser.LevelsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#correlation_integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorrelation_integer(OracleSqlParser.Correlation_integerContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#path_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath_string(OracleSqlParser.Path_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#type_names}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_names(OracleSqlParser.Type_namesContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(OracleSqlParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(OracleSqlParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#nested_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNested_table(OracleSqlParser.Nested_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#nested_table_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNested_table_column_name(OracleSqlParser.Nested_table_column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#sql_expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_expressions(OracleSqlParser.Sql_expressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#grouping_sets_expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrouping_sets_expression_list(OracleSqlParser.Grouping_sets_expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#grouping_expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrouping_expression_list(OracleSqlParser.Grouping_expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_list(OracleSqlParser.Expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#cell_reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCell_reference(OracleSqlParser.Cell_referenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#condition_paren}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_paren(OracleSqlParser.Condition_parenContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#model_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_clause(OracleSqlParser.Model_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#cell_reference_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCell_reference_options(OracleSqlParser.Cell_reference_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#return_rows_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_rows_clause(OracleSqlParser.Return_rows_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#reference_model}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference_model(OracleSqlParser.Reference_modelContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#reference_model_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference_model_name(OracleSqlParser.Reference_model_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#main_model}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_model(OracleSqlParser.Main_modelContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#main_model_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_model_name(OracleSqlParser.Main_model_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#model_column_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_column_clauses(OracleSqlParser.Model_column_clausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#model_columns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_columns(OracleSqlParser.Model_columnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#model_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_column(OracleSqlParser.Model_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#model_rules_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_rules_clause(OracleSqlParser.Model_rules_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#model_rules_exprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_rules_exprs(OracleSqlParser.Model_rules_exprsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#model_rules_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_rules_expr(OracleSqlParser.Model_rules_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#cell_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCell_assignment(OracleSqlParser.Cell_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#cell_assignment_exprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCell_assignment_exprs(OracleSqlParser.Cell_assignment_exprsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#cell_assignment_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCell_assignment_expr(OracleSqlParser.Cell_assignment_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#measure_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMeasure_column(OracleSqlParser.Measure_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#single_column_for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_column_for_loop(OracleSqlParser.Single_column_for_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern(OracleSqlParser.PatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(OracleSqlParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#literals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiterals(OracleSqlParser.LiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#multi_column_for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulti_column_for_loop(OracleSqlParser.Multi_column_for_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#bracket_literals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracket_literals(OracleSqlParser.Bracket_literalsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#bracket_literals_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracket_literals_list(OracleSqlParser.Bracket_literals_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#union_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion_clause(OracleSqlParser.Union_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#order_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_clause(OracleSqlParser.Order_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#order_by_clause_part_first}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_clause_part_first(OracleSqlParser.Order_by_clause_part_firstContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#order_by_clause_part_next}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_clause_part_next(OracleSqlParser.Order_by_clause_part_nextContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#analytic_function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnalytic_function_name(OracleSqlParser.Analytic_function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#analytic_function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnalytic_function_call(OracleSqlParser.Analytic_function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#analytic_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnalytic_function(OracleSqlParser.Analytic_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#count_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCount_function(OracleSqlParser.Count_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#analytic_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnalytic_clause(OracleSqlParser.Analytic_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#windowing_clause_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowing_clause_part(OracleSqlParser.Windowing_clause_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#windowing_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowing_clause(OracleSqlParser.Windowing_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#aggregate_function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregate_function_name(OracleSqlParser.Aggregate_function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#aggregate_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregate_function(OracleSqlParser.Aggregate_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#percent_rank_aggregate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPercent_rank_aggregate(OracleSqlParser.Percent_rank_aggregateContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#dense_rank_aggregate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDense_rank_aggregate(OracleSqlParser.Dense_rank_aggregateContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#percent_rank_analytic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPercent_rank_analytic(OracleSqlParser.Percent_rank_analyticContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#percent_cont_disc_analytic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPercent_cont_disc_analytic(OracleSqlParser.Percent_cont_disc_analyticContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#dense_rank_analytic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDense_rank_analytic(OracleSqlParser.Dense_rank_analyticContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#first_last}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirst_last(OracleSqlParser.First_lastContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#listagg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListagg(OracleSqlParser.ListaggContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#for_update_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_update_clause(OracleSqlParser.For_update_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#for_update_clause_part_first}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_update_clause_part_first(OracleSqlParser.For_update_clause_part_firstContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#for_update_clause_part_next}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_update_clause_part_next(OracleSqlParser.For_update_clause_part_nextContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#pivot_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivot_clause(OracleSqlParser.Pivot_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#pivot_for_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivot_for_clause(OracleSqlParser.Pivot_for_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#pivot_in_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivot_in_clause(OracleSqlParser.Pivot_in_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#unpivot_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnpivot_clause(OracleSqlParser.Unpivot_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#unpivot_in_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnpivot_in_clause(OracleSqlParser.Unpivot_in_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(OracleSqlParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#sql_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_identifier(OracleSqlParser.Sql_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(OracleSqlParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#bind_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBind_variable(OracleSqlParser.Bind_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#hint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHint(OracleSqlParser.HintContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#quoted_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuoted_string(OracleSqlParser.Quoted_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#doublevertbar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoublevertbar(OracleSqlParser.DoublevertbarContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#not_equal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_equal(OracleSqlParser.Not_equalContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#leq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeq(OracleSqlParser.LeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#geq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeq(OracleSqlParser.GeqContext ctx);
}