// Generated from /Users/YUSIN/IdeaProjects/Antlr4Practise/AntlrV4CSV/OracleSql.g4 by ANTLR 4.5.1

package com.dbpat.util.oraclesql;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OracleSqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, ACCESS=3, ADD=4, ALL=5, ALTER=6, AND=7, ANY=8, AS=9, ASC=10, 
		BETWEEN=11, BY=12, CASE=13, CHAR=14, CHECK=15, CLUSTER=16, CONNECT=17, 
		CREATE=18, CURRENT=19, DATE=20, DECIMAL=21, DEFAULT=22, DELETE=23, DESC=24, 
		DISTINCT=25, DROP=26, ELSE=27, EXCLUSIVE=28, EXISTS=29, FALSE=30, FLOAT=31, 
		FOR=32, FROM=33, GRANT=34, GROUP=35, HAVING=36, IN=37, INCREMENT=38, INSERT=39, 
		INTEGER=40, INTERSECT=41, INTO=42, IS=43, LEVEL=44, LIMIT=45, LIKE=46, 
		LONG=47, MINUS2=48, NOT=49, NOWAIT=50, NULL=51, K_NUMBER=52, OF=53, ON=54, 
		OPTION=55, OR=56, ORDER=57, PRIOR=58, RAW=59, ROW=60, ROWID=61, ROWNUM=62, 
		ROWS=63, SELECT=64, SESSION=65, SET=66, SMALLINT=67, START=68, SYSDATE=69, 
		TABLE=70, THEN=71, TO=72, TRUE=73, UNION=74, UNIQUE=75, UPDATE=76, USER=77, 
		VALUES=78, VARCHAR=79, VARCHAR2=80, WHERE=81, WITH=82, AT=83, AUTOMATIC=84, 
		BFILE=85, BINARY_DOUBLE=86, BINARY_FLOAT=87, BINARY_INTEGER=88, BLOB=89, 
		BLOCK=90, BOOLEAN=91, BOTH=92, BREADTH=93, BYTE=94, CAST=95, CHARACTER=96, 
		CLOB=97, CLUSTER_SET=98, CONNECT_BY_ROOT=99, CONSTRAINT=100, COUNT=101, 
		CROSS=102, CUBE=103, CURSOR=104, CYCLE=105, DAY=106, DBTIMEZONE=107, DEC=108, 
		DECREMENT=109, DENSE_RANK=110, DEPTH=111, DIMENSION=112, DOUBLE=113, EMPTY=114, 
		END=115, EQUALS_PATH=116, ERRORS=117, ESCAPE=118, EXCLUDE=119, EXTRACT=120, 
		FIRST=121, FOLLOWING=122, FULL=123, GROUPING=124, HOUR=125, IGNORE=126, 
		INCLUDE=127, INFINITE=128, INNER=129, INT=130, INTERVAL=131, ITERATE=132, 
		JOIN=133, KEEP=134, LAST=135, LEADING=136, LEFT=137, LISTAGG=138, LNNVL=139, 
		LOCAL=140, LOCKED=141, LOG=142, MAIN=143, MATCHED=144, MAXVALUE=145, MEASURES=146, 
		MEMBER=147, MERGE=148, MINUTE=149, MIVALUE=150, MLSLABEL=151, MODEL=152, 
		MONTH=153, MULTISET=154, NAN=155, NATIONAL=156, NATURAL=157, NAV=158, 
		NCHAR=159, NCLOB=160, NOCYCLE=161, NULLS=162, NUMERIC=163, NVARCHAR=164, 
		NVARCHAR2=165, ONLY=166, OUTER=167, OVER=168, PARTITION=169, PERCENT_RANK=170, 
		PERCENTILE_CONT=171, PERCENTILE_DISC=172, PIVOT=173, PLS_INTEGER=174, 
		POSITIVE=175, PRECEDING=176, PRECISION=177, PRESENT=178, RANGE=179, READ=180, 
		REAL=181, REFERENCE=182, REGEXP_LIKE=183, REJECT=184, RESPECT=185, RETURN=186, 
		RETURNING=187, RIGHT=188, ROLLUP=189, RULES=190, SAMPLE=191, SCN=192, 
		SEARCH=193, SECOND=194, SEED=195, SEQUENTIAL=196, SESSIONTIMEZONE=197, 
		SETS=198, SIBLINGS=199, SINGLE=200, SKIP=201, SOME=202, SQL=203, SUBMULTISET=204, 
		SUBPARTITION=205, THE=206, TIME=207, TIMESTAMP=208, TIMEZONE_HOUR=209, 
		TIMEZONE_MINUTE=210, TIMEZONE_REGION=211, TIMEZONE_ABBR=212, TRAILING=213, 
		TRIM=214, TYPE=215, UNBOUNDED=216, UNDER_PATH=217, UNLIMITED=218, UNPIVOT=219, 
		UNTIL=220, UPDATED=221, UPSERT=222, UROWID=223, USING=224, VALUE=225, 
		VARYING=226, VERSIONS=227, WAIT=228, WHEN=229, WITHIN=230, XML=231, YEAR=232, 
		ZONE=233, QUOTED_STRING=234, BINDVAR=235, ID=236, SEMI=237, COLON=238, 
		DOUBLEDOT=239, DOT=240, COMMA=241, ASTERISK=242, AT_SIGN=243, RPAREN=244, 
		LPAREN=245, RBRACK=246, LBRACK=247, PLUS=248, MINUS=249, DIVIDE=250, EQ=251, 
		PERCENTAGE=252, LLABEL=253, RLABEL=254, ASSIGN=255, ARROW=256, VERTBAR=257, 
		DOUBLEVERTBAR=258, NOT_EQ=259, LTH=260, LEQ=261, GTH=262, GEQ=263, NUMBER=264, 
		QUOTE=265, WS=266, SL_COMMENT=267, ML_COMMENT=268, HINT=269, TYPE_ATTR=270, 
		ROWTYPE_ATTR=271, NOTFOUND_ATTR=272, FOUND_ATTR=273, ISOPEN_ATTR=274, 
		ROWCOUNT_ATTR=275, BULK_ROWCOUNT_ATTR=276, CHARSET_ATTR=277, ZV=278;
	public static final int
		RULE_compilationUnit = 0, RULE_delete_statement = 1, RULE_merge_statement = 2, 
		RULE_merge_update_clause = 3, RULE_merge_insert_clause = 4, RULE_insert_statement = 5, 
		RULE_single_table_insert = 6, RULE_insert_into_clause = 7, RULE_values_clause = 8, 
		RULE_returning_clause = 9, RULE_multi_table_insert = 10, RULE_conditional_insert_clause = 11, 
		RULE_dml_table_expression_clause = 12, RULE_error_logging_clause = 13, 
		RULE_data_item = 14, RULE_update_statement = 15, RULE_update_set_clause = 16, 
		RULE_update_set_clause_part1 = 17, RULE_update_set_clause_part2 = 18, 
		RULE_select_statement = 19, RULE_subquery_factoring_clause = 20, RULE_subquery_factoring_clause_part_first = 21, 
		RULE_subquery_factoring_clause_part_next = 22, RULE_search_clause = 23, 
		RULE_cycle_clause = 24, RULE_select_list = 25, RULE_displayed_column_part_first = 26, 
		RULE_displayed_column_part_next = 27, RULE_displayed_column = 28, RULE_sql_expression = 29, 
		RULE_expr_add = 30, RULE_expr_mul = 31, RULE_expr_sign = 32, RULE_expr_expr = 33, 
		RULE_expr_paren = 34, RULE_nested_expression = 35, RULE_function_expression = 36, 
		RULE_call_parameters = 37, RULE_call_parameter = 38, RULE_parameter_name = 39, 
		RULE_special_function = 40, RULE_case_expression = 41, RULE_cursor_expression = 42, 
		RULE_simple_case_expression = 43, RULE_searched_case_expression = 44, 
		RULE_else_case_expression = 45, RULE_object_access_expression = 46, RULE_simple_expression = 47, 
		RULE_query_block = 48, RULE_subquery = 49, RULE_timestamp_expression = 50, 
		RULE_interval_x_to_y = 51, RULE_precision = 52, RULE_extract_datetime_expression = 53, 
		RULE_datetime_expression = 54, RULE_interval_expression = 55, RULE_special_expression = 56, 
		RULE_cluster_set_clause = 57, RULE_cast_expression = 58, RULE_datatype_name = 59, 
		RULE_boolean_literal = 60, RULE_t_alias = 61, RULE_c_alias = 62, RULE_column_spec = 63, 
		RULE_pseudo_column = 64, RULE_function_name = 65, RULE_function_spec = 66, 
		RULE_table_reference_list = 67, RULE_table_reference = 68, RULE_query_table_expression = 69, 
		RULE_flashback_query_clause = 70, RULE_sample_clause = 71, RULE_partition_extension_clause = 72, 
		RULE_subquery_restricrion_clause = 73, RULE_table_collection_clause = 74, 
		RULE_join_clause = 75, RULE_inner_cross_join_clause = 76, RULE_outer_join_clause = 77, 
		RULE_query_partition_clause = 78, RULE_outer_join_type = 79, RULE_sample_percent = 80, 
		RULE_seed_value = 81, RULE_outer_join_sign = 82, RULE_table_name = 83, 
		RULE_schema_name = 84, RULE_package_name = 85, RULE_dblink_name = 86, 
		RULE_column_specs = 87, RULE_partition = 88, RULE_partition_key_value = 89, 
		RULE_subpartition_key_value = 90, RULE_constraint = 91, RULE_collection_expression = 92, 
		RULE_where_clause = 93, RULE_hierarchical_query_clause = 94, RULE_group_by_clause = 95, 
		RULE_group_by_exprs = 96, RULE_group_by_expr = 97, RULE_rollup_cube_clause = 98, 
		RULE_grouping_sets_clause = 99, RULE_grouping_sets_exprs = 100, RULE_grouping_sets_expr = 101, 
		RULE_sql_condition = 102, RULE_condition_or = 103, RULE_condition_and = 104, 
		RULE_condition_not = 105, RULE_condition_expr = 106, RULE_condition_exists = 107, 
		RULE_condition_is = 108, RULE_condition_comparison = 109, RULE_condition_group_comparison = 110, 
		RULE_condition_in = 111, RULE_condition_is_any = 112, RULE_condition_is_empty = 113, 
		RULE_condition_is_of_type = 114, RULE_condition_is_present = 115, RULE_condition_like = 116, 
		RULE_condition_memeber = 117, RULE_condition_between = 118, RULE_condition_regexp_like = 119, 
		RULE_condition_submultiset = 120, RULE_condition_equals_path = 121, RULE_condition_under_path = 122, 
		RULE_levels = 123, RULE_correlation_integer = 124, RULE_path_string = 125, 
		RULE_type_names = 126, RULE_integer = 127, RULE_column_name = 128, RULE_nested_table = 129, 
		RULE_nested_table_column_name = 130, RULE_sql_expressions = 131, RULE_grouping_sets_expression_list = 132, 
		RULE_grouping_expression_list = 133, RULE_expression_list = 134, RULE_cell_reference = 135, 
		RULE_condition_paren = 136, RULE_model_clause = 137, RULE_cell_reference_options = 138, 
		RULE_return_rows_clause = 139, RULE_reference_model = 140, RULE_reference_model_name = 141, 
		RULE_main_model = 142, RULE_main_model_name = 143, RULE_model_column_clauses = 144, 
		RULE_model_columns = 145, RULE_model_column = 146, RULE_model_rules_clause = 147, 
		RULE_model_rules_exprs = 148, RULE_model_rules_expr = 149, RULE_cell_assignment = 150, 
		RULE_cell_assignment_exprs = 151, RULE_cell_assignment_expr = 152, RULE_measure_column = 153, 
		RULE_single_column_for_loop = 154, RULE_pattern = 155, RULE_literal = 156, 
		RULE_literals = 157, RULE_multi_column_for_loop = 158, RULE_bracket_literals = 159, 
		RULE_bracket_literals_list = 160, RULE_union_clause = 161, RULE_order_by_clause = 162, 
		RULE_order_by_clause_part_first = 163, RULE_order_by_clause_part_next = 164, 
		RULE_analytic_function_name = 165, RULE_analytic_function_call = 166, 
		RULE_analytic_function = 167, RULE_count_function = 168, RULE_analytic_clause = 169, 
		RULE_windowing_clause_part = 170, RULE_windowing_clause = 171, RULE_aggregate_function_name = 172, 
		RULE_aggregate_function = 173, RULE_percent_rank_aggregate = 174, RULE_dense_rank_aggregate = 175, 
		RULE_percent_rank_analytic = 176, RULE_percent_cont_disc_analytic = 177, 
		RULE_dense_rank_analytic = 178, RULE_first_last = 179, RULE_listagg = 180, 
		RULE_for_update_clause = 181, RULE_for_update_clause_part_first = 182, 
		RULE_for_update_clause_part_next = 183, RULE_pivot_clause = 184, RULE_pivot_for_clause = 185, 
		RULE_pivot_in_clause = 186, RULE_unpivot_clause = 187, RULE_unpivot_in_clause = 188, 
		RULE_constant = 189, RULE_sql_identifier = 190, RULE_identifier = 191, 
		RULE_bind_variable = 192, RULE_hint = 193, RULE_quoted_string = 194, RULE_doublevertbar = 195, 
		RULE_not_equal = 196, RULE_leq = 197, RULE_geq = 198;
	public static final String[] ruleNames = {
		"compilationUnit", "delete_statement", "merge_statement", "merge_update_clause", 
		"merge_insert_clause", "insert_statement", "single_table_insert", "insert_into_clause", 
		"values_clause", "returning_clause", "multi_table_insert", "conditional_insert_clause", 
		"dml_table_expression_clause", "error_logging_clause", "data_item", "update_statement", 
		"update_set_clause", "update_set_clause_part1", "update_set_clause_part2", 
		"select_statement", "subquery_factoring_clause", "subquery_factoring_clause_part_first", 
		"subquery_factoring_clause_part_next", "search_clause", "cycle_clause", 
		"select_list", "displayed_column_part_first", "displayed_column_part_next", 
		"displayed_column", "sql_expression", "expr_add", "expr_mul", "expr_sign", 
		"expr_expr", "expr_paren", "nested_expression", "function_expression", 
		"call_parameters", "call_parameter", "parameter_name", "special_function", 
		"case_expression", "cursor_expression", "simple_case_expression", "searched_case_expression", 
		"else_case_expression", "object_access_expression", "simple_expression", 
		"query_block", "subquery", "timestamp_expression", "interval_x_to_y", 
		"precision", "extract_datetime_expression", "datetime_expression", "interval_expression", 
		"special_expression", "cluster_set_clause", "cast_expression", "datatype_name", 
		"boolean_literal", "t_alias", "c_alias", "column_spec", "pseudo_column", 
		"function_name", "function_spec", "table_reference_list", "table_reference", 
		"query_table_expression", "flashback_query_clause", "sample_clause", "partition_extension_clause", 
		"subquery_restricrion_clause", "table_collection_clause", "join_clause", 
		"inner_cross_join_clause", "outer_join_clause", "query_partition_clause", 
		"outer_join_type", "sample_percent", "seed_value", "outer_join_sign", 
		"table_name", "schema_name", "package_name", "dblink_name", "column_specs", 
		"partition", "partition_key_value", "subpartition_key_value", "constraint", 
		"collection_expression", "where_clause", "hierarchical_query_clause", 
		"group_by_clause", "group_by_exprs", "group_by_expr", "rollup_cube_clause", 
		"grouping_sets_clause", "grouping_sets_exprs", "grouping_sets_expr", "sql_condition", 
		"condition_or", "condition_and", "condition_not", "condition_expr", "condition_exists", 
		"condition_is", "condition_comparison", "condition_group_comparison", 
		"condition_in", "condition_is_any", "condition_is_empty", "condition_is_of_type", 
		"condition_is_present", "condition_like", "condition_memeber", "condition_between", 
		"condition_regexp_like", "condition_submultiset", "condition_equals_path", 
		"condition_under_path", "levels", "correlation_integer", "path_string", 
		"type_names", "integer", "column_name", "nested_table", "nested_table_column_name", 
		"sql_expressions", "grouping_sets_expression_list", "grouping_expression_list", 
		"expression_list", "cell_reference", "condition_paren", "model_clause", 
		"cell_reference_options", "return_rows_clause", "reference_model", "reference_model_name", 
		"main_model", "main_model_name", "model_column_clauses", "model_columns", 
		"model_column", "model_rules_clause", "model_rules_exprs", "model_rules_expr", 
		"cell_assignment", "cell_assignment_exprs", "cell_assignment_expr", "measure_column", 
		"single_column_for_loop", "pattern", "literal", "literals", "multi_column_for_loop", 
		"bracket_literals", "bracket_literals_list", "union_clause", "order_by_clause", 
		"order_by_clause_part_first", "order_by_clause_part_next", "analytic_function_name", 
		"analytic_function_call", "analytic_function", "count_function", "analytic_clause", 
		"windowing_clause_part", "windowing_clause", "aggregate_function_name", 
		"aggregate_function", "percent_rank_aggregate", "dense_rank_aggregate", 
		"percent_rank_analytic", "percent_cont_disc_analytic", "dense_rank_analytic", 
		"first_last", "listagg", "for_update_clause", "for_update_clause_part_first", 
		"for_update_clause_part_next", "pivot_clause", "pivot_for_clause", "pivot_in_clause", 
		"unpivot_clause", "unpivot_in_clause", "constant", "sql_identifier", "identifier", 
		"bind_variable", "hint", "quoted_string", "doublevertbar", "not_equal", 
		"leq", "geq"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'!'", "'^'", null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "';'", "':'", null, 
		null, "','", "'*'", "'@'", "')'", "'('", "']'", "'['", "'+'", "'-'", "'/'", 
		"'='", "'%'", "'<<'", "'>>'", "':='", "'=>'", "'|'", "'||'", null, "'<'", 
		"'<='", "'>'", "'>='", null, "'''", null, null, null, null, "'%TYPE'", 
		"'%ROWTYPE'", "'%NOTFOUND'", "'%FOUND'", "'%ISOPEN'", "'%ROWCOUNT'", "'%BULK_ROWCOUNT'", 
		"'%CHARSET'", "'@!'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "ACCESS", "ADD", "ALL", "ALTER", "AND", "ANY", "AS", 
		"ASC", "BETWEEN", "BY", "CASE", "CHAR", "CHECK", "CLUSTER", "CONNECT", 
		"CREATE", "CURRENT", "DATE", "DECIMAL", "DEFAULT", "DELETE", "DESC", "DISTINCT", 
		"DROP", "ELSE", "EXCLUSIVE", "EXISTS", "FALSE", "FLOAT", "FOR", "FROM", 
		"GRANT", "GROUP", "HAVING", "IN", "INCREMENT", "INSERT", "INTEGER", "INTERSECT", 
		"INTO", "IS", "LEVEL", "LIMIT", "LIKE", "LONG", "MINUS2", "NOT", "NOWAIT", 
		"NULL", "K_NUMBER", "OF", "ON", "OPTION", "OR", "ORDER", "PRIOR", "RAW", 
		"ROW", "ROWID", "ROWNUM", "ROWS", "SELECT", "SESSION", "SET", "SMALLINT", 
		"START", "SYSDATE", "TABLE", "THEN", "TO", "TRUE", "UNION", "UNIQUE", 
		"UPDATE", "USER", "VALUES", "VARCHAR", "VARCHAR2", "WHERE", "WITH", "AT", 
		"AUTOMATIC", "BFILE", "BINARY_DOUBLE", "BINARY_FLOAT", "BINARY_INTEGER", 
		"BLOB", "BLOCK", "BOOLEAN", "BOTH", "BREADTH", "BYTE", "CAST", "CHARACTER", 
		"CLOB", "CLUSTER_SET", "CONNECT_BY_ROOT", "CONSTRAINT", "COUNT", "CROSS", 
		"CUBE", "CURSOR", "CYCLE", "DAY", "DBTIMEZONE", "DEC", "DECREMENT", "DENSE_RANK", 
		"DEPTH", "DIMENSION", "DOUBLE", "EMPTY", "END", "EQUALS_PATH", "ERRORS", 
		"ESCAPE", "EXCLUDE", "EXTRACT", "FIRST", "FOLLOWING", "FULL", "GROUPING", 
		"HOUR", "IGNORE", "INCLUDE", "INFINITE", "INNER", "INT", "INTERVAL", "ITERATE", 
		"JOIN", "KEEP", "LAST", "LEADING", "LEFT", "LISTAGG", "LNNVL", "LOCAL", 
		"LOCKED", "LOG", "MAIN", "MATCHED", "MAXVALUE", "MEASURES", "MEMBER", 
		"MERGE", "MINUTE", "MIVALUE", "MLSLABEL", "MODEL", "MONTH", "MULTISET", 
		"NAN", "NATIONAL", "NATURAL", "NAV", "NCHAR", "NCLOB", "NOCYCLE", "NULLS", 
		"NUMERIC", "NVARCHAR", "NVARCHAR2", "ONLY", "OUTER", "OVER", "PARTITION", 
		"PERCENT_RANK", "PERCENTILE_CONT", "PERCENTILE_DISC", "PIVOT", "PLS_INTEGER", 
		"POSITIVE", "PRECEDING", "PRECISION", "PRESENT", "RANGE", "READ", "REAL", 
		"REFERENCE", "REGEXP_LIKE", "REJECT", "RESPECT", "RETURN", "RETURNING", 
		"RIGHT", "ROLLUP", "RULES", "SAMPLE", "SCN", "SEARCH", "SECOND", "SEED", 
		"SEQUENTIAL", "SESSIONTIMEZONE", "SETS", "SIBLINGS", "SINGLE", "SKIP", 
		"SOME", "SQL", "SUBMULTISET", "SUBPARTITION", "THE", "TIME", "TIMESTAMP", 
		"TIMEZONE_HOUR", "TIMEZONE_MINUTE", "TIMEZONE_REGION", "TIMEZONE_ABBR", 
		"TRAILING", "TRIM", "TYPE", "UNBOUNDED", "UNDER_PATH", "UNLIMITED", "UNPIVOT", 
		"UNTIL", "UPDATED", "UPSERT", "UROWID", "USING", "VALUE", "VARYING", "VERSIONS", 
		"WAIT", "WHEN", "WITHIN", "XML", "YEAR", "ZONE", "QUOTED_STRING", "BINDVAR", 
		"ID", "SEMI", "COLON", "DOUBLEDOT", "DOT", "COMMA", "ASTERISK", "AT_SIGN", 
		"RPAREN", "LPAREN", "RBRACK", "LBRACK", "PLUS", "MINUS", "DIVIDE", "EQ", 
		"PERCENTAGE", "LLABEL", "RLABEL", "ASSIGN", "ARROW", "VERTBAR", "DOUBLEVERTBAR", 
		"NOT_EQ", "LTH", "LEQ", "GTH", "GEQ", "NUMBER", "QUOTE", "WS", "SL_COMMENT", 
		"ML_COMMENT", "HINT", "TYPE_ATTR", "ROWTYPE_ATTR", "NOTFOUND_ATTR", "FOUND_ATTR", 
		"ISOPEN_ATTR", "ROWCOUNT_ATTR", "BULK_ROWCOUNT_ATTR", "CHARSET_ATTR", 
		"ZV"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "OracleSql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public OracleSqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(OracleSqlParser.SEMI, 0); }
		public TerminalNode EOF() { return getToken(OracleSqlParser.EOF, 0); }
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public Update_statementContext update_statement() {
			return getRuleContext(Update_statementContext.class,0);
		}
		public Insert_statementContext insert_statement() {
			return getRuleContext(Insert_statementContext.class,0);
		}
		public Merge_statementContext merge_statement() {
			return getRuleContext(Merge_statementContext.class,0);
		}
		public Delete_statementContext delete_statement() {
			return getRuleContext(Delete_statementContext.class,0);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			switch (_input.LA(1)) {
			case SELECT:
			case WITH:
			case LPAREN:
				{
				setState(398);
				select_statement();
				}
				break;
			case UPDATE:
				{
				setState(399);
				update_statement();
				}
				break;
			case INSERT:
				{
				setState(400);
				insert_statement();
				}
				break;
			case MERGE:
				{
				setState(401);
				merge_statement();
				}
				break;
			case DELETE:
				{
				setState(402);
				delete_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(405);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==SEMI) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delete_statementContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(OracleSqlParser.DELETE, 0); }
		public Dml_table_expression_clauseContext dml_table_expression_clause() {
			return getRuleContext(Dml_table_expression_clauseContext.class,0);
		}
		public TerminalNode ONLY() { return getToken(OracleSqlParser.ONLY, 0); }
		public TerminalNode LPAREN() { return getToken(OracleSqlParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(OracleSqlParser.RPAREN, 0); }
		public TerminalNode FROM() { return getToken(OracleSqlParser.FROM, 0); }
		public T_aliasContext t_alias() {
			return getRuleContext(T_aliasContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Returning_clauseContext returning_clause() {
			return getRuleContext(Returning_clauseContext.class,0);
		}
		public Error_logging_clauseContext error_logging_clause() {
			return getRuleContext(Error_logging_clauseContext.class,0);
		}
		public Delete_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterDelete_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitDelete_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitDelete_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_statementContext delete_statement() throws RecognitionException {
		Delete_statementContext _localctx = new Delete_statementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_delete_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(DELETE);
			setState(409);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(408);
				match(FROM);
				}
			}

			setState(417);
			switch (_input.LA(1)) {
			case ACCESS:
			case ROWID:
			case ROWNUM:
			case TABLE:
			case COUNT:
			case CYCLE:
			case SQL:
			case THE:
			case TIME:
			case TYPE:
			case VALUE:
			case YEAR:
			case QUOTED_STRING:
			case ID:
			case LPAREN:
				{
				setState(411);
				dml_table_expression_clause();
				}
				break;
			case ONLY:
				{
				setState(412);
				match(ONLY);
				setState(413);
				match(LPAREN);
				setState(414);
				dml_table_expression_clause();
				setState(415);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(420);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCESS) | (1L << ROWID) | (1L << ROWNUM))) != 0) || _la==COUNT || _la==CYCLE || ((((_la - 203)) & ~0x3f) == 0 && ((1L << (_la - 203)) & ((1L << (SQL - 203)) | (1L << (TIME - 203)) | (1L << (TYPE - 203)) | (1L << (VALUE - 203)) | (1L << (YEAR - 203)) | (1L << (QUOTED_STRING - 203)) | (1L << (ID - 203)))) != 0)) {
				{
				setState(419);
				t_alias();
				}
			}

			setState(423);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(422);
				where_clause();
				}
			}

			setState(426);
			_la = _input.LA(1);
			if (_la==RETURN || _la==RETURNING) {
				{
				setState(425);
				returning_clause();
				}
			}

			setState(429);
			_la = _input.LA(1);
			if (_la==LOG) {
				{
				setState(428);
				error_logging_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Merge_statementContext extends ParserRuleContext {
		public TerminalNode MERGE() { return getToken(OracleSqlParser.MERGE, 0); }
		public TerminalNode INTO() { return getToken(OracleSqlParser.INTO, 0); }
		public List<Table_nameContext> table_name() {
			return getRuleContexts(Table_nameContext.class);
		}
		public Table_nameContext table_name(int i) {
			return getRuleContext(Table_nameContext.class,i);
		}
		public TerminalNode USING() { return getToken(OracleSqlParser.USING, 0); }
		public TerminalNode ON() { return getToken(OracleSqlParser.ON, 0); }
		public TerminalNode LPAREN() { return getToken(OracleSqlParser.LPAREN, 0); }
		public Sql_conditionContext sql_condition() {
			return getRuleContext(Sql_conditionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(OracleSqlParser.RPAREN, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public List<Schema_nameContext> schema_name() {
			return getRuleContexts(Schema_nameContext.class);
		}
		public Schema_nameContext schema_name(int i) {
			return getRuleContext(Schema_nameContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(OracleSqlParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(OracleSqlParser.DOT, i);
		}
		public List<T_aliasContext> t_alias() {
			return getRuleContexts(T_aliasContext.class);
		}
		public T_aliasContext t_alias(int i) {
			return getRuleContext(T_aliasContext.class,i);
		}
		public Merge_update_clauseContext merge_update_clause() {
			return getRuleContext(Merge_update_clauseContext.class,0);
		}
		public Merge_insert_clauseContext merge_insert_clause() {
			return getRuleContext(Merge_insert_clauseContext.class,0);
		}
		public Error_logging_clauseContext error_logging_clause() {
			return getRuleContext(Error_logging_clauseContext.class,0);
		}
		public Merge_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_merge_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterMerge_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitMerge_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitMerge_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Merge_statementContext merge_statement() throws RecognitionException {
		Merge_statementContext _localctx = new Merge_statementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_merge_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			match(MERGE);
			setState(432);
			match(INTO);
			setState(436);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(433);
				schema_name();
				setState(434);
				match(DOT);
				}
				break;
			}
			setState(438);
			table_name();
			setState(440);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCESS) | (1L << ROWID) | (1L << ROWNUM))) != 0) || _la==COUNT || _la==CYCLE || ((((_la - 203)) & ~0x3f) == 0 && ((1L << (_la - 203)) & ((1L << (SQL - 203)) | (1L << (TIME - 203)) | (1L << (TYPE - 203)) | (1L << (VALUE - 203)) | (1L << (YEAR - 203)) | (1L << (QUOTED_STRING - 203)) | (1L << (ID - 203)))) != 0)) {
				{
				setState(439);
				t_alias();
				}
			}

			setState(442);
			match(USING);
			setState(450);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(443);
				subquery();
				}
				break;
			case ACCESS:
			case ROWID:
			case ROWNUM:
			case COUNT:
			case CYCLE:
			case SQL:
			case TIME:
			case TYPE:
			case VALUE:
			case YEAR:
			case QUOTED_STRING:
			case ID:
				{
				setState(447);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(444);
					schema_name();
					setState(445);
					match(DOT);
					}
					break;
				}
				setState(449);
				table_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(453);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCESS) | (1L << ROWID) | (1L << ROWNUM))) != 0) || _la==COUNT || _la==CYCLE || ((((_la - 203)) & ~0x3f) == 0 && ((1L << (_la - 203)) & ((1L << (SQL - 203)) | (1L << (TIME - 203)) | (1L << (TYPE - 203)) | (1L << (VALUE - 203)) | (1L << (YEAR - 203)) | (1L << (QUOTED_STRING - 203)) | (1L << (ID - 203)))) != 0)) {
				{
				setState(452);
				t_alias();
				}
			}

			setState(455);
			match(ON);
			setState(456);
			match(LPAREN);
			setState(457);
			sql_condition();
			setState(458);
			match(RPAREN);
			setState(467);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(459);
				merge_update_clause();
				setState(461);
				_la = _input.LA(1);
				if (_la==WHEN) {
					{
					setState(460);
					merge_insert_clause();
					}
				}

				}
				break;
			case 2:
				{
				setState(463);
				merge_insert_clause();
				setState(465);
				_la = _input.LA(1);
				if (_la==WHEN) {
					{
					setState(464);
					merge_update_clause();
					}
				}

				}
				break;
			}
			setState(470);
			_la = _input.LA(1);
			if (_la==LOG) {
				{
				setState(469);
				error_logging_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Merge_update_clauseContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(OracleSqlParser.WHEN, 0); }
		public TerminalNode MATCHED() { return getToken(OracleSqlParser.MATCHED, 0); }
		public TerminalNode THEN() { return getToken(OracleSqlParser.THEN, 0); }
		public TerminalNode UPDATE() { return getToken(OracleSqlParser.UPDATE, 0); }
		public TerminalNode SET() { return getToken(OracleSqlParser.SET, 0); }
		public List<Column_specContext> column_spec() {
			return getRuleContexts(Column_specContext.class);
		}
		public Column_specContext column_spec(int i) {
			return getRuleContext(Column_specContext.class,i);
		}
		public List<TerminalNode> EQ() { return getTokens(OracleSqlParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(OracleSqlParser.EQ, i);
		}
		public List<TerminalNode> DEFAULT() { return getTokens(OracleSqlParser.DEFAULT); }
		public TerminalNode DEFAULT(int i) {
			return getToken(OracleSqlParser.DEFAULT, i);
		}
		public List<Sql_expressionContext> sql_expression() {
			return getRuleContexts(Sql_expressionContext.class);
		}
		public Sql_expressionContext sql_expression(int i) {
			return getRuleContext(Sql_expressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OracleSqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleSqlParser.COMMA, i);
		}
		public List<Where_clauseContext> where_clause() {
			return getRuleContexts(Where_clauseContext.class);
		}
		public Where_clauseContext where_clause(int i) {
			return getRuleContext(Where_clauseContext.class,i);
		}
		public TerminalNode DELETE() { return getToken(OracleSqlParser.DELETE, 0); }
		public Merge_update_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_merge_update_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterMerge_update_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitMerge_update_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitMerge_update_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Merge_update_clauseContext merge_update_clause() throws RecognitionException {
		Merge_update_clauseContext _localctx = new Merge_update_clauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_merge_update_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			match(WHEN);
			setState(473);
			match(MATCHED);
			setState(474);
			match(THEN);
			setState(475);
			match(UPDATE);
			setState(476);
			match(SET);
			setState(477);
			column_spec();
			setState(478);
			match(EQ);
			setState(481);
			switch (_input.LA(1)) {
			case DEFAULT:
				{
				setState(479);
				match(DEFAULT);
				}
				break;
			case ACCESS:
			case CASE:
			case DATE:
			case FALSE:
			case LEVEL:
			case NULL:
			case PRIOR:
			case ROWID:
			case ROWNUM:
			case SET:
			case SYSDATE:
			case TRUE:
			case USER:
			case CAST:
			case CLUSTER_SET:
			case CONNECT_BY_ROOT:
			case COUNT:
			case CURSOR:
			case CYCLE:
			case DENSE_RANK:
			case EXTRACT:
			case INTERVAL:
			case LISTAGG:
			case LNNVL:
			case PERCENT_RANK:
			case PERCENTILE_CONT:
			case PERCENTILE_DISC:
			case SQL:
			case TIME:
			case TIMESTAMP:
			case TRIM:
			case TYPE:
			case VALUE:
			case YEAR:
			case QUOTED_STRING:
			case BINDVAR:
			case ID:
			case COLON:
			case LPAREN:
			case PLUS:
			case MINUS:
			case NUMBER:
				{
				setState(480);
				sql_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(483);
				match(COMMA);
				setState(484);
				column_spec();
				setState(485);
				match(EQ);
				setState(488);
				switch (_input.LA(1)) {
				case DEFAULT:
					{
					setState(486);
					match(DEFAULT);
					}
					break;
				case ACCESS:
				case CASE:
				case DATE:
				case FALSE:
				case LEVEL:
				case NULL:
				case PRIOR:
				case ROWID:
				case ROWNUM:
				case SET:
				case SYSDATE:
				case TRUE:
				case USER:
				case CAST:
				case CLUSTER_SET:
				case CONNECT_BY_ROOT:
				case COUNT:
				case CURSOR:
				case CYCLE:
				case DENSE_RANK:
				case EXTRACT:
				case INTERVAL:
				case LISTAGG:
				case LNNVL:
				case PERCENT_RANK:
				case PERCENTILE_CONT:
				case PERCENTILE_DISC:
				case SQL:
				case TIME:
				case TIMESTAMP:
				case TRIM:
				case TYPE:
				case VALUE:
				case YEAR:
				case QUOTED_STRING:
				case BINDVAR:
				case ID:
				case COLON:
				case LPAREN:
				case PLUS:
				case MINUS:
				case NUMBER:
					{
					setState(487);
					sql_expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(494);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(496);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(495);
				where_clause();
				}
			}

			setState(500);
			_la = _input.LA(1);
			if (_la==DELETE) {
				{
				setState(498);
				match(DELETE);
				setState(499);
				where_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Merge_insert_clauseContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(OracleSqlParser.WHEN, 0); }
		public TerminalNode NOT() { return getToken(OracleSqlParser.NOT, 0); }
		public TerminalNode MATCHED() { return getToken(OracleSqlParser.MATCHED, 0); }
		public TerminalNode THEN() { return getToken(OracleSqlParser.THEN, 0); }
		public TerminalNode INSERT() { return getToken(OracleSqlParser.INSERT, 0); }
		public TerminalNode VALUES() { return getToken(OracleSqlParser.VALUES, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(OracleSqlParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(OracleSqlParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(OracleSqlParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(OracleSqlParser.RPAREN, i);
		}
		public List<TerminalNode> DEFAULT() { return getTokens(OracleSqlParser.DEFAULT); }
		public TerminalNode DEFAULT(int i) {
			return getToken(OracleSqlParser.DEFAULT, i);
		}
		public List<Sql_expressionContext> sql_expression() {
			return getRuleContexts(Sql_expressionContext.class);
		}
		public Sql_expressionContext sql_expression(int i) {
			return getRuleContext(Sql_expressionContext.class,i);
		}
		public Column_specsContext column_specs() {
			return getRuleContext(Column_specsContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(OracleSqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleSqlParser.COMMA, i);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Merge_insert_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_merge_insert_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterMerge_insert_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitMerge_insert_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitMerge_insert_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Merge_insert_clauseContext merge_insert_clause() throws RecognitionException {
		Merge_insert_clauseContext _localctx = new Merge_insert_clauseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_merge_insert_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			match(WHEN);
			setState(503);
			match(NOT);
			setState(504);
			match(MATCHED);
			setState(505);
			match(THEN);
			setState(506);
			match(INSERT);
			setState(511);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(507);
				match(LPAREN);
				setState(508);
				column_specs();
				setState(509);
				match(RPAREN);
				}
			}

			setState(513);
			match(VALUES);
			setState(514);
			match(LPAREN);
			setState(517);
			switch (_input.LA(1)) {
			case DEFAULT:
				{
				setState(515);
				match(DEFAULT);
				}
				break;
			case ACCESS:
			case CASE:
			case DATE:
			case FALSE:
			case LEVEL:
			case NULL:
			case PRIOR:
			case ROWID:
			case ROWNUM:
			case SET:
			case SYSDATE:
			case TRUE:
			case USER:
			case CAST:
			case CLUSTER_SET:
			case CONNECT_BY_ROOT:
			case COUNT:
			case CURSOR:
			case CYCLE:
			case DENSE_RANK:
			case EXTRACT:
			case INTERVAL:
			case LISTAGG:
			case LNNVL:
			case PERCENT_RANK:
			case PERCENTILE_CONT:
			case PERCENTILE_DISC:
			case SQL:
			case TIME:
			case TIMESTAMP:
			case TRIM:
			case TYPE:
			case VALUE:
			case YEAR:
			case QUOTED_STRING:
			case BINDVAR:
			case ID:
			case COLON:
			case LPAREN:
			case PLUS:
			case MINUS:
			case NUMBER:
				{
				setState(516);
				sql_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(519);
				match(COMMA);
				setState(522);
				switch (_input.LA(1)) {
				case DEFAULT:
					{
					setState(520);
					match(DEFAULT);
					}
					break;
				case ACCESS:
				case CASE:
				case DATE:
				case FALSE:
				case LEVEL:
				case NULL:
				case PRIOR:
				case ROWID:
				case ROWNUM:
				case SET:
				case SYSDATE:
				case TRUE:
				case USER:
				case CAST:
				case CLUSTER_SET:
				case CONNECT_BY_ROOT:
				case COUNT:
				case CURSOR:
				case CYCLE:
				case DENSE_RANK:
				case EXTRACT:
				case INTERVAL:
				case LISTAGG:
				case LNNVL:
				case PERCENT_RANK:
				case PERCENTILE_CONT:
				case PERCENTILE_DISC:
				case SQL:
				case TIME:
				case TIMESTAMP:
				case TRIM:
				case TYPE:
				case VALUE:
				case YEAR:
				case QUOTED_STRING:
				case BINDVAR:
				case ID:
				case COLON:
				case LPAREN:
				case PLUS:
				case MINUS:
				case NUMBER:
					{
					setState(521);
					sql_expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(528);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(529);
			match(RPAREN);
			setState(531);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(530);
				where_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_statementContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(OracleSqlParser.INSERT, 0); }
		public Single_table_insertContext single_table_insert() {
			return getRuleContext(Single_table_insertContext.class,0);
		}
		public Multi_table_insertContext multi_table_insert() {
			return getRuleContext(Multi_table_insertContext.class,0);
		}
		public Insert_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterInsert_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitInsert_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitInsert_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_statementContext insert_statement() throws RecognitionException {
		Insert_statementContext _localctx = new Insert_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_insert_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			match(INSERT);
			setState(536);
			switch (_input.LA(1)) {
			case INTO:
				{
				setState(534);
				single_table_insert();
				}
				break;
			case ALL:
			case FIRST:
			case WHEN:
				{
				setState(535);
				multi_table_insert();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Single_table_insertContext extends ParserRuleContext {
		public Insert_into_clauseContext insert_into_clause() {
			return getRuleContext(Insert_into_clauseContext.class,0);
		}
		public Values_clauseContext values_clause() {
			return getRuleContext(Values_clauseContext.class,0);
		}
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public Error_logging_clauseContext error_logging_clause() {
			return getRuleContext(Error_logging_clauseContext.class,0);
		}
		public Returning_clauseContext returning_clause() {
			return getRuleContext(Returning_clauseContext.class,0);
		}
		public Single_table_insertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_table_insert; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterSingle_table_insert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitSingle_table_insert(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitSingle_table_insert(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_table_insertContext single_table_insert() throws RecognitionException {
		Single_table_insertContext _localctx = new Single_table_insertContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_single_table_insert);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			insert_into_clause();
			setState(545);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(539);
				values_clause();
				setState(541);
				_la = _input.LA(1);
				if (_la==RETURN || _la==RETURNING) {
					{
					setState(540);
					returning_clause();
					}
				}

				}
				break;
			case 2:
				{
				setState(543);
				select_statement();
				}
				break;
			case 3:
				{
				setState(544);
				subquery();
				}
				break;
			}
			setState(548);
			_la = _input.LA(1);
			if (_la==LOG) {
				{
				setState(547);
				error_logging_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_into_clauseContext extends ParserRuleContext {
		public TerminalNode INTO() { return getToken(OracleSqlParser.INTO, 0); }
		public Dml_table_expression_clauseContext dml_table_expression_clause() {
			return getRuleContext(Dml_table_expression_clauseContext.class,0);
		}
		public HintContext hint() {
			return getRuleContext(HintContext.class,0);
		}
		public T_aliasContext t_alias() {
			return getRuleContext(T_aliasContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(OracleSqlParser.LPAREN, 0); }
		public Column_specsContext column_specs() {
			return getRuleContext(Column_specsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(OracleSqlParser.RPAREN, 0); }
		public Insert_into_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_into_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterInsert_into_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitInsert_into_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitInsert_into_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_into_clauseContext insert_into_clause() throws RecognitionException {
		Insert_into_clauseContext _localctx = new Insert_into_clauseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_insert_into_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			match(INTO);
			setState(552);
			_la = _input.LA(1);
			if (_la==HINT) {
				{
				setState(551);
				hint();
				}
			}

			setState(554);
			dml_table_expression_clause();
			setState(556);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCESS) | (1L << ROWID) | (1L << ROWNUM))) != 0) || _la==COUNT || _la==CYCLE || ((((_la - 203)) & ~0x3f) == 0 && ((1L << (_la - 203)) & ((1L << (SQL - 203)) | (1L << (TIME - 203)) | (1L << (TYPE - 203)) | (1L << (VALUE - 203)) | (1L << (YEAR - 203)) | (1L << (QUOTED_STRING - 203)) | (1L << (ID - 203)))) != 0)) {
				{
				setState(555);
				t_alias();
				}
			}

			setState(562);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(558);
				match(LPAREN);
				setState(559);
				column_specs();
				setState(560);
				match(RPAREN);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Values_clauseContext extends ParserRuleContext {
		public TerminalNode VALUES() { return getToken(OracleSqlParser.VALUES, 0); }
		public TerminalNode LPAREN() { return getToken(OracleSqlParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(OracleSqlParser.RPAREN, 0); }
		public List<TerminalNode> DEFAULT() { return getTokens(OracleSqlParser.DEFAULT); }
		public TerminalNode DEFAULT(int i) {
			return getToken(OracleSqlParser.DEFAULT, i);
		}
		public List<Sql_expressionContext> sql_expression() {
			return getRuleContexts(Sql_expressionContext.class);
		}
		public Sql_expressionContext sql_expression(int i) {
			return getRuleContext(Sql_expressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OracleSqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleSqlParser.COMMA, i);
		}
		public Values_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterValues_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitValues_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitValues_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Values_clauseContext values_clause() throws RecognitionException {
		Values_clauseContext _localctx = new Values_clauseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_values_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			match(VALUES);
			setState(565);
			match(LPAREN);
			setState(568);
			switch (_input.LA(1)) {
			case DEFAULT:
				{
				setState(566);
				match(DEFAULT);
				}
				break;
			case ACCESS:
			case CASE:
			case DATE:
			case FALSE:
			case LEVEL:
			case NULL:
			case PRIOR:
			case ROWID:
			case ROWNUM:
			case SET:
			case SYSDATE:
			case TRUE:
			case USER:
			case CAST:
			case CLUSTER_SET:
			case CONNECT_BY_ROOT:
			case COUNT:
			case CURSOR:
			case CYCLE:
			case DENSE_RANK:
			case EXTRACT:
			case INTERVAL:
			case LISTAGG:
			case LNNVL:
			case PERCENT_RANK:
			case PERCENTILE_CONT:
			case PERCENTILE_DISC:
			case SQL:
			case TIME:
			case TIMESTAMP:
			case TRIM:
			case TYPE:
			case VALUE:
			case YEAR:
			case QUOTED_STRING:
			case BINDVAR:
			case ID:
			case COLON:
			case LPAREN:
			case PLUS:
			case MINUS:
			case NUMBER:
				{
				setState(567);
				sql_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(577);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(570);
				match(COMMA);
				setState(573);
				switch (_input.LA(1)) {
				case DEFAULT:
					{
					setState(571);
					match(DEFAULT);
					}
					break;
				case ACCESS:
				case CASE:
				case DATE:
				case FALSE:
				case LEVEL:
				case NULL:
				case PRIOR:
				case ROWID:
				case ROWNUM:
				case SET:
				case SYSDATE:
				case TRUE:
				case USER:
				case CAST:
				case CLUSTER_SET:
				case CONNECT_BY_ROOT:
				case COUNT:
				case CURSOR:
				case CYCLE:
				case DENSE_RANK:
				case EXTRACT:
				case INTERVAL:
				case LISTAGG:
				case LNNVL:
				case PERCENT_RANK:
				case PERCENTILE_CONT:
				case PERCENTILE_DISC:
				case SQL:
				case TIME:
				case TIMESTAMP:
				case TRIM:
				case TYPE:
				case VALUE:
				case YEAR:
				case QUOTED_STRING:
				case BINDVAR:
				case ID:
				case COLON:
				case LPAREN:
				case PLUS:
				case MINUS:
				case NUMBER:
					{
					setState(572);
					sql_expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(579);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(580);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Returning_clauseContext extends ParserRuleContext {
		public List<Sql_expressionContext> sql_expression() {
			return getRuleContexts(Sql_expressionContext.class);
		}
		public Sql_expressionContext sql_expression(int i) {
			return getRuleContext(Sql_expressionContext.class,i);
		}
		public TerminalNode INTO() { return getToken(OracleSqlParser.INTO, 0); }
		public List<Data_itemContext> data_item() {
			return getRuleContexts(Data_itemContext.class);
		}
		public Data_itemContext data_item(int i) {
			return getRuleContext(Data_itemContext.class,i);
		}
		public TerminalNode RETURN() { return getToken(OracleSqlParser.RETURN, 0); }
		public TerminalNode RETURNING() { return getToken(OracleSqlParser.RETURNING, 0); }
		public List<TerminalNode> COMMA() { return getTokens(OracleSqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleSqlParser.COMMA, i);
		}
		public Returning_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returning_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterReturning_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitReturning_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitReturning_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Returning_clauseContext returning_clause() throws RecognitionException {
		Returning_clauseContext _localctx = new Returning_clauseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_returning_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			_la = _input.LA(1);
			if ( !(_la==RETURN || _la==RETURNING) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(583);
			sql_expression();
			setState(588);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(584);
				match(COMMA);
				setState(585);
				sql_expression();
				}
				}
				setState(590);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(591);
			match(INTO);
			setState(592);
			data_item();
			setState(597);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(593);
				match(COMMA);
				setState(594);
				data_item();
				}
				}
				setState(599);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Multi_table_insertContext extends ParserRuleContext {
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode ALL() { return getToken(OracleSqlParser.ALL, 0); }
		public Conditional_insert_clauseContext conditional_insert_clause() {
			return getRuleContext(Conditional_insert_clauseContext.class,0);
		}
		public List<Insert_into_clauseContext> insert_into_clause() {
			return getRuleContexts(Insert_into_clauseContext.class);
		}
		public Insert_into_clauseContext insert_into_clause(int i) {
			return getRuleContext(Insert_into_clauseContext.class,i);
		}
		public List<Values_clauseContext> values_clause() {
			return getRuleContexts(Values_clauseContext.class);
		}
		public Values_clauseContext values_clause(int i) {
			return getRuleContext(Values_clauseContext.class,i);
		}
		public List<Error_logging_clauseContext> error_logging_clause() {
			return getRuleContexts(Error_logging_clauseContext.class);
		}
		public Error_logging_clauseContext error_logging_clause(int i) {
			return getRuleContext(Error_logging_clauseContext.class,i);
		}
		public Multi_table_insertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multi_table_insert; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterMulti_table_insert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitMulti_table_insert(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitMulti_table_insert(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multi_table_insertContext multi_table_insert() throws RecognitionException {
		Multi_table_insertContext _localctx = new Multi_table_insertContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_multi_table_insert);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(600);
				match(ALL);
				setState(608); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(601);
					insert_into_clause();
					setState(603);
					_la = _input.LA(1);
					if (_la==VALUES) {
						{
						setState(602);
						values_clause();
						}
					}

					setState(606);
					_la = _input.LA(1);
					if (_la==LOG) {
						{
						setState(605);
						error_logging_clause();
						}
					}

					}
					}
					setState(610); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INTO );
				}
				break;
			case 2:
				{
				setState(612);
				conditional_insert_clause();
				}
				break;
			}
			setState(615);
			subquery();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conditional_insert_clauseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(OracleSqlParser.ELSE, 0); }
		public List<TerminalNode> WHEN() { return getTokens(OracleSqlParser.WHEN); }
		public TerminalNode WHEN(int i) {
			return getToken(OracleSqlParser.WHEN, i);
		}
		public List<Sql_conditionContext> sql_condition() {
			return getRuleContexts(Sql_conditionContext.class);
		}
		public Sql_conditionContext sql_condition(int i) {
			return getRuleContext(Sql_conditionContext.class,i);
		}
		public List<TerminalNode> THEN() { return getTokens(OracleSqlParser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(OracleSqlParser.THEN, i);
		}
		public List<Insert_into_clauseContext> insert_into_clause() {
			return getRuleContexts(Insert_into_clauseContext.class);
		}
		public Insert_into_clauseContext insert_into_clause(int i) {
			return getRuleContext(Insert_into_clauseContext.class,i);
		}
		public TerminalNode ALL() { return getToken(OracleSqlParser.ALL, 0); }
		public TerminalNode FIRST() { return getToken(OracleSqlParser.FIRST, 0); }
		public List<Values_clauseContext> values_clause() {
			return getRuleContexts(Values_clauseContext.class);
		}
		public Values_clauseContext values_clause(int i) {
			return getRuleContext(Values_clauseContext.class,i);
		}
		public Conditional_insert_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_insert_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterConditional_insert_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitConditional_insert_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitConditional_insert_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_insert_clauseContext conditional_insert_clause() throws RecognitionException {
		Conditional_insert_clauseContext _localctx = new Conditional_insert_clauseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_conditional_insert_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			_la = _input.LA(1);
			if (_la==ALL || _la==FIRST) {
				{
				setState(617);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==FIRST) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(631); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(620);
				match(WHEN);
				setState(621);
				sql_condition();
				setState(622);
				match(THEN);
				setState(627); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(623);
					insert_into_clause();
					setState(625);
					_la = _input.LA(1);
					if (_la==VALUES) {
						{
						setState(624);
						values_clause();
						}
					}

					}
					}
					setState(629); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INTO );
				}
				}
				setState(633); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			setState(635);
			match(ELSE);
			setState(640); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(636);
				insert_into_clause();
				setState(638);
				_la = _input.LA(1);
				if (_la==VALUES) {
					{
					setState(637);
					values_clause();
					}
				}

				}
				}
				setState(642); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INTO );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dml_table_expression_clauseContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(OracleSqlParser.DOT, 0); }
		public Partition_extension_clauseContext partition_extension_clause() {
			return getRuleContext(Partition_extension_clauseContext.class,0);
		}
		public TerminalNode AT_SIGN() { return getToken(OracleSqlParser.AT_SIGN, 0); }
		public Dblink_nameContext dblink_name() {
			return getRuleContext(Dblink_nameContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public Subquery_restricrion_clauseContext subquery_restricrion_clause() {
			return getRuleContext(Subquery_restricrion_clauseContext.class,0);
		}
		public Pivot_clauseContext pivot_clause() {
			return getRuleContext(Pivot_clauseContext.class,0);
		}
		public Unpivot_clauseContext unpivot_clause() {
			return getRuleContext(Unpivot_clauseContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(OracleSqlParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(OracleSqlParser.RPAREN, 0); }
		public Table_collection_clauseContext table_collection_clause() {
			return getRuleContext(Table_collection_clauseContext.class,0);
		}
		public Dml_table_expression_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dml_table_expression_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterDml_table_expression_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitDml_table_expression_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitDml_table_expression_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dml_table_expression_clauseContext dml_table_expression_clause() throws RecognitionException {
		Dml_table_expression_clauseContext _localctx = new Dml_table_expression_clauseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_dml_table_expression_clause);
		int _la;
		try {
			setState(671);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(647);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(644);
					schema_name();
					setState(645);
					match(DOT);
					}
					break;
				}
				setState(649);
				table_name();
				setState(653);
				switch (_input.LA(1)) {
				case PARTITION:
				case SUBPARTITION:
					{
					setState(650);
					partition_extension_clause();
					}
					break;
				case AT_SIGN:
					{
					setState(651);
					match(AT_SIGN);
					setState(652);
					dblink_name();
					}
					break;
				case EOF:
				case ACCESS:
				case ELSE:
				case INTO:
				case ROWID:
				case ROWNUM:
				case SELECT:
				case SET:
				case VALUES:
				case WHERE:
				case WITH:
				case COUNT:
				case CYCLE:
				case LOG:
				case RETURN:
				case RETURNING:
				case SQL:
				case TIME:
				case TYPE:
				case VALUE:
				case WHEN:
				case YEAR:
				case QUOTED_STRING:
				case ID:
				case SEMI:
				case RPAREN:
				case LPAREN:
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(655);
				subquery();
				setState(657);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(656);
					subquery_restricrion_clause();
					}
					break;
				}
				setState(661);
				switch (_input.LA(1)) {
				case PIVOT:
					{
					setState(659);
					pivot_clause();
					}
					break;
				case UNPIVOT:
					{
					setState(660);
					unpivot_clause();
					}
					break;
				case EOF:
				case ACCESS:
				case ELSE:
				case INTO:
				case ROWID:
				case ROWNUM:
				case SELECT:
				case SET:
				case VALUES:
				case WHERE:
				case WITH:
				case COUNT:
				case CYCLE:
				case LOG:
				case RETURN:
				case RETURNING:
				case SQL:
				case TIME:
				case TYPE:
				case VALUE:
				case WHEN:
				case YEAR:
				case QUOTED_STRING:
				case ID:
				case SEMI:
				case RPAREN:
				case LPAREN:
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(663);
				match(LPAREN);
				setState(664);
				subquery();
				setState(666);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(665);
					subquery_restricrion_clause();
					}
				}

				setState(668);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(670);
				table_collection_clause();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Error_logging_clauseContext extends ParserRuleContext {
		public TerminalNode LOG() { return getToken(OracleSqlParser.LOG, 0); }
		public TerminalNode ERRORS() { return getToken(OracleSqlParser.ERRORS, 0); }
		public TerminalNode INTO() { return getToken(OracleSqlParser.INTO, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(OracleSqlParser.LPAREN, 0); }
		public Simple_expressionContext simple_expression() {
			return getRuleContext(Simple_expressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(OracleSqlParser.RPAREN, 0); }
		public TerminalNode REJECT() { return getToken(OracleSqlParser.REJECT, 0); }
		public TerminalNode LIMIT() { return getToken(OracleSqlParser.LIMIT, 0); }
		public TerminalNode NUMBER() { return getToken(OracleSqlParser.NUMBER, 0); }
		public TerminalNode UNLIMITED() { return getToken(OracleSqlParser.UNLIMITED, 0); }
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(OracleSqlParser.DOT, 0); }
		public Error_logging_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_logging_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterError_logging_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitError_logging_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitError_logging_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Error_logging_clauseContext error_logging_clause() throws RecognitionException {
		Error_logging_clauseContext _localctx = new Error_logging_clauseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_error_logging_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			match(LOG);
			setState(674);
			match(ERRORS);
			setState(682);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(675);
				match(INTO);
				setState(679);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(676);
					schema_name();
					setState(677);
					match(DOT);
					}
					break;
				}
				setState(681);
				table_name();
				}
				break;
			}
			setState(688);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(684);
				match(LPAREN);
				setState(685);
				simple_expression();
				setState(686);
				match(RPAREN);
				}
				break;
			}
			setState(693);
			_la = _input.LA(1);
			if (_la==REJECT) {
				{
				setState(690);
				match(REJECT);
				setState(691);
				match(LIMIT);
				setState(692);
				_la = _input.LA(1);
				if ( !(_la==UNLIMITED || _la==NUMBER) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Data_itemContext extends ParserRuleContext {
		public Sql_identifierContext sql_identifier() {
			return getRuleContext(Sql_identifierContext.class,0);
		}
		public Bind_variableContext bind_variable() {
			return getRuleContext(Bind_variableContext.class,0);
		}
		public Data_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterData_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitData_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitData_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Data_itemContext data_item() throws RecognitionException {
		Data_itemContext _localctx = new Data_itemContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_data_item);
		try {
			setState(697);
			switch (_input.LA(1)) {
			case ACCESS:
			case ROWID:
			case ROWNUM:
			case COUNT:
			case CYCLE:
			case SQL:
			case TIME:
			case TYPE:
			case VALUE:
			case YEAR:
			case QUOTED_STRING:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(695);
				sql_identifier();
				}
				break;
			case BINDVAR:
			case COLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(696);
				bind_variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_statementContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(OracleSqlParser.UPDATE, 0); }
		public Update_set_clauseContext update_set_clause() {
			return getRuleContext(Update_set_clauseContext.class,0);
		}
		public TerminalNode ONLY() { return getToken(OracleSqlParser.ONLY, 0); }
		public TerminalNode LPAREN() { return getToken(OracleSqlParser.LPAREN, 0); }
		public Dml_table_expression_clauseContext dml_table_expression_clause() {
			return getRuleContext(Dml_table_expression_clauseContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(OracleSqlParser.RPAREN, 0); }
		public T_aliasContext t_alias() {
			return getRuleContext(T_aliasContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Returning_clauseContext returning_clause() {
			return getRuleContext(Returning_clauseContext.class,0);
		}
		public Error_logging_clauseContext error_logging_clause() {
			return getRuleContext(Error_logging_clauseContext.class,0);
		}
		public Update_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterUpdate_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitUpdate_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitUpdate_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_statementContext update_statement() throws RecognitionException {
		Update_statementContext _localctx = new Update_statementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_update_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
			match(UPDATE);
			setState(706);
			switch (_input.LA(1)) {
			case ONLY:
				{
				setState(700);
				match(ONLY);
				setState(701);
				match(LPAREN);
				setState(702);
				dml_table_expression_clause();
				setState(703);
				match(RPAREN);
				}
				break;
			case ACCESS:
			case ROWID:
			case ROWNUM:
			case TABLE:
			case COUNT:
			case CYCLE:
			case SQL:
			case THE:
			case TIME:
			case TYPE:
			case VALUE:
			case YEAR:
			case QUOTED_STRING:
			case ID:
			case LPAREN:
				{
				setState(705);
				dml_table_expression_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(709);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCESS) | (1L << ROWID) | (1L << ROWNUM))) != 0) || _la==COUNT || _la==CYCLE || ((((_la - 203)) & ~0x3f) == 0 && ((1L << (_la - 203)) & ((1L << (SQL - 203)) | (1L << (TIME - 203)) | (1L << (TYPE - 203)) | (1L << (VALUE - 203)) | (1L << (YEAR - 203)) | (1L << (QUOTED_STRING - 203)) | (1L << (ID - 203)))) != 0)) {
				{
				setState(708);
				t_alias();
				}
			}

			setState(711);
			update_set_clause();
			setState(713);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(712);
				where_clause();
				}
			}

			setState(716);
			_la = _input.LA(1);
			if (_la==RETURN || _la==RETURNING) {
				{
				setState(715);
				returning_clause();
				}
			}

			setState(719);
			_la = _input.LA(1);
			if (_la==LOG) {
				{
				setState(718);
				error_logging_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_set_clauseContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(OracleSqlParser.SET, 0); }
		public TerminalNode VALUE() { return getToken(OracleSqlParser.VALUE, 0); }
		public TerminalNode LPAREN() { return getToken(OracleSqlParser.LPAREN, 0); }
		public T_aliasContext t_alias() {
			return getRuleContext(T_aliasContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(OracleSqlParser.RPAREN, 0); }
		public TerminalNode EQ() { return getToken(OracleSqlParser.EQ, 0); }
		public Sql_expressionContext sql_expression() {
			return getRuleContext(Sql_expressionContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public List<Update_set_clause_part1Context> update_set_clause_part1() {
			return getRuleContexts(Update_set_clause_part1Context.class);
		}
		public Update_set_clause_part1Context update_set_clause_part1(int i) {
			return getRuleContext(Update_set_clause_part1Context.class,i);
		}
		public List<Update_set_clause_part2Context> update_set_clause_part2() {
			return getRuleContexts(Update_set_clause_part2Context.class);
		}
		public Update_set_clause_part2Context update_set_clause_part2(int i) {
			return getRuleContext(Update_set_clause_part2Context.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OracleSqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleSqlParser.COMMA, i);
		}
		public Update_set_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_set_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterUpdate_set_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitUpdate_set_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitUpdate_set_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_set_clauseContext update_set_clause() throws RecognitionException {
		Update_set_clauseContext _localctx = new Update_set_clauseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_update_set_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(721);
			match(SET);
			setState(745);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(722);
				match(VALUE);
				setState(723);
				match(LPAREN);
				setState(724);
				t_alias();
				setState(725);
				match(RPAREN);
				setState(726);
				match(EQ);
				setState(729);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(727);
					sql_expression();
					}
					break;
				case 2:
					{
					setState(728);
					subquery();
					}
					break;
				}
				}
				break;
			case 2:
				{
				{
				setState(733);
				switch (_input.LA(1)) {
				case LPAREN:
					{
					setState(731);
					update_set_clause_part1();
					}
					break;
				case ACCESS:
				case LEVEL:
				case NULL:
				case ROWID:
				case ROWNUM:
				case SYSDATE:
				case USER:
				case COUNT:
				case CYCLE:
				case SQL:
				case TIME:
				case TYPE:
				case VALUE:
				case YEAR:
				case QUOTED_STRING:
				case BINDVAR:
				case ID:
				case COLON:
					{
					setState(732);
					update_set_clause_part2();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(742);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(735);
					match(COMMA);
					setState(738);
					switch (_input.LA(1)) {
					case LPAREN:
						{
						setState(736);
						update_set_clause_part1();
						}
						break;
					case ACCESS:
					case LEVEL:
					case NULL:
					case ROWID:
					case ROWNUM:
					case SYSDATE:
					case USER:
					case COUNT:
					case CYCLE:
					case SQL:
					case TIME:
					case TYPE:
					case VALUE:
					case YEAR:
					case QUOTED_STRING:
					case BINDVAR:
					case ID:
					case COLON:
						{
						setState(737);
						update_set_clause_part2();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(744);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_set_clause_part1Context extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(OracleSqlParser.LPAREN, 0); }
		public Column_specsContext column_specs() {
			return getRuleContext(Column_specsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(OracleSqlParser.RPAREN, 0); }
		public TerminalNode EQ() { return getToken(OracleSqlParser.EQ, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public Update_set_clause_part1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_set_clause_part1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterUpdate_set_clause_part1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitUpdate_set_clause_part1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitUpdate_set_clause_part1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_set_clause_part1Context update_set_clause_part1() throws RecognitionException {
		Update_set_clause_part1Context _localctx = new Update_set_clause_part1Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_update_set_clause_part1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747);
			match(LPAREN);
			setState(748);
			column_specs();
			setState(749);
			match(RPAREN);
			setState(750);
			match(EQ);
			setState(751);
			subquery();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_set_clause_part2Context extends ParserRuleContext {
		public Column_specContext column_spec() {
			return getRuleContext(Column_specContext.class,0);
		}
		public TerminalNode EQ() { return getToken(OracleSqlParser.EQ, 0); }
		public TerminalNode DEFAULT() { return getToken(OracleSqlParser.DEFAULT, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public Sql_expressionContext sql_expression() {
			return getRuleContext(Sql_expressionContext.class,0);
		}
		public Update_set_clause_part2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_set_clause_part2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterUpdate_set_clause_part2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitUpdate_set_clause_part2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitUpdate_set_clause_part2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_set_clause_part2Context update_set_clause_part2() throws RecognitionException {
		Update_set_clause_part2Context _localctx = new Update_set_clause_part2Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_update_set_clause_part2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(753);
			column_spec();
			setState(754);
			match(EQ);
			setState(758);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(755);
				match(DEFAULT);
				}
				break;
			case 2:
				{
				setState(756);
				subquery();
				}
				break;
			case 3:
				{
				setState(757);
				sql_expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_statementContext extends ParserRuleContext {
		public For_update_clauseContext fu1;
		public For_update_clauseContext fu2;
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public Subquery_factoring_clauseContext subquery_factoring_clause() {
			return getRuleContext(Subquery_factoring_clauseContext.class,0);
		}
		public TerminalNode SELECT() { return getToken(OracleSqlParser.SELECT, 0); }
		public Select_listContext select_list() {
			return getRuleContext(Select_listContext.class,0);
		}
		public TerminalNode FROM() { return getToken(OracleSqlParser.FROM, 0); }
		public Table_reference_listContext table_reference_list() {
			return getRuleContext(Table_reference_listContext.class,0);
		}
		public HintContext hint() {
			return getRuleContext(HintContext.class,0);
		}
		public TerminalNode INTO() { return getToken(OracleSqlParser.INTO, 0); }
		public List<Data_itemContext> data_item() {
			return getRuleContexts(Data_itemContext.class);
		}
		public Data_itemContext data_item(int i) {
			return getRuleContext(Data_itemContext.class,i);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Hierarchical_query_clauseContext hierarchical_query_clause() {
			return getRuleContext(Hierarchical_query_clauseContext.class,0);
		}
		public Group_by_clauseContext group_by_clause() {
			return getRuleContext(Group_by_clauseContext.class,0);
		}
		public Model_clauseContext model_clause() {
			return getRuleContext(Model_clauseContext.class,0);
		}
		public List<Union_clauseContext> union_clause() {
			return getRuleContexts(Union_clauseContext.class);
		}
		public Union_clauseContext union_clause(int i) {
			return getRuleContext(Union_clauseContext.class,i);
		}
		public Order_by_clauseContext order_by_clause() {
			return getRuleContext(Order_by_clauseContext.class,0);
		}
		public TerminalNode DISTINCT() { return getToken(OracleSqlParser.DISTINCT, 0); }
		public TerminalNode UNIQUE() { return getToken(OracleSqlParser.UNIQUE, 0); }
		public TerminalNode UNION() { return getToken(OracleSqlParser.UNION, 0); }
		public TerminalNode ALL() { return getToken(OracleSqlParser.ALL, 0); }
		public List<For_update_clauseContext> for_update_clause() {
			return getRuleContexts(For_update_clauseContext.class);
		}
		public For_update_clauseContext for_update_clause(int i) {
			return getRuleContext(For_update_clauseContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OracleSqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleSqlParser.COMMA, i);
		}
		public Select_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterSelect_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitSelect_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitSelect_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_statementContext select_statement() throws RecognitionException {
		Select_statementContext _localctx = new Select_statementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_select_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(761);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(760);
				subquery_factoring_clause();
				}
			}

			setState(812);
			switch (_input.LA(1)) {
			case SELECT:
				{
				{
				setState(763);
				match(SELECT);
				setState(765);
				_la = _input.LA(1);
				if (_la==HINT) {
					{
					setState(764);
					hint();
					}
				}

				setState(768);
				_la = _input.LA(1);
				if (_la==ALL || _la==DISTINCT || _la==UNION || _la==UNIQUE) {
					{
					setState(767);
					_la = _input.LA(1);
					if ( !(_la==ALL || _la==DISTINCT || _la==UNION || _la==UNIQUE) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(770);
				select_list();
				setState(780);
				_la = _input.LA(1);
				if (_la==INTO) {
					{
					setState(771);
					match(INTO);
					setState(772);
					data_item();
					setState(777);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(773);
						match(COMMA);
						setState(774);
						data_item();
						}
						}
						setState(779);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(782);
				match(FROM);
				setState(783);
				table_reference_list();
				setState(785);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(784);
					where_clause();
					}
				}

				setState(788);
				_la = _input.LA(1);
				if (_la==CONNECT || _la==START) {
					{
					setState(787);
					hierarchical_query_clause();
					}
				}

				setState(791);
				_la = _input.LA(1);
				if (_la==GROUP || _la==HAVING) {
					{
					setState(790);
					group_by_clause();
					}
				}

				setState(794);
				_la = _input.LA(1);
				if (_la==MODEL) {
					{
					setState(793);
					model_clause();
					}
				}

				setState(799);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(796);
						union_clause();
						}
						} 
					}
					setState(801);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				}
				setState(803);
				switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
				case 1:
					{
					setState(802);
					((Select_statementContext)_localctx).fu1 = for_update_clause();
					}
					break;
				}
				setState(806);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(805);
					order_by_clause();
					}
					break;
				}
				setState(809);
				switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
				case 1:
					{
					setState(808);
					((Select_statementContext)_localctx).fu2 = for_update_clause();
					}
					break;
				}
				}
				}
				break;
			case LPAREN:
				{
				setState(811);
				subquery();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subquery_factoring_clauseContext extends ParserRuleContext {
		public Token with;
		public Subquery_factoring_clause_part_firstContext subquery_factoring_clause_part_first() {
			return getRuleContext(Subquery_factoring_clause_part_firstContext.class,0);
		}
		public TerminalNode WITH() { return getToken(OracleSqlParser.WITH, 0); }
		public List<Subquery_factoring_clause_part_nextContext> subquery_factoring_clause_part_next() {
			return getRuleContexts(Subquery_factoring_clause_part_nextContext.class);
		}
		public Subquery_factoring_clause_part_nextContext subquery_factoring_clause_part_next(int i) {
			return getRuleContext(Subquery_factoring_clause_part_nextContext.class,i);
		}
		public Search_clauseContext search_clause() {
			return getRuleContext(Search_clauseContext.class,0);
		}
		public Cycle_clauseContext cycle_clause() {
			return getRuleContext(Cycle_clauseContext.class,0);
		}
		public Subquery_factoring_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery_factoring_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterSubquery_factoring_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitSubquery_factoring_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitSubquery_factoring_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subquery_factoring_clauseContext subquery_factoring_clause() throws RecognitionException {
		Subquery_factoring_clauseContext _localctx = new Subquery_factoring_clauseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_subquery_factoring_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			((Subquery_factoring_clauseContext)_localctx).with = match(WITH);
			setState(815);
			subquery_factoring_clause_part_first();
			setState(819);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(816);
				subquery_factoring_clause_part_next();
				}
				}
				setState(821);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(823);
			_la = _input.LA(1);
			if (_la==SEARCH) {
				{
				setState(822);
				search_clause();
				}
			}

			setState(826);
			_la = _input.LA(1);
			if (_la==CYCLE) {
				{
				setState(825);
				cycle_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subquery_factoring_clause_part_firstContext extends ParserRuleContext {
		public T_aliasContext t_alias() {
			return getRuleContext(T_aliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(OracleSqlParser.AS, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(OracleSqlParser.LPAREN, 0); }
		public Select_listContext select_list() {
			return getRuleContext(Select_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(OracleSqlParser.RPAREN, 0); }
		public Subquery_factoring_clause_part_firstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery_factoring_clause_part_first; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterSubquery_factoring_clause_part_first(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitSubquery_factoring_clause_part_first(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitSubquery_factoring_clause_part_first(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subquery_factoring_clause_part_firstContext subquery_factoring_clause_part_first() throws RecognitionException {
		Subquery_factoring_clause_part_firstContext _localctx = new Subquery_factoring_clause_part_firstContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_subquery_factoring_clause_part_first);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(828);
			t_alias();
			setState(833);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(829);
				match(LPAREN);
				setState(830);
				select_list();
				setState(831);
				match(RPAREN);
				}
			}

			setState(835);
			match(AS);
			setState(836);
			subquery();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subquery_factoring_clause_part_nextContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(OracleSqlParser.COMMA, 0); }
		public T_aliasContext t_alias() {
			return getRuleContext(T_aliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(OracleSqlParser.AS, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(OracleSqlParser.LPAREN, 0); }
		public Select_listContext select_list() {
			return getRuleContext(Select_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(OracleSqlParser.RPAREN, 0); }
		public Subquery_factoring_clause_part_nextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery_factoring_clause_part_next; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterSubquery_factoring_clause_part_next(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitSubquery_factoring_clause_part_next(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitSubquery_factoring_clause_part_next(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subquery_factoring_clause_part_nextContext subquery_factoring_clause_part_next() throws RecognitionException {
		Subquery_factoring_clause_part_nextContext _localctx = new Subquery_factoring_clause_part_nextContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_subquery_factoring_clause_part_next);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(838);
			match(COMMA);
			setState(839);
			t_alias();
			setState(844);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(840);
				match(LPAREN);
				setState(841);
				select_list();
				setState(842);
				match(RPAREN);
				}
			}

			setState(846);
			match(AS);
			setState(847);
			subquery();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Search_clauseContext extends ParserRuleContext {
		public TerminalNode SEARCH() { return getToken(OracleSqlParser.SEARCH, 0); }
		public List<TerminalNode> FIRST() { return getTokens(OracleSqlParser.FIRST); }
		public TerminalNode FIRST(int i) {
			return getToken(OracleSqlParser.FIRST, i);
		}
		public TerminalNode BY() { return getToken(OracleSqlParser.BY, 0); }
		public TerminalNode SET() { return getToken(OracleSqlParser.SET, 0); }
		public Sql_identifierContext sql_identifier() {
			return getRuleContext(Sql_identifierContext.class,0);
		}
		public TerminalNode DEPTH() { return getToken(OracleSqlParser.DEPTH, 0); }
		public TerminalNode BREADTH() { return getToken(OracleSqlParser.BREADTH, 0); }
		public List<C_aliasContext> c_alias() {
			return getRuleContexts(C_aliasContext.class);
		}
		public C_aliasContext c_alias(int i) {
			return getRuleContext(C_aliasContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OracleSqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleSqlParser.COMMA, i);
		}
		public List<TerminalNode> ASC() { return getTokens(OracleSqlParser.ASC); }
		public TerminalNode ASC(int i) {
			return getToken(OracleSqlParser.ASC, i);
		}
		public List<TerminalNode> DESC() { return getTokens(OracleSqlParser.DESC); }
		public TerminalNode DESC(int i) {
			return getToken(OracleSqlParser.DESC, i);
		}
		public List<TerminalNode> NULLS() { return getTokens(OracleSqlParser.NULLS); }
		public TerminalNode NULLS(int i) {
			return getToken(OracleSqlParser.NULLS, i);
		}
		public List<TerminalNode> LAST() { return getTokens(OracleSqlParser.LAST); }
		public TerminalNode LAST(int i) {
			return getToken(OracleSqlParser.LAST, i);
		}
		public Search_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_search_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterSearch_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitSearch_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitSearch_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Search_clauseContext search_clause() throws RecognitionException {
		Search_clauseContext _localctx = new Search_clauseContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_search_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(849);
			match(SEARCH);
			setState(850);
			_la = _input.LA(1);
			if ( !(_la==BREADTH || _la==DEPTH) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(851);
			match(FIRST);
			setState(852);
			match(BY);
			{
			setState(853);
			c_alias();
			setState(855);
			_la = _input.LA(1);
			if (_la==ASC) {
				{
				setState(854);
				match(ASC);
				}
			}

			setState(858);
			_la = _input.LA(1);
			if (_la==DESC) {
				{
				setState(857);
				match(DESC);
				}
			}

			setState(862);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(860);
				match(NULLS);
				setState(861);
				match(FIRST);
				}
				break;
			}
			setState(866);
			_la = _input.LA(1);
			if (_la==NULLS) {
				{
				setState(864);
				match(NULLS);
				setState(865);
				match(LAST);
				}
			}

			}
			setState(886);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(868);
				match(COMMA);
				setState(869);
				c_alias();
				setState(871);
				_la = _input.LA(1);
				if (_la==ASC) {
					{
					setState(870);
					match(ASC);
					}
				}

				setState(874);
				_la = _input.LA(1);
				if (_la==DESC) {
					{
					setState(873);
					match(DESC);
					}
				}

				setState(878);
				switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
				case 1:
					{
					setState(876);
					match(NULLS);
					setState(877);
					match(FIRST);
					}
					break;
				}
				setState(882);
				_la = _input.LA(1);
				if (_la==NULLS) {
					{
					setState(880);
					match(NULLS);
					setState(881);
					match(LAST);
					}
				}

				}
				}
				setState(888);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(889);
			match(SET);
			setState(890);
			sql_identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cycle_clauseContext extends ParserRuleContext {
		public TerminalNode CYCLE() { return getToken(OracleSqlParser.CYCLE, 0); }
		public List<C_aliasContext> c_alias() {
			return getRuleContexts(C_aliasContext.class);
		}
		public C_aliasContext c_alias(int i) {
			return getRuleContext(C_aliasContext.class,i);
		}
		public TerminalNode SET() { return getToken(OracleSqlParser.SET, 0); }
		public Sql_identifierContext sql_identifier() {
			return getRuleContext(Sql_identifierContext.class,0);
		}
		public TerminalNode TO() { return getToken(OracleSqlParser.TO, 0); }
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public TerminalNode DEFAULT() { return getToken(OracleSqlParser.DEFAULT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(OracleSqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleSqlParser.COMMA, i);
		}
		public Cycle_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cycle_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterCycle_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitCycle_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitCycle_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cycle_clauseContext cycle_clause() throws RecognitionException {
		Cycle_clauseContext _localctx = new Cycle_clauseContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_cycle_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(892);
			match(CYCLE);
			setState(893);
			c_alias();
			setState(898);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(894);
				match(COMMA);
				setState(895);
				c_alias();
				}
				}
				setState(900);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(901);
			match(SET);
			setState(902);
			sql_identifier();
			setState(903);
			match(TO);
			setState(904);
			literal();
			setState(905);
			match(DEFAULT);
			setState(906);
			literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_listContext extends ParserRuleContext {
		public Displayed_column_part_firstContext displayed_column_part_first() {
			return getRuleContext(Displayed_column_part_firstContext.class,0);
		}
		public List<Displayed_column_part_nextContext> displayed_column_part_next() {
			return getRuleContexts(Displayed_column_part_nextContext.class);
		}
		public Displayed_column_part_nextContext displayed_column_part_next(int i) {
			return getRuleContext(Displayed_column_part_nextContext.class,i);
		}
		public Select_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterSelect_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitSelect_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitSelect_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_listContext select_list() throws RecognitionException {
		Select_listContext _localctx = new Select_listContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_select_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(908);
			displayed_column_part_first();
			setState(912);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(909);
				displayed_column_part_next();
				}
				}
				setState(914);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Displayed_column_part_firstContext extends ParserRuleContext {
		public Displayed_columnContext displayed_column() {
			return getRuleContext(Displayed_columnContext.class,0);
		}
		public Displayed_column_part_firstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_displayed_column_part_first; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterDisplayed_column_part_first(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitDisplayed_column_part_first(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitDisplayed_column_part_first(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Displayed_column_part_firstContext displayed_column_part_first() throws RecognitionException {
		Displayed_column_part_firstContext _localctx = new Displayed_column_part_firstContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_displayed_column_part_first);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(915);
			displayed_column();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Displayed_column_part_nextContext extends ParserRuleContext {
		public Token c;
		public Displayed_columnContext displayed_column() {
			return getRuleContext(Displayed_columnContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(OracleSqlParser.COMMA, 0); }
		public Displayed_column_part_nextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_displayed_column_part_next; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterDisplayed_column_part_next(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitDisplayed_column_part_next(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitDisplayed_column_part_next(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Displayed_column_part_nextContext displayed_column_part_next() throws RecognitionException {
		Displayed_column_part_nextContext _localctx = new Displayed_column_part_nextContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_displayed_column_part_next);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(917);
			((Displayed_column_part_nextContext)_localctx).c = match(COMMA);
			setState(918);
			displayed_column();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Displayed_columnContext extends ParserRuleContext {
		public TerminalNode ASTERISK() { return getToken(OracleSqlParser.ASTERISK, 0); }
		public T_aliasContext t_alias() {
			return getRuleContext(T_aliasContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(OracleSqlParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(OracleSqlParser.DOT, i);
		}
		public Sql_expressionContext sql_expression() {
			return getRuleContext(Sql_expressionContext.class,0);
		}
		public C_aliasContext c_alias() {
			return getRuleContext(C_aliasContext.class,0);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public Displayed_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_displayed_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterDisplayed_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitDisplayed_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitDisplayed_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Displayed_columnContext displayed_column() throws RecognitionException {
		Displayed_columnContext _localctx = new Displayed_columnContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_displayed_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(931);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				{
				setState(920);
				match(ASTERISK);
				}
				break;
			case 2:
				{
				setState(924);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(921);
					schema_name();
					setState(922);
					match(DOT);
					}
					break;
				}
				setState(926);
				t_alias();
				setState(927);
				match(DOT);
				setState(928);
				match(ASTERISK);
				}
				break;
			case 3:
				{
				setState(930);
				sql_expression();
				}
				break;
			}
			setState(934);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCESS) | (1L << AS) | (1L << ROWID) | (1L << ROWNUM))) != 0) || _la==COUNT || _la==CYCLE || ((((_la - 203)) & ~0x3f) == 0 && ((1L << (_la - 203)) & ((1L << (SQL - 203)) | (1L << (TIME - 203)) | (1L << (TYPE - 203)) | (1L << (VALUE - 203)) | (1L << (YEAR - 203)) | (1L << (QUOTED_STRING - 203)) | (1L << (ID - 203)))) != 0)) {
				{
				setState(933);
				c_alias();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_expressionContext extends ParserRuleContext {
		public Expr_addContext expr_add() {
			return getRuleContext(Expr_addContext.class,0);
		}
		public Sql_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterSql_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitSql_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitSql_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_expressionContext sql_expression() throws RecognitionException {
		Sql_expressionContext _localctx = new Sql_expressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_sql_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(936);
			expr_add();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_addContext extends ParserRuleContext {
		public List<Expr_mulContext> expr_mul() {
			return getRuleContexts(Expr_mulContext.class);
		}
		public Expr_mulContext expr_mul(int i) {
			return getRuleContext(Expr_mulContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(OracleSqlParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(OracleSqlParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(OracleSqlParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(OracleSqlParser.MINUS, i);
		}
		public List<DoublevertbarContext> doublevertbar() {
			return getRuleContexts(DoublevertbarContext.class);
		}
		public DoublevertbarContext doublevertbar(int i) {
			return getRuleContext(DoublevertbarContext.class,i);
		}
		public Expr_addContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterExpr_add(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitExpr_add(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitExpr_add(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_addContext expr_add() throws RecognitionException {
		Expr_addContext _localctx = new Expr_addContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_expr_add);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(938);
			expr_mul();
			setState(947);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(942);
					switch (_input.LA(1)) {
					case PLUS:
						{
						setState(939);
						match(PLUS);
						}
						break;
					case MINUS:
						{
						setState(940);
						match(MINUS);
						}
						break;
					case VERTBAR:
					case DOUBLEVERTBAR:
						{
						setState(941);
						doublevertbar();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(944);
					expr_mul();
					}
					} 
				}
				setState(949);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_mulContext extends ParserRuleContext {
		public List<Expr_signContext> expr_sign() {
			return getRuleContexts(Expr_signContext.class);
		}
		public Expr_signContext expr_sign(int i) {
			return getRuleContext(Expr_signContext.class,i);
		}
		public List<TerminalNode> ASTERISK() { return getTokens(OracleSqlParser.ASTERISK); }
		public TerminalNode ASTERISK(int i) {
			return getToken(OracleSqlParser.ASTERISK, i);
		}
		public List<TerminalNode> DIVIDE() { return getTokens(OracleSqlParser.DIVIDE); }
		public TerminalNode DIVIDE(int i) {
			return getToken(OracleSqlParser.DIVIDE, i);
		}
		public Expr_mulContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_mul; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterExpr_mul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitExpr_mul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitExpr_mul(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_mulContext expr_mul() throws RecognitionException {
		Expr_mulContext _localctx = new Expr_mulContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_expr_mul);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(950);
			expr_sign();
			setState(955);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(951);
					_la = _input.LA(1);
					if ( !(_la==ASTERISK || _la==DIVIDE) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(952);
					expr_sign();
					}
					} 
				}
				setState(957);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_signContext extends ParserRuleContext {
		public Expr_exprContext expr_expr() {
			return getRuleContext(Expr_exprContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(OracleSqlParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(OracleSqlParser.MINUS, 0); }
		public TerminalNode PRIOR() { return getToken(OracleSqlParser.PRIOR, 0); }
		public TerminalNode CONNECT_BY_ROOT() { return getToken(OracleSqlParser.CONNECT_BY_ROOT, 0); }
		public Expr_signContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterExpr_sign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitExpr_sign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitExpr_sign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_signContext expr_sign() throws RecognitionException {
		Expr_signContext _localctx = new Expr_signContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_expr_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(959);
			_la = _input.LA(1);
			if (_la==PRIOR || _la==CONNECT_BY_ROOT || _la==PLUS || _la==MINUS) {
				{
				setState(958);
				_la = _input.LA(1);
				if ( !(_la==PRIOR || _la==CONNECT_BY_ROOT || _la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(961);
			expr_expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_exprContext extends ParserRuleContext {
		public Extract_datetime_expressionContext extract_datetime_expression() {
			return getRuleContext(Extract_datetime_expressionContext.class,0);
		}
		public Interval_x_to_yContext interval_x_to_y() {
			return getRuleContext(Interval_x_to_yContext.class,0);
		}
		public Datetime_expressionContext datetime_expression() {
			return getRuleContext(Datetime_expressionContext.class,0);
		}
		public Interval_expressionContext interval_expression() {
			return getRuleContext(Interval_expressionContext.class,0);
		}
		public Expr_parenContext expr_paren() {
			return getRuleContext(Expr_parenContext.class,0);
		}
		public Cursor_expressionContext cursor_expression() {
			return getRuleContext(Cursor_expressionContext.class,0);
		}
		public Cast_expressionContext cast_expression() {
			return getRuleContext(Cast_expressionContext.class,0);
		}
		public Special_expressionContext special_expression() {
			return getRuleContext(Special_expressionContext.class,0);
		}
		public Object_access_expressionContext object_access_expression() {
			return getRuleContext(Object_access_expressionContext.class,0);
		}
		public Case_expressionContext case_expression() {
			return getRuleContext(Case_expressionContext.class,0);
		}
		public Special_functionContext special_function() {
			return getRuleContext(Special_functionContext.class,0);
		}
		public Analytic_functionContext analytic_function() {
			return getRuleContext(Analytic_functionContext.class,0);
		}
		public Aggregate_functionContext aggregate_function() {
			return getRuleContext(Aggregate_functionContext.class,0);
		}
		public Function_expressionContext function_expression() {
			return getRuleContext(Function_expressionContext.class,0);
		}
		public Simple_expressionContext simple_expression() {
			return getRuleContext(Simple_expressionContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public Expr_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterExpr_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitExpr_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitExpr_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_exprContext expr_expr() throws RecognitionException {
		Expr_exprContext _localctx = new Expr_exprContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_expr_expr);
		try {
			setState(979);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(963);
				extract_datetime_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(964);
				interval_x_to_y();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(965);
				datetime_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(966);
				interval_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(967);
				expr_paren();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(968);
				cursor_expression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(969);
				cast_expression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(970);
				special_expression();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(971);
				object_access_expression();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(972);
				case_expression();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(973);
				special_function();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(974);
				analytic_function();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(975);
				aggregate_function();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(976);
				function_expression();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(977);
				simple_expression();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(978);
				subquery();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_parenContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(OracleSqlParser.LPAREN, 0); }
		public Nested_expressionContext nested_expression() {
			return getRuleContext(Nested_expressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(OracleSqlParser.RPAREN, 0); }
		public Expr_parenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_paren; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterExpr_paren(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitExpr_paren(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitExpr_paren(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_parenContext expr_paren() throws RecognitionException {
		Expr_parenContext _localctx = new Expr_parenContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_expr_paren);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(981);
			match(LPAREN);
			setState(982);
			nested_expression();
			setState(983);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nested_expressionContext extends ParserRuleContext {
		public Sql_expressionContext sql_expression() {
			return getRuleContext(Sql_expressionContext.class,0);
		}
		public Nested_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nested_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterNested_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitNested_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitNested_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nested_expressionContext nested_expression() throws RecognitionException {
		Nested_expressionContext _localctx = new Nested_expressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_nested_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(985);
			sql_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_expressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(OracleSqlParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(OracleSqlParser.RPAREN, 0); }
		public Function_specContext function_spec() {
			return getRuleContext(Function_specContext.class,0);
		}
		public Analytic_function_nameContext analytic_function_name() {
			return getRuleContext(Analytic_function_nameContext.class,0);
		}
		public Call_parametersContext call_parameters() {
			return getRuleContext(Call_parametersContext.class,0);
		}
		public Function_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterFunction_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitFunction_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitFunction_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_expressionContext function_expression() throws RecognitionException {
		Function_expressionContext _localctx = new Function_expressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_function_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(989);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(987);
				function_spec();
				}
				break;
			case 2:
				{
				setState(988);
				analytic_function_name();
				}
				break;
			}
			setState(991);
			match(LPAREN);
			setState(993);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCESS) | (1L << CASE) | (1L << DATE) | (1L << FALSE) | (1L << LEVEL) | (1L << NULL) | (1L << PRIOR) | (1L << ROWID) | (1L << ROWNUM))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (SET - 66)) | (1L << (SYSDATE - 66)) | (1L << (TRUE - 66)) | (1L << (USER - 66)) | (1L << (CAST - 66)) | (1L << (CLUSTER_SET - 66)) | (1L << (CONNECT_BY_ROOT - 66)) | (1L << (COUNT - 66)) | (1L << (CURSOR - 66)) | (1L << (CYCLE - 66)) | (1L << (DENSE_RANK - 66)) | (1L << (EXTRACT - 66)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (INTERVAL - 131)) | (1L << (LISTAGG - 131)) | (1L << (LNNVL - 131)) | (1L << (PERCENT_RANK - 131)) | (1L << (PERCENTILE_CONT - 131)) | (1L << (PERCENTILE_DISC - 131)))) != 0) || ((((_la - 203)) & ~0x3f) == 0 && ((1L << (_la - 203)) & ((1L << (SQL - 203)) | (1L << (TIME - 203)) | (1L << (TIMESTAMP - 203)) | (1L << (TRIM - 203)) | (1L << (TYPE - 203)) | (1L << (VALUE - 203)) | (1L << (YEAR - 203)) | (1L << (QUOTED_STRING - 203)) | (1L << (BINDVAR - 203)) | (1L << (ID - 203)) | (1L << (COLON - 203)) | (1L << (ASTERISK - 203)) | (1L << (LPAREN - 203)) | (1L << (PLUS - 203)) | (1L << (MINUS - 203)) | (1L << (NUMBER - 203)))) != 0)) {
				{
				setState(992);
				call_parameters();
				}
			}

			setState(995);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Call_parametersContext extends ParserRuleContext {
		public TerminalNode ASTERISK() { return getToken(OracleSqlParser.ASTERISK, 0); }
		public List<Call_parameterContext> call_parameter() {
			return getRuleContexts(Call_parameterContext.class);
		}
		public Call_parameterContext call_parameter(int i) {
			return getRuleContext(Call_parameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OracleSqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleSqlParser.COMMA, i);
		}
		public Call_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterCall_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitCall_parameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitCall_parameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_parametersContext call_parameters() throws RecognitionException {
		Call_parametersContext _localctx = new Call_parametersContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_call_parameters);
		int _la;
		try {
			setState(1006);
			switch (_input.LA(1)) {
			case ASTERISK:
				enterOuterAlt(_localctx, 1);
				{
				setState(997);
				match(ASTERISK);
				}
				break;
			case ACCESS:
			case CASE:
			case DATE:
			case FALSE:
			case LEVEL:
			case NULL:
			case PRIOR:
			case ROWID:
			case ROWNUM:
			case SET:
			case SYSDATE:
			case TRUE:
			case USER:
			case CAST:
			case CLUSTER_SET:
			case CONNECT_BY_ROOT:
			case COUNT:
			case CURSOR:
			case CYCLE:
			case DENSE_RANK:
			case EXTRACT:
			case INTERVAL:
			case LISTAGG:
			case LNNVL:
			case PERCENT_RANK:
			case PERCENTILE_CONT:
			case PERCENTILE_DISC:
			case SQL:
			case TIME:
			case TIMESTAMP:
			case TRIM:
			case TYPE:
			case VALUE:
			case YEAR:
			case QUOTED_STRING:
			case BINDVAR:
			case ID:
			case COLON:
			case LPAREN:
			case PLUS:
			case MINUS:
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(998);
				call_parameter();
				setState(1003);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(999);
					match(COMMA);
					setState(1000);
					call_parameter();
					}
					}
					setState(1005);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Call_parameterContext extends ParserRuleContext {
		public Nested_expressionContext nested_expression() {
			return getRuleContext(Nested_expressionContext.class,0);
		}
		public Parameter_nameContext parameter_name() {
			return getRuleContext(Parameter_nameContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(OracleSqlParser.ARROW, 0); }
		public Call_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterCall_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitCall_parameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitCall_parameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_parameterContext call_parameter() throws RecognitionException {
		Call_parameterContext _localctx = new Call_parameterContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_call_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1011);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				{
				setState(1008);
				parameter_name();
				setState(1009);
				match(ARROW);
				}
				break;
			}
			setState(1013);
			nested_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Parameter_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterParameter_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitParameter_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitParameter_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_nameContext parameter_name() throws RecognitionException {
		Parameter_nameContext _localctx = new Parameter_nameContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_parameter_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1015);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Special_functionContext extends ParserRuleContext {
		public TerminalNode TRIM() { return getToken(OracleSqlParser.TRIM, 0); }
		public TerminalNode LPAREN() { return getToken(OracleSqlParser.LPAREN, 0); }
		public Sql_expressionContext sql_expression() {
			return getRuleContext(Sql_expressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(OracleSqlParser.RPAREN, 0); }
		public TerminalNode FROM() { return getToken(OracleSqlParser.FROM, 0); }
		public TerminalNode QUOTED_STRING() { return getToken(OracleSqlParser.QUOTED_STRING, 0); }
		public TerminalNode LEADING() { return getToken(OracleSqlParser.LEADING, 0); }
		public TerminalNode TRAILING() { return getToken(OracleSqlParser.TRAILING, 0); }
		public TerminalNode BOTH() { return getToken(OracleSqlParser.BOTH, 0); }
		public TerminalNode SET() { return getToken(OracleSqlParser.SET, 0); }
		public TerminalNode LNNVL() { return getToken(OracleSqlParser.LNNVL, 0); }
		public Sql_conditionContext sql_condition() {
			return getRuleContext(Sql_conditionContext.class,0);
		}
		public Special_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_special_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterSpecial_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitSpecial_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitSpecial_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Special_functionContext special_function() throws RecognitionException {
		Special_functionContext _localctx = new Special_functionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_special_function);
		int _la;
		try {
			setState(1041);
			switch (_input.LA(1)) {
			case TRIM:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1017);
				match(TRIM);
				setState(1018);
				match(LPAREN);
				setState(1026);
				switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
				case 1:
					{
					setState(1020);
					_la = _input.LA(1);
					if (_la==BOTH || _la==LEADING || _la==TRAILING) {
						{
						setState(1019);
						_la = _input.LA(1);
						if ( !(_la==BOTH || _la==LEADING || _la==TRAILING) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						}
					}

					setState(1023);
					_la = _input.LA(1);
					if (_la==QUOTED_STRING) {
						{
						setState(1022);
						match(QUOTED_STRING);
						}
					}

					setState(1025);
					match(FROM);
					}
					break;
				}
				setState(1028);
				sql_expression();
				setState(1029);
				match(RPAREN);
				}
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1031);
				match(SET);
				setState(1032);
				match(LPAREN);
				setState(1033);
				sql_expression();
				setState(1034);
				match(RPAREN);
				}
				}
				break;
			case LNNVL:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(1036);
				match(LNNVL);
				setState(1037);
				match(LPAREN);
				setState(1038);
				sql_condition();
				setState(1039);
				match(RPAREN);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_expressionContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(OracleSqlParser.CASE, 0); }
		public TerminalNode END() { return getToken(OracleSqlParser.END, 0); }
		public Simple_case_expressionContext simple_case_expression() {
			return getRuleContext(Simple_case_expressionContext.class,0);
		}
		public Searched_case_expressionContext searched_case_expression() {
			return getRuleContext(Searched_case_expressionContext.class,0);
		}
		public Else_case_expressionContext else_case_expression() {
			return getRuleContext(Else_case_expressionContext.class,0);
		}
		public Case_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterCase_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitCase_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitCase_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_expressionContext case_expression() throws RecognitionException {
		Case_expressionContext _localctx = new Case_expressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_case_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1043);
			match(CASE);
			setState(1046);
			switch (_input.LA(1)) {
			case ACCESS:
			case CASE:
			case DATE:
			case FALSE:
			case LEVEL:
			case NULL:
			case PRIOR:
			case ROWID:
			case ROWNUM:
			case SET:
			case SYSDATE:
			case TRUE:
			case USER:
			case CAST:
			case CLUSTER_SET:
			case CONNECT_BY_ROOT:
			case COUNT:
			case CURSOR:
			case CYCLE:
			case DENSE_RANK:
			case EXTRACT:
			case INTERVAL:
			case LISTAGG:
			case LNNVL:
			case PERCENT_RANK:
			case PERCENTILE_CONT:
			case PERCENTILE_DISC:
			case SQL:
			case TIME:
			case TIMESTAMP:
			case TRIM:
			case TYPE:
			case VALUE:
			case YEAR:
			case QUOTED_STRING:
			case BINDVAR:
			case ID:
			case COLON:
			case LPAREN:
			case PLUS:
			case MINUS:
			case NUMBER:
				{
				setState(1044);
				simple_case_expression();
				}
				break;
			case WHEN:
				{
				setState(1045);
				searched_case_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1049);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(1048);
				else_case_expression();
				}
			}

			setState(1051);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cursor_expressionContext extends ParserRuleContext {
		public TerminalNode CURSOR() { return getToken(OracleSqlParser.CURSOR, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public Cursor_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cursor_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterCursor_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitCursor_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitCursor_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cursor_expressionContext cursor_expression() throws RecognitionException {
		Cursor_expressionContext _localctx = new Cursor_expressionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_cursor_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1053);
			match(CURSOR);
			setState(1054);
			subquery();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_case_expressionContext extends ParserRuleContext {
		public List<Nested_expressionContext> nested_expression() {
			return getRuleContexts(Nested_expressionContext.class);
		}
		public Nested_expressionContext nested_expression(int i) {
			return getRuleContext(Nested_expressionContext.class,i);
		}
		public List<TerminalNode> WHEN() { return getTokens(OracleSqlParser.WHEN); }
		public TerminalNode WHEN(int i) {
			return getToken(OracleSqlParser.WHEN, i);
		}
		public List<TerminalNode> THEN() { return getTokens(OracleSqlParser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(OracleSqlParser.THEN, i);
		}
		public Simple_case_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_case_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterSimple_case_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitSimple_case_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitSimple_case_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_case_expressionContext simple_case_expression() throws RecognitionException {
		Simple_case_expressionContext _localctx = new Simple_case_expressionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_simple_case_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1056);
			nested_expression();
			setState(1062); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1057);
				match(WHEN);
				setState(1058);
				nested_expression();
				setState(1059);
				match(THEN);
				setState(1060);
				nested_expression();
				}
				}
				setState(1064); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Searched_case_expressionContext extends ParserRuleContext {
		public List<TerminalNode> WHEN() { return getTokens(OracleSqlParser.WHEN); }
		public TerminalNode WHEN(int i) {
			return getToken(OracleSqlParser.WHEN, i);
		}
		public List<Sql_conditionContext> sql_condition() {
			return getRuleContexts(Sql_conditionContext.class);
		}
		public Sql_conditionContext sql_condition(int i) {
			return getRuleContext(Sql_conditionContext.class,i);
		}
		public List<TerminalNode> THEN() { return getTokens(OracleSqlParser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(OracleSqlParser.THEN, i);
		}
		public List<Nested_expressionContext> nested_expression() {
			return getRuleContexts(Nested_expressionContext.class);
		}
		public Nested_expressionContext nested_expression(int i) {
			return getRuleContext(Nested_expressionContext.class,i);
		}
		public Searched_case_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_searched_case_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterSearched_case_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitSearched_case_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitSearched_case_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Searched_case_expressionContext searched_case_expression() throws RecognitionException {
		Searched_case_expressionContext _localctx = new Searched_case_expressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_searched_case_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1071); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1066);
				match(WHEN);
				setState(1067);
				sql_condition();
				setState(1068);
				match(THEN);
				setState(1069);
				nested_expression();
				}
				}
				setState(1073); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_case_expressionContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(OracleSqlParser.ELSE, 0); }
		public Nested_expressionContext nested_expression() {
			return getRuleContext(Nested_expressionContext.class,0);
		}
		public Else_case_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_case_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterElse_case_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitElse_case_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitElse_case_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_case_expressionContext else_case_expression() throws RecognitionException {
		Else_case_expressionContext _localctx = new Else_case_expressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_else_case_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1075);
			match(ELSE);
			setState(1076);
			nested_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Object_access_expressionContext extends ParserRuleContext {
		public List<Function_expressionContext> function_expression() {
			return getRuleContexts(Function_expressionContext.class);
		}
		public Function_expressionContext function_expression(int i) {
			return getRuleContext(Function_expressionContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(OracleSqlParser.LPAREN, 0); }
		public Sql_expressionContext sql_expression() {
			return getRuleContext(Sql_expressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(OracleSqlParser.RPAREN, 0); }
		public List<TerminalNode> DOT() { return getTokens(OracleSqlParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(OracleSqlParser.DOT, i);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public Object_access_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object_access_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterObject_access_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitObject_access_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitObject_access_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Object_access_expressionContext object_access_expression() throws RecognitionException {
		Object_access_expressionContext _localctx = new Object_access_expressionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_object_access_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1089);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				{
				setState(1078);
				match(LPAREN);
				setState(1079);
				sql_expression();
				setState(1080);
				match(RPAREN);
				setState(1081);
				match(DOT);
				}
				break;
			case 2:
				{
				setState(1083);
				table_name();
				setState(1084);
				match(DOT);
				}
				break;
			case 3:
				{
				setState(1086);
				function_expression();
				setState(1087);
				match(DOT);
				}
				break;
			}
			setState(1096);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1091);
					identifier();
					setState(1092);
					match(DOT);
					}
					} 
				}
				setState(1098);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			}
			setState(1099);
			function_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_expressionContext extends ParserRuleContext {
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public TerminalNode SQL() { return getToken(OracleSqlParser.SQL, 0); }
		public TerminalNode FOUND_ATTR() { return getToken(OracleSqlParser.FOUND_ATTR, 0); }
		public TerminalNode NOTFOUND_ATTR() { return getToken(OracleSqlParser.NOTFOUND_ATTR, 0); }
		public TerminalNode ISOPEN_ATTR() { return getToken(OracleSqlParser.ISOPEN_ATTR, 0); }
		public TerminalNode ROWCOUNT_ATTR() { return getToken(OracleSqlParser.ROWCOUNT_ATTR, 0); }
		public TerminalNode BULK_ROWCOUNT_ATTR() { return getToken(OracleSqlParser.BULK_ROWCOUNT_ATTR, 0); }
		public Cell_assignmentContext cell_assignment() {
			return getRuleContext(Cell_assignmentContext.class,0);
		}
		public Column_specContext column_spec() {
			return getRuleContext(Column_specContext.class,0);
		}
		public Timestamp_expressionContext timestamp_expression() {
			return getRuleContext(Timestamp_expressionContext.class,0);
		}
		public Quoted_stringContext quoted_string() {
			return getRuleContext(Quoted_stringContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(OracleSqlParser.NUMBER, 0); }
		public Simple_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterSimple_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitSimple_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitSimple_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_expressionContext simple_expression() throws RecognitionException {
		Simple_expressionContext _localctx = new Simple_expressionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_simple_expression);
		int _la;
		try {
			setState(1109);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1101);
				boolean_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1102);
				match(SQL);
				setState(1103);
				_la = _input.LA(1);
				if ( !(((((_la - 272)) & ~0x3f) == 0 && ((1L << (_la - 272)) & ((1L << (NOTFOUND_ATTR - 272)) | (1L << (FOUND_ATTR - 272)) | (1L << (ISOPEN_ATTR - 272)) | (1L << (ROWCOUNT_ATTR - 272)) | (1L << (BULK_ROWCOUNT_ATTR - 272)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1104);
				cell_assignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1105);
				column_spec();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1106);
				timestamp_expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1107);
				quoted_string();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1108);
				match(NUMBER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Query_blockContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(OracleSqlParser.SELECT, 0); }
		public Select_listContext select_list() {
			return getRuleContext(Select_listContext.class,0);
		}
		public TerminalNode FROM() { return getToken(OracleSqlParser.FROM, 0); }
		public Table_reference_listContext table_reference_list() {
			return getRuleContext(Table_reference_listContext.class,0);
		}
		public HintContext hint() {
			return getRuleContext(HintContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Hierarchical_query_clauseContext hierarchical_query_clause() {
			return getRuleContext(Hierarchical_query_clauseContext.class,0);
		}
		public Group_by_clauseContext group_by_clause() {
			return getRuleContext(Group_by_clauseContext.class,0);
		}
		public Model_clauseContext model_clause() {
			return getRuleContext(Model_clauseContext.class,0);
		}
		public TerminalNode DISTINCT() { return getToken(OracleSqlParser.DISTINCT, 0); }
		public TerminalNode UNIQUE() { return getToken(OracleSqlParser.UNIQUE, 0); }
		public TerminalNode ALL() { return getToken(OracleSqlParser.ALL, 0); }
		public Query_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterQuery_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitQuery_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitQuery_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Query_blockContext query_block() throws RecognitionException {
		Query_blockContext _localctx = new Query_blockContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_query_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1111);
			match(SELECT);
			setState(1113);
			_la = _input.LA(1);
			if (_la==HINT) {
				{
				setState(1112);
				hint();
				}
			}

			setState(1116);
			_la = _input.LA(1);
			if (_la==ALL || _la==DISTINCT || _la==UNIQUE) {
				{
				setState(1115);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==DISTINCT || _la==UNIQUE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(1118);
			select_list();
			setState(1119);
			match(FROM);
			setState(1120);
			table_reference_list();
			setState(1122);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(1121);
				where_clause();
				}
			}

			setState(1125);
			_la = _input.LA(1);
			if (_la==CONNECT || _la==START) {
				{
				setState(1124);
				hierarchical_query_clause();
				}
			}

			setState(1128);
			_la = _input.LA(1);
			if (_la==GROUP || _la==HAVING) {
				{
				setState(1127);
				group_by_clause();
				}
			}

			setState(1131);
			_la = _input.LA(1);
			if (_la==MODEL) {
				{
				setState(1130);
				model_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubqueryContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(OracleSqlParser.LPAREN, 0); }
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(OracleSqlParser.RPAREN, 0); }
		public Group_by_clauseContext group_by_clause() {
			return getRuleContext(Group_by_clauseContext.class,0);
		}
		public Model_clauseContext model_clause() {
			return getRuleContext(Model_clauseContext.class,0);
		}
		public List<For_update_clauseContext> for_update_clause() {
			return getRuleContexts(For_update_clauseContext.class);
		}
		public For_update_clauseContext for_update_clause(int i) {
			return getRuleContext(For_update_clauseContext.class,i);
		}
		public Order_by_clauseContext order_by_clause() {
			return getRuleContext(Order_by_clauseContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public SubqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubqueryContext subquery() throws RecognitionException {
		SubqueryContext _localctx = new SubqueryContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_subquery);
		try {
			setState(1169);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1133);
				match(LPAREN);
				setState(1134);
				select_statement();
				setState(1135);
				match(RPAREN);
				setState(1137);
				switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
				case 1:
					{
					setState(1136);
					group_by_clause();
					}
					break;
				}
				setState(1140);
				switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
				case 1:
					{
					setState(1139);
					model_clause();
					}
					break;
				}
				setState(1143);
				switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
				case 1:
					{
					setState(1142);
					for_update_clause();
					}
					break;
				}
				setState(1146);
				switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
				case 1:
					{
					setState(1145);
					order_by_clause();
					}
					break;
				}
				setState(1149);
				switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
				case 1:
					{
					setState(1148);
					for_update_clause();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1151);
				match(LPAREN);
				setState(1152);
				subquery();
				setState(1153);
				match(RPAREN);
				setState(1155);
				switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
				case 1:
					{
					setState(1154);
					group_by_clause();
					}
					break;
				}
				setState(1158);
				switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
				case 1:
					{
					setState(1157);
					model_clause();
					}
					break;
				}
				setState(1161);
				switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
				case 1:
					{
					setState(1160);
					for_update_clause();
					}
					break;
				}
				setState(1164);
				switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
				case 1:
					{
					setState(1163);
					order_by_clause();
					}
					break;
				}
				setState(1167);
				switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
				case 1:
					{
					setState(1166);
					for_update_clause();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Timestamp_expressionContext extends ParserRuleContext {
		public Quoted_stringContext quoted_string() {
			return getRuleContext(Quoted_stringContext.class,0);
		}
		public TerminalNode DATE() { return getToken(OracleSqlParser.DATE, 0); }
		public TerminalNode TIMESTAMP() { return getToken(OracleSqlParser.TIMESTAMP, 0); }
		public Timestamp_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timestamp_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterTimestamp_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitTimestamp_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitTimestamp_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Timestamp_expressionContext timestamp_expression() throws RecognitionException {
		Timestamp_expressionContext _localctx = new Timestamp_expressionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_timestamp_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1171);
			_la = _input.LA(1);
			if ( !(_la==DATE || _la==TIMESTAMP) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1172);
			quoted_string();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interval_x_to_yContext extends ParserRuleContext {
		public TerminalNode INTERVAL() { return getToken(OracleSqlParser.INTERVAL, 0); }
		public List<TerminalNode> YEAR() { return getTokens(OracleSqlParser.YEAR); }
		public TerminalNode YEAR(int i) {
			return getToken(OracleSqlParser.YEAR, i);
		}
		public List<TerminalNode> MONTH() { return getTokens(OracleSqlParser.MONTH); }
		public TerminalNode MONTH(int i) {
			return getToken(OracleSqlParser.MONTH, i);
		}
		public List<TerminalNode> DAY() { return getTokens(OracleSqlParser.DAY); }
		public TerminalNode DAY(int i) {
			return getToken(OracleSqlParser.DAY, i);
		}
		public List<TerminalNode> HOUR() { return getTokens(OracleSqlParser.HOUR); }
		public TerminalNode HOUR(int i) {
			return getToken(OracleSqlParser.HOUR, i);
		}
		public List<TerminalNode> MINUTE() { return getTokens(OracleSqlParser.MINUTE); }
		public TerminalNode MINUTE(int i) {
			return getToken(OracleSqlParser.MINUTE, i);
		}
		public List<TerminalNode> SECOND() { return getTokens(OracleSqlParser.SECOND); }
		public TerminalNode SECOND(int i) {
			return getToken(OracleSqlParser.SECOND, i);
		}
		public Quoted_stringContext quoted_string() {
			return getRuleContext(Quoted_stringContext.class,0);
		}
		public Bind_variableContext bind_variable() {
			return getRuleContext(Bind_variableContext.class,0);
		}
		public List<TerminalNode> LPAREN() { return getTokens(OracleSqlParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(OracleSqlParser.LPAREN, i);
		}
		public List<PrecisionContext> precision() {
			return getRuleContexts(PrecisionContext.class);
		}
		public PrecisionContext precision(int i) {
			return getRuleContext(PrecisionContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(OracleSqlParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(OracleSqlParser.RPAREN, i);
		}
		public TerminalNode TO() { return getToken(OracleSqlParser.TO, 0); }
		public TerminalNode COMMA() { return getToken(OracleSqlParser.COMMA, 0); }
		public Interval_x_to_yContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval_x_to_y; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterInterval_x_to_y(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitInterval_x_to_y(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitInterval_x_to_y(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interval_x_to_yContext interval_x_to_y() throws RecognitionException {
		Interval_x_to_yContext _localctx = new Interval_x_to_yContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_interval_x_to_y);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1174);
			match(INTERVAL);
			setState(1215);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				{
				{
				setState(1177);
				switch (_input.LA(1)) {
				case QUOTED_STRING:
					{
					setState(1175);
					quoted_string();
					}
					break;
				case BINDVAR:
				case COLON:
					{
					setState(1176);
					bind_variable();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1179);
				_la = _input.LA(1);
				if ( !(_la==MONTH || _la==YEAR) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1184);
				switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
				case 1:
					{
					setState(1180);
					match(LPAREN);
					setState(1181);
					precision();
					setState(1182);
					match(RPAREN);
					}
					break;
				}
				setState(1188);
				_la = _input.LA(1);
				if (_la==TO) {
					{
					setState(1186);
					match(TO);
					setState(1187);
					_la = _input.LA(1);
					if ( !(_la==MONTH || _la==YEAR) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				}
				}
				break;
			case 2:
				{
				{
				setState(1192);
				switch (_input.LA(1)) {
				case QUOTED_STRING:
					{
					setState(1190);
					quoted_string();
					}
					break;
				case BINDVAR:
				case COLON:
					{
					setState(1191);
					bind_variable();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1194);
				_la = _input.LA(1);
				if ( !(((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (DAY - 106)) | (1L << (HOUR - 106)) | (1L << (MINUTE - 106)))) != 0) || _la==SECOND) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1203);
				switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
				case 1:
					{
					setState(1195);
					match(LPAREN);
					setState(1196);
					precision();
					setState(1199);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(1197);
						match(COMMA);
						setState(1198);
						precision();
						}
					}

					setState(1201);
					match(RPAREN);
					}
					break;
				}
				setState(1213);
				_la = _input.LA(1);
				if (_la==TO) {
					{
					setState(1205);
					match(TO);
					setState(1206);
					_la = _input.LA(1);
					if ( !(((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (DAY - 106)) | (1L << (HOUR - 106)) | (1L << (MINUTE - 106)))) != 0) || _la==SECOND) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(1211);
					switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
					case 1:
						{
						setState(1207);
						match(LPAREN);
						setState(1208);
						precision();
						setState(1209);
						match(RPAREN);
						}
						break;
					}
					}
				}

				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrecisionContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(OracleSqlParser.NUMBER, 0); }
		public Bind_variableContext bind_variable() {
			return getRuleContext(Bind_variableContext.class,0);
		}
		public PrecisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precision; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterPrecision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitPrecision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitPrecision(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrecisionContext precision() throws RecognitionException {
		PrecisionContext _localctx = new PrecisionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_precision);
		try {
			setState(1219);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1217);
				match(NUMBER);
				}
				break;
			case BINDVAR:
			case COLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(1218);
				bind_variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Extract_datetime_expressionContext extends ParserRuleContext {
		public TerminalNode EXTRACT() { return getToken(OracleSqlParser.EXTRACT, 0); }
		public TerminalNode LPAREN() { return getToken(OracleSqlParser.LPAREN, 0); }
		public TerminalNode FROM() { return getToken(OracleSqlParser.FROM, 0); }
		public Sql_expressionContext sql_expression() {
			return getRuleContext(Sql_expressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(OracleSqlParser.RPAREN, 0); }
		public TerminalNode YEAR() { return getToken(OracleSqlParser.YEAR, 0); }
		public TerminalNode MONTH() { return getToken(OracleSqlParser.MONTH, 0); }
		public TerminalNode DAY() { return getToken(OracleSqlParser.DAY, 0); }
		public TerminalNode HOUR() { return getToken(OracleSqlParser.HOUR, 0); }
		public TerminalNode MINUTE() { return getToken(OracleSqlParser.MINUTE, 0); }
		public TerminalNode SECOND() { return getToken(OracleSqlParser.SECOND, 0); }
		public TerminalNode TIMEZONE_HOUR() { return getToken(OracleSqlParser.TIMEZONE_HOUR, 0); }
		public TerminalNode TIMEZONE_MINUTE() { return getToken(OracleSqlParser.TIMEZONE_MINUTE, 0); }
		public TerminalNode TIMEZONE_REGION() { return getToken(OracleSqlParser.TIMEZONE_REGION, 0); }
		public TerminalNode TIMEZONE_ABBR() { return getToken(OracleSqlParser.TIMEZONE_ABBR, 0); }
		public Extract_datetime_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extract_datetime_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterExtract_datetime_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitExtract_datetime_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitExtract_datetime_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Extract_datetime_expressionContext extract_datetime_expression() throws RecognitionException {
		Extract_datetime_expressionContext _localctx = new Extract_datetime_expressionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_extract_datetime_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1221);
			match(EXTRACT);
			setState(1222);
			match(LPAREN);
			setState(1223);
			_la = _input.LA(1);
			if ( !(((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (DAY - 106)) | (1L << (HOUR - 106)) | (1L << (MINUTE - 106)) | (1L << (MONTH - 106)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (SECOND - 194)) | (1L << (TIMEZONE_HOUR - 194)) | (1L << (TIMEZONE_MINUTE - 194)) | (1L << (TIMEZONE_REGION - 194)) | (1L << (TIMEZONE_ABBR - 194)) | (1L << (YEAR - 194)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1224);
			match(FROM);
			setState(1225);
			sql_expression();
			setState(1226);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Datetime_expressionContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(OracleSqlParser.AT, 0); }
		public Function_expressionContext function_expression() {
			return getRuleContext(Function_expressionContext.class,0);
		}
		public Cast_expressionContext cast_expression() {
			return getRuleContext(Cast_expressionContext.class,0);
		}
		public Simple_expressionContext simple_expression() {
			return getRuleContext(Simple_expressionContext.class,0);
		}
		public TerminalNode LOCAL() { return getToken(OracleSqlParser.LOCAL, 0); }
		public TerminalNode TIME() { return getToken(OracleSqlParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(OracleSqlParser.ZONE, 0); }
		public Quoted_stringContext quoted_string() {
			return getRuleContext(Quoted_stringContext.class,0);
		}
		public TerminalNode DBTIMEZONE() { return getToken(OracleSqlParser.DBTIMEZONE, 0); }
		public TerminalNode SESSIONTIMEZONE() { return getToken(OracleSqlParser.SESSIONTIMEZONE, 0); }
		public Sql_expressionContext sql_expression() {
			return getRuleContext(Sql_expressionContext.class,0);
		}
		public Datetime_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datetime_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterDatetime_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitDatetime_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitDatetime_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Datetime_expressionContext datetime_expression() throws RecognitionException {
		Datetime_expressionContext _localctx = new Datetime_expressionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_datetime_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1231);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				{
				setState(1228);
				function_expression();
				}
				break;
			case 2:
				{
				setState(1229);
				cast_expression();
				}
				break;
			case 3:
				{
				setState(1230);
				simple_expression();
				}
				break;
			}
			setState(1233);
			match(AT);
			setState(1243);
			switch (_input.LA(1)) {
			case LOCAL:
				{
				setState(1234);
				match(LOCAL);
				}
				break;
			case TIME:
				{
				setState(1235);
				match(TIME);
				setState(1236);
				match(ZONE);
				setState(1241);
				switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
				case 1:
					{
					setState(1237);
					quoted_string();
					}
					break;
				case 2:
					{
					setState(1238);
					match(DBTIMEZONE);
					}
					break;
				case 3:
					{
					setState(1239);
					match(SESSIONTIMEZONE);
					}
					break;
				case 4:
					{
					setState(1240);
					sql_expression();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interval_expressionContext extends ParserRuleContext {
		public List<TerminalNode> LPAREN() { return getTokens(OracleSqlParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(OracleSqlParser.LPAREN, i);
		}
		public TerminalNode MINUS() { return getToken(OracleSqlParser.MINUS, 0); }
		public List<TerminalNode> RPAREN() { return getTokens(OracleSqlParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(OracleSqlParser.RPAREN, i);
		}
		public List<Function_expressionContext> function_expression() {
			return getRuleContexts(Function_expressionContext.class);
		}
		public Function_expressionContext function_expression(int i) {
			return getRuleContext(Function_expressionContext.class,i);
		}
		public List<Cast_expressionContext> cast_expression() {
			return getRuleContexts(Cast_expressionContext.class);
		}
		public Cast_expressionContext cast_expression(int i) {
			return getRuleContext(Cast_expressionContext.class,i);
		}
		public List<Simple_expressionContext> simple_expression() {
			return getRuleContexts(Simple_expressionContext.class);
		}
		public Simple_expressionContext simple_expression(int i) {
			return getRuleContext(Simple_expressionContext.class,i);
		}
		public TerminalNode DAY() { return getToken(OracleSqlParser.DAY, 0); }
		public TerminalNode TO() { return getToken(OracleSqlParser.TO, 0); }
		public TerminalNode SECOND() { return getToken(OracleSqlParser.SECOND, 0); }
		public TerminalNode YEAR() { return getToken(OracleSqlParser.YEAR, 0); }
		public TerminalNode MONTH() { return getToken(OracleSqlParser.MONTH, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(OracleSqlParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(OracleSqlParser.NUMBER, i);
		}
		public Interval_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterInterval_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitInterval_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitInterval_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interval_expressionContext interval_expression() throws RecognitionException {
		Interval_expressionContext _localctx = new Interval_expressionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_interval_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1245);
			match(LPAREN);
			setState(1249);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				{
				setState(1246);
				function_expression();
				}
				break;
			case 2:
				{
				setState(1247);
				cast_expression();
				}
				break;
			case 3:
				{
				setState(1248);
				simple_expression();
				}
				break;
			}
			setState(1251);
			match(MINUS);
			setState(1255);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				{
				setState(1252);
				function_expression();
				}
				break;
			case 2:
				{
				setState(1253);
				cast_expression();
				}
				break;
			case 3:
				{
				setState(1254);
				simple_expression();
				}
				break;
			}
			setState(1257);
			match(RPAREN);
			setState(1284);
			switch (_input.LA(1)) {
			case DAY:
				{
				setState(1258);
				match(DAY);
				setState(1262);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1259);
					match(LPAREN);
					setState(1260);
					match(NUMBER);
					setState(1261);
					match(RPAREN);
					}
				}

				setState(1264);
				match(TO);
				setState(1265);
				match(SECOND);
				setState(1269);
				switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
				case 1:
					{
					setState(1266);
					match(LPAREN);
					setState(1267);
					match(NUMBER);
					setState(1268);
					match(RPAREN);
					}
					break;
				}
				}
				break;
			case YEAR:
				{
				setState(1271);
				match(YEAR);
				setState(1275);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1272);
					match(LPAREN);
					setState(1273);
					match(NUMBER);
					setState(1274);
					match(RPAREN);
					}
				}

				setState(1277);
				match(TO);
				setState(1278);
				match(MONTH);
				setState(1282);
				switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
				case 1:
					{
					setState(1279);
					match(LPAREN);
					setState(1280);
					match(NUMBER);
					setState(1281);
					match(RPAREN);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Special_expressionContext extends ParserRuleContext {
		public Cluster_set_clauseContext cluster_set_clause() {
			return getRuleContext(Cluster_set_clauseContext.class,0);
		}
		public Special_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_special_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterSpecial_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitSpecial_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitSpecial_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Special_expressionContext special_expression() throws RecognitionException {
		Special_expressionContext _localctx = new Special_expressionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_special_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1286);
			cluster_set_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cluster_set_clauseContext extends ParserRuleContext {
		public TerminalNode CLUSTER_SET() { return getToken(OracleSqlParser.CLUSTER_SET, 0); }
		public TerminalNode LPAREN() { return getToken(OracleSqlParser.LPAREN, 0); }
		public List<Column_specContext> column_spec() {
			return getRuleContexts(Column_specContext.class);
		}
		public Column_specContext column_spec(int i) {
			return getRuleContext(Column_specContext.class,i);
		}
		public TerminalNode USING() { return getToken(OracleSqlParser.USING, 0); }
		public TerminalNode RPAREN() { return getToken(OracleSqlParser.RPAREN, 0); }
		public Column_specsContext column_specs() {
			return getRuleContext(Column_specsContext.class,0);
		}
		public TerminalNode ASTERISK() { return getToken(OracleSqlParser.ASTERISK, 0); }
		public List<TerminalNode> COMMA() { return getTokens(OracleSqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleSqlParser.COMMA, i);
		}
		public TerminalNode NUMBER() { return getToken(OracleSqlParser.NUMBER, 0); }
		public Cluster_set_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cluster_set_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterCluster_set_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitCluster_set_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitCluster_set_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cluster_set_clauseContext cluster_set_clause() throws RecognitionException {
		Cluster_set_clauseContext _localctx = new Cluster_set_clauseContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_cluster_set_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1288);
			match(CLUSTER_SET);
			setState(1289);
			match(LPAREN);
			setState(1290);
			column_spec();
			setState(1293);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				{
				setState(1291);
				match(COMMA);
				setState(1292);
				column_spec();
				}
				break;
			}
			setState(1297);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1295);
				match(COMMA);
				setState(1296);
				match(NUMBER);
				}
			}

			setState(1299);
			match(USING);
			setState(1302);
			switch (_input.LA(1)) {
			case ACCESS:
			case LEVEL:
			case NULL:
			case ROWID:
			case ROWNUM:
			case SYSDATE:
			case USER:
			case COUNT:
			case CYCLE:
			case SQL:
			case TIME:
			case TYPE:
			case VALUE:
			case YEAR:
			case QUOTED_STRING:
			case BINDVAR:
			case ID:
			case COLON:
				{
				setState(1300);
				column_specs();
				}
				break;
			case ASTERISK:
				{
				setState(1301);
				match(ASTERISK);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1304);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cast_expressionContext extends ParserRuleContext {
		public TerminalNode CAST() { return getToken(OracleSqlParser.CAST, 0); }
		public TerminalNode LPAREN() { return getToken(OracleSqlParser.LPAREN, 0); }
		public TerminalNode AS() { return getToken(OracleSqlParser.AS, 0); }
		public TerminalNode RPAREN() { return getToken(OracleSqlParser.RPAREN, 0); }
		public Sql_expressionContext sql_expression() {
			return getRuleContext(Sql_expressionContext.class,0);
		}
		public TerminalNode MULTISET() { return getToken(OracleSqlParser.MULTISET, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public Datatype_nameContext datatype_name() {
			return getRuleContext(Datatype_nameContext.class,0);
		}
		public Column_specContext column_spec() {
			return getRuleContext(Column_specContext.class,0);
		}
		public Cast_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterCast_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitCast_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitCast_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cast_expressionContext cast_expression() throws RecognitionException {
		Cast_expressionContext _localctx = new Cast_expressionContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_cast_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1306);
			match(CAST);
			setState(1307);
			match(LPAREN);
			setState(1311);
			switch (_input.LA(1)) {
			case ACCESS:
			case CASE:
			case DATE:
			case FALSE:
			case LEVEL:
			case NULL:
			case PRIOR:
			case ROWID:
			case ROWNUM:
			case SET:
			case SYSDATE:
			case TRUE:
			case USER:
			case CAST:
			case CLUSTER_SET:
			case CONNECT_BY_ROOT:
			case COUNT:
			case CURSOR:
			case CYCLE:
			case DENSE_RANK:
			case EXTRACT:
			case INTERVAL:
			case LISTAGG:
			case LNNVL:
			case PERCENT_RANK:
			case PERCENTILE_CONT:
			case PERCENTILE_DISC:
			case SQL:
			case TIME:
			case TIMESTAMP:
			case TRIM:
			case TYPE:
			case VALUE:
			case YEAR:
			case QUOTED_STRING:
			case BINDVAR:
			case ID:
			case COLON:
			case LPAREN:
			case PLUS:
			case MINUS:
			case NUMBER:
				{
				setState(1308);
				sql_expression();
				}
				break;
			case MULTISET:
				{
				setState(1309);
				match(MULTISET);
				setState(1310);
				subquery();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1313);
			match(AS);
			setState(1316);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				{
				setState(1314);
				datatype_name();
				}
				break;
			case 2:
				{
				setState(1315);
				column_spec();
				}
				break;
			}
			setState(1318);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Datatype_nameContext extends ParserRuleContext {
		public TerminalNode BINARY_INTEGER() { return getToken(OracleSqlParser.BINARY_INTEGER, 0); }
		public TerminalNode BINARY_FLOAT() { return getToken(OracleSqlParser.BINARY_FLOAT, 0); }
		public TerminalNode BINARY_DOUBLE() { return getToken(OracleSqlParser.BINARY_DOUBLE, 0); }
		public TerminalNode NATURAL() { return getToken(OracleSqlParser.NATURAL, 0); }
		public TerminalNode POSITIVE() { return getToken(OracleSqlParser.POSITIVE, 0); }
		public TerminalNode K_NUMBER() { return getToken(OracleSqlParser.K_NUMBER, 0); }
		public TerminalNode NUMERIC() { return getToken(OracleSqlParser.NUMERIC, 0); }
		public TerminalNode DECIMAL() { return getToken(OracleSqlParser.DECIMAL, 0); }
		public TerminalNode DEC() { return getToken(OracleSqlParser.DEC, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(OracleSqlParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(OracleSqlParser.LPAREN, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(OracleSqlParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(OracleSqlParser.NUMBER, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(OracleSqlParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(OracleSqlParser.RPAREN, i);
		}
		public TerminalNode COMMA() { return getToken(OracleSqlParser.COMMA, 0); }
		public TerminalNode LONG() { return getToken(OracleSqlParser.LONG, 0); }
		public TerminalNode RAW() { return getToken(OracleSqlParser.RAW, 0); }
		public TerminalNode BOOLEAN() { return getToken(OracleSqlParser.BOOLEAN, 0); }
		public TerminalNode DATE() { return getToken(OracleSqlParser.DATE, 0); }
		public TerminalNode INTERVAL() { return getToken(OracleSqlParser.INTERVAL, 0); }
		public TerminalNode DAY() { return getToken(OracleSqlParser.DAY, 0); }
		public TerminalNode TO() { return getToken(OracleSqlParser.TO, 0); }
		public TerminalNode SECOND() { return getToken(OracleSqlParser.SECOND, 0); }
		public TerminalNode YEAR() { return getToken(OracleSqlParser.YEAR, 0); }
		public TerminalNode MONTH() { return getToken(OracleSqlParser.MONTH, 0); }
		public List<TerminalNode> TIME() { return getTokens(OracleSqlParser.TIME); }
		public TerminalNode TIME(int i) {
			return getToken(OracleSqlParser.TIME, i);
		}
		public TerminalNode TIMESTAMP() { return getToken(OracleSqlParser.TIMESTAMP, 0); }
		public TerminalNode WITH() { return getToken(OracleSqlParser.WITH, 0); }
		public TerminalNode ZONE() { return getToken(OracleSqlParser.ZONE, 0); }
		public TerminalNode LOCAL() { return getToken(OracleSqlParser.LOCAL, 0); }
		public TerminalNode INTEGER() { return getToken(OracleSqlParser.INTEGER, 0); }
		public TerminalNode INT() { return getToken(OracleSqlParser.INT, 0); }
		public TerminalNode SMALLINT() { return getToken(OracleSqlParser.SMALLINT, 0); }
		public TerminalNode FLOAT() { return getToken(OracleSqlParser.FLOAT, 0); }
		public TerminalNode REAL() { return getToken(OracleSqlParser.REAL, 0); }
		public TerminalNode DOUBLE() { return getToken(OracleSqlParser.DOUBLE, 0); }
		public TerminalNode PRECISION() { return getToken(OracleSqlParser.PRECISION, 0); }
		public List<TerminalNode> CHAR() { return getTokens(OracleSqlParser.CHAR); }
		public TerminalNode CHAR(int i) {
			return getToken(OracleSqlParser.CHAR, i);
		}
		public TerminalNode VARYING() { return getToken(OracleSqlParser.VARYING, 0); }
		public TerminalNode CHARACTER() { return getToken(OracleSqlParser.CHARACTER, 0); }
		public TerminalNode SET() { return getToken(OracleSqlParser.SET, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Column_specContext column_spec() {
			return getRuleContext(Column_specContext.class,0);
		}
		public TerminalNode CHARSET_ATTR() { return getToken(OracleSqlParser.CHARSET_ATTR, 0); }
		public TerminalNode BYTE() { return getToken(OracleSqlParser.BYTE, 0); }
		public TerminalNode VARCHAR() { return getToken(OracleSqlParser.VARCHAR, 0); }
		public TerminalNode VARCHAR2() { return getToken(OracleSqlParser.VARCHAR2, 0); }
		public TerminalNode NCHAR() { return getToken(OracleSqlParser.NCHAR, 0); }
		public TerminalNode NVARCHAR() { return getToken(OracleSqlParser.NVARCHAR, 0); }
		public TerminalNode NVARCHAR2() { return getToken(OracleSqlParser.NVARCHAR2, 0); }
		public TerminalNode NATIONAL() { return getToken(OracleSqlParser.NATIONAL, 0); }
		public TerminalNode MLSLABEL() { return getToken(OracleSqlParser.MLSLABEL, 0); }
		public TerminalNode PLS_INTEGER() { return getToken(OracleSqlParser.PLS_INTEGER, 0); }
		public TerminalNode BLOB() { return getToken(OracleSqlParser.BLOB, 0); }
		public TerminalNode CLOB() { return getToken(OracleSqlParser.CLOB, 0); }
		public TerminalNode NCLOB() { return getToken(OracleSqlParser.NCLOB, 0); }
		public TerminalNode BFILE() { return getToken(OracleSqlParser.BFILE, 0); }
		public TerminalNode ROWID() { return getToken(OracleSqlParser.ROWID, 0); }
		public TerminalNode UROWID() { return getToken(OracleSqlParser.UROWID, 0); }
		public Datatype_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datatype_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterDatatype_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitDatatype_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitDatatype_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Datatype_nameContext datatype_name() throws RecognitionException {
		Datatype_nameContext _localctx = new Datatype_nameContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_datatype_name);
		int _la;
		try {
			setState(1524);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1320);
				match(BINARY_INTEGER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1321);
				match(BINARY_FLOAT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1322);
				match(BINARY_DOUBLE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1323);
				match(NATURAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1324);
				match(POSITIVE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1325);
				_la = _input.LA(1);
				if ( !(_la==DECIMAL || _la==K_NUMBER || _la==DEC || _la==NUMERIC) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1333);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1326);
					match(LPAREN);
					setState(1327);
					match(NUMBER);
					setState(1330);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(1328);
						match(COMMA);
						setState(1329);
						match(NUMBER);
						}
					}

					setState(1332);
					match(RPAREN);
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1335);
				match(LONG);
				setState(1337);
				_la = _input.LA(1);
				if (_la==RAW) {
					{
					setState(1336);
					match(RAW);
					}
				}

				setState(1342);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1339);
					match(LPAREN);
					setState(1340);
					match(NUMBER);
					setState(1341);
					match(RPAREN);
					}
				}

				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1344);
				match(RAW);
				setState(1348);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1345);
					match(LPAREN);
					setState(1346);
					match(NUMBER);
					setState(1347);
					match(RPAREN);
					}
				}

				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1350);
				match(BOOLEAN);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1351);
				match(DATE);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1352);
				match(INTERVAL);
				setState(1353);
				match(DAY);
				setState(1357);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1354);
					match(LPAREN);
					setState(1355);
					match(NUMBER);
					setState(1356);
					match(RPAREN);
					}
				}

				setState(1359);
				match(TO);
				setState(1360);
				match(SECOND);
				setState(1364);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1361);
					match(LPAREN);
					setState(1362);
					match(NUMBER);
					setState(1363);
					match(RPAREN);
					}
				}

				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1366);
				match(INTERVAL);
				setState(1367);
				match(YEAR);
				setState(1371);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1368);
					match(LPAREN);
					setState(1369);
					match(NUMBER);
					setState(1370);
					match(RPAREN);
					}
				}

				setState(1373);
				match(TO);
				setState(1374);
				match(MONTH);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1375);
				_la = _input.LA(1);
				if ( !(_la==TIME || _la==TIMESTAMP) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1379);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1376);
					match(LPAREN);
					setState(1377);
					match(NUMBER);
					setState(1378);
					match(RPAREN);
					}
				}

				setState(1387);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(1381);
					match(WITH);
					setState(1383);
					_la = _input.LA(1);
					if (_la==LOCAL) {
						{
						setState(1382);
						match(LOCAL);
						}
					}

					setState(1385);
					match(TIME);
					setState(1386);
					match(ZONE);
					}
				}

				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1389);
				match(INTEGER);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1390);
				match(INT);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1391);
				match(SMALLINT);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1392);
				match(FLOAT);
				setState(1396);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1393);
					match(LPAREN);
					setState(1394);
					match(NUMBER);
					setState(1395);
					match(RPAREN);
					}
				}

				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1398);
				match(REAL);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1399);
				match(DOUBLE);
				setState(1400);
				match(PRECISION);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1401);
				match(CHAR);
				setState(1403);
				_la = _input.LA(1);
				if (_la==VARYING) {
					{
					setState(1402);
					match(VARYING);
					}
				}

				setState(1411);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1405);
					match(LPAREN);
					setState(1406);
					match(NUMBER);
					setState(1408);
					_la = _input.LA(1);
					if (_la==CHAR || _la==BYTE) {
						{
						setState(1407);
						_la = _input.LA(1);
						if ( !(_la==CHAR || _la==BYTE) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						}
					}

					setState(1410);
					match(RPAREN);
					}
				}

				setState(1421);
				_la = _input.LA(1);
				if (_la==CHARACTER) {
					{
					setState(1413);
					match(CHARACTER);
					setState(1414);
					match(SET);
					setState(1419);
					switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
					case 1:
						{
						setState(1415);
						identifier();
						}
						break;
					case 2:
						{
						setState(1416);
						column_spec();
						setState(1417);
						match(CHARSET_ATTR);
						}
						break;
					}
					}
				}

				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1423);
				match(VARCHAR);
				setState(1430);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1424);
					match(LPAREN);
					setState(1425);
					match(NUMBER);
					setState(1427);
					_la = _input.LA(1);
					if (_la==CHAR || _la==BYTE) {
						{
						setState(1426);
						_la = _input.LA(1);
						if ( !(_la==CHAR || _la==BYTE) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						}
					}

					setState(1429);
					match(RPAREN);
					}
				}

				setState(1440);
				_la = _input.LA(1);
				if (_la==CHARACTER) {
					{
					setState(1432);
					match(CHARACTER);
					setState(1433);
					match(SET);
					setState(1438);
					switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
					case 1:
						{
						setState(1434);
						identifier();
						}
						break;
					case 2:
						{
						setState(1435);
						column_spec();
						setState(1436);
						match(CHARSET_ATTR);
						}
						break;
					}
					}
				}

				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1442);
				match(VARCHAR2);
				setState(1449);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1443);
					match(LPAREN);
					setState(1444);
					match(NUMBER);
					setState(1446);
					_la = _input.LA(1);
					if (_la==CHAR || _la==BYTE) {
						{
						setState(1445);
						_la = _input.LA(1);
						if ( !(_la==CHAR || _la==BYTE) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						}
					}

					setState(1448);
					match(RPAREN);
					}
				}

				setState(1459);
				_la = _input.LA(1);
				if (_la==CHARACTER) {
					{
					setState(1451);
					match(CHARACTER);
					setState(1452);
					match(SET);
					setState(1457);
					switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
					case 1:
						{
						setState(1453);
						identifier();
						}
						break;
					case 2:
						{
						setState(1454);
						column_spec();
						setState(1455);
						match(CHARSET_ATTR);
						}
						break;
					}
					}
				}

				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1461);
				match(CHARACTER);
				setState(1463);
				_la = _input.LA(1);
				if (_la==VARYING) {
					{
					setState(1462);
					match(VARYING);
					}
				}

				setState(1468);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1465);
					match(LPAREN);
					setState(1466);
					match(NUMBER);
					setState(1467);
					match(RPAREN);
					}
				}

				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(1470);
				match(NCHAR);
				setState(1472);
				_la = _input.LA(1);
				if (_la==VARYING) {
					{
					setState(1471);
					match(VARYING);
					}
				}

				setState(1477);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1474);
					match(LPAREN);
					setState(1475);
					match(NUMBER);
					setState(1476);
					match(RPAREN);
					}
				}

				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(1479);
				match(NVARCHAR);
				setState(1483);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1480);
					match(LPAREN);
					setState(1481);
					match(NUMBER);
					setState(1482);
					match(RPAREN);
					}
				}

				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(1485);
				match(NVARCHAR2);
				setState(1489);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1486);
					match(LPAREN);
					setState(1487);
					match(NUMBER);
					setState(1488);
					match(RPAREN);
					}
				}

				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(1491);
				match(NATIONAL);
				setState(1492);
				_la = _input.LA(1);
				if ( !(_la==CHAR || _la==CHARACTER) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1494);
				_la = _input.LA(1);
				if (_la==VARYING) {
					{
					setState(1493);
					match(VARYING);
					}
				}

				setState(1499);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1496);
					match(LPAREN);
					setState(1497);
					match(NUMBER);
					setState(1498);
					match(RPAREN);
					}
				}

				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(1501);
				match(MLSLABEL);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(1502);
				match(PLS_INTEGER);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(1503);
				match(BLOB);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(1504);
				match(CLOB);
				setState(1513);
				_la = _input.LA(1);
				if (_la==CHARACTER) {
					{
					setState(1505);
					match(CHARACTER);
					setState(1506);
					match(SET);
					setState(1511);
					switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
					case 1:
						{
						setState(1507);
						identifier();
						}
						break;
					case 2:
						{
						setState(1508);
						column_spec();
						setState(1509);
						match(CHARSET_ATTR);
						}
						break;
					}
					}
				}

				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(1515);
				match(NCLOB);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(1516);
				match(BFILE);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(1517);
				match(ROWID);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(1518);
				match(UROWID);
				setState(1522);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1519);
					match(LPAREN);
					setState(1520);
					match(NUMBER);
					setState(1521);
					match(RPAREN);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolean_literalContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(OracleSqlParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(OracleSqlParser.FALSE, 0); }
		public Boolean_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterBoolean_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitBoolean_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitBoolean_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_literalContext boolean_literal() throws RecognitionException {
		Boolean_literalContext _localctx = new Boolean_literalContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_boolean_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1526);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_aliasContext extends ParserRuleContext {
		public Sql_identifierContext sql_identifier() {
			return getRuleContext(Sql_identifierContext.class,0);
		}
		public T_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterT_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitT_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitT_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_aliasContext t_alias() throws RecognitionException {
		T_aliasContext _localctx = new T_aliasContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_t_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1528);
			sql_identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class C_aliasContext extends ParserRuleContext {
		public Sql_identifierContext sql_identifier() {
			return getRuleContext(Sql_identifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(OracleSqlParser.AS, 0); }
		public C_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterC_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitC_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitC_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final C_aliasContext c_alias() throws RecognitionException {
		C_aliasContext _localctx = new C_aliasContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_c_alias);
		int _la;
		try {
			setState(1535);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1531);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(1530);
					match(AS);
					}
				}

				setState(1533);
				sql_identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1534);
				match(AS);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_specContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public T_aliasContext t_alias() {
			return getRuleContext(T_aliasContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(OracleSqlParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(OracleSqlParser.DOT, i);
		}
		public Outer_join_signContext outer_join_sign() {
			return getRuleContext(Outer_join_signContext.class,0);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public Package_nameContext package_name() {
			return getRuleContext(Package_nameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Pseudo_columnContext pseudo_column() {
			return getRuleContext(Pseudo_columnContext.class,0);
		}
		public Bind_variableContext bind_variable() {
			return getRuleContext(Bind_variableContext.class,0);
		}
		public Column_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterColumn_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitColumn_spec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitColumn_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_specContext column_spec() throws RecognitionException {
		Column_specContext _localctx = new Column_specContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_column_spec);
		try {
			setState(1560);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1545);
				switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
				case 1:
					{
					setState(1540);
					switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
					case 1:
						{
						setState(1537);
						schema_name();
						setState(1538);
						match(DOT);
						}
						break;
					}
					setState(1542);
					t_alias();
					setState(1543);
					match(DOT);
					}
					break;
				}
				setState(1547);
				column_name();
				setState(1549);
				switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
				case 1:
					{
					setState(1548);
					outer_join_sign();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1551);
				schema_name();
				setState(1552);
				match(DOT);
				setState(1553);
				package_name();
				setState(1554);
				match(DOT);
				setState(1555);
				identifier();
				setState(1556);
				match(DOT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1558);
				pseudo_column();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1559);
				bind_variable();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pseudo_columnContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(OracleSqlParser.NULL, 0); }
		public TerminalNode SYSDATE() { return getToken(OracleSqlParser.SYSDATE, 0); }
		public TerminalNode USER() { return getToken(OracleSqlParser.USER, 0); }
		public TerminalNode LEVEL() { return getToken(OracleSqlParser.LEVEL, 0); }
		public Pseudo_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudo_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterPseudo_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitPseudo_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitPseudo_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pseudo_columnContext pseudo_column() throws RecognitionException {
		Pseudo_columnContext _localctx = new Pseudo_columnContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_pseudo_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1562);
			_la = _input.LA(1);
			if ( !(((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (LEVEL - 44)) | (1L << (NULL - 44)) | (1L << (SYSDATE - 44)) | (1L << (USER - 44)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_nameContext extends ParserRuleContext {
		public Sql_identifierContext sql_identifier() {
			return getRuleContext(Sql_identifierContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1564);
			sql_identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_specContext extends ParserRuleContext {
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(OracleSqlParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(OracleSqlParser.DOT, i);
		}
		public Package_nameContext package_name() {
			return getRuleContext(Package_nameContext.class,0);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public Function_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterFunction_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitFunction_spec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitFunction_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_specContext function_spec() throws RecognitionException {
		Function_specContext _localctx = new Function_specContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_function_spec);
		try {
			setState(1577);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1566);
				schema_name();
				setState(1567);
				match(DOT);
				setState(1568);
				package_name();
				setState(1569);
				match(DOT);
				setState(1570);
				function_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1572);
				schema_name();
				setState(1573);
				match(DOT);
				setState(1574);
				function_name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1576);
				function_name();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_reference_listContext extends ParserRuleContext {
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public List<Table_referenceContext> table_reference() {
			return getRuleContexts(Table_referenceContext.class);
		}
		public Table_referenceContext table_reference(int i) {
			return getRuleContext(Table_referenceContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OracleSqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleSqlParser.COMMA, i);
		}
		public Table_reference_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_reference_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterTable_reference_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitTable_reference_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitTable_reference_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_reference_listContext table_reference_list() throws RecognitionException {
		Table_reference_listContext _localctx = new Table_reference_listContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_table_reference_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1581);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				{
				setState(1579);
				join_clause();
				}
				break;
			case 2:
				{
				setState(1580);
				table_reference();
				}
				break;
			}
			setState(1587);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1583);
				match(COMMA);
				setState(1584);
				table_reference();
				}
				}
				setState(1589);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_referenceContext extends ParserRuleContext {
		public Query_table_expressionContext query_table_expression() {
			return getRuleContext(Query_table_expressionContext.class,0);
		}
		public Flashback_query_clauseContext flashback_query_clause() {
			return getRuleContext(Flashback_query_clauseContext.class,0);
		}
		public T_aliasContext t_alias() {
			return getRuleContext(T_aliasContext.class,0);
		}
		public TerminalNode ONLY() { return getToken(OracleSqlParser.ONLY, 0); }
		public TerminalNode LPAREN() { return getToken(OracleSqlParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(OracleSqlParser.RPAREN, 0); }
		public Table_referenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterTable_reference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitTable_reference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitTable_reference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_referenceContext table_reference() throws RecognitionException {
		Table_referenceContext _localctx = new Table_referenceContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_table_reference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1596);
			switch (_input.LA(1)) {
			case ONLY:
				{
				{
				setState(1590);
				match(ONLY);
				setState(1591);
				match(LPAREN);
				setState(1592);
				query_table_expression();
				setState(1593);
				match(RPAREN);
				}
				}
				break;
			case ACCESS:
			case ROWID:
			case ROWNUM:
			case TABLE:
			case COUNT:
			case CYCLE:
			case SQL:
			case THE:
			case TIME:
			case TYPE:
			case VALUE:
			case YEAR:
			case QUOTED_STRING:
			case ID:
			case LPAREN:
				{
				setState(1595);
				query_table_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1599);
			_la = _input.LA(1);
			if (_la==AS || _la==VERSIONS) {
				{
				setState(1598);
				flashback_query_clause();
				}
			}

			setState(1602);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCESS) | (1L << ROWID) | (1L << ROWNUM))) != 0) || _la==COUNT || _la==CYCLE || ((((_la - 203)) & ~0x3f) == 0 && ((1L << (_la - 203)) & ((1L << (SQL - 203)) | (1L << (TIME - 203)) | (1L << (TYPE - 203)) | (1L << (VALUE - 203)) | (1L << (YEAR - 203)) | (1L << (QUOTED_STRING - 203)) | (1L << (ID - 203)))) != 0)) {
				{
				setState(1601);
				t_alias();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Query_table_expressionContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(OracleSqlParser.DOT, 0); }
		public Partition_extension_clauseContext partition_extension_clause() {
			return getRuleContext(Partition_extension_clauseContext.class,0);
		}
		public TerminalNode AT_SIGN() { return getToken(OracleSqlParser.AT_SIGN, 0); }
		public Dblink_nameContext dblink_name() {
			return getRuleContext(Dblink_nameContext.class,0);
		}
		public Sample_clauseContext sample_clause() {
			return getRuleContext(Sample_clauseContext.class,0);
		}
		public Pivot_clauseContext pivot_clause() {
			return getRuleContext(Pivot_clauseContext.class,0);
		}
		public Unpivot_clauseContext unpivot_clause() {
			return getRuleContext(Unpivot_clauseContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public Subquery_restricrion_clauseContext subquery_restricrion_clause() {
			return getRuleContext(Subquery_restricrion_clauseContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(OracleSqlParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(OracleSqlParser.RPAREN, 0); }
		public Table_collection_clauseContext table_collection_clause() {
			return getRuleContext(Table_collection_clauseContext.class,0);
		}
		public Query_table_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_table_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterQuery_table_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitQuery_table_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitQuery_table_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Query_table_expressionContext query_table_expression() throws RecognitionException {
		Query_table_expressionContext _localctx = new Query_table_expressionContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_query_table_expression);
		int _la;
		try {
			setState(1646);
			switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1607);
				switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
				case 1:
					{
					setState(1604);
					schema_name();
					setState(1605);
					match(DOT);
					}
					break;
				}
				setState(1609);
				table_name();
				setState(1613);
				switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
				case 1:
					{
					setState(1610);
					partition_extension_clause();
					}
					break;
				case 2:
					{
					setState(1611);
					match(AT_SIGN);
					setState(1612);
					dblink_name();
					}
					break;
				}
				setState(1616);
				_la = _input.LA(1);
				if (_la==SAMPLE) {
					{
					setState(1615);
					sample_clause();
					}
				}

				setState(1620);
				switch (_input.LA(1)) {
				case PIVOT:
					{
					setState(1618);
					pivot_clause();
					}
					break;
				case UNPIVOT:
					{
					setState(1619);
					unpivot_clause();
					}
					break;
				case EOF:
				case ACCESS:
				case AS:
				case CONNECT:
				case FOR:
				case GROUP:
				case HAVING:
				case INTERSECT:
				case MINUS2:
				case ON:
				case ORDER:
				case ROWID:
				case ROWNUM:
				case START:
				case UNION:
				case WHERE:
				case COUNT:
				case CROSS:
				case CYCLE:
				case FULL:
				case INNER:
				case JOIN:
				case LEFT:
				case LOG:
				case MODEL:
				case NATURAL:
				case PARTITION:
				case RIGHT:
				case SQL:
				case TIME:
				case TYPE:
				case USING:
				case VALUE:
				case VERSIONS:
				case YEAR:
				case QUOTED_STRING:
				case ID:
				case SEMI:
				case COMMA:
				case RPAREN:
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1622);
				subquery();
				setState(1624);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(1623);
					subquery_restricrion_clause();
					}
				}

				setState(1628);
				switch (_input.LA(1)) {
				case PIVOT:
					{
					setState(1626);
					pivot_clause();
					}
					break;
				case UNPIVOT:
					{
					setState(1627);
					unpivot_clause();
					}
					break;
				case EOF:
				case ACCESS:
				case AS:
				case CONNECT:
				case FOR:
				case GROUP:
				case HAVING:
				case INTERSECT:
				case MINUS2:
				case ON:
				case ORDER:
				case ROWID:
				case ROWNUM:
				case START:
				case UNION:
				case WHERE:
				case COUNT:
				case CROSS:
				case CYCLE:
				case FULL:
				case INNER:
				case JOIN:
				case LEFT:
				case LOG:
				case MODEL:
				case NATURAL:
				case PARTITION:
				case RIGHT:
				case SQL:
				case TIME:
				case TYPE:
				case USING:
				case VALUE:
				case VERSIONS:
				case YEAR:
				case QUOTED_STRING:
				case ID:
				case SEMI:
				case COMMA:
				case RPAREN:
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1630);
				match(LPAREN);
				setState(1631);
				subquery();
				setState(1633);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(1632);
					subquery_restricrion_clause();
					}
				}

				setState(1637);
				switch (_input.LA(1)) {
				case PIVOT:
					{
					setState(1635);
					pivot_clause();
					}
					break;
				case UNPIVOT:
					{
					setState(1636);
					unpivot_clause();
					}
					break;
				case RPAREN:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1639);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1641);
				table_collection_clause();
				setState(1644);
				switch (_input.LA(1)) {
				case PIVOT:
					{
					setState(1642);
					pivot_clause();
					}
					break;
				case UNPIVOT:
					{
					setState(1643);
					unpivot_clause();
					}
					break;
				case EOF:
				case ACCESS:
				case AS:
				case CONNECT:
				case FOR:
				case GROUP:
				case HAVING:
				case INTERSECT:
				case MINUS2:
				case ON:
				case ORDER:
				case ROWID:
				case ROWNUM:
				case START:
				case UNION:
				case WHERE:
				case COUNT:
				case CROSS:
				case CYCLE:
				case FULL:
				case INNER:
				case JOIN:
				case LEFT:
				case LOG:
				case MODEL:
				case NATURAL:
				case PARTITION:
				case RIGHT:
				case SQL:
				case TIME:
				case TYPE:
				case USING:
				case VALUE:
				case VERSIONS:
				case YEAR:
				case QUOTED_STRING:
				case ID:
				case SEMI:
				case COMMA:
				case RPAREN:
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Flashback_query_clauseContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(OracleSqlParser.AS, 0); }
		public TerminalNode OF() { return getToken(OracleSqlParser.OF, 0); }
		public List<Sql_expressionContext> sql_expression() {
			return getRuleContexts(Sql_expressionContext.class);
		}
		public Sql_expressionContext sql_expression(int i) {
			return getRuleContext(Sql_expressionContext.class,i);
		}
		public List<TerminalNode> SCN() { return getTokens(OracleSqlParser.SCN); }
		public TerminalNode SCN(int i) {
			return getToken(OracleSqlParser.SCN, i);
		}
		public List<TerminalNode> TIMESTAMP() { return getTokens(OracleSqlParser.TIMESTAMP); }
		public TerminalNode TIMESTAMP(int i) {
			return getToken(OracleSqlParser.TIMESTAMP, i);
		}
		public TerminalNode VERSIONS() { return getToken(OracleSqlParser.VERSIONS, 0); }
		public TerminalNode BETWEEN() { return getToken(OracleSqlParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(OracleSqlParser.AND, 0); }
		public TerminalNode MIVALUE() { return getToken(OracleSqlParser.MIVALUE, 0); }
		public TerminalNode MAXVALUE() { return getToken(OracleSqlParser.MAXVALUE, 0); }
		public Flashback_query_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flashback_query_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterFlashback_query_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitFlashback_query_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitFlashback_query_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Flashback_query_clauseContext flashback_query_clause() throws RecognitionException {
		Flashback_query_clauseContext _localctx = new Flashback_query_clauseContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_flashback_query_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1660);
			_la = _input.LA(1);
			if (_la==VERSIONS) {
				{
				setState(1648);
				match(VERSIONS);
				setState(1649);
				match(BETWEEN);
				setState(1650);
				_la = _input.LA(1);
				if ( !(_la==SCN || _la==TIMESTAMP) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1653);
				switch (_input.LA(1)) {
				case ACCESS:
				case CASE:
				case DATE:
				case FALSE:
				case LEVEL:
				case NULL:
				case PRIOR:
				case ROWID:
				case ROWNUM:
				case SET:
				case SYSDATE:
				case TRUE:
				case USER:
				case CAST:
				case CLUSTER_SET:
				case CONNECT_BY_ROOT:
				case COUNT:
				case CURSOR:
				case CYCLE:
				case DENSE_RANK:
				case EXTRACT:
				case INTERVAL:
				case LISTAGG:
				case LNNVL:
				case PERCENT_RANK:
				case PERCENTILE_CONT:
				case PERCENTILE_DISC:
				case SQL:
				case TIME:
				case TIMESTAMP:
				case TRIM:
				case TYPE:
				case VALUE:
				case YEAR:
				case QUOTED_STRING:
				case BINDVAR:
				case ID:
				case COLON:
				case LPAREN:
				case PLUS:
				case MINUS:
				case NUMBER:
					{
					setState(1651);
					sql_expression();
					}
					break;
				case MIVALUE:
					{
					setState(1652);
					match(MIVALUE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1655);
				match(AND);
				setState(1658);
				switch (_input.LA(1)) {
				case ACCESS:
				case CASE:
				case DATE:
				case FALSE:
				case LEVEL:
				case NULL:
				case PRIOR:
				case ROWID:
				case ROWNUM:
				case SET:
				case SYSDATE:
				case TRUE:
				case USER:
				case CAST:
				case CLUSTER_SET:
				case CONNECT_BY_ROOT:
				case COUNT:
				case CURSOR:
				case CYCLE:
				case DENSE_RANK:
				case EXTRACT:
				case INTERVAL:
				case LISTAGG:
				case LNNVL:
				case PERCENT_RANK:
				case PERCENTILE_CONT:
				case PERCENTILE_DISC:
				case SQL:
				case TIME:
				case TIMESTAMP:
				case TRIM:
				case TYPE:
				case VALUE:
				case YEAR:
				case QUOTED_STRING:
				case BINDVAR:
				case ID:
				case COLON:
				case LPAREN:
				case PLUS:
				case MINUS:
				case NUMBER:
					{
					setState(1656);
					sql_expression();
					}
					break;
				case MAXVALUE:
					{
					setState(1657);
					match(MAXVALUE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(1662);
			match(AS);
			setState(1663);
			match(OF);
			setState(1664);
			_la = _input.LA(1);
			if ( !(_la==SCN || _la==TIMESTAMP) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1665);
			sql_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sample_clauseContext extends ParserRuleContext {
		public TerminalNode SAMPLE() { return getToken(OracleSqlParser.SAMPLE, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(OracleSqlParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(OracleSqlParser.LPAREN, i);
		}
		public List<Sample_percentContext> sample_percent() {
			return getRuleContexts(Sample_percentContext.class);
		}
		public Sample_percentContext sample_percent(int i) {
			return getRuleContext(Sample_percentContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(OracleSqlParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(OracleSqlParser.RPAREN, i);
		}
		public TerminalNode BLOCK() { return getToken(OracleSqlParser.BLOCK, 0); }
		public TerminalNode COMMA() { return getToken(OracleSqlParser.COMMA, 0); }
		public TerminalNode SEED() { return getToken(OracleSqlParser.SEED, 0); }
		public Seed_valueContext seed_value() {
			return getRuleContext(Seed_valueContext.class,0);
		}
		public Sample_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sample_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterSample_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitSample_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitSample_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sample_clauseContext sample_clause() throws RecognitionException {
		Sample_clauseContext _localctx = new Sample_clauseContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_sample_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1667);
			match(SAMPLE);
			setState(1669);
			_la = _input.LA(1);
			if (_la==BLOCK) {
				{
				setState(1668);
				match(BLOCK);
				}
			}

			setState(1671);
			match(LPAREN);
			setState(1672);
			sample_percent();
			setState(1675);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1673);
				match(COMMA);
				setState(1674);
				sample_percent();
				}
			}

			setState(1677);
			match(RPAREN);
			setState(1683);
			_la = _input.LA(1);
			if (_la==SEED) {
				{
				setState(1678);
				match(SEED);
				setState(1679);
				match(LPAREN);
				setState(1680);
				seed_value();
				setState(1681);
				match(RPAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Partition_extension_clauseContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(OracleSqlParser.PARTITION, 0); }
		public TerminalNode LPAREN() { return getToken(OracleSqlParser.LPAREN, 0); }
		public PartitionContext partition() {
			return getRuleContext(PartitionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(OracleSqlParser.RPAREN, 0); }
		public TerminalNode FOR() { return getToken(OracleSqlParser.FOR, 0); }
		public List<Partition_key_valueContext> partition_key_value() {
			return getRuleContexts(Partition_key_valueContext.class);
		}
		public Partition_key_valueContext partition_key_value(int i) {
			return getRuleContext(Partition_key_valueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OracleSqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleSqlParser.COMMA, i);
		}
		public TerminalNode SUBPARTITION() { return getToken(OracleSqlParser.SUBPARTITION, 0); }
		public List<Subpartition_key_valueContext> subpartition_key_value() {
			return getRuleContexts(Subpartition_key_valueContext.class);
		}
		public Subpartition_key_valueContext subpartition_key_value(int i) {
			return getRuleContext(Subpartition_key_valueContext.class,i);
		}
		public Partition_extension_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition_extension_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterPartition_extension_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitPartition_extension_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitPartition_extension_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Partition_extension_clauseContext partition_extension_clause() throws RecognitionException {
		Partition_extension_clauseContext _localctx = new Partition_extension_clauseContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_partition_extension_clause);
		int _la;
		try {
			setState(1723);
			switch (_input.LA(1)) {
			case PARTITION:
				enterOuterAlt(_localctx, 1);
				{
				setState(1685);
				match(PARTITION);
				setState(1702);
				switch (_input.LA(1)) {
				case LPAREN:
					{
					{
					setState(1686);
					match(LPAREN);
					setState(1687);
					partition();
					setState(1688);
					match(RPAREN);
					}
					}
					break;
				case FOR:
					{
					{
					setState(1690);
					match(FOR);
					setState(1691);
					match(LPAREN);
					setState(1692);
					partition_key_value();
					setState(1697);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1693);
						match(COMMA);
						setState(1694);
						partition_key_value();
						}
						}
						setState(1699);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1700);
					match(RPAREN);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case SUBPARTITION:
				enterOuterAlt(_localctx, 2);
				{
				setState(1704);
				match(SUBPARTITION);
				setState(1721);
				switch (_input.LA(1)) {
				case LPAREN:
					{
					{
					setState(1705);
					match(LPAREN);
					setState(1706);
					partition();
					setState(1707);
					match(RPAREN);
					}
					}
					break;
				case FOR:
					{
					{
					setState(1709);
					match(FOR);
					setState(1710);
					match(LPAREN);
					setState(1711);
					subpartition_key_value();
					setState(1716);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1712);
						match(COMMA);
						setState(1713);
						subpartition_key_value();
						}
						}
						setState(1718);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1719);
					match(RPAREN);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subquery_restricrion_clauseContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(OracleSqlParser.WITH, 0); }
		public TerminalNode READ() { return getToken(OracleSqlParser.READ, 0); }
		public TerminalNode ONLY() { return getToken(OracleSqlParser.ONLY, 0); }
		public TerminalNode CHECK() { return getToken(OracleSqlParser.CHECK, 0); }
		public TerminalNode OPTION() { return getToken(OracleSqlParser.OPTION, 0); }
		public TerminalNode CONSTRAINT() { return getToken(OracleSqlParser.CONSTRAINT, 0); }
		public ConstraintContext constraint() {
			return getRuleContext(ConstraintContext.class,0);
		}
		public Subquery_restricrion_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery_restricrion_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterSubquery_restricrion_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitSubquery_restricrion_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitSubquery_restricrion_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subquery_restricrion_clauseContext subquery_restricrion_clause() throws RecognitionException {
		Subquery_restricrion_clauseContext _localctx = new Subquery_restricrion_clauseContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_subquery_restricrion_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1725);
			match(WITH);
			setState(1734);
			switch (_input.LA(1)) {
			case READ:
				{
				{
				setState(1726);
				match(READ);
				setState(1727);
				match(ONLY);
				}
				}
				break;
			case CHECK:
				{
				{
				setState(1728);
				match(CHECK);
				setState(1729);
				match(OPTION);
				setState(1732);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(1730);
					match(CONSTRAINT);
					setState(1731);
					constraint();
					}
				}

				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_collection_clauseContext extends ParserRuleContext {
		public Collection_expressionContext collection_expression() {
			return getRuleContext(Collection_expressionContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(OracleSqlParser.TABLE, 0); }
		public TerminalNode THE() { return getToken(OracleSqlParser.THE, 0); }
		public Outer_join_signContext outer_join_sign() {
			return getRuleContext(Outer_join_signContext.class,0);
		}
		public Table_collection_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_collection_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterTable_collection_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitTable_collection_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitTable_collection_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_collection_clauseContext table_collection_clause() throws RecognitionException {
		Table_collection_clauseContext _localctx = new Table_collection_clauseContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_table_collection_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1736);
			_la = _input.LA(1);
			if ( !(_la==TABLE || _la==THE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1737);
			collection_expression();
			setState(1739);
			switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
			case 1:
				{
				setState(1738);
				outer_join_sign();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_clauseContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(OracleSqlParser.LPAREN, 0); }
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(OracleSqlParser.RPAREN, 0); }
		public Table_referenceContext table_reference() {
			return getRuleContext(Table_referenceContext.class,0);
		}
		public List<Inner_cross_join_clauseContext> inner_cross_join_clause() {
			return getRuleContexts(Inner_cross_join_clauseContext.class);
		}
		public Inner_cross_join_clauseContext inner_cross_join_clause(int i) {
			return getRuleContext(Inner_cross_join_clauseContext.class,i);
		}
		public List<Outer_join_clauseContext> outer_join_clause() {
			return getRuleContexts(Outer_join_clauseContext.class);
		}
		public Outer_join_clauseContext outer_join_clause(int i) {
			return getRuleContext(Outer_join_clauseContext.class,i);
		}
		public Join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterJoin_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitJoin_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitJoin_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_clauseContext join_clause() throws RecognitionException {
		Join_clauseContext _localctx = new Join_clauseContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_join_clause);
		int _la;
		try {
			setState(1758);
			switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1746);
				switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
				case 1:
					{
					setState(1741);
					match(LPAREN);
					setState(1742);
					join_clause();
					setState(1743);
					match(RPAREN);
					}
					break;
				case 2:
					{
					setState(1745);
					table_reference();
					}
					break;
				}
				setState(1750); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(1750);
					switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
					case 1:
						{
						setState(1748);
						inner_cross_join_clause();
						}
						break;
					case 2:
						{
						setState(1749);
						outer_join_clause();
						}
						break;
					}
					}
					setState(1752); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (CROSS - 102)) | (1L << (FULL - 102)) | (1L << (INNER - 102)) | (1L << (JOIN - 102)) | (1L << (LEFT - 102)) | (1L << (NATURAL - 102)))) != 0) || _la==PARTITION || _la==RIGHT );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1754);
				match(LPAREN);
				setState(1755);
				join_clause();
				setState(1756);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Inner_cross_join_clauseContext extends ParserRuleContext {
		public TerminalNode JOIN() { return getToken(OracleSqlParser.JOIN, 0); }
		public Table_referenceContext table_reference() {
			return getRuleContext(Table_referenceContext.class,0);
		}
		public TerminalNode INNER() { return getToken(OracleSqlParser.INNER, 0); }
		public List<TerminalNode> ON() { return getTokens(OracleSqlParser.ON); }
		public TerminalNode ON(int i) {
			return getToken(OracleSqlParser.ON, i);
		}
		public List<Sql_conditionContext> sql_condition() {
			return getRuleContexts(Sql_conditionContext.class);
		}
		public Sql_conditionContext sql_condition(int i) {
			return getRuleContext(Sql_conditionContext.class,i);
		}
		public List<TerminalNode> USING() { return getTokens(OracleSqlParser.USING); }
		public TerminalNode USING(int i) {
			return getToken(OracleSqlParser.USING, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(OracleSqlParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(OracleSqlParser.LPAREN, i);
		}
		public List<Column_specsContext> column_specs() {
			return getRuleContexts(Column_specsContext.class);
		}
		public Column_specsContext column_specs(int i) {
			return getRuleContext(Column_specsContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(OracleSqlParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(OracleSqlParser.RPAREN, i);
		}
		public TerminalNode CROSS() { return getToken(OracleSqlParser.CROSS, 0); }
		public TerminalNode NATURAL() { return getToken(OracleSqlParser.NATURAL, 0); }
		public Inner_cross_join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inner_cross_join_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterInner_cross_join_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitInner_cross_join_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitInner_cross_join_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inner_cross_join_clauseContext inner_cross_join_clause() throws RecognitionException {
		Inner_cross_join_clauseContext _localctx = new Inner_cross_join_clauseContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_inner_cross_join_clause);
		int _la;
		try {
			setState(1786);
			switch (_input.LA(1)) {
			case INNER:
			case JOIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1761);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(1760);
					match(INNER);
					}
				}

				setState(1763);
				match(JOIN);
				setState(1764);
				table_reference();
				setState(1774);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ON || _la==USING) {
					{
					setState(1772);
					switch (_input.LA(1)) {
					case ON:
						{
						{
						setState(1765);
						match(ON);
						setState(1766);
						sql_condition();
						}
						}
						break;
					case USING:
						{
						{
						setState(1767);
						match(USING);
						setState(1768);
						match(LPAREN);
						setState(1769);
						column_specs();
						setState(1770);
						match(RPAREN);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(1776);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case CROSS:
			case NATURAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1782);
				switch (_input.LA(1)) {
				case CROSS:
					{
					setState(1777);
					match(CROSS);
					}
					break;
				case NATURAL:
					{
					setState(1778);
					match(NATURAL);
					setState(1780);
					_la = _input.LA(1);
					if (_la==INNER) {
						{
						setState(1779);
						match(INNER);
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				{
				setState(1784);
				match(JOIN);
				setState(1785);
				table_reference();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Outer_join_clauseContext extends ParserRuleContext {
		public Table_referenceContext table_reference() {
			return getRuleContext(Table_referenceContext.class,0);
		}
		public Outer_join_typeContext outer_join_type() {
			return getRuleContext(Outer_join_typeContext.class,0);
		}
		public TerminalNode JOIN() { return getToken(OracleSqlParser.JOIN, 0); }
		public TerminalNode NATURAL() { return getToken(OracleSqlParser.NATURAL, 0); }
		public List<Query_partition_clauseContext> query_partition_clause() {
			return getRuleContexts(Query_partition_clauseContext.class);
		}
		public Query_partition_clauseContext query_partition_clause(int i) {
			return getRuleContext(Query_partition_clauseContext.class,i);
		}
		public TerminalNode ON() { return getToken(OracleSqlParser.ON, 0); }
		public Sql_conditionContext sql_condition() {
			return getRuleContext(Sql_conditionContext.class,0);
		}
		public TerminalNode USING() { return getToken(OracleSqlParser.USING, 0); }
		public TerminalNode LPAREN() { return getToken(OracleSqlParser.LPAREN, 0); }
		public Column_specsContext column_specs() {
			return getRuleContext(Column_specsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(OracleSqlParser.RPAREN, 0); }
		public Outer_join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outer_join_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterOuter_join_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitOuter_join_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitOuter_join_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Outer_join_clauseContext outer_join_clause() throws RecognitionException {
		Outer_join_clauseContext _localctx = new Outer_join_clauseContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_outer_join_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1789);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(1788);
				query_partition_clause();
				}
			}

			setState(1799);
			switch (_input.LA(1)) {
			case FULL:
			case LEFT:
			case RIGHT:
				{
				setState(1791);
				outer_join_type();
				setState(1792);
				match(JOIN);
				}
				break;
			case NATURAL:
				{
				setState(1794);
				match(NATURAL);
				setState(1796);
				_la = _input.LA(1);
				if (_la==FULL || _la==LEFT || _la==RIGHT) {
					{
					setState(1795);
					outer_join_type();
					}
				}

				setState(1798);
				match(JOIN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1801);
			table_reference();
			setState(1803);
			switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
			case 1:
				{
				setState(1802);
				query_partition_clause();
				}
				break;
			}
			setState(1812);
			switch (_input.LA(1)) {
			case ON:
				{
				setState(1805);
				match(ON);
				setState(1806);
				sql_condition();
				}
				break;
			case USING:
				{
				setState(1807);
				match(USING);
				setState(1808);
				match(LPAREN);
				setState(1809);
				column_specs();
				setState(1810);
				match(RPAREN);
				}
				break;
			case EOF:
			case CONNECT:
			case FOR:
			case GROUP:
			case HAVING:
			case INTERSECT:
			case MINUS2:
			case ORDER:
			case START:
			case UNION:
			case WHERE:
			case CROSS:
			case FULL:
			case INNER:
			case JOIN:
			case LEFT:
			case LOG:
			case MODEL:
			case NATURAL:
			case PARTITION:
			case RIGHT:
			case SEMI:
			case COMMA:
			case RPAREN:
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Query_partition_clauseContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(OracleSqlParser.PARTITION, 0); }
		public TerminalNode BY() { return getToken(OracleSqlParser.BY, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Query_partition_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_partition_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterQuery_partition_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitQuery_partition_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitQuery_partition_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Query_partition_clauseContext query_partition_clause() throws RecognitionException {
		Query_partition_clauseContext _localctx = new Query_partition_clauseContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_query_partition_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1814);
			match(PARTITION);
			setState(1815);
			match(BY);
			setState(1816);
			expression_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Outer_join_typeContext extends ParserRuleContext {
		public TerminalNode FULL() { return getToken(OracleSqlParser.FULL, 0); }
		public TerminalNode LEFT() { return getToken(OracleSqlParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(OracleSqlParser.RIGHT, 0); }
		public TerminalNode OUTER() { return getToken(OracleSqlParser.OUTER, 0); }
		public Outer_join_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outer_join_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterOuter_join_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitOuter_join_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitOuter_join_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Outer_join_typeContext outer_join_type() throws RecognitionException {
		Outer_join_typeContext _localctx = new Outer_join_typeContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_outer_join_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1818);
			_la = _input.LA(1);
			if ( !(_la==FULL || _la==LEFT || _la==RIGHT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1820);
			_la = _input.LA(1);
			if (_la==OUTER) {
				{
				setState(1819);
				match(OUTER);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sample_percentContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(OracleSqlParser.NUMBER, 0); }
		public Bind_variableContext bind_variable() {
			return getRuleContext(Bind_variableContext.class,0);
		}
		public Sample_percentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sample_percent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterSample_percent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitSample_percent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitSample_percent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sample_percentContext sample_percent() throws RecognitionException {
		Sample_percentContext _localctx = new Sample_percentContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_sample_percent);
		try {
			setState(1824);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1822);
				match(NUMBER);
				}
				break;
			case BINDVAR:
			case COLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(1823);
				bind_variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Seed_valueContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(OracleSqlParser.NUMBER, 0); }
		public Bind_variableContext bind_variable() {
			return getRuleContext(Bind_variableContext.class,0);
		}
		public Seed_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seed_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterSeed_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitSeed_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitSeed_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Seed_valueContext seed_value() throws RecognitionException {
		Seed_valueContext _localctx = new Seed_valueContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_seed_value);
		try {
			setState(1828);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1826);
				match(NUMBER);
				}
				break;
			case BINDVAR:
			case COLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(1827);
				bind_variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Outer_join_signContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(OracleSqlParser.LPAREN, 0); }
		public TerminalNode PLUS() { return getToken(OracleSqlParser.PLUS, 0); }
		public TerminalNode RPAREN() { return getToken(OracleSqlParser.RPAREN, 0); }
		public Outer_join_signContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outer_join_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterOuter_join_sign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitOuter_join_sign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitOuter_join_sign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Outer_join_signContext outer_join_sign() throws RecognitionException {
		Outer_join_signContext _localctx = new Outer_join_signContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_outer_join_sign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1830);
			match(LPAREN);
			setState(1831);
			match(PLUS);
			setState(1832);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_nameContext extends ParserRuleContext {
		public Sql_identifierContext sql_identifier() {
			return getRuleContext(Sql_identifierContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitTable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1834);
			sql_identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Schema_nameContext extends ParserRuleContext {
		public Sql_identifierContext sql_identifier() {
			return getRuleContext(Sql_identifierContext.class,0);
		}
		public Schema_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schema_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterSchema_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitSchema_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitSchema_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Schema_nameContext schema_name() throws RecognitionException {
		Schema_nameContext _localctx = new Schema_nameContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_schema_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1836);
			sql_identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Package_nameContext extends ParserRuleContext {
		public Sql_identifierContext sql_identifier() {
			return getRuleContext(Sql_identifierContext.class,0);
		}
		public Package_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterPackage_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitPackage_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitPackage_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_nameContext package_name() throws RecognitionException {
		Package_nameContext _localctx = new Package_nameContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_package_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1838);
			sql_identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dblink_nameContext extends ParserRuleContext {
		public Sql_identifierContext sql_identifier() {
			return getRuleContext(Sql_identifierContext.class,0);
		}
		public Dblink_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dblink_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterDblink_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitDblink_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitDblink_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dblink_nameContext dblink_name() throws RecognitionException {
		Dblink_nameContext _localctx = new Dblink_nameContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_dblink_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1840);
			sql_identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_specsContext extends ParserRuleContext {
		public List<Column_specContext> column_spec() {
			return getRuleContexts(Column_specContext.class);
		}
		public Column_specContext column_spec(int i) {
			return getRuleContext(Column_specContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OracleSqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleSqlParser.COMMA, i);
		}
		public Column_specsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_specs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterColumn_specs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitColumn_specs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitColumn_specs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_specsContext column_specs() throws RecognitionException {
		Column_specsContext _localctx = new Column_specsContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_column_specs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1842);
			column_spec();
			setState(1847);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1843);
				match(COMMA);
				setState(1844);
				column_spec();
				}
				}
				setState(1849);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PartitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterPartition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitPartition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitPartition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionContext partition() throws RecognitionException {
		PartitionContext _localctx = new PartitionContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_partition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1850);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Partition_key_valueContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(OracleSqlParser.NUMBER, 0); }
		public Partition_key_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition_key_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterPartition_key_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitPartition_key_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitPartition_key_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Partition_key_valueContext partition_key_value() throws RecognitionException {
		Partition_key_valueContext _localctx = new Partition_key_valueContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_partition_key_value);
		try {
			setState(1854);
			switch (_input.LA(1)) {
			case QUOTED_STRING:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1852);
				identifier();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1853);
				match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subpartition_key_valueContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(OracleSqlParser.NUMBER, 0); }
		public Subpartition_key_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subpartition_key_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterSubpartition_key_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitSubpartition_key_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitSubpartition_key_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subpartition_key_valueContext subpartition_key_value() throws RecognitionException {
		Subpartition_key_valueContext _localctx = new Subpartition_key_valueContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_subpartition_key_value);
		try {
			setState(1858);
			switch (_input.LA(1)) {
			case QUOTED_STRING:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1856);
				identifier();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1857);
				match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstraintContext extends ParserRuleContext {
		public Sql_identifierContext sql_identifier() {
			return getRuleContext(Sql_identifierContext.class,0);
		}
		public ConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintContext constraint() throws RecognitionException {
		ConstraintContext _localctx = new ConstraintContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1860);
			sql_identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Collection_expressionContext extends ParserRuleContext {
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(OracleSqlParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(OracleSqlParser.RPAREN, 0); }
		public Cast_expressionContext cast_expression() {
			return getRuleContext(Cast_expressionContext.class,0);
		}
		public Function_expressionContext function_expression() {
			return getRuleContext(Function_expressionContext.class,0);
		}
		public Column_specContext column_spec() {
			return getRuleContext(Column_specContext.class,0);
		}
		public Collection_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collection_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterCollection_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitCollection_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitCollection_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Collection_expressionContext collection_expression() throws RecognitionException {
		Collection_expressionContext _localctx = new Collection_expressionContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_collection_expression);
		try {
			setState(1874);
			switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1862);
				subquery();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1863);
				match(LPAREN);
				setState(1866);
				switch (_input.LA(1)) {
				case CAST:
					{
					setState(1864);
					cast_expression();
					}
					break;
				case ACCESS:
				case ROWID:
				case ROWNUM:
				case COUNT:
				case CYCLE:
				case SQL:
				case TIME:
				case TYPE:
				case VALUE:
				case YEAR:
				case QUOTED_STRING:
				case ID:
					{
					setState(1865);
					function_expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1868);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1870);
				match(LPAREN);
				setState(1871);
				column_spec();
				setState(1872);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Where_clauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(OracleSqlParser.WHERE, 0); }
		public Sql_conditionContext sql_condition() {
			return getRuleContext(Sql_conditionContext.class,0);
		}
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterWhere_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitWhere_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitWhere_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1876);
			match(WHERE);
			setState(1877);
			sql_condition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Hierarchical_query_clauseContext extends ParserRuleContext {
		public TerminalNode CONNECT() { return getToken(OracleSqlParser.CONNECT, 0); }
		public TerminalNode BY() { return getToken(OracleSqlParser.BY, 0); }
		public List<Sql_conditionContext> sql_condition() {
			return getRuleContexts(Sql_conditionContext.class);
		}
		public Sql_conditionContext sql_condition(int i) {
			return getRuleContext(Sql_conditionContext.class,i);
		}
		public TerminalNode NOCYCLE() { return getToken(OracleSqlParser.NOCYCLE, 0); }
		public TerminalNode START() { return getToken(OracleSqlParser.START, 0); }
		public TerminalNode WITH() { return getToken(OracleSqlParser.WITH, 0); }
		public Hierarchical_query_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hierarchical_query_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterHierarchical_query_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitHierarchical_query_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitHierarchical_query_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Hierarchical_query_clauseContext hierarchical_query_clause() throws RecognitionException {
		Hierarchical_query_clauseContext _localctx = new Hierarchical_query_clauseContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_hierarchical_query_clause);
		int _la;
		try {
			setState(1901);
			switch (_input.LA(1)) {
			case CONNECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1879);
				match(CONNECT);
				setState(1880);
				match(BY);
				setState(1882);
				_la = _input.LA(1);
				if (_la==NOCYCLE) {
					{
					setState(1881);
					match(NOCYCLE);
					}
				}

				setState(1884);
				sql_condition();
				setState(1888);
				_la = _input.LA(1);
				if (_la==START) {
					{
					setState(1885);
					match(START);
					setState(1886);
					match(WITH);
					setState(1887);
					sql_condition();
					}
				}

				}
				break;
			case START:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1890);
				match(START);
				setState(1891);
				match(WITH);
				setState(1892);
				sql_condition();
				}
				setState(1894);
				match(CONNECT);
				setState(1895);
				match(BY);
				setState(1897);
				_la = _input.LA(1);
				if (_la==NOCYCLE) {
					{
					setState(1896);
					match(NOCYCLE);
					}
				}

				setState(1899);
				sql_condition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Group_by_clauseContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(OracleSqlParser.HAVING, 0); }
		public Sql_conditionContext sql_condition() {
			return getRuleContext(Sql_conditionContext.class,0);
		}
		public TerminalNode GROUP() { return getToken(OracleSqlParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(OracleSqlParser.BY, 0); }
		public Group_by_exprsContext group_by_exprs() {
			return getRuleContext(Group_by_exprsContext.class,0);
		}
		public Group_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_by_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterGroup_by_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitGroup_by_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitGroup_by_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Group_by_clauseContext group_by_clause() throws RecognitionException {
		Group_by_clauseContext _localctx = new Group_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_group_by_clause);
		try {
			setState(1917);
			switch (_input.LA(1)) {
			case HAVING:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1903);
				match(HAVING);
				setState(1904);
				sql_condition();
				setState(1908);
				switch ( getInterpreter().adaptivePredict(_input,266,_ctx) ) {
				case 1:
					{
					setState(1905);
					match(GROUP);
					setState(1906);
					match(BY);
					setState(1907);
					group_by_exprs();
					}
					break;
				}
				}
				}
				break;
			case GROUP:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1910);
				match(GROUP);
				setState(1911);
				match(BY);
				setState(1912);
				group_by_exprs();
				setState(1915);
				switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
				case 1:
					{
					setState(1913);
					match(HAVING);
					setState(1914);
					sql_condition();
					}
					break;
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Group_by_exprsContext extends ParserRuleContext {
		public List<Group_by_exprContext> group_by_expr() {
			return getRuleContexts(Group_by_exprContext.class);
		}
		public Group_by_exprContext group_by_expr(int i) {
			return getRuleContext(Group_by_exprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OracleSqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleSqlParser.COMMA, i);
		}
		public Group_by_exprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_by_exprs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterGroup_by_exprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitGroup_by_exprs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitGroup_by_exprs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Group_by_exprsContext group_by_exprs() throws RecognitionException {
		Group_by_exprsContext _localctx = new Group_by_exprsContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_group_by_exprs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1919);
			group_by_expr();
			setState(1924);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,269,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1920);
					match(COMMA);
					setState(1921);
					group_by_expr();
					}
					} 
				}
				setState(1926);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,269,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Group_by_exprContext extends ParserRuleContext {
		public Rollup_cube_clauseContext rollup_cube_clause() {
			return getRuleContext(Rollup_cube_clauseContext.class,0);
		}
		public Grouping_sets_clauseContext grouping_sets_clause() {
			return getRuleContext(Grouping_sets_clauseContext.class,0);
		}
		public Grouping_expression_listContext grouping_expression_list() {
			return getRuleContext(Grouping_expression_listContext.class,0);
		}
		public Group_by_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_by_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterGroup_by_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitGroup_by_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitGroup_by_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Group_by_exprContext group_by_expr() throws RecognitionException {
		Group_by_exprContext _localctx = new Group_by_exprContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_group_by_expr);
		try {
			setState(1930);
			switch (_input.LA(1)) {
			case CUBE:
			case ROLLUP:
				enterOuterAlt(_localctx, 1);
				{
				setState(1927);
				rollup_cube_clause();
				}
				break;
			case GROUPING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1928);
				grouping_sets_clause();
				}
				break;
			case ACCESS:
			case CASE:
			case DATE:
			case FALSE:
			case LEVEL:
			case NULL:
			case PRIOR:
			case ROWID:
			case ROWNUM:
			case SET:
			case SYSDATE:
			case TRUE:
			case USER:
			case CAST:
			case CLUSTER_SET:
			case CONNECT_BY_ROOT:
			case COUNT:
			case CURSOR:
			case CYCLE:
			case DENSE_RANK:
			case EXTRACT:
			case INTERVAL:
			case LISTAGG:
			case LNNVL:
			case PERCENT_RANK:
			case PERCENTILE_CONT:
			case PERCENTILE_DISC:
			case SQL:
			case TIME:
			case TIMESTAMP:
			case TRIM:
			case TYPE:
			case VALUE:
			case YEAR:
			case QUOTED_STRING:
			case BINDVAR:
			case ID:
			case COLON:
			case LPAREN:
			case PLUS:
			case MINUS:
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(1929);
				grouping_expression_list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rollup_cube_clauseContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(OracleSqlParser.LPAREN, 0); }
		public Grouping_expression_listContext grouping_expression_list() {
			return getRuleContext(Grouping_expression_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(OracleSqlParser.RPAREN, 0); }
		public TerminalNode ROLLUP() { return getToken(OracleSqlParser.ROLLUP, 0); }
		public TerminalNode CUBE() { return getToken(OracleSqlParser.CUBE, 0); }
		public Rollup_cube_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollup_cube_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterRollup_cube_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitRollup_cube_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitRollup_cube_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rollup_cube_clauseContext rollup_cube_clause() throws RecognitionException {
		Rollup_cube_clauseContext _localctx = new Rollup_cube_clauseContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_rollup_cube_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1932);
			_la = _input.LA(1);
			if ( !(_la==CUBE || _la==ROLLUP) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1933);
			match(LPAREN);
			setState(1934);
			grouping_expression_list();
			setState(1935);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Grouping_sets_clauseContext extends ParserRuleContext {
		public TerminalNode GROUPING() { return getToken(OracleSqlParser.GROUPING, 0); }
		public TerminalNode SETS() { return getToken(OracleSqlParser.SETS, 0); }
		public TerminalNode LPAREN() { return getToken(OracleSqlParser.LPAREN, 0); }
		public Grouping_sets_expression_listContext grouping_sets_expression_list() {
			return getRuleContext(Grouping_sets_expression_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(OracleSqlParser.RPAREN, 0); }
		public Grouping_sets_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grouping_sets_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterGrouping_sets_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitGrouping_sets_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitGrouping_sets_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Grouping_sets_clauseContext grouping_sets_clause() throws RecognitionException {
		Grouping_sets_clauseContext _localctx = new Grouping_sets_clauseContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_grouping_sets_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1937);
			match(GROUPING);
			setState(1938);
			match(SETS);
			setState(1939);
			match(LPAREN);
			setState(1940);
			grouping_sets_expression_list();
			setState(1941);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Grouping_sets_exprsContext extends ParserRuleContext {
		public List<Grouping_sets_exprContext> grouping_sets_expr() {
			return getRuleContexts(Grouping_sets_exprContext.class);
		}
		public Grouping_sets_exprContext grouping_sets_expr(int i) {
			return getRuleContext(Grouping_sets_exprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OracleSqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleSqlParser.COMMA, i);
		}
		public Grouping_sets_exprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grouping_sets_exprs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterGrouping_sets_exprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitGrouping_sets_exprs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitGrouping_sets_exprs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Grouping_sets_exprsContext grouping_sets_exprs() throws RecognitionException {
		Grouping_sets_exprsContext _localctx = new Grouping_sets_exprsContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_grouping_sets_exprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1943);
			grouping_sets_expr();
			setState(1948);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1944);
				match(COMMA);
				setState(1945);
				grouping_sets_expr();
				}
				}
				setState(1950);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Grouping_sets_exprContext extends ParserRuleContext {
		public Rollup_cube_clauseContext rollup_cube_clause() {
			return getRuleContext(Rollup_cube_clauseContext.class,0);
		}
		public Grouping_expression_listContext grouping_expression_list() {
			return getRuleContext(Grouping_expression_listContext.class,0);
		}
		public Grouping_sets_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grouping_sets_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterGrouping_sets_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitGrouping_sets_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitGrouping_sets_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Grouping_sets_exprContext grouping_sets_expr() throws RecognitionException {
		Grouping_sets_exprContext _localctx = new Grouping_sets_exprContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_grouping_sets_expr);
		try {
			setState(1953);
			switch (_input.LA(1)) {
			case CUBE:
			case ROLLUP:
				enterOuterAlt(_localctx, 1);
				{
				setState(1951);
				rollup_cube_clause();
				}
				break;
			case ACCESS:
			case CASE:
			case DATE:
			case FALSE:
			case LEVEL:
			case NULL:
			case PRIOR:
			case ROWID:
			case ROWNUM:
			case SET:
			case SYSDATE:
			case TRUE:
			case USER:
			case CAST:
			case CLUSTER_SET:
			case CONNECT_BY_ROOT:
			case COUNT:
			case CURSOR:
			case CYCLE:
			case DENSE_RANK:
			case EXTRACT:
			case INTERVAL:
			case LISTAGG:
			case LNNVL:
			case PERCENT_RANK:
			case PERCENTILE_CONT:
			case PERCENTILE_DISC:
			case SQL:
			case TIME:
			case TIMESTAMP:
			case TRIM:
			case TYPE:
			case VALUE:
			case YEAR:
			case QUOTED_STRING:
			case BINDVAR:
			case ID:
			case COLON:
			case LPAREN:
			case PLUS:
			case MINUS:
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1952);
				grouping_expression_list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_conditionContext extends ParserRuleContext {
		public Condition_orContext condition_or() {
			return getRuleContext(Condition_orContext.class,0);
		}
		public Sql_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterSql_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitSql_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitSql_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_conditionContext sql_condition() throws RecognitionException {
		Sql_conditionContext _localctx = new Sql_conditionContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_sql_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1955);
			condition_or();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Condition_orContext extends ParserRuleContext {
		public List<Condition_andContext> condition_and() {
			return getRuleContexts(Condition_andContext.class);
		}
		public Condition_andContext condition_and(int i) {
			return getRuleContext(Condition_andContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(OracleSqlParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(OracleSqlParser.OR, i);
		}
		public Condition_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterCondition_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitCondition_or(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitCondition_or(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_orContext condition_or() throws RecognitionException {
		Condition_orContext _localctx = new Condition_orContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_condition_or);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1957);
			condition_and();
			setState(1962);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,273,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1958);
					match(OR);
					setState(1959);
					condition_and();
					}
					} 
				}
				setState(1964);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,273,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Condition_andContext extends ParserRuleContext {
		public List<Condition_notContext> condition_not() {
			return getRuleContexts(Condition_notContext.class);
		}
		public Condition_notContext condition_not(int i) {
			return getRuleContext(Condition_notContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(OracleSqlParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(OracleSqlParser.AND, i);
		}
		public Condition_andContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterCondition_and(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitCondition_and(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitCondition_and(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_andContext condition_and() throws RecognitionException {
		Condition_andContext _localctx = new Condition_andContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_condition_and);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1965);
			condition_not();
			setState(1970);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,274,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1966);
					match(AND);
					setState(1967);
					condition_not();
					}
					} 
				}
				setState(1972);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,274,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Condition_notContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(OracleSqlParser.NOT, 0); }
		public Condition_exprContext condition_expr() {
			return getRuleContext(Condition_exprContext.class,0);
		}
		public Condition_notContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_not; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterCondition_not(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitCondition_not(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitCondition_not(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_notContext condition_not() throws RecognitionException {
		Condition_notContext _localctx = new Condition_notContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_condition_not);
		try {
			setState(1976);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1973);
				match(NOT);
				setState(1974);
				condition_expr();
				}
				break;
			case ACCESS:
			case ANY:
			case CASE:
			case DATE:
			case EXISTS:
			case FALSE:
			case LEVEL:
			case NULL:
			case PRIOR:
			case ROWID:
			case ROWNUM:
			case SET:
			case SYSDATE:
			case TRUE:
			case USER:
			case CAST:
			case CLUSTER_SET:
			case CONNECT_BY_ROOT:
			case COUNT:
			case CURSOR:
			case CYCLE:
			case DENSE_RANK:
			case EQUALS_PATH:
			case EXTRACT:
			case INTERVAL:
			case LISTAGG:
			case LNNVL:
			case PERCENT_RANK:
			case PERCENTILE_CONT:
			case PERCENTILE_DISC:
			case REGEXP_LIKE:
			case SQL:
			case TIME:
			case TIMESTAMP:
			case TRIM:
			case TYPE:
			case UNDER_PATH:
			case VALUE:
			case YEAR:
			case QUOTED_STRING:
			case BINDVAR:
			case ID:
			case COLON:
			case LPAREN:
			case PLUS:
			case MINUS:
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1975);
				condition_expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Condition_exprContext extends ParserRuleContext {
		public Condition_existsContext condition_exists() {
			return getRuleContext(Condition_existsContext.class,0);
		}
		public Condition_parenContext condition_paren() {
			return getRuleContext(Condition_parenContext.class,0);
		}
		public Condition_isContext condition_is() {
			return getRuleContext(Condition_isContext.class,0);
		}
		public Condition_comparisonContext condition_comparison() {
			return getRuleContext(Condition_comparisonContext.class,0);
		}
		public Condition_group_comparisonContext condition_group_comparison() {
			return getRuleContext(Condition_group_comparisonContext.class,0);
		}
		public Condition_inContext condition_in() {
			return getRuleContext(Condition_inContext.class,0);
		}
		public Condition_is_anyContext condition_is_any() {
			return getRuleContext(Condition_is_anyContext.class,0);
		}
		public Condition_is_emptyContext condition_is_empty() {
			return getRuleContext(Condition_is_emptyContext.class,0);
		}
		public Condition_is_of_typeContext condition_is_of_type() {
			return getRuleContext(Condition_is_of_typeContext.class,0);
		}
		public Condition_is_presentContext condition_is_present() {
			return getRuleContext(Condition_is_presentContext.class,0);
		}
		public Condition_likeContext condition_like() {
			return getRuleContext(Condition_likeContext.class,0);
		}
		public Condition_memeberContext condition_memeber() {
			return getRuleContext(Condition_memeberContext.class,0);
		}
		public Condition_betweenContext condition_between() {
			return getRuleContext(Condition_betweenContext.class,0);
		}
		public Condition_regexp_likeContext condition_regexp_like() {
			return getRuleContext(Condition_regexp_likeContext.class,0);
		}
		public Condition_submultisetContext condition_submultiset() {
			return getRuleContext(Condition_submultisetContext.class,0);
		}
		public Condition_equals_pathContext condition_equals_path() {
			return getRuleContext(Condition_equals_pathContext.class,0);
		}
		public Condition_under_pathContext condition_under_path() {
			return getRuleContext(Condition_under_pathContext.class,0);
		}
		public Condition_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterCondition_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitCondition_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitCondition_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_exprContext condition_expr() throws RecognitionException {
		Condition_exprContext _localctx = new Condition_exprContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_condition_expr);
		try {
			setState(1995);
			switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1978);
				condition_exists();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1979);
				condition_paren();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1980);
				condition_is();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1981);
				condition_comparison();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1982);
				condition_group_comparison();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1983);
				condition_in();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1984);
				condition_is_any();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1985);
				condition_is_empty();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1986);
				condition_is_of_type();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1987);
				condition_is_present();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1988);
				condition_like();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1989);
				condition_memeber();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1990);
				condition_between();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1991);
				condition_regexp_like();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1992);
				condition_submultiset();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1993);
				condition_equals_path();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1994);
				condition_under_path();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Condition_existsContext extends ParserRuleContext {
		public TerminalNode EXISTS() { return getToken(OracleSqlParser.EXISTS, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public Condition_existsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_exists; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterCondition_exists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitCondition_exists(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitCondition_exists(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_existsContext condition_exists() throws RecognitionException {
		Condition_existsContext _localctx = new Condition_existsContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_condition_exists);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1997);
			match(EXISTS);
			setState(1998);
			subquery();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Condition_isContext extends ParserRuleContext {
		public Column_specContext column_spec() {
			return getRuleContext(Column_specContext.class,0);
		}
		public TerminalNode IS() { return getToken(OracleSqlParser.IS, 0); }
		public TerminalNode NAN() { return getToken(OracleSqlParser.NAN, 0); }
		public TerminalNode INFINITE() { return getToken(OracleSqlParser.INFINITE, 0); }
		public TerminalNode NULL() { return getToken(OracleSqlParser.NULL, 0); }
		public Outer_join_signContext outer_join_sign() {
			return getRuleContext(Outer_join_signContext.class,0);
		}
		public TerminalNode NOT() { return getToken(OracleSqlParser.NOT, 0); }
		public Sql_expressionContext sql_expression() {
			return getRuleContext(Sql_expressionContext.class,0);
		}
		public Condition_isContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_is; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterCondition_is(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitCondition_is(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitCondition_is(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_isContext condition_is() throws RecognitionException {
		Condition_isContext _localctx = new Condition_isContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_condition_is);
		int _la;
		try {
			setState(2017);
			switch ( getInterpreter().adaptivePredict(_input,280,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2000);
				column_spec();
				setState(2002);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(2001);
					outer_join_sign();
					}
				}

				setState(2004);
				match(IS);
				setState(2006);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2005);
					match(NOT);
					}
				}

				setState(2008);
				_la = _input.LA(1);
				if ( !(_la==NULL || _la==INFINITE || _la==NAN) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2010);
				sql_expression();
				setState(2011);
				match(IS);
				setState(2013);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2012);
					match(NOT);
					}
				}

				setState(2015);
				_la = _input.LA(1);
				if ( !(_la==NULL || _la==INFINITE || _la==NAN) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Condition_comparisonContext extends ParserRuleContext {
		public Sql_expressionsContext sql_expressions() {
			return getRuleContext(Sql_expressionsContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode EQ() { return getToken(OracleSqlParser.EQ, 0); }
		public Not_equalContext not_equal() {
			return getRuleContext(Not_equalContext.class,0);
		}
		public List<Outer_join_signContext> outer_join_sign() {
			return getRuleContexts(Outer_join_signContext.class);
		}
		public Outer_join_signContext outer_join_sign(int i) {
			return getRuleContext(Outer_join_signContext.class,i);
		}
		public List<Sql_expressionContext> sql_expression() {
			return getRuleContexts(Sql_expressionContext.class);
		}
		public Sql_expressionContext sql_expression(int i) {
			return getRuleContext(Sql_expressionContext.class,i);
		}
		public TerminalNode GTH() { return getToken(OracleSqlParser.GTH, 0); }
		public GeqContext geq() {
			return getRuleContext(GeqContext.class,0);
		}
		public TerminalNode LTH() { return getToken(OracleSqlParser.LTH, 0); }
		public LeqContext leq() {
			return getRuleContext(LeqContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(OracleSqlParser.LPAREN, 0); }
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(OracleSqlParser.RPAREN, 0); }
		public List<TerminalNode> PRIOR() { return getTokens(OracleSqlParser.PRIOR); }
		public TerminalNode PRIOR(int i) {
			return getToken(OracleSqlParser.PRIOR, i);
		}
		public Condition_comparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterCondition_comparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitCondition_comparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitCondition_comparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_comparisonContext condition_comparison() throws RecognitionException {
		Condition_comparisonContext _localctx = new Condition_comparisonContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_condition_comparison);
		int _la;
		try {
			setState(2059);
			switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2019);
				sql_expressions();
				setState(2021);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(2020);
					outer_join_sign();
					}
				}

				setState(2025);
				switch (_input.LA(1)) {
				case EQ:
					{
					setState(2023);
					match(EQ);
					}
					break;
				case T__0:
				case T__1:
				case NOT_EQ:
				case LTH:
					{
					setState(2024);
					not_equal();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2027);
				subquery();
				setState(2029);
				switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
				case 1:
					{
					setState(2028);
					outer_join_sign();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2032);
				switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
				case 1:
					{
					setState(2031);
					match(PRIOR);
					}
					break;
				}
				setState(2034);
				sql_expression();
				setState(2036);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(2035);
					outer_join_sign();
					}
				}

				setState(2044);
				switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
				case 1:
					{
					setState(2038);
					match(EQ);
					}
					break;
				case 2:
					{
					setState(2039);
					not_equal();
					}
					break;
				case 3:
					{
					setState(2040);
					match(GTH);
					}
					break;
				case 4:
					{
					setState(2041);
					geq();
					}
					break;
				case 5:
					{
					setState(2042);
					match(LTH);
					}
					break;
				case 6:
					{
					setState(2043);
					leq();
					}
					break;
				}
				setState(2047);
				switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
				case 1:
					{
					setState(2046);
					match(PRIOR);
					}
					break;
				}
				setState(2054);
				switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
				case 1:
					{
					setState(2049);
					sql_expression();
					}
					break;
				case 2:
					{
					setState(2050);
					match(LPAREN);
					setState(2051);
					select_statement();
					setState(2052);
					match(RPAREN);
					}
					break;
				}
				setState(2057);
				switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
				case 1:
					{
					setState(2056);
					outer_join_sign();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Condition_group_comparisonContext extends ParserRuleContext {
		public List<TerminalNode> LPAREN() { return getTokens(OracleSqlParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(OracleSqlParser.LPAREN, i);
		}
		public Sql_expressionsContext sql_expressions() {
			return getRuleContext(Sql_expressionsContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(OracleSqlParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(OracleSqlParser.RPAREN, i);
		}
		public TerminalNode ANY() { return getToken(OracleSqlParser.ANY, 0); }
		public TerminalNode SOME() { return getToken(OracleSqlParser.SOME, 0); }
		public TerminalNode ALL() { return getToken(OracleSqlParser.ALL, 0); }
		public TerminalNode EQ() { return getToken(OracleSqlParser.EQ, 0); }
		public Not_equalContext not_equal() {
			return getRuleContext(Not_equalContext.class,0);
		}
		public Grouping_expression_listContext grouping_expression_list() {
			return getRuleContext(Grouping_expression_listContext.class,0);
		}
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public Sql_expressionContext sql_expression() {
			return getRuleContext(Sql_expressionContext.class,0);
		}
		public TerminalNode GTH() { return getToken(OracleSqlParser.GTH, 0); }
		public GeqContext geq() {
			return getRuleContext(GeqContext.class,0);
		}
		public TerminalNode LTH() { return getToken(OracleSqlParser.LTH, 0); }
		public LeqContext leq() {
			return getRuleContext(LeqContext.class,0);
		}
		public Condition_group_comparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_group_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterCondition_group_comparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitCondition_group_comparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitCondition_group_comparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_group_comparisonContext condition_group_comparison() throws RecognitionException {
		Condition_group_comparisonContext _localctx = new Condition_group_comparisonContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_condition_group_comparison);
		int _la;
		try {
			setState(2093);
			switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2061);
				match(LPAREN);
				setState(2062);
				sql_expressions();
				setState(2063);
				match(RPAREN);
				setState(2066);
				switch (_input.LA(1)) {
				case EQ:
					{
					setState(2064);
					match(EQ);
					}
					break;
				case T__0:
				case T__1:
				case NOT_EQ:
				case LTH:
					{
					setState(2065);
					not_equal();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2068);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==ANY || _la==SOME) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(2069);
				match(LPAREN);
				setState(2072);
				switch ( getInterpreter().adaptivePredict(_input,292,_ctx) ) {
				case 1:
					{
					setState(2070);
					grouping_expression_list();
					}
					break;
				case 2:
					{
					setState(2071);
					select_statement();
					}
					break;
				}
				setState(2074);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2076);
				sql_expression();
				setState(2083);
				switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
				case 1:
					{
					setState(2077);
					match(EQ);
					}
					break;
				case 2:
					{
					setState(2078);
					not_equal();
					}
					break;
				case 3:
					{
					setState(2079);
					match(GTH);
					}
					break;
				case 4:
					{
					setState(2080);
					geq();
					}
					break;
				case 5:
					{
					setState(2081);
					match(LTH);
					}
					break;
				case 6:
					{
					setState(2082);
					leq();
					}
					break;
				}
				setState(2085);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==ANY || _la==SOME) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(2086);
				match(LPAREN);
				setState(2089);
				switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
				case 1:
					{
					setState(2087);
					sql_expressions();
					}
					break;
				case 2:
					{
					setState(2088);
					select_statement();
					}
					break;
				}
				setState(2091);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Condition_inContext extends ParserRuleContext {
		public List<TerminalNode> LPAREN() { return getTokens(OracleSqlParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(OracleSqlParser.LPAREN, i);
		}
		public Sql_expressionsContext sql_expressions() {
			return getRuleContext(Sql_expressionsContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(OracleSqlParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(OracleSqlParser.RPAREN, i);
		}
		public TerminalNode IN() { return getToken(OracleSqlParser.IN, 0); }
		public Grouping_expression_listContext grouping_expression_list() {
			return getRuleContext(Grouping_expression_listContext.class,0);
		}
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public TerminalNode NOT() { return getToken(OracleSqlParser.NOT, 0); }
		public List<Sql_expressionContext> sql_expression() {
			return getRuleContexts(Sql_expressionContext.class);
		}
		public Sql_expressionContext sql_expression(int i) {
			return getRuleContext(Sql_expressionContext.class,i);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Condition_inContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_in; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterCondition_in(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitCondition_in(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitCondition_in(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_inContext condition_in() throws RecognitionException {
		Condition_inContext _localctx = new Condition_inContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_condition_in);
		int _la;
		try {
			setState(2128);
			switch ( getInterpreter().adaptivePredict(_input,301,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2095);
				match(LPAREN);
				setState(2096);
				sql_expressions();
				setState(2097);
				match(RPAREN);
				setState(2099);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2098);
					match(NOT);
					}
				}

				setState(2101);
				match(IN);
				setState(2102);
				match(LPAREN);
				setState(2105);
				switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
				case 1:
					{
					setState(2103);
					grouping_expression_list();
					}
					break;
				case 2:
					{
					setState(2104);
					select_statement();
					}
					break;
				}
				setState(2107);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2109);
				sql_expression();
				setState(2111);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2110);
					match(NOT);
					}
				}

				setState(2113);
				match(IN);
				setState(2114);
				match(LPAREN);
				setState(2117);
				switch ( getInterpreter().adaptivePredict(_input,299,_ctx) ) {
				case 1:
					{
					setState(2115);
					expression_list();
					}
					break;
				case 2:
					{
					setState(2116);
					select_statement();
					}
					break;
				}
				setState(2119);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2121);
				sql_expression();
				setState(2123);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2122);
					match(NOT);
					}
				}

				setState(2125);
				match(IN);
				setState(2126);
				sql_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Condition_is_anyContext extends ParserRuleContext {
		public TerminalNode ANY() { return getToken(OracleSqlParser.ANY, 0); }
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode IS() { return getToken(OracleSqlParser.IS, 0); }
		public Condition_is_anyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_is_any; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterCondition_is_any(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitCondition_is_any(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitCondition_is_any(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_is_anyContext condition_is_any() throws RecognitionException {
		Condition_is_anyContext _localctx = new Condition_is_anyContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_condition_is_any);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2133);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCESS) | (1L << ROWID) | (1L << ROWNUM))) != 0) || _la==COUNT || _la==CYCLE || ((((_la - 203)) & ~0x3f) == 0 && ((1L << (_la - 203)) & ((1L << (SQL - 203)) | (1L << (TIME - 203)) | (1L << (TYPE - 203)) | (1L << (VALUE - 203)) | (1L << (YEAR - 203)) | (1L << (QUOTED_STRING - 203)) | (1L << (ID - 203)))) != 0)) {
				{
				setState(2130);
				column_name();
				setState(2131);
				match(IS);
				}
			}

			setState(2135);
			match(ANY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Condition_is_emptyContext extends ParserRuleContext {
		public Nested_table_column_nameContext nested_table_column_name() {
			return getRuleContext(Nested_table_column_nameContext.class,0);
		}
		public TerminalNode IS() { return getToken(OracleSqlParser.IS, 0); }
		public TerminalNode EMPTY() { return getToken(OracleSqlParser.EMPTY, 0); }
		public TerminalNode NOT() { return getToken(OracleSqlParser.NOT, 0); }
		public Condition_is_emptyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_is_empty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterCondition_is_empty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitCondition_is_empty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitCondition_is_empty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_is_emptyContext condition_is_empty() throws RecognitionException {
		Condition_is_emptyContext _localctx = new Condition_is_emptyContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_condition_is_empty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2137);
			nested_table_column_name();
			setState(2138);
			match(IS);
			setState(2140);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(2139);
				match(NOT);
				}
			}

			setState(2142);
			match(EMPTY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Condition_is_of_typeContext extends ParserRuleContext {
		public Sql_expressionContext sql_expression() {
			return getRuleContext(Sql_expressionContext.class,0);
		}
		public TerminalNode IS() { return getToken(OracleSqlParser.IS, 0); }
		public TerminalNode OF() { return getToken(OracleSqlParser.OF, 0); }
		public TerminalNode LPAREN() { return getToken(OracleSqlParser.LPAREN, 0); }
		public Type_namesContext type_names() {
			return getRuleContext(Type_namesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(OracleSqlParser.RPAREN, 0); }
		public TerminalNode NOT() { return getToken(OracleSqlParser.NOT, 0); }
		public TerminalNode TYPE() { return getToken(OracleSqlParser.TYPE, 0); }
		public Condition_is_of_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_is_of_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterCondition_is_of_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitCondition_is_of_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitCondition_is_of_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_is_of_typeContext condition_is_of_type() throws RecognitionException {
		Condition_is_of_typeContext _localctx = new Condition_is_of_typeContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_condition_is_of_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2144);
			sql_expression();
			setState(2145);
			match(IS);
			setState(2147);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(2146);
				match(NOT);
				}
			}

			setState(2149);
			match(OF);
			setState(2151);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(2150);
				match(TYPE);
				}
			}

			setState(2153);
			match(LPAREN);
			setState(2154);
			type_names();
			setState(2155);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Condition_is_presentContext extends ParserRuleContext {
		public Cell_referenceContext cell_reference() {
			return getRuleContext(Cell_referenceContext.class,0);
		}
		public TerminalNode IS() { return getToken(OracleSqlParser.IS, 0); }
		public TerminalNode PRESENT() { return getToken(OracleSqlParser.PRESENT, 0); }
		public Condition_is_presentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_is_present; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterCondition_is_present(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitCondition_is_present(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitCondition_is_present(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_is_presentContext condition_is_present() throws RecognitionException {
		Condition_is_presentContext _localctx = new Condition_is_presentContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_condition_is_present);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2157);
			cell_reference();
			setState(2158);
			match(IS);
			setState(2159);
			match(PRESENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Condition_likeContext extends ParserRuleContext {
		public List<Sql_expressionContext> sql_expression() {
			return getRuleContexts(Sql_expressionContext.class);
		}
		public Sql_expressionContext sql_expression(int i) {
			return getRuleContext(Sql_expressionContext.class,i);
		}
		public TerminalNode LIKE() { return getToken(OracleSqlParser.LIKE, 0); }
		public TerminalNode NOT() { return getToken(OracleSqlParser.NOT, 0); }
		public TerminalNode ESCAPE() { return getToken(OracleSqlParser.ESCAPE, 0); }
		public Condition_likeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_like; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterCondition_like(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitCondition_like(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitCondition_like(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_likeContext condition_like() throws RecognitionException {
		Condition_likeContext _localctx = new Condition_likeContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_condition_like);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2161);
			sql_expression();
			setState(2163);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(2162);
				match(NOT);
				}
			}

			setState(2165);
			match(LIKE);
			setState(2166);
			sql_expression();
			setState(2169);
			switch ( getInterpreter().adaptivePredict(_input,307,_ctx) ) {
			case 1:
				{
				setState(2167);
				match(ESCAPE);
				setState(2168);
				sql_expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Condition_memeberContext extends ParserRuleContext {
		public Sql_expressionContext sql_expression() {
			return getRuleContext(Sql_expressionContext.class,0);
		}
		public TerminalNode MEMBER() { return getToken(OracleSqlParser.MEMBER, 0); }
		public Function_expressionContext function_expression() {
			return getRuleContext(Function_expressionContext.class,0);
		}
		public Nested_table_column_nameContext nested_table_column_name() {
			return getRuleContext(Nested_table_column_nameContext.class,0);
		}
		public TerminalNode NOT() { return getToken(OracleSqlParser.NOT, 0); }
		public TerminalNode OF() { return getToken(OracleSqlParser.OF, 0); }
		public Condition_memeberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_memeber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterCondition_memeber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitCondition_memeber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitCondition_memeber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_memeberContext condition_memeber() throws RecognitionException {
		Condition_memeberContext _localctx = new Condition_memeberContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_condition_memeber);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2171);
			sql_expression();
			setState(2173);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(2172);
				match(NOT);
				}
			}

			setState(2175);
			match(MEMBER);
			setState(2177);
			_la = _input.LA(1);
			if (_la==OF) {
				{
				setState(2176);
				match(OF);
				}
			}

			setState(2181);
			switch ( getInterpreter().adaptivePredict(_input,310,_ctx) ) {
			case 1:
				{
				setState(2179);
				function_expression();
				}
				break;
			case 2:
				{
				setState(2180);
				nested_table_column_name();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Condition_betweenContext extends ParserRuleContext {
		public List<Sql_expressionContext> sql_expression() {
			return getRuleContexts(Sql_expressionContext.class);
		}
		public Sql_expressionContext sql_expression(int i) {
			return getRuleContext(Sql_expressionContext.class,i);
		}
		public TerminalNode BETWEEN() { return getToken(OracleSqlParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(OracleSqlParser.AND, 0); }
		public TerminalNode NOT() { return getToken(OracleSqlParser.NOT, 0); }
		public Condition_betweenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_between; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterCondition_between(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitCondition_between(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitCondition_between(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_betweenContext condition_between() throws RecognitionException {
		Condition_betweenContext _localctx = new Condition_betweenContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_condition_between);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2183);
			sql_expression();
			setState(2185);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(2184);
				match(NOT);
				}
			}

			setState(2187);
			match(BETWEEN);
			setState(2188);
			sql_expression();
			setState(2189);
			match(AND);
			setState(2190);
			sql_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Condition_regexp_likeContext extends ParserRuleContext {
		public TerminalNode REGEXP_LIKE() { return getToken(OracleSqlParser.REGEXP_LIKE, 0); }
		public TerminalNode LPAREN() { return getToken(OracleSqlParser.LPAREN, 0); }
		public Call_parametersContext call_parameters() {
			return getRuleContext(Call_parametersContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(OracleSqlParser.RPAREN, 0); }
		public Condition_regexp_likeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_regexp_like; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterCondition_regexp_like(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitCondition_regexp_like(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitCondition_regexp_like(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_regexp_likeContext condition_regexp_like() throws RecognitionException {
		Condition_regexp_likeContext _localctx = new Condition_regexp_likeContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_condition_regexp_like);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2192);
			match(REGEXP_LIKE);
			setState(2193);
			match(LPAREN);
			setState(2194);
			call_parameters();
			setState(2195);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Condition_submultisetContext extends ParserRuleContext {
		public List<Nested_table_column_nameContext> nested_table_column_name() {
			return getRuleContexts(Nested_table_column_nameContext.class);
		}
		public Nested_table_column_nameContext nested_table_column_name(int i) {
			return getRuleContext(Nested_table_column_nameContext.class,i);
		}
		public TerminalNode SUBMULTISET() { return getToken(OracleSqlParser.SUBMULTISET, 0); }
		public TerminalNode NOT() { return getToken(OracleSqlParser.NOT, 0); }
		public TerminalNode OF() { return getToken(OracleSqlParser.OF, 0); }
		public Condition_submultisetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_submultiset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterCondition_submultiset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitCondition_submultiset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitCondition_submultiset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_submultisetContext condition_submultiset() throws RecognitionException {
		Condition_submultisetContext _localctx = new Condition_submultisetContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_condition_submultiset);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2197);
			nested_table_column_name();
			setState(2199);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(2198);
				match(NOT);
				}
			}

			setState(2201);
			match(SUBMULTISET);
			setState(2203);
			_la = _input.LA(1);
			if (_la==OF) {
				{
				setState(2202);
				match(OF);
				}
			}

			setState(2205);
			nested_table_column_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Condition_equals_pathContext extends ParserRuleContext {
		public TerminalNode EQUALS_PATH() { return getToken(OracleSqlParser.EQUALS_PATH, 0); }
		public TerminalNode LPAREN() { return getToken(OracleSqlParser.LPAREN, 0); }
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(OracleSqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleSqlParser.COMMA, i);
		}
		public Path_stringContext path_string() {
			return getRuleContext(Path_stringContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(OracleSqlParser.RPAREN, 0); }
		public Correlation_integerContext correlation_integer() {
			return getRuleContext(Correlation_integerContext.class,0);
		}
		public Condition_equals_pathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_equals_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterCondition_equals_path(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitCondition_equals_path(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitCondition_equals_path(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_equals_pathContext condition_equals_path() throws RecognitionException {
		Condition_equals_pathContext _localctx = new Condition_equals_pathContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_condition_equals_path);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2207);
			match(EQUALS_PATH);
			setState(2208);
			match(LPAREN);
			setState(2209);
			column_name();
			setState(2210);
			match(COMMA);
			setState(2211);
			path_string();
			setState(2214);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(2212);
				match(COMMA);
				setState(2213);
				correlation_integer();
				}
			}

			setState(2216);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Condition_under_pathContext extends ParserRuleContext {
		public TerminalNode UNDER_PATH() { return getToken(OracleSqlParser.UNDER_PATH, 0); }
		public TerminalNode LPAREN() { return getToken(OracleSqlParser.LPAREN, 0); }
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(OracleSqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleSqlParser.COMMA, i);
		}
		public Path_stringContext path_string() {
			return getRuleContext(Path_stringContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(OracleSqlParser.RPAREN, 0); }
		public LevelsContext levels() {
			return getRuleContext(LevelsContext.class,0);
		}
		public Correlation_integerContext correlation_integer() {
			return getRuleContext(Correlation_integerContext.class,0);
		}
		public Condition_under_pathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_under_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterCondition_under_path(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitCondition_under_path(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitCondition_under_path(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_under_pathContext condition_under_path() throws RecognitionException {
		Condition_under_pathContext _localctx = new Condition_under_pathContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_condition_under_path);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2218);
			match(UNDER_PATH);
			setState(2219);
			match(LPAREN);
			setState(2220);
			column_name();
			setState(2223);
			switch ( getInterpreter().adaptivePredict(_input,315,_ctx) ) {
			case 1:
				{
				setState(2221);
				match(COMMA);
				setState(2222);
				levels();
				}
				break;
			}
			setState(2225);
			match(COMMA);
			setState(2226);
			path_string();
			setState(2229);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(2227);
				match(COMMA);
				setState(2228);
				correlation_integer();
				}
			}

			setState(2231);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LevelsContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public LevelsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_levels; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterLevels(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitLevels(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitLevels(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LevelsContext levels() throws RecognitionException {
		LevelsContext _localctx = new LevelsContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_levels);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2233);
			integer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Correlation_integerContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public Correlation_integerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_correlation_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterCorrelation_integer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitCorrelation_integer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitCorrelation_integer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Correlation_integerContext correlation_integer() throws RecognitionException {
		Correlation_integerContext _localctx = new Correlation_integerContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_correlation_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2235);
			integer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Path_stringContext extends ParserRuleContext {
		public Quoted_stringContext quoted_string() {
			return getRuleContext(Quoted_stringContext.class,0);
		}
		public Path_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterPath_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitPath_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitPath_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Path_stringContext path_string() throws RecognitionException {
		Path_stringContext _localctx = new Path_stringContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_path_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2237);
			quoted_string();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_namesContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> ONLY() { return getTokens(OracleSqlParser.ONLY); }
		public TerminalNode ONLY(int i) {
			return getToken(OracleSqlParser.ONLY, i);
		}
		public List<Schema_nameContext> schema_name() {
			return getRuleContexts(Schema_nameContext.class);
		}
		public Schema_nameContext schema_name(int i) {
			return getRuleContext(Schema_nameContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(OracleSqlParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(OracleSqlParser.DOT, i);
		}
		public Type_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_names; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterType_names(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitType_names(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitType_names(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_namesContext type_names() throws RecognitionException {
		Type_namesContext _localctx = new Type_namesContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_type_names);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2240);
			_la = _input.LA(1);
			if (_la==ONLY) {
				{
				setState(2239);
				match(ONLY);
				}
			}

			setState(2245);
			switch ( getInterpreter().adaptivePredict(_input,318,_ctx) ) {
			case 1:
				{
				setState(2242);
				schema_name();
				setState(2243);
				match(DOT);
				}
				break;
			}
			setState(2247);
			identifier();
			setState(2259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCESS) | (1L << ROWID) | (1L << ROWNUM))) != 0) || _la==COUNT || _la==CYCLE || ((((_la - 166)) & ~0x3f) == 0 && ((1L << (_la - 166)) & ((1L << (ONLY - 166)) | (1L << (SQL - 166)) | (1L << (TIME - 166)) | (1L << (TYPE - 166)) | (1L << (VALUE - 166)))) != 0) || ((((_la - 232)) & ~0x3f) == 0 && ((1L << (_la - 232)) & ((1L << (YEAR - 232)) | (1L << (QUOTED_STRING - 232)) | (1L << (ID - 232)))) != 0)) {
				{
				{
				setState(2249);
				_la = _input.LA(1);
				if (_la==ONLY) {
					{
					setState(2248);
					match(ONLY);
					}
				}

				setState(2254);
				switch ( getInterpreter().adaptivePredict(_input,320,_ctx) ) {
				case 1:
					{
					setState(2251);
					schema_name();
					setState(2252);
					match(DOT);
					}
					break;
				}
				setState(2256);
				identifier();
				}
				}
				setState(2261);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(OracleSqlParser.NUMBER, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2262);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_nameContext extends ParserRuleContext {
		public Sql_identifierContext sql_identifier() {
			return getRuleContext(Sql_identifierContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitColumn_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2264);
			sql_identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nested_tableContext extends ParserRuleContext {
		public Sql_identifierContext sql_identifier() {
			return getRuleContext(Sql_identifierContext.class,0);
		}
		public Nested_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nested_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterNested_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitNested_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitNested_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nested_tableContext nested_table() throws RecognitionException {
		Nested_tableContext _localctx = new Nested_tableContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_nested_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2266);
			sql_identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nested_table_column_nameContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(OracleSqlParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(OracleSqlParser.DOT, i);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Nested_tableContext nested_table() {
			return getRuleContext(Nested_tableContext.class,0);
		}
		public Nested_table_column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nested_table_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterNested_table_column_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitNested_table_column_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitNested_table_column_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nested_table_column_nameContext nested_table_column_name() throws RecognitionException {
		Nested_table_column_nameContext _localctx = new Nested_table_column_nameContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_nested_table_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2271);
			switch ( getInterpreter().adaptivePredict(_input,322,_ctx) ) {
			case 1:
				{
				setState(2268);
				schema_name();
				setState(2269);
				match(DOT);
				}
				break;
			}
			setState(2276);
			switch ( getInterpreter().adaptivePredict(_input,323,_ctx) ) {
			case 1:
				{
				setState(2273);
				table_name();
				setState(2274);
				match(DOT);
				}
				break;
			}
			setState(2281);
			switch ( getInterpreter().adaptivePredict(_input,324,_ctx) ) {
			case 1:
				{
				setState(2278);
				nested_table();
				setState(2279);
				match(DOT);
				}
				break;
			}
			setState(2283);
			column_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_expressionsContext extends ParserRuleContext {
		public List<Sql_expressionContext> sql_expression() {
			return getRuleContexts(Sql_expressionContext.class);
		}
		public Sql_expressionContext sql_expression(int i) {
			return getRuleContext(Sql_expressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OracleSqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleSqlParser.COMMA, i);
		}
		public Sql_expressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_expressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterSql_expressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitSql_expressions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitSql_expressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_expressionsContext sql_expressions() throws RecognitionException {
		Sql_expressionsContext _localctx = new Sql_expressionsContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_sql_expressions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2285);
			sql_expression();
			setState(2290);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,325,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2286);
					match(COMMA);
					setState(2287);
					sql_expression();
					}
					} 
				}
				setState(2292);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,325,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Grouping_sets_expression_listContext extends ParserRuleContext {
		public List<TerminalNode> LPAREN() { return getTokens(OracleSqlParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(OracleSqlParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(OracleSqlParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(OracleSqlParser.RPAREN, i);
		}
		public List<Sql_expressionsContext> sql_expressions() {
			return getRuleContexts(Sql_expressionsContext.class);
		}
		public Sql_expressionsContext sql_expressions(int i) {
			return getRuleContext(Sql_expressionsContext.class,i);
		}
		public List<Sql_expressionContext> sql_expression() {
			return getRuleContexts(Sql_expressionContext.class);
		}
		public Sql_expressionContext sql_expression(int i) {
			return getRuleContext(Sql_expressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OracleSqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleSqlParser.COMMA, i);
		}
		public Grouping_sets_expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grouping_sets_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterGrouping_sets_expression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitGrouping_sets_expression_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitGrouping_sets_expression_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Grouping_sets_expression_listContext grouping_sets_expression_list() throws RecognitionException {
		Grouping_sets_expression_listContext _localctx = new Grouping_sets_expression_listContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_grouping_sets_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2300);
			switch ( getInterpreter().adaptivePredict(_input,326,_ctx) ) {
			case 1:
				{
				setState(2293);
				match(LPAREN);
				setState(2294);
				match(RPAREN);
				}
				break;
			case 2:
				{
				setState(2295);
				match(LPAREN);
				setState(2296);
				sql_expressions();
				setState(2297);
				match(RPAREN);
				}
				break;
			case 3:
				{
				setState(2299);
				sql_expression();
				}
				break;
			}
			setState(2314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2302);
				match(COMMA);
				setState(2310);
				switch ( getInterpreter().adaptivePredict(_input,327,_ctx) ) {
				case 1:
					{
					setState(2303);
					match(LPAREN);
					setState(2304);
					match(RPAREN);
					}
					break;
				case 2:
					{
					setState(2305);
					match(LPAREN);
					setState(2306);
					sql_expressions();
					setState(2307);
					match(RPAREN);
					}
					break;
				case 3:
					{
					setState(2309);
					sql_expression();
					}
					break;
				}
				}
				}
				setState(2316);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Grouping_expression_listContext extends ParserRuleContext {
		public List<Expression_listContext> expression_list() {
			return getRuleContexts(Expression_listContext.class);
		}
		public Expression_listContext expression_list(int i) {
			return getRuleContext(Expression_listContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OracleSqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleSqlParser.COMMA, i);
		}
		public Grouping_expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grouping_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterGrouping_expression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitGrouping_expression_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitGrouping_expression_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Grouping_expression_listContext grouping_expression_list() throws RecognitionException {
		Grouping_expression_listContext _localctx = new Grouping_expression_listContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_grouping_expression_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2317);
			expression_list();
			setState(2322);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,329,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2318);
					match(COMMA);
					setState(2319);
					expression_list();
					}
					} 
				}
				setState(2324);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,329,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression_listContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(OracleSqlParser.LPAREN, 0); }
		public Sql_expressionsContext sql_expressions() {
			return getRuleContext(Sql_expressionsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(OracleSqlParser.RPAREN, 0); }
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterExpression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitExpression_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitExpression_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		Expression_listContext _localctx = new Expression_listContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_expression_list);
		try {
			setState(2330);
			switch ( getInterpreter().adaptivePredict(_input,330,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2325);
				match(LPAREN);
				setState(2326);
				sql_expressions();
				setState(2327);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2329);
				sql_expressions();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cell_referenceContext extends ParserRuleContext {
		public Sql_identifierContext sql_identifier() {
			return getRuleContext(Sql_identifierContext.class,0);
		}
		public Cell_referenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cell_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterCell_reference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitCell_reference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitCell_reference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cell_referenceContext cell_reference() throws RecognitionException {
		Cell_referenceContext _localctx = new Cell_referenceContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_cell_reference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2332);
			sql_identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Condition_parenContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(OracleSqlParser.LPAREN, 0); }
		public Sql_conditionContext sql_condition() {
			return getRuleContext(Sql_conditionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(OracleSqlParser.RPAREN, 0); }
		public Condition_parenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_paren; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterCondition_paren(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitCondition_paren(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitCondition_paren(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_parenContext condition_paren() throws RecognitionException {
		Condition_parenContext _localctx = new Condition_parenContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_condition_paren);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2334);
			match(LPAREN);
			setState(2335);
			sql_condition();
			setState(2336);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Model_clauseContext extends ParserRuleContext {
		public TerminalNode MODEL() { return getToken(OracleSqlParser.MODEL, 0); }
		public Main_modelContext main_model() {
			return getRuleContext(Main_modelContext.class,0);
		}
		public Return_rows_clauseContext return_rows_clause() {
			return getRuleContext(Return_rows_clauseContext.class,0);
		}
		public List<Reference_modelContext> reference_model() {
			return getRuleContexts(Reference_modelContext.class);
		}
		public Reference_modelContext reference_model(int i) {
			return getRuleContext(Reference_modelContext.class,i);
		}
		public Model_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_model_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterModel_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitModel_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitModel_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Model_clauseContext model_clause() throws RecognitionException {
		Model_clauseContext _localctx = new Model_clauseContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_model_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2338);
			match(MODEL);
			setState(2339);
			main_model();
			setState(2341);
			switch ( getInterpreter().adaptivePredict(_input,331,_ctx) ) {
			case 1:
				{
				setState(2340);
				return_rows_clause();
				}
				break;
			}
			setState(2346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==REFERENCE) {
				{
				{
				setState(2343);
				reference_model();
				}
				}
				setState(2348);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cell_reference_optionsContext extends ParserRuleContext {
		public TerminalNode NAV() { return getToken(OracleSqlParser.NAV, 0); }
		public TerminalNode UNIQUE() { return getToken(OracleSqlParser.UNIQUE, 0); }
		public TerminalNode IGNORE() { return getToken(OracleSqlParser.IGNORE, 0); }
		public TerminalNode KEEP() { return getToken(OracleSqlParser.KEEP, 0); }
		public TerminalNode DIMENSION() { return getToken(OracleSqlParser.DIMENSION, 0); }
		public TerminalNode SINGLE() { return getToken(OracleSqlParser.SINGLE, 0); }
		public TerminalNode REFERENCE() { return getToken(OracleSqlParser.REFERENCE, 0); }
		public Cell_reference_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cell_reference_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterCell_reference_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitCell_reference_options(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitCell_reference_options(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cell_reference_optionsContext cell_reference_options() throws RecognitionException {
		Cell_reference_optionsContext _localctx = new Cell_reference_optionsContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_cell_reference_options);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2351);
			switch ( getInterpreter().adaptivePredict(_input,333,_ctx) ) {
			case 1:
				{
				setState(2349);
				_la = _input.LA(1);
				if ( !(_la==IGNORE || _la==KEEP) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(2350);
				match(NAV);
				}
				break;
			}
			setState(2359);
			_la = _input.LA(1);
			if (_la==UNIQUE) {
				{
				setState(2353);
				match(UNIQUE);
				setState(2357);
				switch (_input.LA(1)) {
				case DIMENSION:
					{
					setState(2354);
					match(DIMENSION);
					}
					break;
				case SINGLE:
					{
					setState(2355);
					match(SINGLE);
					setState(2356);
					match(REFERENCE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_rows_clauseContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(OracleSqlParser.RETURN, 0); }
		public TerminalNode ROWS() { return getToken(OracleSqlParser.ROWS, 0); }
		public TerminalNode UPDATED() { return getToken(OracleSqlParser.UPDATED, 0); }
		public TerminalNode ALL() { return getToken(OracleSqlParser.ALL, 0); }
		public Return_rows_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_rows_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterReturn_rows_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitReturn_rows_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitReturn_rows_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_rows_clauseContext return_rows_clause() throws RecognitionException {
		Return_rows_clauseContext _localctx = new Return_rows_clauseContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_return_rows_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2361);
			match(RETURN);
			setState(2362);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==UPDATED) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(2363);
			match(ROWS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Reference_modelContext extends ParserRuleContext {
		public TerminalNode REFERENCE() { return getToken(OracleSqlParser.REFERENCE, 0); }
		public Reference_model_nameContext reference_model_name() {
			return getRuleContext(Reference_model_nameContext.class,0);
		}
		public TerminalNode ON() { return getToken(OracleSqlParser.ON, 0); }
		public TerminalNode LPAREN() { return getToken(OracleSqlParser.LPAREN, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(OracleSqlParser.RPAREN, 0); }
		public Model_column_clausesContext model_column_clauses() {
			return getRuleContext(Model_column_clausesContext.class,0);
		}
		public Cell_reference_optionsContext cell_reference_options() {
			return getRuleContext(Cell_reference_optionsContext.class,0);
		}
		public Reference_modelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference_model; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterReference_model(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitReference_model(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitReference_model(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Reference_modelContext reference_model() throws RecognitionException {
		Reference_modelContext _localctx = new Reference_modelContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_reference_model);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2365);
			match(REFERENCE);
			setState(2366);
			reference_model_name();
			setState(2367);
			match(ON);
			setState(2368);
			match(LPAREN);
			setState(2369);
			subquery();
			setState(2370);
			match(RPAREN);
			setState(2371);
			model_column_clauses();
			{
			setState(2372);
			cell_reference_options();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Reference_model_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Reference_model_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference_model_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterReference_model_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitReference_model_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitReference_model_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Reference_model_nameContext reference_model_name() throws RecognitionException {
		Reference_model_nameContext _localctx = new Reference_model_nameContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_reference_model_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2374);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Main_modelContext extends ParserRuleContext {
		public Model_column_clausesContext model_column_clauses() {
			return getRuleContext(Model_column_clausesContext.class,0);
		}
		public Model_rules_clauseContext model_rules_clause() {
			return getRuleContext(Model_rules_clauseContext.class,0);
		}
		public Cell_reference_optionsContext cell_reference_options() {
			return getRuleContext(Cell_reference_optionsContext.class,0);
		}
		public TerminalNode MAIN() { return getToken(OracleSqlParser.MAIN, 0); }
		public Main_model_nameContext main_model_name() {
			return getRuleContext(Main_model_nameContext.class,0);
		}
		public Main_modelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_model; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterMain_model(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitMain_model(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitMain_model(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Main_modelContext main_model() throws RecognitionException {
		Main_modelContext _localctx = new Main_modelContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_main_model);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2378);
			_la = _input.LA(1);
			if (_la==MAIN) {
				{
				setState(2376);
				match(MAIN);
				setState(2377);
				main_model_name();
				}
			}

			setState(2380);
			model_column_clauses();
			{
			setState(2381);
			cell_reference_options();
			}
			setState(2382);
			model_rules_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Main_model_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Main_model_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_model_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterMain_model_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitMain_model_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitMain_model_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Main_model_nameContext main_model_name() throws RecognitionException {
		Main_model_nameContext _localctx = new Main_model_nameContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_main_model_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2384);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Model_column_clausesContext extends ParserRuleContext {
		public TerminalNode DIMENSION() { return getToken(OracleSqlParser.DIMENSION, 0); }
		public TerminalNode BY() { return getToken(OracleSqlParser.BY, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(OracleSqlParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(OracleSqlParser.LPAREN, i);
		}
		public List<Model_columnsContext> model_columns() {
			return getRuleContexts(Model_columnsContext.class);
		}
		public Model_columnsContext model_columns(int i) {
			return getRuleContext(Model_columnsContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(OracleSqlParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(OracleSqlParser.RPAREN, i);
		}
		public TerminalNode MEASURES() { return getToken(OracleSqlParser.MEASURES, 0); }
		public Query_partition_clauseContext query_partition_clause() {
			return getRuleContext(Query_partition_clauseContext.class,0);
		}
		public Column_specContext column_spec() {
			return getRuleContext(Column_specContext.class,0);
		}
		public Model_column_clausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_model_column_clauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterModel_column_clauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitModel_column_clauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitModel_column_clauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Model_column_clausesContext model_column_clauses() throws RecognitionException {
		Model_column_clausesContext _localctx = new Model_column_clausesContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_model_column_clauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2390);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(2386);
				query_partition_clause();
				setState(2388);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCESS) | (1L << LEVEL) | (1L << NULL) | (1L << ROWID) | (1L << ROWNUM))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (SYSDATE - 69)) | (1L << (USER - 69)) | (1L << (COUNT - 69)) | (1L << (CYCLE - 69)))) != 0) || ((((_la - 203)) & ~0x3f) == 0 && ((1L << (_la - 203)) & ((1L << (SQL - 203)) | (1L << (TIME - 203)) | (1L << (TYPE - 203)) | (1L << (VALUE - 203)) | (1L << (YEAR - 203)) | (1L << (QUOTED_STRING - 203)) | (1L << (BINDVAR - 203)) | (1L << (ID - 203)) | (1L << (COLON - 203)))) != 0)) {
					{
					setState(2387);
					column_spec();
					}
				}

				}
			}

			setState(2392);
			match(DIMENSION);
			setState(2393);
			match(BY);
			setState(2394);
			match(LPAREN);
			setState(2395);
			model_columns();
			setState(2396);
			match(RPAREN);
			setState(2397);
			match(MEASURES);
			setState(2398);
			match(LPAREN);
			setState(2399);
			model_columns();
			setState(2400);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Model_columnsContext extends ParserRuleContext {
		public List<Model_columnContext> model_column() {
			return getRuleContexts(Model_columnContext.class);
		}
		public Model_columnContext model_column(int i) {
			return getRuleContext(Model_columnContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OracleSqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleSqlParser.COMMA, i);
		}
		public Model_columnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_model_columns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterModel_columns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitModel_columns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitModel_columns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Model_columnsContext model_columns() throws RecognitionException {
		Model_columnsContext _localctx = new Model_columnsContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_model_columns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2402);
			model_column();
			setState(2407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2403);
				match(COMMA);
				setState(2404);
				model_column();
				}
				}
				setState(2409);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Model_columnContext extends ParserRuleContext {
		public Sql_expressionContext sql_expression() {
			return getRuleContext(Sql_expressionContext.class,0);
		}
		public Column_specContext column_spec() {
			return getRuleContext(Column_specContext.class,0);
		}
		public TerminalNode AS() { return getToken(OracleSqlParser.AS, 0); }
		public Model_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_model_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterModel_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitModel_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitModel_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Model_columnContext model_column() throws RecognitionException {
		Model_columnContext _localctx = new Model_columnContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_model_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2410);
			sql_expression();
			setState(2415);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCESS) | (1L << AS) | (1L << LEVEL) | (1L << NULL) | (1L << ROWID) | (1L << ROWNUM))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (SYSDATE - 69)) | (1L << (USER - 69)) | (1L << (COUNT - 69)) | (1L << (CYCLE - 69)))) != 0) || ((((_la - 203)) & ~0x3f) == 0 && ((1L << (_la - 203)) & ((1L << (SQL - 203)) | (1L << (TIME - 203)) | (1L << (TYPE - 203)) | (1L << (VALUE - 203)) | (1L << (YEAR - 203)) | (1L << (QUOTED_STRING - 203)) | (1L << (BINDVAR - 203)) | (1L << (ID - 203)) | (1L << (COLON - 203)))) != 0)) {
				{
				setState(2412);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(2411);
					match(AS);
					}
				}

				setState(2414);
				column_spec();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Model_rules_clauseContext extends ParserRuleContext {
		public List<TerminalNode> LPAREN() { return getTokens(OracleSqlParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(OracleSqlParser.LPAREN, i);
		}
		public Model_rules_exprsContext model_rules_exprs() {
			return getRuleContext(Model_rules_exprsContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(OracleSqlParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(OracleSqlParser.RPAREN, i);
		}
		public TerminalNode RULES() { return getToken(OracleSqlParser.RULES, 0); }
		public TerminalNode ITERATE() { return getToken(OracleSqlParser.ITERATE, 0); }
		public TerminalNode NUMBER() { return getToken(OracleSqlParser.NUMBER, 0); }
		public TerminalNode UPDATE() { return getToken(OracleSqlParser.UPDATE, 0); }
		public TerminalNode UPSERT() { return getToken(OracleSqlParser.UPSERT, 0); }
		public TerminalNode ORDER() { return getToken(OracleSqlParser.ORDER, 0); }
		public TerminalNode UNTIL() { return getToken(OracleSqlParser.UNTIL, 0); }
		public Sql_conditionContext sql_condition() {
			return getRuleContext(Sql_conditionContext.class,0);
		}
		public TerminalNode AUTOMATIC() { return getToken(OracleSqlParser.AUTOMATIC, 0); }
		public TerminalNode SEQUENTIAL() { return getToken(OracleSqlParser.SEQUENTIAL, 0); }
		public TerminalNode ALL() { return getToken(OracleSqlParser.ALL, 0); }
		public Model_rules_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_model_rules_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterModel_rules_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitModel_rules_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitModel_rules_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Model_rules_clauseContext model_rules_clause() throws RecognitionException {
		Model_rules_clauseContext _localctx = new Model_rules_clauseContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_model_rules_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2429);
			_la = _input.LA(1);
			if (_la==RULES) {
				{
				setState(2417);
				match(RULES);
				setState(2423);
				switch (_input.LA(1)) {
				case UPDATE:
					{
					setState(2418);
					match(UPDATE);
					}
					break;
				case UPSERT:
					{
					setState(2419);
					match(UPSERT);
					setState(2421);
					_la = _input.LA(1);
					if (_la==ALL) {
						{
						setState(2420);
						match(ALL);
						}
					}

					}
					break;
				case AUTOMATIC:
				case ITERATE:
				case SEQUENTIAL:
				case LPAREN:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2427);
				_la = _input.LA(1);
				if (_la==AUTOMATIC || _la==SEQUENTIAL) {
					{
					setState(2425);
					_la = _input.LA(1);
					if ( !(_la==AUTOMATIC || _la==SEQUENTIAL) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(2426);
					match(ORDER);
					}
				}

				}
			}

			setState(2442);
			_la = _input.LA(1);
			if (_la==ITERATE) {
				{
				setState(2431);
				match(ITERATE);
				setState(2432);
				match(LPAREN);
				setState(2433);
				match(NUMBER);
				setState(2434);
				match(RPAREN);
				setState(2440);
				_la = _input.LA(1);
				if (_la==UNTIL) {
					{
					setState(2435);
					match(UNTIL);
					setState(2436);
					match(LPAREN);
					setState(2437);
					sql_condition();
					setState(2438);
					match(RPAREN);
					}
				}

				}
			}

			setState(2444);
			match(LPAREN);
			setState(2445);
			model_rules_exprs();
			setState(2446);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Model_rules_exprsContext extends ParserRuleContext {
		public List<Model_rules_exprContext> model_rules_expr() {
			return getRuleContexts(Model_rules_exprContext.class);
		}
		public Model_rules_exprContext model_rules_expr(int i) {
			return getRuleContext(Model_rules_exprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OracleSqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleSqlParser.COMMA, i);
		}
		public Model_rules_exprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_model_rules_exprs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterModel_rules_exprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitModel_rules_exprs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitModel_rules_exprs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Model_rules_exprsContext model_rules_exprs() throws RecognitionException {
		Model_rules_exprsContext _localctx = new Model_rules_exprsContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_model_rules_exprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2448);
			model_rules_expr();
			setState(2453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2449);
				match(COMMA);
				setState(2450);
				model_rules_expr();
				}
				}
				setState(2455);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Model_rules_exprContext extends ParserRuleContext {
		public Cell_assignmentContext cell_assignment() {
			return getRuleContext(Cell_assignmentContext.class,0);
		}
		public TerminalNode EQ() { return getToken(OracleSqlParser.EQ, 0); }
		public Sql_expressionContext sql_expression() {
			return getRuleContext(Sql_expressionContext.class,0);
		}
		public TerminalNode UPDATE() { return getToken(OracleSqlParser.UPDATE, 0); }
		public TerminalNode UPSERT() { return getToken(OracleSqlParser.UPSERT, 0); }
		public Order_by_clauseContext order_by_clause() {
			return getRuleContext(Order_by_clauseContext.class,0);
		}
		public TerminalNode ALL() { return getToken(OracleSqlParser.ALL, 0); }
		public Model_rules_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_model_rules_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterModel_rules_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitModel_rules_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitModel_rules_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Model_rules_exprContext model_rules_expr() throws RecognitionException {
		Model_rules_exprContext _localctx = new Model_rules_exprContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_model_rules_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2461);
			switch (_input.LA(1)) {
			case UPDATE:
				{
				setState(2456);
				match(UPDATE);
				}
				break;
			case UPSERT:
				{
				setState(2457);
				match(UPSERT);
				setState(2459);
				_la = _input.LA(1);
				if (_la==ALL) {
					{
					setState(2458);
					match(ALL);
					}
				}

				}
				break;
			case ACCESS:
			case ROWID:
			case ROWNUM:
			case COUNT:
			case CYCLE:
			case SQL:
			case TIME:
			case TYPE:
			case VALUE:
			case YEAR:
			case QUOTED_STRING:
			case ID:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2463);
			cell_assignment();
			setState(2465);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(2464);
				order_by_clause();
				}
			}

			setState(2467);
			match(EQ);
			setState(2468);
			sql_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cell_assignmentContext extends ParserRuleContext {
		public Measure_columnContext measure_column() {
			return getRuleContext(Measure_columnContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(OracleSqlParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(OracleSqlParser.RBRACK, 0); }
		public Multi_column_for_loopContext multi_column_for_loop() {
			return getRuleContext(Multi_column_for_loopContext.class,0);
		}
		public Cell_assignment_exprsContext cell_assignment_exprs() {
			return getRuleContext(Cell_assignment_exprsContext.class,0);
		}
		public Cell_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cell_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterCell_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitCell_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitCell_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cell_assignmentContext cell_assignment() throws RecognitionException {
		Cell_assignmentContext _localctx = new Cell_assignmentContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_cell_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2470);
			measure_column();
			setState(2471);
			match(LBRACK);
			setState(2474);
			switch ( getInterpreter().adaptivePredict(_input,352,_ctx) ) {
			case 1:
				{
				setState(2472);
				multi_column_for_loop();
				}
				break;
			case 2:
				{
				setState(2473);
				cell_assignment_exprs();
				}
				break;
			}
			setState(2476);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cell_assignment_exprsContext extends ParserRuleContext {
		public List<Cell_assignment_exprContext> cell_assignment_expr() {
			return getRuleContexts(Cell_assignment_exprContext.class);
		}
		public Cell_assignment_exprContext cell_assignment_expr(int i) {
			return getRuleContext(Cell_assignment_exprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OracleSqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleSqlParser.COMMA, i);
		}
		public Cell_assignment_exprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cell_assignment_exprs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterCell_assignment_exprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitCell_assignment_exprs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitCell_assignment_exprs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cell_assignment_exprsContext cell_assignment_exprs() throws RecognitionException {
		Cell_assignment_exprsContext _localctx = new Cell_assignment_exprsContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_cell_assignment_exprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2478);
			cell_assignment_expr();
			setState(2483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2479);
				match(COMMA);
				setState(2480);
				cell_assignment_expr();
				}
				}
				setState(2485);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cell_assignment_exprContext extends ParserRuleContext {
		public Sql_conditionContext sql_condition() {
			return getRuleContext(Sql_conditionContext.class,0);
		}
		public Sql_expressionContext sql_expression() {
			return getRuleContext(Sql_expressionContext.class,0);
		}
		public Single_column_for_loopContext single_column_for_loop() {
			return getRuleContext(Single_column_for_loopContext.class,0);
		}
		public Cell_assignment_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cell_assignment_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterCell_assignment_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitCell_assignment_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitCell_assignment_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cell_assignment_exprContext cell_assignment_expr() throws RecognitionException {
		Cell_assignment_exprContext _localctx = new Cell_assignment_exprContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_cell_assignment_expr);
		try {
			setState(2489);
			switch ( getInterpreter().adaptivePredict(_input,354,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2486);
				sql_condition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2487);
				sql_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2488);
				single_column_for_loop();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Measure_columnContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Measure_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_measure_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterMeasure_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitMeasure_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitMeasure_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Measure_columnContext measure_column() throws RecognitionException {
		Measure_columnContext _localctx = new Measure_columnContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_measure_column);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2491);
			column_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Single_column_for_loopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(OracleSqlParser.FOR, 0); }
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode IN() { return getToken(OracleSqlParser.IN, 0); }
		public TerminalNode LPAREN() { return getToken(OracleSqlParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(OracleSqlParser.RPAREN, 0); }
		public TerminalNode FROM() { return getToken(OracleSqlParser.FROM, 0); }
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public TerminalNode TO() { return getToken(OracleSqlParser.TO, 0); }
		public TerminalNode INCREMENT() { return getToken(OracleSqlParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(OracleSqlParser.DECREMENT, 0); }
		public LiteralsContext literals() {
			return getRuleContext(LiteralsContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(OracleSqlParser.LIKE, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public Single_column_for_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_column_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterSingle_column_for_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitSingle_column_for_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitSingle_column_for_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_column_for_loopContext single_column_for_loop() throws RecognitionException {
		Single_column_for_loopContext _localctx = new Single_column_for_loopContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_single_column_for_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2493);
			match(FOR);
			setState(2494);
			column_name();
			setState(2514);
			switch (_input.LA(1)) {
			case IN:
				{
				setState(2495);
				match(IN);
				setState(2496);
				match(LPAREN);
				setState(2499);
				switch (_input.LA(1)) {
				case QUOTED_STRING:
				case PLUS:
				case MINUS:
				case NUMBER:
					{
					setState(2497);
					literals();
					}
					break;
				case LPAREN:
					{
					setState(2498);
					subquery();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2501);
				match(RPAREN);
				}
				break;
			case FROM:
			case LIKE:
				{
				setState(2505);
				_la = _input.LA(1);
				if (_la==LIKE) {
					{
					setState(2503);
					match(LIKE);
					setState(2504);
					pattern();
					}
				}

				setState(2507);
				match(FROM);
				setState(2508);
				literal();
				setState(2509);
				match(TO);
				setState(2510);
				literal();
				setState(2511);
				_la = _input.LA(1);
				if ( !(_la==INCREMENT || _la==DECREMENT) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(2512);
				literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatternContext extends ParserRuleContext {
		public Quoted_stringContext quoted_string() {
			return getRuleContext(Quoted_stringContext.class,0);
		}
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2516);
			quoted_string();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(OracleSqlParser.NUMBER, 0); }
		public TerminalNode PLUS() { return getToken(OracleSqlParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(OracleSqlParser.MINUS, 0); }
		public Quoted_stringContext quoted_string() {
			return getRuleContext(Quoted_stringContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_literal);
		int _la;
		try {
			setState(2523);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2519);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(2518);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(2521);
				match(NUMBER);
				}
				break;
			case QUOTED_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(2522);
				quoted_string();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralsContext extends ParserRuleContext {
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OracleSqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleSqlParser.COMMA, i);
		}
		public LiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterLiterals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitLiterals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralsContext literals() throws RecognitionException {
		LiteralsContext _localctx = new LiteralsContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_literals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2525);
			literal();
			setState(2530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2526);
				match(COMMA);
				setState(2527);
				literal();
				}
				}
				setState(2532);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Multi_column_for_loopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(OracleSqlParser.FOR, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(OracleSqlParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(OracleSqlParser.LPAREN, i);
		}
		public Column_specsContext column_specs() {
			return getRuleContext(Column_specsContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(OracleSqlParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(OracleSqlParser.RPAREN, i);
		}
		public TerminalNode IN() { return getToken(OracleSqlParser.IN, 0); }
		public Bracket_literals_listContext bracket_literals_list() {
			return getRuleContext(Bracket_literals_listContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public Multi_column_for_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multi_column_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterMulti_column_for_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitMulti_column_for_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitMulti_column_for_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multi_column_for_loopContext multi_column_for_loop() throws RecognitionException {
		Multi_column_for_loopContext _localctx = new Multi_column_for_loopContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_multi_column_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2533);
			match(FOR);
			setState(2534);
			match(LPAREN);
			setState(2535);
			column_specs();
			setState(2536);
			match(RPAREN);
			setState(2537);
			match(IN);
			setState(2538);
			match(LPAREN);
			setState(2541);
			switch ( getInterpreter().adaptivePredict(_input,361,_ctx) ) {
			case 1:
				{
				setState(2539);
				bracket_literals_list();
				}
				break;
			case 2:
				{
				setState(2540);
				subquery();
				}
				break;
			}
			setState(2543);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bracket_literalsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(OracleSqlParser.LPAREN, 0); }
		public LiteralsContext literals() {
			return getRuleContext(LiteralsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(OracleSqlParser.RPAREN, 0); }
		public Bracket_literalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracket_literals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterBracket_literals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitBracket_literals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitBracket_literals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bracket_literalsContext bracket_literals() throws RecognitionException {
		Bracket_literalsContext _localctx = new Bracket_literalsContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_bracket_literals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2545);
			match(LPAREN);
			setState(2546);
			literals();
			setState(2547);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bracket_literals_listContext extends ParserRuleContext {
		public List<Bracket_literalsContext> bracket_literals() {
			return getRuleContexts(Bracket_literalsContext.class);
		}
		public Bracket_literalsContext bracket_literals(int i) {
			return getRuleContext(Bracket_literalsContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OracleSqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleSqlParser.COMMA, i);
		}
		public Bracket_literals_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracket_literals_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterBracket_literals_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitBracket_literals_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitBracket_literals_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bracket_literals_listContext bracket_literals_list() throws RecognitionException {
		Bracket_literals_listContext _localctx = new Bracket_literals_listContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_bracket_literals_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2549);
			bracket_literals();
			setState(2554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2550);
				match(COMMA);
				setState(2551);
				bracket_literals();
				}
				}
				setState(2556);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Union_clauseContext extends ParserRuleContext {
		public TerminalNode UNION() { return getToken(OracleSqlParser.UNION, 0); }
		public TerminalNode INTERSECT() { return getToken(OracleSqlParser.INTERSECT, 0); }
		public TerminalNode MINUS2() { return getToken(OracleSqlParser.MINUS2, 0); }
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode ALL() { return getToken(OracleSqlParser.ALL, 0); }
		public Union_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterUnion_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitUnion_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitUnion_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Union_clauseContext union_clause() throws RecognitionException {
		Union_clauseContext _localctx = new Union_clauseContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_union_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2563);
			switch (_input.LA(1)) {
			case UNION:
				{
				setState(2557);
				match(UNION);
				setState(2559);
				_la = _input.LA(1);
				if (_la==ALL) {
					{
					setState(2558);
					match(ALL);
					}
				}

				}
				break;
			case INTERSECT:
				{
				setState(2561);
				match(INTERSECT);
				}
				break;
			case MINUS2:
				{
				setState(2562);
				match(MINUS2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2567);
			switch ( getInterpreter().adaptivePredict(_input,365,_ctx) ) {
			case 1:
				{
				setState(2565);
				select_statement();
				}
				break;
			case 2:
				{
				setState(2566);
				subquery();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Order_by_clauseContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(OracleSqlParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(OracleSqlParser.BY, 0); }
		public Order_by_clause_part_firstContext order_by_clause_part_first() {
			return getRuleContext(Order_by_clause_part_firstContext.class,0);
		}
		public TerminalNode SIBLINGS() { return getToken(OracleSqlParser.SIBLINGS, 0); }
		public List<Order_by_clause_part_nextContext> order_by_clause_part_next() {
			return getRuleContexts(Order_by_clause_part_nextContext.class);
		}
		public Order_by_clause_part_nextContext order_by_clause_part_next(int i) {
			return getRuleContext(Order_by_clause_part_nextContext.class,i);
		}
		public Order_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterOrder_by_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitOrder_by_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitOrder_by_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Order_by_clauseContext order_by_clause() throws RecognitionException {
		Order_by_clauseContext _localctx = new Order_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_order_by_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2569);
			match(ORDER);
			setState(2571);
			_la = _input.LA(1);
			if (_la==SIBLINGS) {
				{
				setState(2570);
				match(SIBLINGS);
				}
			}

			setState(2573);
			match(BY);
			setState(2574);
			order_by_clause_part_first();
			setState(2578);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,367,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2575);
					order_by_clause_part_next();
					}
					} 
				}
				setState(2580);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,367,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Order_by_clause_part_firstContext extends ParserRuleContext {
		public Sql_expressionContext sql_expression() {
			return getRuleContext(Sql_expressionContext.class,0);
		}
		public TerminalNode ASC() { return getToken(OracleSqlParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(OracleSqlParser.DESC, 0); }
		public List<TerminalNode> NULLS() { return getTokens(OracleSqlParser.NULLS); }
		public TerminalNode NULLS(int i) {
			return getToken(OracleSqlParser.NULLS, i);
		}
		public TerminalNode FIRST() { return getToken(OracleSqlParser.FIRST, 0); }
		public TerminalNode LAST() { return getToken(OracleSqlParser.LAST, 0); }
		public Order_by_clause_part_firstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_clause_part_first; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterOrder_by_clause_part_first(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitOrder_by_clause_part_first(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitOrder_by_clause_part_first(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Order_by_clause_part_firstContext order_by_clause_part_first() throws RecognitionException {
		Order_by_clause_part_firstContext _localctx = new Order_by_clause_part_firstContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_order_by_clause_part_first);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2581);
			sql_expression();
			setState(2583);
			switch ( getInterpreter().adaptivePredict(_input,368,_ctx) ) {
			case 1:
				{
				setState(2582);
				match(ASC);
				}
				break;
			}
			setState(2586);
			switch ( getInterpreter().adaptivePredict(_input,369,_ctx) ) {
			case 1:
				{
				setState(2585);
				match(DESC);
				}
				break;
			}
			setState(2590);
			switch ( getInterpreter().adaptivePredict(_input,370,_ctx) ) {
			case 1:
				{
				setState(2588);
				match(NULLS);
				setState(2589);
				match(FIRST);
				}
				break;
			}
			setState(2594);
			switch ( getInterpreter().adaptivePredict(_input,371,_ctx) ) {
			case 1:
				{
				setState(2592);
				match(NULLS);
				setState(2593);
				match(LAST);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Order_by_clause_part_nextContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(OracleSqlParser.COMMA, 0); }
		public Sql_expressionContext sql_expression() {
			return getRuleContext(Sql_expressionContext.class,0);
		}
		public TerminalNode ASC() { return getToken(OracleSqlParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(OracleSqlParser.DESC, 0); }
		public List<TerminalNode> NULLS() { return getTokens(OracleSqlParser.NULLS); }
		public TerminalNode NULLS(int i) {
			return getToken(OracleSqlParser.NULLS, i);
		}
		public TerminalNode FIRST() { return getToken(OracleSqlParser.FIRST, 0); }
		public TerminalNode LAST() { return getToken(OracleSqlParser.LAST, 0); }
		public Order_by_clause_part_nextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_clause_part_next; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterOrder_by_clause_part_next(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitOrder_by_clause_part_next(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitOrder_by_clause_part_next(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Order_by_clause_part_nextContext order_by_clause_part_next() throws RecognitionException {
		Order_by_clause_part_nextContext _localctx = new Order_by_clause_part_nextContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_order_by_clause_part_next);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2596);
			match(COMMA);
			setState(2597);
			sql_expression();
			setState(2599);
			switch ( getInterpreter().adaptivePredict(_input,372,_ctx) ) {
			case 1:
				{
				setState(2598);
				match(ASC);
				}
				break;
			}
			setState(2602);
			switch ( getInterpreter().adaptivePredict(_input,373,_ctx) ) {
			case 1:
				{
				setState(2601);
				match(DESC);
				}
				break;
			}
			setState(2606);
			switch ( getInterpreter().adaptivePredict(_input,374,_ctx) ) {
			case 1:
				{
				setState(2604);
				match(NULLS);
				setState(2605);
				match(FIRST);
				}
				break;
			}
			setState(2610);
			switch ( getInterpreter().adaptivePredict(_input,375,_ctx) ) {
			case 1:
				{
				setState(2608);
				match(NULLS);
				setState(2609);
				match(LAST);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Analytic_function_nameContext extends ParserRuleContext {
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public Analytic_function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_analytic_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterAnalytic_function_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitAnalytic_function_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitAnalytic_function_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Analytic_function_nameContext analytic_function_name() throws RecognitionException {
		Analytic_function_nameContext _localctx = new Analytic_function_nameContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_analytic_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2612);
			function_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Analytic_function_callContext extends ParserRuleContext {
		public Analytic_function_nameContext analytic_function_name() {
			return getRuleContext(Analytic_function_nameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(OracleSqlParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(OracleSqlParser.RPAREN, 0); }
		public List<Sql_expressionContext> sql_expression() {
			return getRuleContexts(Sql_expressionContext.class);
		}
		public Sql_expressionContext sql_expression(int i) {
			return getRuleContext(Sql_expressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OracleSqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleSqlParser.COMMA, i);
		}
		public TerminalNode NULLS() { return getToken(OracleSqlParser.NULLS, 0); }
		public TerminalNode DISTINCT() { return getToken(OracleSqlParser.DISTINCT, 0); }
		public TerminalNode UNIQUE() { return getToken(OracleSqlParser.UNIQUE, 0); }
		public TerminalNode ALL() { return getToken(OracleSqlParser.ALL, 0); }
		public TerminalNode RESPECT() { return getToken(OracleSqlParser.RESPECT, 0); }
		public TerminalNode IGNORE() { return getToken(OracleSqlParser.IGNORE, 0); }
		public Analytic_function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_analytic_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterAnalytic_function_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitAnalytic_function_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitAnalytic_function_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Analytic_function_callContext analytic_function_call() throws RecognitionException {
		Analytic_function_callContext _localctx = new Analytic_function_callContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_analytic_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2614);
			analytic_function_name();
			setState(2615);
			match(LPAREN);
			setState(2617);
			_la = _input.LA(1);
			if (_la==ALL || _la==DISTINCT || _la==UNIQUE) {
				{
				setState(2616);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==DISTINCT || _la==UNIQUE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(2620);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCESS) | (1L << CASE) | (1L << DATE) | (1L << FALSE) | (1L << LEVEL) | (1L << NULL) | (1L << PRIOR) | (1L << ROWID) | (1L << ROWNUM))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (SET - 66)) | (1L << (SYSDATE - 66)) | (1L << (TRUE - 66)) | (1L << (USER - 66)) | (1L << (CAST - 66)) | (1L << (CLUSTER_SET - 66)) | (1L << (CONNECT_BY_ROOT - 66)) | (1L << (COUNT - 66)) | (1L << (CURSOR - 66)) | (1L << (CYCLE - 66)) | (1L << (DENSE_RANK - 66)) | (1L << (EXTRACT - 66)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (INTERVAL - 131)) | (1L << (LISTAGG - 131)) | (1L << (LNNVL - 131)) | (1L << (PERCENT_RANK - 131)) | (1L << (PERCENTILE_CONT - 131)) | (1L << (PERCENTILE_DISC - 131)))) != 0) || ((((_la - 203)) & ~0x3f) == 0 && ((1L << (_la - 203)) & ((1L << (SQL - 203)) | (1L << (TIME - 203)) | (1L << (TIMESTAMP - 203)) | (1L << (TRIM - 203)) | (1L << (TYPE - 203)) | (1L << (VALUE - 203)) | (1L << (YEAR - 203)) | (1L << (QUOTED_STRING - 203)) | (1L << (BINDVAR - 203)) | (1L << (ID - 203)) | (1L << (COLON - 203)) | (1L << (LPAREN - 203)) | (1L << (PLUS - 203)) | (1L << (MINUS - 203)) | (1L << (NUMBER - 203)))) != 0)) {
				{
				setState(2619);
				sql_expression();
				}
			}

			setState(2626);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2622);
				match(COMMA);
				setState(2623);
				sql_expression();
				}
				}
				setState(2628);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2631);
			_la = _input.LA(1);
			if (_la==IGNORE || _la==RESPECT) {
				{
				setState(2629);
				_la = _input.LA(1);
				if ( !(_la==IGNORE || _la==RESPECT) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(2630);
				match(NULLS);
				}
			}

			setState(2633);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Analytic_functionContext extends ParserRuleContext {
		public Dense_rank_analyticContext dense_rank_analytic() {
			return getRuleContext(Dense_rank_analyticContext.class,0);
		}
		public Percent_rank_analyticContext percent_rank_analytic() {
			return getRuleContext(Percent_rank_analyticContext.class,0);
		}
		public Percent_cont_disc_analyticContext percent_cont_disc_analytic() {
			return getRuleContext(Percent_cont_disc_analyticContext.class,0);
		}
		public First_lastContext first_last() {
			return getRuleContext(First_lastContext.class,0);
		}
		public ListaggContext listagg() {
			return getRuleContext(ListaggContext.class,0);
		}
		public Analytic_function_callContext analytic_function_call() {
			return getRuleContext(Analytic_function_callContext.class,0);
		}
		public TerminalNode OVER() { return getToken(OracleSqlParser.OVER, 0); }
		public TerminalNode LPAREN() { return getToken(OracleSqlParser.LPAREN, 0); }
		public Analytic_clauseContext analytic_clause() {
			return getRuleContext(Analytic_clauseContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(OracleSqlParser.RPAREN, 0); }
		public TerminalNode NULLS() { return getToken(OracleSqlParser.NULLS, 0); }
		public TerminalNode RESPECT() { return getToken(OracleSqlParser.RESPECT, 0); }
		public TerminalNode IGNORE() { return getToken(OracleSqlParser.IGNORE, 0); }
		public Analytic_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_analytic_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterAnalytic_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitAnalytic_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitAnalytic_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Analytic_functionContext analytic_function() throws RecognitionException {
		Analytic_functionContext _localctx = new Analytic_functionContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_analytic_function);
		int _la;
		try {
			setState(2650);
			switch ( getInterpreter().adaptivePredict(_input,381,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2635);
				dense_rank_analytic();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2636);
				percent_rank_analytic();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2637);
				percent_cont_disc_analytic();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2638);
				first_last();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2639);
				listagg();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2640);
				analytic_function_call();
				setState(2643);
				_la = _input.LA(1);
				if (_la==IGNORE || _la==RESPECT) {
					{
					setState(2641);
					_la = _input.LA(1);
					if ( !(_la==IGNORE || _la==RESPECT) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(2642);
					match(NULLS);
					}
				}

				setState(2645);
				match(OVER);
				setState(2646);
				match(LPAREN);
				setState(2647);
				analytic_clause();
				setState(2648);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Count_functionContext extends ParserRuleContext {
		public TerminalNode COUNT() { return getToken(OracleSqlParser.COUNT, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(OracleSqlParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(OracleSqlParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(OracleSqlParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(OracleSqlParser.RPAREN, i);
		}
		public TerminalNode ASTERISK() { return getToken(OracleSqlParser.ASTERISK, 0); }
		public Sql_expressionContext sql_expression() {
			return getRuleContext(Sql_expressionContext.class,0);
		}
		public TerminalNode OVER() { return getToken(OracleSqlParser.OVER, 0); }
		public Analytic_clauseContext analytic_clause() {
			return getRuleContext(Analytic_clauseContext.class,0);
		}
		public TerminalNode DISTINCT() { return getToken(OracleSqlParser.DISTINCT, 0); }
		public TerminalNode UNIQUE() { return getToken(OracleSqlParser.UNIQUE, 0); }
		public TerminalNode ALL() { return getToken(OracleSqlParser.ALL, 0); }
		public Count_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_count_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterCount_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitCount_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitCount_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Count_functionContext count_function() throws RecognitionException {
		Count_functionContext _localctx = new Count_functionContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_count_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2652);
			match(COUNT);
			setState(2653);
			match(LPAREN);
			setState(2659);
			switch (_input.LA(1)) {
			case ASTERISK:
				{
				setState(2654);
				match(ASTERISK);
				}
				break;
			case ACCESS:
			case ALL:
			case CASE:
			case DATE:
			case DISTINCT:
			case FALSE:
			case LEVEL:
			case NULL:
			case PRIOR:
			case ROWID:
			case ROWNUM:
			case SET:
			case SYSDATE:
			case TRUE:
			case UNIQUE:
			case USER:
			case CAST:
			case CLUSTER_SET:
			case CONNECT_BY_ROOT:
			case COUNT:
			case CURSOR:
			case CYCLE:
			case DENSE_RANK:
			case EXTRACT:
			case INTERVAL:
			case LISTAGG:
			case LNNVL:
			case PERCENT_RANK:
			case PERCENTILE_CONT:
			case PERCENTILE_DISC:
			case SQL:
			case TIME:
			case TIMESTAMP:
			case TRIM:
			case TYPE:
			case VALUE:
			case YEAR:
			case QUOTED_STRING:
			case BINDVAR:
			case ID:
			case COLON:
			case LPAREN:
			case PLUS:
			case MINUS:
			case NUMBER:
				{
				setState(2656);
				_la = _input.LA(1);
				if (_la==ALL || _la==DISTINCT || _la==UNIQUE) {
					{
					setState(2655);
					_la = _input.LA(1);
					if ( !(_la==ALL || _la==DISTINCT || _la==UNIQUE) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(2658);
				sql_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2661);
			match(RPAREN);
			setState(2667);
			_la = _input.LA(1);
			if (_la==OVER) {
				{
				setState(2662);
				match(OVER);
				setState(2663);
				match(LPAREN);
				setState(2664);
				analytic_clause();
				setState(2665);
				match(RPAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Analytic_clauseContext extends ParserRuleContext {
		public Query_partition_clauseContext query_partition_clause() {
			return getRuleContext(Query_partition_clauseContext.class,0);
		}
		public Order_by_clauseContext order_by_clause() {
			return getRuleContext(Order_by_clauseContext.class,0);
		}
		public Windowing_clauseContext windowing_clause() {
			return getRuleContext(Windowing_clauseContext.class,0);
		}
		public Analytic_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_analytic_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterAnalytic_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitAnalytic_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitAnalytic_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Analytic_clauseContext analytic_clause() throws RecognitionException {
		Analytic_clauseContext _localctx = new Analytic_clauseContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_analytic_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2670);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(2669);
				query_partition_clause();
				}
			}

			setState(2676);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(2672);
				order_by_clause();
				setState(2674);
				_la = _input.LA(1);
				if (_la==ROWS || _la==RANGE) {
					{
					setState(2673);
					windowing_clause();
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Windowing_clause_partContext extends ParserRuleContext {
		public TerminalNode UNBOUNDED() { return getToken(OracleSqlParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(OracleSqlParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(OracleSqlParser.FOLLOWING, 0); }
		public TerminalNode CURRENT() { return getToken(OracleSqlParser.CURRENT, 0); }
		public TerminalNode ROW() { return getToken(OracleSqlParser.ROW, 0); }
		public Sql_expressionContext sql_expression() {
			return getRuleContext(Sql_expressionContext.class,0);
		}
		public Windowing_clause_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowing_clause_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterWindowing_clause_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitWindowing_clause_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitWindowing_clause_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Windowing_clause_partContext windowing_clause_part() throws RecognitionException {
		Windowing_clause_partContext _localctx = new Windowing_clause_partContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_windowing_clause_part);
		int _la;
		try {
			setState(2685);
			switch (_input.LA(1)) {
			case UNBOUNDED:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(2678);
				match(UNBOUNDED);
				setState(2679);
				_la = _input.LA(1);
				if ( !(_la==FOLLOWING || _la==PRECEDING) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				break;
			case CURRENT:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(2680);
				match(CURRENT);
				setState(2681);
				match(ROW);
				}
				}
				break;
			case ACCESS:
			case CASE:
			case DATE:
			case FALSE:
			case LEVEL:
			case NULL:
			case PRIOR:
			case ROWID:
			case ROWNUM:
			case SET:
			case SYSDATE:
			case TRUE:
			case USER:
			case CAST:
			case CLUSTER_SET:
			case CONNECT_BY_ROOT:
			case COUNT:
			case CURSOR:
			case CYCLE:
			case DENSE_RANK:
			case EXTRACT:
			case INTERVAL:
			case LISTAGG:
			case LNNVL:
			case PERCENT_RANK:
			case PERCENTILE_CONT:
			case PERCENTILE_DISC:
			case SQL:
			case TIME:
			case TIMESTAMP:
			case TRIM:
			case TYPE:
			case VALUE:
			case YEAR:
			case QUOTED_STRING:
			case BINDVAR:
			case ID:
			case COLON:
			case LPAREN:
			case PLUS:
			case MINUS:
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(2682);
				sql_expression();
				setState(2683);
				_la = _input.LA(1);
				if ( !(_la==FOLLOWING || _la==PRECEDING) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Windowing_clauseContext extends ParserRuleContext {
		public TerminalNode ROWS() { return getToken(OracleSqlParser.ROWS, 0); }
		public TerminalNode RANGE() { return getToken(OracleSqlParser.RANGE, 0); }
		public List<Windowing_clause_partContext> windowing_clause_part() {
			return getRuleContexts(Windowing_clause_partContext.class);
		}
		public Windowing_clause_partContext windowing_clause_part(int i) {
			return getRuleContext(Windowing_clause_partContext.class,i);
		}
		public TerminalNode BETWEEN() { return getToken(OracleSqlParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(OracleSqlParser.AND, 0); }
		public Windowing_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowing_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterWindowing_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitWindowing_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitWindowing_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Windowing_clauseContext windowing_clause() throws RecognitionException {
		Windowing_clauseContext _localctx = new Windowing_clauseContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_windowing_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2687);
			_la = _input.LA(1);
			if ( !(_la==ROWS || _la==RANGE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(2694);
			switch (_input.LA(1)) {
			case ACCESS:
			case CASE:
			case CURRENT:
			case DATE:
			case FALSE:
			case LEVEL:
			case NULL:
			case PRIOR:
			case ROWID:
			case ROWNUM:
			case SET:
			case SYSDATE:
			case TRUE:
			case USER:
			case CAST:
			case CLUSTER_SET:
			case CONNECT_BY_ROOT:
			case COUNT:
			case CURSOR:
			case CYCLE:
			case DENSE_RANK:
			case EXTRACT:
			case INTERVAL:
			case LISTAGG:
			case LNNVL:
			case PERCENT_RANK:
			case PERCENTILE_CONT:
			case PERCENTILE_DISC:
			case SQL:
			case TIME:
			case TIMESTAMP:
			case TRIM:
			case TYPE:
			case UNBOUNDED:
			case VALUE:
			case YEAR:
			case QUOTED_STRING:
			case BINDVAR:
			case ID:
			case COLON:
			case LPAREN:
			case PLUS:
			case MINUS:
			case NUMBER:
				{
				setState(2688);
				windowing_clause_part();
				}
				break;
			case BETWEEN:
				{
				{
				setState(2689);
				match(BETWEEN);
				setState(2690);
				windowing_clause_part();
				setState(2691);
				match(AND);
				setState(2692);
				windowing_clause_part();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Aggregate_function_nameContext extends ParserRuleContext {
		public TerminalNode COUNT() { return getToken(OracleSqlParser.COUNT, 0); }
		public Function_specContext function_spec() {
			return getRuleContext(Function_specContext.class,0);
		}
		public Aggregate_function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterAggregate_function_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitAggregate_function_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitAggregate_function_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aggregate_function_nameContext aggregate_function_name() throws RecognitionException {
		Aggregate_function_nameContext _localctx = new Aggregate_function_nameContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_aggregate_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2698);
			switch ( getInterpreter().adaptivePredict(_input,390,_ctx) ) {
			case 1:
				{
				setState(2696);
				match(COUNT);
				}
				break;
			case 2:
				{
				setState(2697);
				function_spec();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Aggregate_functionContext extends ParserRuleContext {
		public Dense_rank_aggregateContext dense_rank_aggregate() {
			return getRuleContext(Dense_rank_aggregateContext.class,0);
		}
		public Percent_rank_aggregateContext percent_rank_aggregate() {
			return getRuleContext(Percent_rank_aggregateContext.class,0);
		}
		public First_lastContext first_last() {
			return getRuleContext(First_lastContext.class,0);
		}
		public ListaggContext listagg() {
			return getRuleContext(ListaggContext.class,0);
		}
		public Aggregate_function_nameContext aggregate_function_name() {
			return getRuleContext(Aggregate_function_nameContext.class,0);
		}
		public List<TerminalNode> LPAREN() { return getTokens(OracleSqlParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(OracleSqlParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(OracleSqlParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(OracleSqlParser.RPAREN, i);
		}
		public TerminalNode ASTERISK() { return getToken(OracleSqlParser.ASTERISK, 0); }
		public Sql_expressionContext sql_expression() {
			return getRuleContext(Sql_expressionContext.class,0);
		}
		public TerminalNode OVER() { return getToken(OracleSqlParser.OVER, 0); }
		public Analytic_clauseContext analytic_clause() {
			return getRuleContext(Analytic_clauseContext.class,0);
		}
		public TerminalNode DISTINCT() { return getToken(OracleSqlParser.DISTINCT, 0); }
		public TerminalNode UNIQUE() { return getToken(OracleSqlParser.UNIQUE, 0); }
		public TerminalNode ALL() { return getToken(OracleSqlParser.ALL, 0); }
		public Aggregate_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterAggregate_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitAggregate_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitAggregate_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aggregate_functionContext aggregate_function() throws RecognitionException {
		Aggregate_functionContext _localctx = new Aggregate_functionContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_aggregate_function);
		int _la;
		try {
			setState(2721);
			switch ( getInterpreter().adaptivePredict(_input,394,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2700);
				dense_rank_aggregate();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2701);
				percent_rank_aggregate();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2702);
				first_last();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2703);
				listagg();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2704);
				aggregate_function_name();
				setState(2705);
				match(LPAREN);
				setState(2711);
				switch (_input.LA(1)) {
				case ASTERISK:
					{
					setState(2706);
					match(ASTERISK);
					}
					break;
				case ACCESS:
				case ALL:
				case CASE:
				case DATE:
				case DISTINCT:
				case FALSE:
				case LEVEL:
				case NULL:
				case PRIOR:
				case ROWID:
				case ROWNUM:
				case SET:
				case SYSDATE:
				case TRUE:
				case UNIQUE:
				case USER:
				case CAST:
				case CLUSTER_SET:
				case CONNECT_BY_ROOT:
				case COUNT:
				case CURSOR:
				case CYCLE:
				case DENSE_RANK:
				case EXTRACT:
				case INTERVAL:
				case LISTAGG:
				case LNNVL:
				case PERCENT_RANK:
				case PERCENTILE_CONT:
				case PERCENTILE_DISC:
				case SQL:
				case TIME:
				case TIMESTAMP:
				case TRIM:
				case TYPE:
				case VALUE:
				case YEAR:
				case QUOTED_STRING:
				case BINDVAR:
				case ID:
				case COLON:
				case LPAREN:
				case PLUS:
				case MINUS:
				case NUMBER:
					{
					setState(2708);
					_la = _input.LA(1);
					if (_la==ALL || _la==DISTINCT || _la==UNIQUE) {
						{
						setState(2707);
						_la = _input.LA(1);
						if ( !(_la==ALL || _la==DISTINCT || _la==UNIQUE) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						}
					}

					setState(2710);
					sql_expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2713);
				match(RPAREN);
				setState(2719);
				_la = _input.LA(1);
				if (_la==OVER) {
					{
					setState(2714);
					match(OVER);
					setState(2715);
					match(LPAREN);
					setState(2716);
					analytic_clause();
					setState(2717);
					match(RPAREN);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Percent_rank_aggregateContext extends ParserRuleContext {
		public TerminalNode PERCENT_RANK() { return getToken(OracleSqlParser.PERCENT_RANK, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(OracleSqlParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(OracleSqlParser.LPAREN, i);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(OracleSqlParser.RPAREN, 0); }
		public TerminalNode WITHIN() { return getToken(OracleSqlParser.WITHIN, 0); }
		public TerminalNode GROUP() { return getToken(OracleSqlParser.GROUP, 0); }
		public TerminalNode ORDER() { return getToken(OracleSqlParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(OracleSqlParser.BY, 0); }
		public List<Sql_expressionContext> sql_expression() {
			return getRuleContexts(Sql_expressionContext.class);
		}
		public Sql_expressionContext sql_expression(int i) {
			return getRuleContext(Sql_expressionContext.class,i);
		}
		public List<TerminalNode> NULLS() { return getTokens(OracleSqlParser.NULLS); }
		public TerminalNode NULLS(int i) {
			return getToken(OracleSqlParser.NULLS, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OracleSqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleSqlParser.COMMA, i);
		}
		public List<TerminalNode> ASC() { return getTokens(OracleSqlParser.ASC); }
		public TerminalNode ASC(int i) {
			return getToken(OracleSqlParser.ASC, i);
		}
		public List<TerminalNode> DESC() { return getTokens(OracleSqlParser.DESC); }
		public TerminalNode DESC(int i) {
			return getToken(OracleSqlParser.DESC, i);
		}
		public List<TerminalNode> FIRST() { return getTokens(OracleSqlParser.FIRST); }
		public TerminalNode FIRST(int i) {
			return getToken(OracleSqlParser.FIRST, i);
		}
		public List<TerminalNode> LAST() { return getTokens(OracleSqlParser.LAST); }
		public TerminalNode LAST(int i) {
			return getToken(OracleSqlParser.LAST, i);
		}
		public Percent_rank_aggregateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_percent_rank_aggregate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterPercent_rank_aggregate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitPercent_rank_aggregate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitPercent_rank_aggregate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Percent_rank_aggregateContext percent_rank_aggregate() throws RecognitionException {
		Percent_rank_aggregateContext _localctx = new Percent_rank_aggregateContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_percent_rank_aggregate);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2723);
			match(PERCENT_RANK);
			setState(2724);
			match(LPAREN);
			setState(2725);
			expression_list();
			setState(2726);
			match(RPAREN);
			setState(2727);
			match(WITHIN);
			setState(2728);
			match(GROUP);
			setState(2729);
			match(LPAREN);
			setState(2730);
			match(ORDER);
			setState(2731);
			match(BY);
			setState(2732);
			sql_expression();
			setState(2734);
			switch ( getInterpreter().adaptivePredict(_input,395,_ctx) ) {
			case 1:
				{
				setState(2733);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			}
			setState(2738);
			switch ( getInterpreter().adaptivePredict(_input,396,_ctx) ) {
			case 1:
				{
				setState(2736);
				match(NULLS);
				setState(2737);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==LAST) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			}
			setState(2751);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,399,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2740);
					match(COMMA);
					setState(2741);
					sql_expression();
					setState(2743);
					switch ( getInterpreter().adaptivePredict(_input,397,_ctx) ) {
					case 1:
						{
						setState(2742);
						_la = _input.LA(1);
						if ( !(_la==ASC || _la==DESC) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						}
						break;
					}
					setState(2747);
					switch ( getInterpreter().adaptivePredict(_input,398,_ctx) ) {
					case 1:
						{
						setState(2745);
						match(NULLS);
						setState(2746);
						_la = _input.LA(1);
						if ( !(_la==FIRST || _la==LAST) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						}
						break;
					}
					}
					} 
				}
				setState(2753);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,399,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dense_rank_aggregateContext extends ParserRuleContext {
		public TerminalNode DENSE_RANK() { return getToken(OracleSqlParser.DENSE_RANK, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(OracleSqlParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(OracleSqlParser.LPAREN, i);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(OracleSqlParser.RPAREN, 0); }
		public TerminalNode WITHIN() { return getToken(OracleSqlParser.WITHIN, 0); }
		public TerminalNode GROUP() { return getToken(OracleSqlParser.GROUP, 0); }
		public TerminalNode ORDER() { return getToken(OracleSqlParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(OracleSqlParser.BY, 0); }
		public List<Sql_expressionContext> sql_expression() {
			return getRuleContexts(Sql_expressionContext.class);
		}
		public Sql_expressionContext sql_expression(int i) {
			return getRuleContext(Sql_expressionContext.class,i);
		}
		public List<TerminalNode> NULLS() { return getTokens(OracleSqlParser.NULLS); }
		public TerminalNode NULLS(int i) {
			return getToken(OracleSqlParser.NULLS, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OracleSqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleSqlParser.COMMA, i);
		}
		public List<TerminalNode> ASC() { return getTokens(OracleSqlParser.ASC); }
		public TerminalNode ASC(int i) {
			return getToken(OracleSqlParser.ASC, i);
		}
		public List<TerminalNode> DESC() { return getTokens(OracleSqlParser.DESC); }
		public TerminalNode DESC(int i) {
			return getToken(OracleSqlParser.DESC, i);
		}
		public List<TerminalNode> FIRST() { return getTokens(OracleSqlParser.FIRST); }
		public TerminalNode FIRST(int i) {
			return getToken(OracleSqlParser.FIRST, i);
		}
		public List<TerminalNode> LAST() { return getTokens(OracleSqlParser.LAST); }
		public TerminalNode LAST(int i) {
			return getToken(OracleSqlParser.LAST, i);
		}
		public Dense_rank_aggregateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dense_rank_aggregate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterDense_rank_aggregate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitDense_rank_aggregate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitDense_rank_aggregate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dense_rank_aggregateContext dense_rank_aggregate() throws RecognitionException {
		Dense_rank_aggregateContext _localctx = new Dense_rank_aggregateContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_dense_rank_aggregate);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2754);
			match(DENSE_RANK);
			setState(2755);
			match(LPAREN);
			setState(2756);
			expression_list();
			setState(2757);
			match(RPAREN);
			setState(2758);
			match(WITHIN);
			setState(2759);
			match(GROUP);
			setState(2760);
			match(LPAREN);
			setState(2761);
			match(ORDER);
			setState(2762);
			match(BY);
			setState(2763);
			sql_expression();
			setState(2765);
			switch ( getInterpreter().adaptivePredict(_input,400,_ctx) ) {
			case 1:
				{
				setState(2764);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			}
			setState(2769);
			switch ( getInterpreter().adaptivePredict(_input,401,_ctx) ) {
			case 1:
				{
				setState(2767);
				match(NULLS);
				setState(2768);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==LAST) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			}
			setState(2782);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,404,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2771);
					match(COMMA);
					setState(2772);
					sql_expression();
					setState(2774);
					switch ( getInterpreter().adaptivePredict(_input,402,_ctx) ) {
					case 1:
						{
						setState(2773);
						_la = _input.LA(1);
						if ( !(_la==ASC || _la==DESC) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						}
						break;
					}
					setState(2778);
					switch ( getInterpreter().adaptivePredict(_input,403,_ctx) ) {
					case 1:
						{
						setState(2776);
						match(NULLS);
						setState(2777);
						_la = _input.LA(1);
						if ( !(_la==FIRST || _la==LAST) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						}
						break;
					}
					}
					} 
				}
				setState(2784);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,404,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Percent_rank_analyticContext extends ParserRuleContext {
		public TerminalNode PERCENT_RANK() { return getToken(OracleSqlParser.PERCENT_RANK, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(OracleSqlParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(OracleSqlParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(OracleSqlParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(OracleSqlParser.RPAREN, i);
		}
		public TerminalNode OVER() { return getToken(OracleSqlParser.OVER, 0); }
		public Query_partition_clauseContext query_partition_clause() {
			return getRuleContext(Query_partition_clauseContext.class,0);
		}
		public Percent_rank_analyticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_percent_rank_analytic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterPercent_rank_analytic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitPercent_rank_analytic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitPercent_rank_analytic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Percent_rank_analyticContext percent_rank_analytic() throws RecognitionException {
		Percent_rank_analyticContext _localctx = new Percent_rank_analyticContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_percent_rank_analytic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2785);
			match(PERCENT_RANK);
			setState(2786);
			match(LPAREN);
			setState(2787);
			match(RPAREN);
			setState(2788);
			match(OVER);
			setState(2789);
			match(LPAREN);
			setState(2790);
			query_partition_clause();
			setState(2791);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Percent_cont_disc_analyticContext extends ParserRuleContext {
		public List<TerminalNode> LPAREN() { return getTokens(OracleSqlParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(OracleSqlParser.LPAREN, i);
		}
		public Sql_expressionContext sql_expression() {
			return getRuleContext(Sql_expressionContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(OracleSqlParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(OracleSqlParser.RPAREN, i);
		}
		public TerminalNode WITHIN() { return getToken(OracleSqlParser.WITHIN, 0); }
		public TerminalNode GROUP() { return getToken(OracleSqlParser.GROUP, 0); }
		public Order_by_clauseContext order_by_clause() {
			return getRuleContext(Order_by_clauseContext.class,0);
		}
		public TerminalNode PERCENTILE_DISC() { return getToken(OracleSqlParser.PERCENTILE_DISC, 0); }
		public TerminalNode PERCENTILE_CONT() { return getToken(OracleSqlParser.PERCENTILE_CONT, 0); }
		public TerminalNode OVER() { return getToken(OracleSqlParser.OVER, 0); }
		public Query_partition_clauseContext query_partition_clause() {
			return getRuleContext(Query_partition_clauseContext.class,0);
		}
		public Percent_cont_disc_analyticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_percent_cont_disc_analytic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterPercent_cont_disc_analytic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitPercent_cont_disc_analytic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitPercent_cont_disc_analytic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Percent_cont_disc_analyticContext percent_cont_disc_analytic() throws RecognitionException {
		Percent_cont_disc_analyticContext _localctx = new Percent_cont_disc_analyticContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_percent_cont_disc_analytic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2793);
			_la = _input.LA(1);
			if ( !(_la==PERCENTILE_CONT || _la==PERCENTILE_DISC) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(2794);
			match(LPAREN);
			setState(2795);
			sql_expression();
			setState(2796);
			match(RPAREN);
			setState(2797);
			match(WITHIN);
			setState(2798);
			match(GROUP);
			setState(2799);
			match(LPAREN);
			setState(2800);
			order_by_clause();
			setState(2801);
			match(RPAREN);
			setState(2807);
			_la = _input.LA(1);
			if (_la==OVER) {
				{
				setState(2802);
				match(OVER);
				setState(2803);
				match(LPAREN);
				setState(2804);
				query_partition_clause();
				setState(2805);
				match(RPAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dense_rank_analyticContext extends ParserRuleContext {
		public TerminalNode DENSE_RANK() { return getToken(OracleSqlParser.DENSE_RANK, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(OracleSqlParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(OracleSqlParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(OracleSqlParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(OracleSqlParser.RPAREN, i);
		}
		public TerminalNode OVER() { return getToken(OracleSqlParser.OVER, 0); }
		public Query_partition_clauseContext query_partition_clause() {
			return getRuleContext(Query_partition_clauseContext.class,0);
		}
		public Dense_rank_analyticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dense_rank_analytic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterDense_rank_analytic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitDense_rank_analytic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitDense_rank_analytic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dense_rank_analyticContext dense_rank_analytic() throws RecognitionException {
		Dense_rank_analyticContext _localctx = new Dense_rank_analyticContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_dense_rank_analytic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2809);
			match(DENSE_RANK);
			setState(2810);
			match(LPAREN);
			setState(2811);
			match(RPAREN);
			setState(2812);
			match(OVER);
			setState(2813);
			match(LPAREN);
			setState(2814);
			query_partition_clause();
			setState(2815);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class First_lastContext extends ParserRuleContext {
		public Aggregate_function_nameContext aggregate_function_name() {
			return getRuleContext(Aggregate_function_nameContext.class,0);
		}
		public List<TerminalNode> LPAREN() { return getTokens(OracleSqlParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(OracleSqlParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(OracleSqlParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(OracleSqlParser.RPAREN, i);
		}
		public TerminalNode KEEP() { return getToken(OracleSqlParser.KEEP, 0); }
		public TerminalNode DENSE_RANK() { return getToken(OracleSqlParser.DENSE_RANK, 0); }
		public Order_by_clauseContext order_by_clause() {
			return getRuleContext(Order_by_clauseContext.class,0);
		}
		public TerminalNode FIRST() { return getToken(OracleSqlParser.FIRST, 0); }
		public TerminalNode LAST() { return getToken(OracleSqlParser.LAST, 0); }
		public TerminalNode ASTERISK() { return getToken(OracleSqlParser.ASTERISK, 0); }
		public Sql_expressionContext sql_expression() {
			return getRuleContext(Sql_expressionContext.class,0);
		}
		public TerminalNode OVER() { return getToken(OracleSqlParser.OVER, 0); }
		public Analytic_clauseContext analytic_clause() {
			return getRuleContext(Analytic_clauseContext.class,0);
		}
		public TerminalNode DISTINCT() { return getToken(OracleSqlParser.DISTINCT, 0); }
		public TerminalNode UNIQUE() { return getToken(OracleSqlParser.UNIQUE, 0); }
		public TerminalNode ALL() { return getToken(OracleSqlParser.ALL, 0); }
		public First_lastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_first_last; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterFirst_last(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitFirst_last(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitFirst_last(this);
			else return visitor.visitChildren(this);
		}
	}

	public final First_lastContext first_last() throws RecognitionException {
		First_lastContext _localctx = new First_lastContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_first_last);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2817);
			aggregate_function_name();
			setState(2818);
			match(LPAREN);
			setState(2824);
			switch (_input.LA(1)) {
			case ASTERISK:
				{
				setState(2819);
				match(ASTERISK);
				}
				break;
			case ACCESS:
			case ALL:
			case CASE:
			case DATE:
			case DISTINCT:
			case FALSE:
			case LEVEL:
			case NULL:
			case PRIOR:
			case ROWID:
			case ROWNUM:
			case SET:
			case SYSDATE:
			case TRUE:
			case UNIQUE:
			case USER:
			case CAST:
			case CLUSTER_SET:
			case CONNECT_BY_ROOT:
			case COUNT:
			case CURSOR:
			case CYCLE:
			case DENSE_RANK:
			case EXTRACT:
			case INTERVAL:
			case LISTAGG:
			case LNNVL:
			case PERCENT_RANK:
			case PERCENTILE_CONT:
			case PERCENTILE_DISC:
			case SQL:
			case TIME:
			case TIMESTAMP:
			case TRIM:
			case TYPE:
			case VALUE:
			case YEAR:
			case QUOTED_STRING:
			case BINDVAR:
			case ID:
			case COLON:
			case LPAREN:
			case PLUS:
			case MINUS:
			case NUMBER:
				{
				setState(2821);
				_la = _input.LA(1);
				if (_la==ALL || _la==DISTINCT || _la==UNIQUE) {
					{
					setState(2820);
					_la = _input.LA(1);
					if ( !(_la==ALL || _la==DISTINCT || _la==UNIQUE) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(2823);
				sql_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2826);
			match(RPAREN);
			setState(2827);
			match(KEEP);
			setState(2828);
			match(LPAREN);
			setState(2829);
			match(DENSE_RANK);
			setState(2830);
			_la = _input.LA(1);
			if ( !(_la==FIRST || _la==LAST) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(2831);
			order_by_clause();
			setState(2832);
			match(RPAREN);
			setState(2838);
			_la = _input.LA(1);
			if (_la==OVER) {
				{
				setState(2833);
				match(OVER);
				setState(2834);
				match(LPAREN);
				setState(2835);
				analytic_clause();
				setState(2836);
				match(RPAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListaggContext extends ParserRuleContext {
		public TerminalNode LISTAGG() { return getToken(OracleSqlParser.LISTAGG, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(OracleSqlParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(OracleSqlParser.LPAREN, i);
		}
		public Sql_expressionContext sql_expression() {
			return getRuleContext(Sql_expressionContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(OracleSqlParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(OracleSqlParser.RPAREN, i);
		}
		public TerminalNode WITHIN() { return getToken(OracleSqlParser.WITHIN, 0); }
		public TerminalNode GROUP() { return getToken(OracleSqlParser.GROUP, 0); }
		public Order_by_clauseContext order_by_clause() {
			return getRuleContext(Order_by_clauseContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(OracleSqlParser.COMMA, 0); }
		public Quoted_stringContext quoted_string() {
			return getRuleContext(Quoted_stringContext.class,0);
		}
		public TerminalNode OVER() { return getToken(OracleSqlParser.OVER, 0); }
		public Query_partition_clauseContext query_partition_clause() {
			return getRuleContext(Query_partition_clauseContext.class,0);
		}
		public ListaggContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listagg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterListagg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitListagg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitListagg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaggContext listagg() throws RecognitionException {
		ListaggContext _localctx = new ListaggContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_listagg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2840);
			match(LISTAGG);
			setState(2841);
			match(LPAREN);
			setState(2842);
			sql_expression();
			setState(2845);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(2843);
				match(COMMA);
				setState(2844);
				quoted_string();
				}
			}

			setState(2847);
			match(RPAREN);
			setState(2848);
			match(WITHIN);
			setState(2849);
			match(GROUP);
			setState(2850);
			match(LPAREN);
			setState(2851);
			order_by_clause();
			setState(2852);
			match(RPAREN);
			setState(2858);
			_la = _input.LA(1);
			if (_la==OVER) {
				{
				setState(2853);
				match(OVER);
				setState(2854);
				match(LPAREN);
				setState(2855);
				query_partition_clause();
				setState(2856);
				match(RPAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_update_clauseContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(OracleSqlParser.FOR, 0); }
		public TerminalNode UPDATE() { return getToken(OracleSqlParser.UPDATE, 0); }
		public TerminalNode OF() { return getToken(OracleSqlParser.OF, 0); }
		public For_update_clause_part_firstContext for_update_clause_part_first() {
			return getRuleContext(For_update_clause_part_firstContext.class,0);
		}
		public TerminalNode NOWAIT() { return getToken(OracleSqlParser.NOWAIT, 0); }
		public TerminalNode WAIT() { return getToken(OracleSqlParser.WAIT, 0); }
		public TerminalNode NUMBER() { return getToken(OracleSqlParser.NUMBER, 0); }
		public TerminalNode SKIP() { return getToken(OracleSqlParser.SKIP, 0); }
		public TerminalNode LOCKED() { return getToken(OracleSqlParser.LOCKED, 0); }
		public List<For_update_clause_part_nextContext> for_update_clause_part_next() {
			return getRuleContexts(For_update_clause_part_nextContext.class);
		}
		public For_update_clause_part_nextContext for_update_clause_part_next(int i) {
			return getRuleContext(For_update_clause_part_nextContext.class,i);
		}
		public For_update_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_update_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterFor_update_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitFor_update_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitFor_update_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_update_clauseContext for_update_clause() throws RecognitionException {
		For_update_clauseContext _localctx = new For_update_clauseContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_for_update_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2860);
			match(FOR);
			setState(2861);
			match(UPDATE);
			setState(2870);
			_la = _input.LA(1);
			if (_la==OF) {
				{
				setState(2862);
				match(OF);
				setState(2863);
				for_update_clause_part_first();
				setState(2867);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,411,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2864);
						for_update_clause_part_next();
						}
						} 
					}
					setState(2869);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,411,_ctx);
				}
				}
			}

			setState(2877);
			switch (_input.LA(1)) {
			case NOWAIT:
				{
				setState(2872);
				match(NOWAIT);
				}
				break;
			case WAIT:
				{
				setState(2873);
				match(WAIT);
				setState(2874);
				match(NUMBER);
				}
				break;
			case SKIP:
				{
				setState(2875);
				match(SKIP);
				setState(2876);
				match(LOCKED);
				}
				break;
			case EOF:
			case T__0:
			case T__1:
			case ACCESS:
			case AND:
			case AS:
			case ASC:
			case BETWEEN:
			case CONNECT:
			case DELETE:
			case DESC:
			case ELSE:
			case FOR:
			case FROM:
			case GROUP:
			case HAVING:
			case IN:
			case INTERSECT:
			case INTO:
			case IS:
			case LEVEL:
			case LIKE:
			case MINUS2:
			case NOT:
			case NULL:
			case ON:
			case OR:
			case ORDER:
			case ROWID:
			case ROWNUM:
			case ROWS:
			case SELECT:
			case SET:
			case START:
			case SYSDATE:
			case THEN:
			case UNION:
			case USER:
			case VALUES:
			case WHERE:
			case WITH:
			case COUNT:
			case CROSS:
			case CYCLE:
			case DIMENSION:
			case END:
			case ESCAPE:
			case FOLLOWING:
			case FULL:
			case IGNORE:
			case INNER:
			case JOIN:
			case LEFT:
			case LOG:
			case MEMBER:
			case MODEL:
			case NATURAL:
			case NULLS:
			case PARTITION:
			case PIVOT:
			case PRECEDING:
			case RANGE:
			case RESPECT:
			case RETURN:
			case RETURNING:
			case RIGHT:
			case SEARCH:
			case SQL:
			case TIME:
			case TYPE:
			case UNPIVOT:
			case USING:
			case VALUE:
			case VERSIONS:
			case WHEN:
			case YEAR:
			case QUOTED_STRING:
			case BINDVAR:
			case ID:
			case SEMI:
			case COLON:
			case COMMA:
			case ASTERISK:
			case RPAREN:
			case LPAREN:
			case RBRACK:
			case PLUS:
			case MINUS:
			case DIVIDE:
			case EQ:
			case VERTBAR:
			case DOUBLEVERTBAR:
			case NOT_EQ:
			case LTH:
			case LEQ:
			case GTH:
			case GEQ:
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_update_clause_part_firstContext extends ParserRuleContext {
		public Schema_nameContext sch1;
		public Token dot1a;
		public Table_nameContext tbl1;
		public Token dot1b;
		public Column_nameContext col1;
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(OracleSqlParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(OracleSqlParser.DOT, i);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public For_update_clause_part_firstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_update_clause_part_first; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterFor_update_clause_part_first(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitFor_update_clause_part_first(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitFor_update_clause_part_first(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_update_clause_part_firstContext for_update_clause_part_first() throws RecognitionException {
		For_update_clause_part_firstContext _localctx = new For_update_clause_part_firstContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_for_update_clause_part_first);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2882);
			switch ( getInterpreter().adaptivePredict(_input,414,_ctx) ) {
			case 1:
				{
				setState(2879);
				((For_update_clause_part_firstContext)_localctx).sch1 = schema_name();
				setState(2880);
				((For_update_clause_part_firstContext)_localctx).dot1a = match(DOT);
				}
				break;
			}
			setState(2887);
			switch ( getInterpreter().adaptivePredict(_input,415,_ctx) ) {
			case 1:
				{
				setState(2884);
				((For_update_clause_part_firstContext)_localctx).tbl1 = table_name();
				setState(2885);
				((For_update_clause_part_firstContext)_localctx).dot1b = match(DOT);
				}
				break;
			}
			setState(2889);
			((For_update_clause_part_firstContext)_localctx).col1 = column_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_update_clause_part_nextContext extends ParserRuleContext {
		public Schema_nameContext sch1;
		public Token dot1a;
		public Table_nameContext tbl1;
		public Token dot1b;
		public Column_nameContext col1;
		public TerminalNode COMMA() { return getToken(OracleSqlParser.COMMA, 0); }
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(OracleSqlParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(OracleSqlParser.DOT, i);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public For_update_clause_part_nextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_update_clause_part_next; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterFor_update_clause_part_next(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitFor_update_clause_part_next(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitFor_update_clause_part_next(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_update_clause_part_nextContext for_update_clause_part_next() throws RecognitionException {
		For_update_clause_part_nextContext _localctx = new For_update_clause_part_nextContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_for_update_clause_part_next);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2891);
			match(COMMA);
			setState(2895);
			switch ( getInterpreter().adaptivePredict(_input,416,_ctx) ) {
			case 1:
				{
				setState(2892);
				((For_update_clause_part_nextContext)_localctx).sch1 = schema_name();
				setState(2893);
				((For_update_clause_part_nextContext)_localctx).dot1a = match(DOT);
				}
				break;
			}
			setState(2900);
			switch ( getInterpreter().adaptivePredict(_input,417,_ctx) ) {
			case 1:
				{
				setState(2897);
				((For_update_clause_part_nextContext)_localctx).tbl1 = table_name();
				setState(2898);
				((For_update_clause_part_nextContext)_localctx).dot1b = match(DOT);
				}
				break;
			}
			setState(2902);
			((For_update_clause_part_nextContext)_localctx).col1 = column_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pivot_clauseContext extends ParserRuleContext {
		public TerminalNode PIVOT() { return getToken(OracleSqlParser.PIVOT, 0); }
		public TerminalNode LPAREN() { return getToken(OracleSqlParser.LPAREN, 0); }
		public List<Aggregate_functionContext> aggregate_function() {
			return getRuleContexts(Aggregate_functionContext.class);
		}
		public Aggregate_functionContext aggregate_function(int i) {
			return getRuleContext(Aggregate_functionContext.class,i);
		}
		public Pivot_for_clauseContext pivot_for_clause() {
			return getRuleContext(Pivot_for_clauseContext.class,0);
		}
		public Pivot_in_clauseContext pivot_in_clause() {
			return getRuleContext(Pivot_in_clauseContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(OracleSqlParser.RPAREN, 0); }
		public TerminalNode XML() { return getToken(OracleSqlParser.XML, 0); }
		public List<C_aliasContext> c_alias() {
			return getRuleContexts(C_aliasContext.class);
		}
		public C_aliasContext c_alias(int i) {
			return getRuleContext(C_aliasContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OracleSqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleSqlParser.COMMA, i);
		}
		public Pivot_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivot_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterPivot_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitPivot_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitPivot_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pivot_clauseContext pivot_clause() throws RecognitionException {
		Pivot_clauseContext _localctx = new Pivot_clauseContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_pivot_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2904);
			match(PIVOT);
			setState(2906);
			_la = _input.LA(1);
			if (_la==XML) {
				{
				setState(2905);
				match(XML);
				}
			}

			setState(2908);
			match(LPAREN);
			setState(2909);
			aggregate_function();
			setState(2911);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCESS) | (1L << AS) | (1L << ROWID) | (1L << ROWNUM))) != 0) || _la==COUNT || _la==CYCLE || ((((_la - 203)) & ~0x3f) == 0 && ((1L << (_la - 203)) & ((1L << (SQL - 203)) | (1L << (TIME - 203)) | (1L << (TYPE - 203)) | (1L << (VALUE - 203)) | (1L << (YEAR - 203)) | (1L << (QUOTED_STRING - 203)) | (1L << (ID - 203)))) != 0)) {
				{
				setState(2910);
				c_alias();
				}
			}

			setState(2920);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2913);
				match(COMMA);
				setState(2914);
				aggregate_function();
				setState(2916);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCESS) | (1L << AS) | (1L << ROWID) | (1L << ROWNUM))) != 0) || _la==COUNT || _la==CYCLE || ((((_la - 203)) & ~0x3f) == 0 && ((1L << (_la - 203)) & ((1L << (SQL - 203)) | (1L << (TIME - 203)) | (1L << (TYPE - 203)) | (1L << (VALUE - 203)) | (1L << (YEAR - 203)) | (1L << (QUOTED_STRING - 203)) | (1L << (ID - 203)))) != 0)) {
					{
					setState(2915);
					c_alias();
					}
				}

				}
				}
				setState(2922);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2923);
			pivot_for_clause();
			setState(2924);
			pivot_in_clause();
			setState(2925);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pivot_for_clauseContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(OracleSqlParser.FOR, 0); }
		public Column_specContext column_spec() {
			return getRuleContext(Column_specContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(OracleSqlParser.LPAREN, 0); }
		public Column_specsContext column_specs() {
			return getRuleContext(Column_specsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(OracleSqlParser.RPAREN, 0); }
		public Pivot_for_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivot_for_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterPivot_for_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitPivot_for_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitPivot_for_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pivot_for_clauseContext pivot_for_clause() throws RecognitionException {
		Pivot_for_clauseContext _localctx = new Pivot_for_clauseContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_pivot_for_clause);
		try {
			setState(2933);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(2927);
				match(FOR);
				setState(2928);
				column_spec();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(2929);
				match(LPAREN);
				setState(2930);
				column_specs();
				setState(2931);
				match(RPAREN);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pivot_in_clauseContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(OracleSqlParser.IN, 0); }
		public TerminalNode LPAREN() { return getToken(OracleSqlParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(OracleSqlParser.RPAREN, 0); }
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public List<TerminalNode> ANY() { return getTokens(OracleSqlParser.ANY); }
		public TerminalNode ANY(int i) {
			return getToken(OracleSqlParser.ANY, i);
		}
		public List<Expression_listContext> expression_list() {
			return getRuleContexts(Expression_listContext.class);
		}
		public Expression_listContext expression_list(int i) {
			return getRuleContext(Expression_listContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OracleSqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleSqlParser.COMMA, i);
		}
		public List<C_aliasContext> c_alias() {
			return getRuleContexts(C_aliasContext.class);
		}
		public C_aliasContext c_alias(int i) {
			return getRuleContext(C_aliasContext.class,i);
		}
		public Pivot_in_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivot_in_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterPivot_in_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitPivot_in_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitPivot_in_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pivot_in_clauseContext pivot_in_clause() throws RecognitionException {
		Pivot_in_clauseContext _localctx = new Pivot_in_clauseContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_pivot_in_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2935);
			match(IN);
			setState(2936);
			match(LPAREN);
			setState(2955);
			switch ( getInterpreter().adaptivePredict(_input,426,_ctx) ) {
			case 1:
				{
				setState(2937);
				select_statement();
				}
				break;
			case 2:
				{
				setState(2938);
				match(ANY);
				setState(2943);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2939);
					match(COMMA);
					setState(2940);
					match(ANY);
					}
					}
					setState(2945);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				{
				setState(2946);
				expression_list();
				setState(2948);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCESS) | (1L << AS) | (1L << ROWID) | (1L << ROWNUM))) != 0) || _la==COUNT || _la==CYCLE || ((((_la - 203)) & ~0x3f) == 0 && ((1L << (_la - 203)) & ((1L << (SQL - 203)) | (1L << (TIME - 203)) | (1L << (TYPE - 203)) | (1L << (VALUE - 203)) | (1L << (YEAR - 203)) | (1L << (QUOTED_STRING - 203)) | (1L << (ID - 203)))) != 0)) {
					{
					setState(2947);
					c_alias();
					}
				}

				{
				setState(2950);
				match(COMMA);
				setState(2951);
				expression_list();
				setState(2953);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCESS) | (1L << AS) | (1L << ROWID) | (1L << ROWNUM))) != 0) || _la==COUNT || _la==CYCLE || ((((_la - 203)) & ~0x3f) == 0 && ((1L << (_la - 203)) & ((1L << (SQL - 203)) | (1L << (TIME - 203)) | (1L << (TYPE - 203)) | (1L << (VALUE - 203)) | (1L << (YEAR - 203)) | (1L << (QUOTED_STRING - 203)) | (1L << (ID - 203)))) != 0)) {
					{
					setState(2952);
					c_alias();
					}
				}

				}
				}
				break;
			}
			setState(2957);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unpivot_clauseContext extends ParserRuleContext {
		public TerminalNode UNPIVOT() { return getToken(OracleSqlParser.UNPIVOT, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(OracleSqlParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(OracleSqlParser.LPAREN, i);
		}
		public Pivot_for_clauseContext pivot_for_clause() {
			return getRuleContext(Pivot_for_clauseContext.class,0);
		}
		public Unpivot_in_clauseContext unpivot_in_clause() {
			return getRuleContext(Unpivot_in_clauseContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(OracleSqlParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(OracleSqlParser.RPAREN, i);
		}
		public Column_specContext column_spec() {
			return getRuleContext(Column_specContext.class,0);
		}
		public TerminalNode NULLS() { return getToken(OracleSqlParser.NULLS, 0); }
		public TerminalNode EXCLUDE() { return getToken(OracleSqlParser.EXCLUDE, 0); }
		public TerminalNode INCLUDE() { return getToken(OracleSqlParser.INCLUDE, 0); }
		public Column_specsContext column_specs() {
			return getRuleContext(Column_specsContext.class,0);
		}
		public Unpivot_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unpivot_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterUnpivot_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitUnpivot_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitUnpivot_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unpivot_clauseContext unpivot_clause() throws RecognitionException {
		Unpivot_clauseContext _localctx = new Unpivot_clauseContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_unpivot_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2959);
			match(UNPIVOT);
			setState(2962);
			_la = _input.LA(1);
			if (_la==EXCLUDE || _la==INCLUDE) {
				{
				setState(2960);
				_la = _input.LA(1);
				if ( !(_la==EXCLUDE || _la==INCLUDE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(2961);
				match(NULLS);
				}
			}

			setState(2964);
			match(LPAREN);
			setState(2970);
			switch (_input.LA(1)) {
			case ACCESS:
			case LEVEL:
			case NULL:
			case ROWID:
			case ROWNUM:
			case SYSDATE:
			case USER:
			case COUNT:
			case CYCLE:
			case SQL:
			case TIME:
			case TYPE:
			case VALUE:
			case YEAR:
			case QUOTED_STRING:
			case BINDVAR:
			case ID:
			case COLON:
				{
				setState(2965);
				column_spec();
				}
				break;
			case LPAREN:
				{
				{
				setState(2966);
				match(LPAREN);
				setState(2967);
				column_specs();
				setState(2968);
				match(RPAREN);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2972);
			pivot_for_clause();
			setState(2973);
			unpivot_in_clause();
			setState(2974);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unpivot_in_clauseContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(OracleSqlParser.IN, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(OracleSqlParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(OracleSqlParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(OracleSqlParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(OracleSqlParser.RPAREN, i);
		}
		public List<Column_specContext> column_spec() {
			return getRuleContexts(Column_specContext.class);
		}
		public Column_specContext column_spec(int i) {
			return getRuleContext(Column_specContext.class,i);
		}
		public List<TerminalNode> AS() { return getTokens(OracleSqlParser.AS); }
		public TerminalNode AS(int i) {
			return getToken(OracleSqlParser.AS, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OracleSqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleSqlParser.COMMA, i);
		}
		public List<Column_specsContext> column_specs() {
			return getRuleContexts(Column_specsContext.class);
		}
		public Column_specsContext column_specs(int i) {
			return getRuleContext(Column_specsContext.class,i);
		}
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public Unpivot_in_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unpivot_in_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterUnpivot_in_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitUnpivot_in_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitUnpivot_in_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unpivot_in_clauseContext unpivot_in_clause() throws RecognitionException {
		Unpivot_in_clauseContext _localctx = new Unpivot_in_clauseContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_unpivot_in_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2976);
			match(IN);
			setState(2977);
			match(LPAREN);
			setState(2983);
			switch (_input.LA(1)) {
			case ACCESS:
			case LEVEL:
			case NULL:
			case ROWID:
			case ROWNUM:
			case SYSDATE:
			case USER:
			case COUNT:
			case CYCLE:
			case SQL:
			case TIME:
			case TYPE:
			case VALUE:
			case YEAR:
			case QUOTED_STRING:
			case BINDVAR:
			case ID:
			case COLON:
				{
				setState(2978);
				column_spec();
				}
				break;
			case LPAREN:
				{
				{
				setState(2979);
				match(LPAREN);
				setState(2980);
				column_specs();
				setState(2981);
				match(RPAREN);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2993);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(2985);
				match(AS);
				setState(2991);
				switch (_input.LA(1)) {
				case QUOTED_STRING:
				case NUMBER:
					{
					setState(2986);
					constant();
					}
					break;
				case LPAREN:
					{
					{
					setState(2987);
					match(LPAREN);
					setState(2988);
					constant();
					setState(2989);
					match(RPAREN);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(3015);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2995);
				match(COMMA);
				setState(3001);
				switch (_input.LA(1)) {
				case ACCESS:
				case LEVEL:
				case NULL:
				case ROWID:
				case ROWNUM:
				case SYSDATE:
				case USER:
				case COUNT:
				case CYCLE:
				case SQL:
				case TIME:
				case TYPE:
				case VALUE:
				case YEAR:
				case QUOTED_STRING:
				case BINDVAR:
				case ID:
				case COLON:
					{
					setState(2996);
					column_spec();
					}
					break;
				case LPAREN:
					{
					{
					setState(2997);
					match(LPAREN);
					setState(2998);
					column_specs();
					setState(2999);
					match(RPAREN);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(3011);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(3003);
					match(AS);
					setState(3009);
					switch (_input.LA(1)) {
					case QUOTED_STRING:
					case NUMBER:
						{
						setState(3004);
						constant();
						}
						break;
					case LPAREN:
						{
						{
						setState(3005);
						match(LPAREN);
						setState(3006);
						constant();
						setState(3007);
						match(RPAREN);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				}
				}
				setState(3017);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3018);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(OracleSqlParser.NUMBER, 0); }
		public Quoted_stringContext quoted_string() {
			return getRuleContext(Quoted_stringContext.class,0);
		}
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_constant);
		try {
			setState(3022);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(3020);
				match(NUMBER);
				}
				break;
			case QUOTED_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(3021);
				quoted_string();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_identifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ROWID() { return getToken(OracleSqlParser.ROWID, 0); }
		public TerminalNode ROWNUM() { return getToken(OracleSqlParser.ROWNUM, 0); }
		public TerminalNode VALUE() { return getToken(OracleSqlParser.VALUE, 0); }
		public TerminalNode TYPE() { return getToken(OracleSqlParser.TYPE, 0); }
		public TerminalNode SQL() { return getToken(OracleSqlParser.SQL, 0); }
		public TerminalNode YEAR() { return getToken(OracleSqlParser.YEAR, 0); }
		public TerminalNode TIME() { return getToken(OracleSqlParser.TIME, 0); }
		public TerminalNode ACCESS() { return getToken(OracleSqlParser.ACCESS, 0); }
		public TerminalNode CYCLE() { return getToken(OracleSqlParser.CYCLE, 0); }
		public TerminalNode COUNT() { return getToken(OracleSqlParser.COUNT, 0); }
		public Sql_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterSql_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitSql_identifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitSql_identifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_identifierContext sql_identifier() throws RecognitionException {
		Sql_identifierContext _localctx = new Sql_identifierContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_sql_identifier);
		try {
			setState(3036);
			switch ( getInterpreter().adaptivePredict(_input,437,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3024);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3025);
				match(ROWID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3026);
				match(ROWNUM);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3027);
				match(VALUE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(3028);
				match(TYPE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(3029);
				match(SQL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(3030);
				match(YEAR);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(3031);
				match(TIME);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(3032);
				match(ACCESS);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(3033);
				match(CYCLE);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(3034);
				match(COUNT);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(3035);
				match(TYPE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(OracleSqlParser.ID, 0); }
		public TerminalNode QUOTED_STRING() { return getToken(OracleSqlParser.QUOTED_STRING, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3038);
			_la = _input.LA(1);
			if ( !(_la==QUOTED_STRING || _la==ID) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bind_variableContext extends ParserRuleContext {
		public TerminalNode BINDVAR() { return getToken(OracleSqlParser.BINDVAR, 0); }
		public TerminalNode COLON() { return getToken(OracleSqlParser.COLON, 0); }
		public TerminalNode NUMBER() { return getToken(OracleSqlParser.NUMBER, 0); }
		public Bind_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bind_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterBind_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitBind_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitBind_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bind_variableContext bind_variable() throws RecognitionException {
		Bind_variableContext _localctx = new Bind_variableContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_bind_variable);
		try {
			setState(3043);
			switch (_input.LA(1)) {
			case BINDVAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(3040);
				match(BINDVAR);
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(3041);
				match(COLON);
				setState(3042);
				match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HintContext extends ParserRuleContext {
		public TerminalNode HINT() { return getToken(OracleSqlParser.HINT, 0); }
		public HintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterHint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitHint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitHint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HintContext hint() throws RecognitionException {
		HintContext _localctx = new HintContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_hint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3045);
			match(HINT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Quoted_stringContext extends ParserRuleContext {
		public TerminalNode QUOTED_STRING() { return getToken(OracleSqlParser.QUOTED_STRING, 0); }
		public Quoted_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quoted_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterQuoted_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitQuoted_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitQuoted_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Quoted_stringContext quoted_string() throws RecognitionException {
		Quoted_stringContext _localctx = new Quoted_stringContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_quoted_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3047);
			match(QUOTED_STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoublevertbarContext extends ParserRuleContext {
		public TerminalNode DOUBLEVERTBAR() { return getToken(OracleSqlParser.DOUBLEVERTBAR, 0); }
		public List<TerminalNode> VERTBAR() { return getTokens(OracleSqlParser.VERTBAR); }
		public TerminalNode VERTBAR(int i) {
			return getToken(OracleSqlParser.VERTBAR, i);
		}
		public DoublevertbarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doublevertbar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterDoublevertbar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitDoublevertbar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitDoublevertbar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoublevertbarContext doublevertbar() throws RecognitionException {
		DoublevertbarContext _localctx = new DoublevertbarContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_doublevertbar);
		try {
			setState(3052);
			switch (_input.LA(1)) {
			case DOUBLEVERTBAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(3049);
				match(DOUBLEVERTBAR);
				}
				break;
			case VERTBAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(3050);
				match(VERTBAR);
				setState(3051);
				match(VERTBAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Not_equalContext extends ParserRuleContext {
		public TerminalNode NOT_EQ() { return getToken(OracleSqlParser.NOT_EQ, 0); }
		public TerminalNode LTH() { return getToken(OracleSqlParser.LTH, 0); }
		public TerminalNode GTH() { return getToken(OracleSqlParser.GTH, 0); }
		public TerminalNode EQ() { return getToken(OracleSqlParser.EQ, 0); }
		public Not_equalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not_equal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterNot_equal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitNot_equal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitNot_equal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Not_equalContext not_equal() throws RecognitionException {
		Not_equalContext _localctx = new Not_equalContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_not_equal);
		try {
			setState(3061);
			switch (_input.LA(1)) {
			case NOT_EQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(3054);
				match(NOT_EQ);
				}
				break;
			case LTH:
				enterOuterAlt(_localctx, 2);
				{
				setState(3055);
				match(LTH);
				setState(3056);
				match(GTH);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(3057);
				match(T__0);
				setState(3058);
				match(EQ);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 4);
				{
				setState(3059);
				match(T__1);
				setState(3060);
				match(EQ);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeqContext extends ParserRuleContext {
		public TerminalNode LEQ() { return getToken(OracleSqlParser.LEQ, 0); }
		public TerminalNode LTH() { return getToken(OracleSqlParser.LTH, 0); }
		public TerminalNode EQ() { return getToken(OracleSqlParser.EQ, 0); }
		public LeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterLeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitLeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitLeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeqContext leq() throws RecognitionException {
		LeqContext _localctx = new LeqContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_leq);
		try {
			setState(3066);
			switch (_input.LA(1)) {
			case LEQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(3063);
				match(LEQ);
				}
				break;
			case LTH:
				enterOuterAlt(_localctx, 2);
				{
				setState(3064);
				match(LTH);
				setState(3065);
				match(EQ);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GeqContext extends ParserRuleContext {
		public TerminalNode GEQ() { return getToken(OracleSqlParser.GEQ, 0); }
		public TerminalNode GTH() { return getToken(OracleSqlParser.GTH, 0); }
		public TerminalNode EQ() { return getToken(OracleSqlParser.EQ, 0); }
		public GeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_geq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterGeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitGeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitGeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GeqContext geq() throws RecognitionException {
		GeqContext _localctx = new GeqContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_geq);
		try {
			setState(3071);
			switch (_input.LA(1)) {
			case GEQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(3068);
				match(GEQ);
				}
				break;
			case GTH:
				enterOuterAlt(_localctx, 2);
				{
				setState(3069);
				match(GTH);
				setState(3070);
				match(EQ);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u0118\u0c04\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\3\2\3\2\3\2\3\2\3\2\5\2\u0196\n\2\3\2\3\2\3\3\3\3\5\3\u019c\n\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\5\3\u01a4\n\3\3\3\5\3\u01a7\n\3\3\3\5\3\u01aa\n\3\3"+
		"\3\5\3\u01ad\n\3\3\3\5\3\u01b0\n\3\3\4\3\4\3\4\3\4\3\4\5\4\u01b7\n\4\3"+
		"\4\3\4\5\4\u01bb\n\4\3\4\3\4\3\4\3\4\3\4\5\4\u01c2\n\4\3\4\5\4\u01c5\n"+
		"\4\3\4\5\4\u01c8\n\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u01d0\n\4\3\4\3\4\5\4"+
		"\u01d4\n\4\5\4\u01d6\n\4\3\4\5\4\u01d9\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\5\u01e4\n\5\3\5\3\5\3\5\3\5\3\5\5\5\u01eb\n\5\7\5\u01ed\n\5"+
		"\f\5\16\5\u01f0\13\5\3\5\5\5\u01f3\n\5\3\5\3\5\5\5\u01f7\n\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0202\n\6\3\6\3\6\3\6\3\6\5\6\u0208\n\6"+
		"\3\6\3\6\3\6\5\6\u020d\n\6\7\6\u020f\n\6\f\6\16\6\u0212\13\6\3\6\3\6\5"+
		"\6\u0216\n\6\3\7\3\7\3\7\5\7\u021b\n\7\3\b\3\b\3\b\5\b\u0220\n\b\3\b\3"+
		"\b\5\b\u0224\n\b\3\b\5\b\u0227\n\b\3\t\3\t\5\t\u022b\n\t\3\t\3\t\5\t\u022f"+
		"\n\t\3\t\3\t\3\t\3\t\5\t\u0235\n\t\3\n\3\n\3\n\3\n\5\n\u023b\n\n\3\n\3"+
		"\n\3\n\5\n\u0240\n\n\7\n\u0242\n\n\f\n\16\n\u0245\13\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\7\13\u024d\n\13\f\13\16\13\u0250\13\13\3\13\3\13\3\13\3"+
		"\13\7\13\u0256\n\13\f\13\16\13\u0259\13\13\3\f\3\f\3\f\5\f\u025e\n\f\3"+
		"\f\5\f\u0261\n\f\6\f\u0263\n\f\r\f\16\f\u0264\3\f\5\f\u0268\n\f\3\f\3"+
		"\f\3\r\5\r\u026d\n\r\3\r\3\r\3\r\3\r\3\r\5\r\u0274\n\r\6\r\u0276\n\r\r"+
		"\r\16\r\u0277\6\r\u027a\n\r\r\r\16\r\u027b\3\r\3\r\3\r\5\r\u0281\n\r\6"+
		"\r\u0283\n\r\r\r\16\r\u0284\3\16\3\16\3\16\5\16\u028a\n\16\3\16\3\16\3"+
		"\16\3\16\5\16\u0290\n\16\3\16\3\16\5\16\u0294\n\16\3\16\3\16\5\16\u0298"+
		"\n\16\3\16\3\16\3\16\5\16\u029d\n\16\3\16\3\16\3\16\5\16\u02a2\n\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\5\17\u02aa\n\17\3\17\5\17\u02ad\n\17\3\17"+
		"\3\17\3\17\3\17\5\17\u02b3\n\17\3\17\3\17\3\17\5\17\u02b8\n\17\3\20\3"+
		"\20\5\20\u02bc\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u02c5\n\21"+
		"\3\21\5\21\u02c8\n\21\3\21\3\21\5\21\u02cc\n\21\3\21\5\21\u02cf\n\21\3"+
		"\21\5\21\u02d2\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u02dc"+
		"\n\22\3\22\3\22\5\22\u02e0\n\22\3\22\3\22\3\22\5\22\u02e5\n\22\7\22\u02e7"+
		"\n\22\f\22\16\22\u02ea\13\22\5\22\u02ec\n\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\5\24\u02f9\n\24\3\25\5\25\u02fc\n\25\3"+
		"\25\3\25\5\25\u0300\n\25\3\25\5\25\u0303\n\25\3\25\3\25\3\25\3\25\3\25"+
		"\7\25\u030a\n\25\f\25\16\25\u030d\13\25\5\25\u030f\n\25\3\25\3\25\3\25"+
		"\5\25\u0314\n\25\3\25\5\25\u0317\n\25\3\25\5\25\u031a\n\25\3\25\5\25\u031d"+
		"\n\25\3\25\7\25\u0320\n\25\f\25\16\25\u0323\13\25\3\25\5\25\u0326\n\25"+
		"\3\25\5\25\u0329\n\25\3\25\5\25\u032c\n\25\3\25\5\25\u032f\n\25\3\26\3"+
		"\26\3\26\7\26\u0334\n\26\f\26\16\26\u0337\13\26\3\26\5\26\u033a\n\26\3"+
		"\26\5\26\u033d\n\26\3\27\3\27\3\27\3\27\3\27\5\27\u0344\n\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u034f\n\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\5\31\u035a\n\31\3\31\5\31\u035d\n\31\3\31\3"+
		"\31\5\31\u0361\n\31\3\31\3\31\5\31\u0365\n\31\3\31\3\31\3\31\5\31\u036a"+
		"\n\31\3\31\5\31\u036d\n\31\3\31\3\31\5\31\u0371\n\31\3\31\3\31\5\31\u0375"+
		"\n\31\7\31\u0377\n\31\f\31\16\31\u037a\13\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\7\32\u0383\n\32\f\32\16\32\u0386\13\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\7\33\u0391\n\33\f\33\16\33\u0394\13\33\3\34"+
		"\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\5\36\u039f\n\36\3\36\3\36\3\36"+
		"\3\36\3\36\5\36\u03a6\n\36\3\36\5\36\u03a9\n\36\3\37\3\37\3 \3 \3 \3 "+
		"\5 \u03b1\n \3 \7 \u03b4\n \f \16 \u03b7\13 \3!\3!\3!\7!\u03bc\n!\f!\16"+
		"!\u03bf\13!\3\"\5\"\u03c2\n\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\5#\u03d6\n#\3$\3$\3$\3$\3%\3%\3&\3&\5&\u03e0\n&\3&\3"+
		"&\5&\u03e4\n&\3&\3&\3\'\3\'\3\'\3\'\7\'\u03ec\n\'\f\'\16\'\u03ef\13\'"+
		"\5\'\u03f1\n\'\3(\3(\3(\5(\u03f6\n(\3(\3(\3)\3)\3*\3*\3*\5*\u03ff\n*\3"+
		"*\5*\u0402\n*\3*\5*\u0405\n*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5"+
		"*\u0414\n*\3+\3+\3+\5+\u0419\n+\3+\5+\u041c\n+\3+\3+\3,\3,\3,\3-\3-\3"+
		"-\3-\3-\3-\6-\u0429\n-\r-\16-\u042a\3.\3.\3.\3.\3.\6.\u0432\n.\r.\16."+
		"\u0433\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\5\60\u0444\n\60\3\60\3\60\3\60\7\60\u0449\n\60\f\60\16\60\u044c\13\60"+
		"\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u0458\n\61\3\62"+
		"\3\62\5\62\u045c\n\62\3\62\5\62\u045f\n\62\3\62\3\62\3\62\3\62\5\62\u0465"+
		"\n\62\3\62\5\62\u0468\n\62\3\62\5\62\u046b\n\62\3\62\5\62\u046e\n\62\3"+
		"\63\3\63\3\63\3\63\5\63\u0474\n\63\3\63\5\63\u0477\n\63\3\63\5\63\u047a"+
		"\n\63\3\63\5\63\u047d\n\63\3\63\5\63\u0480\n\63\3\63\3\63\3\63\3\63\5"+
		"\63\u0486\n\63\3\63\5\63\u0489\n\63\3\63\5\63\u048c\n\63\3\63\5\63\u048f"+
		"\n\63\3\63\5\63\u0492\n\63\5\63\u0494\n\63\3\64\3\64\3\64\3\65\3\65\3"+
		"\65\5\65\u049c\n\65\3\65\3\65\3\65\3\65\3\65\5\65\u04a3\n\65\3\65\3\65"+
		"\5\65\u04a7\n\65\3\65\3\65\5\65\u04ab\n\65\3\65\3\65\3\65\3\65\3\65\5"+
		"\65\u04b2\n\65\3\65\3\65\5\65\u04b6\n\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\5\65\u04be\n\65\5\65\u04c0\n\65\5\65\u04c2\n\65\3\66\3\66\5\66\u04c6"+
		"\n\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\58\u04d2\n8\38\38\3"+
		"8\38\38\38\38\38\58\u04dc\n8\58\u04de\n8\39\39\39\39\59\u04e4\n9\39\3"+
		"9\39\39\59\u04ea\n9\39\39\39\39\39\59\u04f1\n9\39\39\39\39\39\59\u04f8"+
		"\n9\39\39\39\39\59\u04fe\n9\39\39\39\39\39\59\u0505\n9\59\u0507\n9\3:"+
		"\3:\3;\3;\3;\3;\3;\5;\u0510\n;\3;\3;\5;\u0514\n;\3;\3;\3;\5;\u0519\n;"+
		"\3;\3;\3<\3<\3<\3<\3<\5<\u0522\n<\3<\3<\3<\5<\u0527\n<\3<\3<\3=\3=\3="+
		"\3=\3=\3=\3=\3=\3=\3=\5=\u0535\n=\3=\5=\u0538\n=\3=\3=\5=\u053c\n=\3="+
		"\3=\3=\5=\u0541\n=\3=\3=\3=\3=\5=\u0547\n=\3=\3=\3=\3=\3=\3=\3=\5=\u0550"+
		"\n=\3=\3=\3=\3=\3=\5=\u0557\n=\3=\3=\3=\3=\3=\5=\u055e\n=\3=\3=\3=\3="+
		"\3=\3=\5=\u0566\n=\3=\3=\5=\u056a\n=\3=\3=\5=\u056e\n=\3=\3=\3=\3=\3="+
		"\3=\3=\5=\u0577\n=\3=\3=\3=\3=\3=\5=\u057e\n=\3=\3=\3=\5=\u0583\n=\3="+
		"\5=\u0586\n=\3=\3=\3=\3=\3=\3=\5=\u058e\n=\5=\u0590\n=\3=\3=\3=\3=\5="+
		"\u0596\n=\3=\5=\u0599\n=\3=\3=\3=\3=\3=\3=\5=\u05a1\n=\5=\u05a3\n=\3="+
		"\3=\3=\3=\5=\u05a9\n=\3=\5=\u05ac\n=\3=\3=\3=\3=\3=\3=\5=\u05b4\n=\5="+
		"\u05b6\n=\3=\3=\5=\u05ba\n=\3=\3=\3=\5=\u05bf\n=\3=\3=\5=\u05c3\n=\3="+
		"\3=\3=\5=\u05c8\n=\3=\3=\3=\3=\5=\u05ce\n=\3=\3=\3=\3=\5=\u05d4\n=\3="+
		"\3=\3=\5=\u05d9\n=\3=\3=\3=\5=\u05de\n=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3="+
		"\5=\u05ea\n=\5=\u05ec\n=\3=\3=\3=\3=\3=\3=\3=\5=\u05f5\n=\5=\u05f7\n="+
		"\3>\3>\3?\3?\3@\5@\u05fe\n@\3@\3@\5@\u0602\n@\3A\3A\3A\5A\u0607\nA\3A"+
		"\3A\3A\5A\u060c\nA\3A\3A\5A\u0610\nA\3A\3A\3A\3A\3A\3A\3A\3A\3A\5A\u061b"+
		"\nA\3B\3B\3C\3C\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\5D\u062c\nD\3E\3E\5E"+
		"\u0630\nE\3E\3E\7E\u0634\nE\fE\16E\u0637\13E\3F\3F\3F\3F\3F\3F\5F\u063f"+
		"\nF\3F\5F\u0642\nF\3F\5F\u0645\nF\3G\3G\3G\5G\u064a\nG\3G\3G\3G\3G\5G"+
		"\u0650\nG\3G\5G\u0653\nG\3G\3G\5G\u0657\nG\3G\3G\5G\u065b\nG\3G\3G\5G"+
		"\u065f\nG\3G\3G\3G\5G\u0664\nG\3G\3G\5G\u0668\nG\3G\3G\3G\3G\3G\5G\u066f"+
		"\nG\5G\u0671\nG\3H\3H\3H\3H\3H\5H\u0678\nH\3H\3H\3H\5H\u067d\nH\5H\u067f"+
		"\nH\3H\3H\3H\3H\3H\3I\3I\5I\u0688\nI\3I\3I\3I\3I\5I\u068e\nI\3I\3I\3I"+
		"\3I\3I\3I\5I\u0696\nI\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\7J\u06a2\nJ\fJ\16"+
		"J\u06a5\13J\3J\3J\5J\u06a9\nJ\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\7J\u06b5\n"+
		"J\fJ\16J\u06b8\13J\3J\3J\5J\u06bc\nJ\5J\u06be\nJ\3K\3K\3K\3K\3K\3K\3K"+
		"\5K\u06c7\nK\5K\u06c9\nK\3L\3L\3L\5L\u06ce\nL\3M\3M\3M\3M\3M\5M\u06d5"+
		"\nM\3M\3M\6M\u06d9\nM\rM\16M\u06da\3M\3M\3M\3M\5M\u06e1\nM\3N\5N\u06e4"+
		"\nN\3N\3N\3N\3N\3N\3N\3N\3N\3N\7N\u06ef\nN\fN\16N\u06f2\13N\3N\3N\3N\5"+
		"N\u06f7\nN\5N\u06f9\nN\3N\3N\5N\u06fd\nN\3O\5O\u0700\nO\3O\3O\3O\3O\3"+
		"O\5O\u0707\nO\3O\5O\u070a\nO\3O\3O\5O\u070e\nO\3O\3O\3O\3O\3O\3O\3O\5"+
		"O\u0717\nO\3P\3P\3P\3P\3Q\3Q\5Q\u071f\nQ\3R\3R\5R\u0723\nR\3S\3S\5S\u0727"+
		"\nS\3T\3T\3T\3T\3U\3U\3V\3V\3W\3W\3X\3X\3Y\3Y\3Y\7Y\u0738\nY\fY\16Y\u073b"+
		"\13Y\3Z\3Z\3[\3[\5[\u0741\n[\3\\\3\\\5\\\u0745\n\\\3]\3]\3^\3^\3^\3^\5"+
		"^\u074d\n^\3^\3^\3^\3^\3^\3^\5^\u0755\n^\3_\3_\3_\3`\3`\3`\5`\u075d\n"+
		"`\3`\3`\3`\3`\5`\u0763\n`\3`\3`\3`\3`\3`\3`\3`\5`\u076c\n`\3`\3`\5`\u0770"+
		"\n`\3a\3a\3a\3a\3a\5a\u0777\na\3a\3a\3a\3a\3a\5a\u077e\na\5a\u0780\na"+
		"\3b\3b\3b\7b\u0785\nb\fb\16b\u0788\13b\3c\3c\3c\5c\u078d\nc\3d\3d\3d\3"+
		"d\3d\3e\3e\3e\3e\3e\3e\3f\3f\3f\7f\u079d\nf\ff\16f\u07a0\13f\3g\3g\5g"+
		"\u07a4\ng\3h\3h\3i\3i\3i\7i\u07ab\ni\fi\16i\u07ae\13i\3j\3j\3j\7j\u07b3"+
		"\nj\fj\16j\u07b6\13j\3k\3k\3k\5k\u07bb\nk\3l\3l\3l\3l\3l\3l\3l\3l\3l\3"+
		"l\3l\3l\3l\3l\3l\3l\3l\5l\u07ce\nl\3m\3m\3m\3n\3n\5n\u07d5\nn\3n\3n\5"+
		"n\u07d9\nn\3n\3n\3n\3n\3n\5n\u07e0\nn\3n\3n\5n\u07e4\nn\3o\3o\5o\u07e8"+
		"\no\3o\3o\5o\u07ec\no\3o\3o\5o\u07f0\no\3o\5o\u07f3\no\3o\3o\5o\u07f7"+
		"\no\3o\3o\3o\3o\3o\3o\5o\u07ff\no\3o\5o\u0802\no\3o\3o\3o\3o\3o\5o\u0809"+
		"\no\3o\5o\u080c\no\5o\u080e\no\3p\3p\3p\3p\3p\5p\u0815\np\3p\3p\3p\3p"+
		"\5p\u081b\np\3p\3p\3p\3p\3p\3p\3p\3p\3p\5p\u0826\np\3p\3p\3p\3p\5p\u082c"+
		"\np\3p\3p\5p\u0830\np\3q\3q\3q\3q\5q\u0836\nq\3q\3q\3q\3q\5q\u083c\nq"+
		"\3q\3q\3q\3q\5q\u0842\nq\3q\3q\3q\3q\5q\u0848\nq\3q\3q\3q\3q\5q\u084e"+
		"\nq\3q\3q\3q\5q\u0853\nq\3r\3r\3r\5r\u0858\nr\3r\3r\3s\3s\3s\5s\u085f"+
		"\ns\3s\3s\3t\3t\3t\5t\u0866\nt\3t\3t\5t\u086a\nt\3t\3t\3t\3t\3u\3u\3u"+
		"\3u\3v\3v\5v\u0876\nv\3v\3v\3v\3v\5v\u087c\nv\3w\3w\5w\u0880\nw\3w\3w"+
		"\5w\u0884\nw\3w\3w\5w\u0888\nw\3x\3x\5x\u088c\nx\3x\3x\3x\3x\3x\3y\3y"+
		"\3y\3y\3y\3z\3z\5z\u089a\nz\3z\3z\5z\u089e\nz\3z\3z\3{\3{\3{\3{\3{\3{"+
		"\3{\5{\u08a9\n{\3{\3{\3|\3|\3|\3|\3|\5|\u08b2\n|\3|\3|\3|\3|\5|\u08b8"+
		"\n|\3|\3|\3}\3}\3~\3~\3\177\3\177\3\u0080\5\u0080\u08c3\n\u0080\3\u0080"+
		"\3\u0080\3\u0080\5\u0080\u08c8\n\u0080\3\u0080\3\u0080\5\u0080\u08cc\n"+
		"\u0080\3\u0080\3\u0080\3\u0080\5\u0080\u08d1\n\u0080\3\u0080\7\u0080\u08d4"+
		"\n\u0080\f\u0080\16\u0080\u08d7\13\u0080\3\u0081\3\u0081\3\u0082\3\u0082"+
		"\3\u0083\3\u0083\3\u0084\3\u0084\3\u0084\5\u0084\u08e2\n\u0084\3\u0084"+
		"\3\u0084\3\u0084\5\u0084\u08e7\n\u0084\3\u0084\3\u0084\3\u0084\5\u0084"+
		"\u08ec\n\u0084\3\u0084\3\u0084\3\u0085\3\u0085\3\u0085\7\u0085\u08f3\n"+
		"\u0085\f\u0085\16\u0085\u08f6\13\u0085\3\u0086\3\u0086\3\u0086\3\u0086"+
		"\3\u0086\3\u0086\3\u0086\5\u0086\u08ff\n\u0086\3\u0086\3\u0086\3\u0086"+
		"\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\5\u0086\u0909\n\u0086\7\u0086"+
		"\u090b\n\u0086\f\u0086\16\u0086\u090e\13\u0086\3\u0087\3\u0087\3\u0087"+
		"\7\u0087\u0913\n\u0087\f\u0087\16\u0087\u0916\13\u0087\3\u0088\3\u0088"+
		"\3\u0088\3\u0088\3\u0088\5\u0088\u091d\n\u0088\3\u0089\3\u0089\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\3\u008b\3\u008b\3\u008b\5\u008b\u0928\n\u008b"+
		"\3\u008b\7\u008b\u092b\n\u008b\f\u008b\16\u008b\u092e\13\u008b\3\u008c"+
		"\3\u008c\5\u008c\u0932\n\u008c\3\u008c\3\u008c\3\u008c\3\u008c\5\u008c"+
		"\u0938\n\u008c\5\u008c\u093a\n\u008c\3\u008d\3\u008d\3\u008d\3\u008d\3"+
		"\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e"+
		"\3\u008f\3\u008f\3\u0090\3\u0090\5\u0090\u094d\n\u0090\3\u0090\3\u0090"+
		"\3\u0090\3\u0090\3\u0091\3\u0091\3\u0092\3\u0092\5\u0092\u0957\n\u0092"+
		"\5\u0092\u0959\n\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092"+
		"\3\u0092\3\u0092\3\u0092\3\u0092\3\u0093\3\u0093\3\u0093\7\u0093\u0968"+
		"\n\u0093\f\u0093\16\u0093\u096b\13\u0093\3\u0094\3\u0094\5\u0094\u096f"+
		"\n\u0094\3\u0094\5\u0094\u0972\n\u0094\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\5\u0095\u0978\n\u0095\5\u0095\u097a\n\u0095\3\u0095\3\u0095\5\u0095\u097e"+
		"\n\u0095\5\u0095\u0980\n\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\3\u0095\3\u0095\3\u0095\3\u0095\5\u0095\u098b\n\u0095\5\u0095\u098d\n"+
		"\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0096\3\u0096\3\u0096\7\u0096"+
		"\u0996\n\u0096\f\u0096\16\u0096\u0999\13\u0096\3\u0097\3\u0097\3\u0097"+
		"\5\u0097\u099e\n\u0097\5\u0097\u09a0\n\u0097\3\u0097\3\u0097\5\u0097\u09a4"+
		"\n\u0097\3\u0097\3\u0097\3\u0097\3\u0098\3\u0098\3\u0098\3\u0098\5\u0098"+
		"\u09ad\n\u0098\3\u0098\3\u0098\3\u0099\3\u0099\3\u0099\7\u0099\u09b4\n"+
		"\u0099\f\u0099\16\u0099\u09b7\13\u0099\3\u009a\3\u009a\3\u009a\5\u009a"+
		"\u09bc\n\u009a\3\u009b\3\u009b\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c"+
		"\3\u009c\5\u009c\u09c6\n\u009c\3\u009c\3\u009c\3\u009c\3\u009c\5\u009c"+
		"\u09cc\n\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c"+
		"\5\u009c\u09d5\n\u009c\3\u009d\3\u009d\3\u009e\5\u009e\u09da\n\u009e\3"+
		"\u009e\3\u009e\5\u009e\u09de\n\u009e\3\u009f\3\u009f\3\u009f\7\u009f\u09e3"+
		"\n\u009f\f\u009f\16\u009f\u09e6\13\u009f\3\u00a0\3\u00a0\3\u00a0\3\u00a0"+
		"\3\u00a0\3\u00a0\3\u00a0\3\u00a0\5\u00a0\u09f0\n\u00a0\3\u00a0\3\u00a0"+
		"\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a2\3\u00a2\3\u00a2\7\u00a2\u09fb"+
		"\n\u00a2\f\u00a2\16\u00a2\u09fe\13\u00a2\3\u00a3\3\u00a3\5\u00a3\u0a02"+
		"\n\u00a3\3\u00a3\3\u00a3\5\u00a3\u0a06\n\u00a3\3\u00a3\3\u00a3\5\u00a3"+
		"\u0a0a\n\u00a3\3\u00a4\3\u00a4\5\u00a4\u0a0e\n\u00a4\3\u00a4\3\u00a4\3"+
		"\u00a4\7\u00a4\u0a13\n\u00a4\f\u00a4\16\u00a4\u0a16\13\u00a4\3\u00a5\3"+
		"\u00a5\5\u00a5\u0a1a\n\u00a5\3\u00a5\5\u00a5\u0a1d\n\u00a5\3\u00a5\3\u00a5"+
		"\5\u00a5\u0a21\n\u00a5\3\u00a5\3\u00a5\5\u00a5\u0a25\n\u00a5\3\u00a6\3"+
		"\u00a6\3\u00a6\5\u00a6\u0a2a\n\u00a6\3\u00a6\5\u00a6\u0a2d\n\u00a6\3\u00a6"+
		"\3\u00a6\5\u00a6\u0a31\n\u00a6\3\u00a6\3\u00a6\5\u00a6\u0a35\n\u00a6\3"+
		"\u00a7\3\u00a7\3\u00a8\3\u00a8\3\u00a8\5\u00a8\u0a3c\n\u00a8\3\u00a8\5"+
		"\u00a8\u0a3f\n\u00a8\3\u00a8\3\u00a8\7\u00a8\u0a43\n\u00a8\f\u00a8\16"+
		"\u00a8\u0a46\13\u00a8\3\u00a8\3\u00a8\5\u00a8\u0a4a\n\u00a8\3\u00a8\3"+
		"\u00a8\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9"+
		"\5\u00a9\u0a56\n\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\5\u00a9"+
		"\u0a5d\n\u00a9\3\u00aa\3\u00aa\3\u00aa\3\u00aa\5\u00aa\u0a63\n\u00aa\3"+
		"\u00aa\5\u00aa\u0a66\n\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3"+
		"\u00aa\5\u00aa\u0a6e\n\u00aa\3\u00ab\5\u00ab\u0a71\n\u00ab\3\u00ab\3\u00ab"+
		"\5\u00ab\u0a75\n\u00ab\5\u00ab\u0a77\n\u00ab\3\u00ac\3\u00ac\3\u00ac\3"+
		"\u00ac\3\u00ac\3\u00ac\3\u00ac\5\u00ac\u0a80\n\u00ac\3\u00ad\3\u00ad\3"+
		"\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\5\u00ad\u0a89\n\u00ad\3\u00ae\3"+
		"\u00ae\5\u00ae\u0a8d\n\u00ae\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\3"+
		"\u00af\3\u00af\3\u00af\5\u00af\u0a97\n\u00af\3\u00af\5\u00af\u0a9a\n\u00af"+
		"\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\5\u00af\u0aa2\n\u00af"+
		"\5\u00af\u0aa4\n\u00af\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0"+
		"\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\5\u00b0\u0ab1\n\u00b0\3\u00b0"+
		"\3\u00b0\5\u00b0\u0ab5\n\u00b0\3\u00b0\3\u00b0\3\u00b0\5\u00b0\u0aba\n"+
		"\u00b0\3\u00b0\3\u00b0\5\u00b0\u0abe\n\u00b0\7\u00b0\u0ac0\n\u00b0\f\u00b0"+
		"\16\u00b0\u0ac3\13\u00b0\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1"+
		"\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\5\u00b1\u0ad0\n\u00b1\3\u00b1"+
		"\3\u00b1\5\u00b1\u0ad4\n\u00b1\3\u00b1\3\u00b1\3\u00b1\5\u00b1\u0ad9\n"+
		"\u00b1\3\u00b1\3\u00b1\5\u00b1\u0add\n\u00b1\7\u00b1\u0adf\n\u00b1\f\u00b1"+
		"\16\u00b1\u0ae2\13\u00b1\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2"+
		"\3\u00b2\3\u00b2\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3"+
		"\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\5\u00b3\u0afa"+
		"\n\u00b3\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4"+
		"\3\u00b5\3\u00b5\3\u00b5\3\u00b5\5\u00b5\u0b08\n\u00b5\3\u00b5\5\u00b5"+
		"\u0b0b\n\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5"+
		"\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\5\u00b5\u0b19\n\u00b5\3\u00b6"+
		"\3\u00b6\3\u00b6\3\u00b6\3\u00b6\5\u00b6\u0b20\n\u00b6\3\u00b6\3\u00b6"+
		"\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6"+
		"\5\u00b6\u0b2d\n\u00b6\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\7\u00b7"+
		"\u0b34\n\u00b7\f\u00b7\16\u00b7\u0b37\13\u00b7\5\u00b7\u0b39\n\u00b7\3"+
		"\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\5\u00b7\u0b40\n\u00b7\3\u00b8\3"+
		"\u00b8\3\u00b8\5\u00b8\u0b45\n\u00b8\3\u00b8\3\u00b8\3\u00b8\5\u00b8\u0b4a"+
		"\n\u00b8\3\u00b8\3\u00b8\3\u00b9\3\u00b9\3\u00b9\3\u00b9\5\u00b9\u0b52"+
		"\n\u00b9\3\u00b9\3\u00b9\3\u00b9\5\u00b9\u0b57\n\u00b9\3\u00b9\3\u00b9"+
		"\3\u00ba\3\u00ba\5\u00ba\u0b5d\n\u00ba\3\u00ba\3\u00ba\3\u00ba\5\u00ba"+
		"\u0b62\n\u00ba\3\u00ba\3\u00ba\3\u00ba\5\u00ba\u0b67\n\u00ba\7\u00ba\u0b69"+
		"\n\u00ba\f\u00ba\16\u00ba\u0b6c\13\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba"+
		"\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\5\u00bb\u0b78\n\u00bb"+
		"\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\7\u00bc\u0b80\n\u00bc"+
		"\f\u00bc\16\u00bc\u0b83\13\u00bc\3\u00bc\3\u00bc\5\u00bc\u0b87\n\u00bc"+
		"\3\u00bc\3\u00bc\3\u00bc\5\u00bc\u0b8c\n\u00bc\5\u00bc\u0b8e\n\u00bc\3"+
		"\u00bc\3\u00bc\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u0b95\n\u00bd\3\u00bd\3"+
		"\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u0b9d\n\u00bd\3\u00bd\3"+
		"\u00bd\3\u00bd\3\u00bd\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be"+
		"\3\u00be\5\u00be\u0baa\n\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be"+
		"\3\u00be\5\u00be\u0bb2\n\u00be\5\u00be\u0bb4\n\u00be\3\u00be\3\u00be\3"+
		"\u00be\3\u00be\3\u00be\3\u00be\5\u00be\u0bbc\n\u00be\3\u00be\3\u00be\3"+
		"\u00be\3\u00be\3\u00be\3\u00be\5\u00be\u0bc4\n\u00be\5\u00be\u0bc6\n\u00be"+
		"\7\u00be\u0bc8\n\u00be\f\u00be\16\u00be\u0bcb\13\u00be\3\u00be\3\u00be"+
		"\3\u00bf\3\u00bf\5\u00bf\u0bd1\n\u00bf\3\u00c0\3\u00c0\3\u00c0\3\u00c0"+
		"\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\5\u00c0"+
		"\u0bdf\n\u00c0\3\u00c1\3\u00c1\3\u00c2\3\u00c2\3\u00c2\5\u00c2\u0be6\n"+
		"\u00c2\3\u00c3\3\u00c3\3\u00c4\3\u00c4\3\u00c5\3\u00c5\3\u00c5\5\u00c5"+
		"\u0bef\n\u00c5\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6"+
		"\5\u00c6\u0bf8\n\u00c6\3\u00c7\3\u00c7\3\u00c7\5\u00c7\u0bfd\n\u00c7\3"+
		"\u00c8\3\u00c8\3\u00c8\5\u00c8\u0c02\n\u00c8\3\u00c8\2\2\u00c9\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX"+
		"Z\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0"+
		"\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8"+
		"\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0"+
		"\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108"+
		"\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120"+
		"\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138"+
		"\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150"+
		"\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168"+
		"\u016a\u016c\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c\u017e\u0180"+
		"\u0182\u0184\u0186\u0188\u018a\u018c\u018e\2*\3\3\u00ef\u00ef\3\2\u00bc"+
		"\u00bd\4\2\7\7{{\4\2\u00dc\u00dc\u010a\u010a\5\2\7\7\33\33LM\4\2__qq\4"+
		"\2\u00f4\u00f4\u00fc\u00fc\5\2<<ee\u00fa\u00fb\5\2^^\u008a\u008a\u00d7"+
		"\u00d7\3\2\u0112\u0116\5\2\7\7\33\33MM\4\2\26\26\u00d2\u00d2\4\2\u009b"+
		"\u009b\u00ea\u00ea\6\2ll\177\177\u0097\u0097\u00c4\u00c4\t\2ll\177\177"+
		"\u0097\u0097\u009b\u009b\u00c4\u00c4\u00d3\u00d6\u00ea\u00ea\6\2\27\27"+
		"\66\66nn\u00a5\u00a5\3\2\u00d1\u00d2\4\2\20\20``\4\2\20\20bb\4\2  KK\6"+
		"\2..\65\65GGOO\4\2\u00c2\u00c2\u00d2\u00d2\4\2HH\u00d0\u00d0\5\2}}\u008b"+
		"\u008b\u00be\u00be\4\2ii\u00bf\u00bf\5\2\65\65\u0082\u0082\u009d\u009d"+
		"\5\2\7\7\n\n\u00cc\u00cc\4\2\u0080\u0080\u0088\u0088\4\2\7\7\u00df\u00df"+
		"\4\2VV\u00c6\u00c6\4\2((oo\3\2\u00fa\u00fb\4\2\u0080\u0080\u00bb\u00bb"+
		"\4\2||\u00b2\u00b2\4\2AA\u00b5\u00b5\4\2\f\f\32\32\4\2{{\u0089\u0089\3"+
		"\2\u00ad\u00ae\4\2yy\u0081\u0081\4\2\u00ec\u00ec\u00ee\u00ee\u0d80\2\u0195"+
		"\3\2\2\2\4\u0199\3\2\2\2\6\u01b1\3\2\2\2\b\u01da\3\2\2\2\n\u01f8\3\2\2"+
		"\2\f\u0217\3\2\2\2\16\u021c\3\2\2\2\20\u0228\3\2\2\2\22\u0236\3\2\2\2"+
		"\24\u0248\3\2\2\2\26\u0267\3\2\2\2\30\u026c\3\2\2\2\32\u02a1\3\2\2\2\34"+
		"\u02a3\3\2\2\2\36\u02bb\3\2\2\2 \u02bd\3\2\2\2\"\u02d3\3\2\2\2$\u02ed"+
		"\3\2\2\2&\u02f3\3\2\2\2(\u02fb\3\2\2\2*\u0330\3\2\2\2,\u033e\3\2\2\2."+
		"\u0348\3\2\2\2\60\u0353\3\2\2\2\62\u037e\3\2\2\2\64\u038e\3\2\2\2\66\u0395"+
		"\3\2\2\28\u0397\3\2\2\2:\u03a5\3\2\2\2<\u03aa\3\2\2\2>\u03ac\3\2\2\2@"+
		"\u03b8\3\2\2\2B\u03c1\3\2\2\2D\u03d5\3\2\2\2F\u03d7\3\2\2\2H\u03db\3\2"+
		"\2\2J\u03df\3\2\2\2L\u03f0\3\2\2\2N\u03f5\3\2\2\2P\u03f9\3\2\2\2R\u0413"+
		"\3\2\2\2T\u0415\3\2\2\2V\u041f\3\2\2\2X\u0422\3\2\2\2Z\u0431\3\2\2\2\\"+
		"\u0435\3\2\2\2^\u0443\3\2\2\2`\u0457\3\2\2\2b\u0459\3\2\2\2d\u0493\3\2"+
		"\2\2f\u0495\3\2\2\2h\u0498\3\2\2\2j\u04c5\3\2\2\2l\u04c7\3\2\2\2n\u04d1"+
		"\3\2\2\2p\u04df\3\2\2\2r\u0508\3\2\2\2t\u050a\3\2\2\2v\u051c\3\2\2\2x"+
		"\u05f6\3\2\2\2z\u05f8\3\2\2\2|\u05fa\3\2\2\2~\u0601\3\2\2\2\u0080\u061a"+
		"\3\2\2\2\u0082\u061c\3\2\2\2\u0084\u061e\3\2\2\2\u0086\u062b\3\2\2\2\u0088"+
		"\u062f\3\2\2\2\u008a\u063e\3\2\2\2\u008c\u0670\3\2\2\2\u008e\u067e\3\2"+
		"\2\2\u0090\u0685\3\2\2\2\u0092\u06bd\3\2\2\2\u0094\u06bf\3\2\2\2\u0096"+
		"\u06ca\3\2\2\2\u0098\u06e0\3\2\2\2\u009a\u06fc\3\2\2\2\u009c\u06ff\3\2"+
		"\2\2\u009e\u0718\3\2\2\2\u00a0\u071c\3\2\2\2\u00a2\u0722\3\2\2\2\u00a4"+
		"\u0726\3\2\2\2\u00a6\u0728\3\2\2\2\u00a8\u072c\3\2\2\2\u00aa\u072e\3\2"+
		"\2\2\u00ac\u0730\3\2\2\2\u00ae\u0732\3\2\2\2\u00b0\u0734\3\2\2\2\u00b2"+
		"\u073c\3\2\2\2\u00b4\u0740\3\2\2\2\u00b6\u0744\3\2\2\2\u00b8\u0746\3\2"+
		"\2\2\u00ba\u0754\3\2\2\2\u00bc\u0756\3\2\2\2\u00be\u076f\3\2\2\2\u00c0"+
		"\u077f\3\2\2\2\u00c2\u0781\3\2\2\2\u00c4\u078c\3\2\2\2\u00c6\u078e\3\2"+
		"\2\2\u00c8\u0793\3\2\2\2\u00ca\u0799\3\2\2\2\u00cc\u07a3\3\2\2\2\u00ce"+
		"\u07a5\3\2\2\2\u00d0\u07a7\3\2\2\2\u00d2\u07af\3\2\2\2\u00d4\u07ba\3\2"+
		"\2\2\u00d6\u07cd\3\2\2\2\u00d8\u07cf\3\2\2\2\u00da\u07e3\3\2\2\2\u00dc"+
		"\u080d\3\2\2\2\u00de\u082f\3\2\2\2\u00e0\u0852\3\2\2\2\u00e2\u0857\3\2"+
		"\2\2\u00e4\u085b\3\2\2\2\u00e6\u0862\3\2\2\2\u00e8\u086f\3\2\2\2\u00ea"+
		"\u0873\3\2\2\2\u00ec\u087d\3\2\2\2\u00ee\u0889\3\2\2\2\u00f0\u0892\3\2"+
		"\2\2\u00f2\u0897\3\2\2\2\u00f4\u08a1\3\2\2\2\u00f6\u08ac\3\2\2\2\u00f8"+
		"\u08bb\3\2\2\2\u00fa\u08bd\3\2\2\2\u00fc\u08bf\3\2\2\2\u00fe\u08c2\3\2"+
		"\2\2\u0100\u08d8\3\2\2\2\u0102\u08da\3\2\2\2\u0104\u08dc\3\2\2\2\u0106"+
		"\u08e1\3\2\2\2\u0108\u08ef\3\2\2\2\u010a\u08fe\3\2\2\2\u010c\u090f\3\2"+
		"\2\2\u010e\u091c\3\2\2\2\u0110\u091e\3\2\2\2\u0112\u0920\3\2\2\2\u0114"+
		"\u0924\3\2\2\2\u0116\u0931\3\2\2\2\u0118\u093b\3\2\2\2\u011a\u093f\3\2"+
		"\2\2\u011c\u0948\3\2\2\2\u011e\u094c\3\2\2\2\u0120\u0952\3\2\2\2\u0122"+
		"\u0958\3\2\2\2\u0124\u0964\3\2\2\2\u0126\u096c\3\2\2\2\u0128\u097f\3\2"+
		"\2\2\u012a\u0992\3\2\2\2\u012c\u099f\3\2\2\2\u012e\u09a8\3\2\2\2\u0130"+
		"\u09b0\3\2\2\2\u0132\u09bb\3\2\2\2\u0134\u09bd\3\2\2\2\u0136\u09bf\3\2"+
		"\2\2\u0138\u09d6\3\2\2\2\u013a\u09dd\3\2\2\2\u013c\u09df\3\2\2\2\u013e"+
		"\u09e7\3\2\2\2\u0140\u09f3\3\2\2\2\u0142\u09f7\3\2\2\2\u0144\u0a05\3\2"+
		"\2\2\u0146\u0a0b\3\2\2\2\u0148\u0a17\3\2\2\2\u014a\u0a26\3\2\2\2\u014c"+
		"\u0a36\3\2\2\2\u014e\u0a38\3\2\2\2\u0150\u0a5c\3\2\2\2\u0152\u0a5e\3\2"+
		"\2\2\u0154\u0a70\3\2\2\2\u0156\u0a7f\3\2\2\2\u0158\u0a81\3\2\2\2\u015a"+
		"\u0a8c\3\2\2\2\u015c\u0aa3\3\2\2\2\u015e\u0aa5\3\2\2\2\u0160\u0ac4\3\2"+
		"\2\2\u0162\u0ae3\3\2\2\2\u0164\u0aeb\3\2\2\2\u0166\u0afb\3\2\2\2\u0168"+
		"\u0b03\3\2\2\2\u016a\u0b1a\3\2\2\2\u016c\u0b2e\3\2\2\2\u016e\u0b44\3\2"+
		"\2\2\u0170\u0b4d\3\2\2\2\u0172\u0b5a\3\2\2\2\u0174\u0b77\3\2\2\2\u0176"+
		"\u0b79\3\2\2\2\u0178\u0b91\3\2\2\2\u017a\u0ba2\3\2\2\2\u017c\u0bd0\3\2"+
		"\2\2\u017e\u0bde\3\2\2\2\u0180\u0be0\3\2\2\2\u0182\u0be5\3\2\2\2\u0184"+
		"\u0be7\3\2\2\2\u0186\u0be9\3\2\2\2\u0188\u0bee\3\2\2\2\u018a\u0bf7\3\2"+
		"\2\2\u018c\u0bfc\3\2\2\2\u018e\u0c01\3\2\2\2\u0190\u0196\5(\25\2\u0191"+
		"\u0196\5 \21\2\u0192\u0196\5\f\7\2\u0193\u0196\5\6\4\2\u0194\u0196\5\4"+
		"\3\2\u0195\u0190\3\2\2\2\u0195\u0191\3\2\2\2\u0195\u0192\3\2\2\2\u0195"+
		"\u0193\3\2\2\2\u0195\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0198\t\2"+
		"\2\2\u0198\3\3\2\2\2\u0199\u019b\7\31\2\2\u019a\u019c\7#\2\2\u019b\u019a"+
		"\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u01a3\3\2\2\2\u019d\u01a4\5\32\16\2"+
		"\u019e\u019f\7\u00a8\2\2\u019f\u01a0\7\u00f7\2\2\u01a0\u01a1\5\32\16\2"+
		"\u01a1\u01a2\7\u00f6\2\2\u01a2\u01a4\3\2\2\2\u01a3\u019d\3\2\2\2\u01a3"+
		"\u019e\3\2\2\2\u01a4\u01a6\3\2\2\2\u01a5\u01a7\5|?\2\u01a6\u01a5\3\2\2"+
		"\2\u01a6\u01a7\3\2\2\2\u01a7\u01a9\3\2\2\2\u01a8\u01aa\5\u00bc_\2\u01a9"+
		"\u01a8\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ac\3\2\2\2\u01ab\u01ad\5\24"+
		"\13\2\u01ac\u01ab\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01af\3\2\2\2\u01ae"+
		"\u01b0\5\34\17\2\u01af\u01ae\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\5\3\2\2"+
		"\2\u01b1\u01b2\7\u0096\2\2\u01b2\u01b6\7,\2\2\u01b3\u01b4\5\u00aaV\2\u01b4"+
		"\u01b5\7\u00f2\2\2\u01b5\u01b7\3\2\2\2\u01b6\u01b3\3\2\2\2\u01b6\u01b7"+
		"\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01ba\5\u00a8U\2\u01b9\u01bb\5|?\2"+
		"\u01ba\u01b9\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01c4"+
		"\7\u00e2\2\2\u01bd\u01c5\5d\63\2\u01be\u01bf\5\u00aaV\2\u01bf\u01c0\7"+
		"\u00f2\2\2\u01c0\u01c2\3\2\2\2\u01c1\u01be\3\2\2\2\u01c1\u01c2\3\2\2\2"+
		"\u01c2\u01c3\3\2\2\2\u01c3\u01c5\5\u00a8U\2\u01c4\u01bd\3\2\2\2\u01c4"+
		"\u01c1\3\2\2\2\u01c5\u01c7\3\2\2\2\u01c6\u01c8\5|?\2\u01c7\u01c6\3\2\2"+
		"\2\u01c7\u01c8\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01ca\78\2\2\u01ca\u01cb"+
		"\7\u00f7\2\2\u01cb\u01cc\5\u00ceh\2\u01cc\u01d5\7\u00f6\2\2\u01cd\u01cf"+
		"\5\b\5\2\u01ce\u01d0\5\n\6\2\u01cf\u01ce\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0"+
		"\u01d6\3\2\2\2\u01d1\u01d3\5\n\6\2\u01d2\u01d4\5\b\5\2\u01d3\u01d2\3\2"+
		"\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d6\3\2\2\2\u01d5\u01cd\3\2\2\2\u01d5"+
		"\u01d1\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d8\3\2\2\2\u01d7\u01d9\5\34"+
		"\17\2\u01d8\u01d7\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\7\3\2\2\2\u01da\u01db"+
		"\7\u00e7\2\2\u01db\u01dc\7\u0092\2\2\u01dc\u01dd\7I\2\2\u01dd\u01de\7"+
		"N\2\2\u01de\u01df\7D\2\2\u01df\u01e0\5\u0080A\2\u01e0\u01e3\7\u00fd\2"+
		"\2\u01e1\u01e4\7\30\2\2\u01e2\u01e4\5<\37\2\u01e3\u01e1\3\2\2\2\u01e3"+
		"\u01e2\3\2\2\2\u01e4\u01ee\3\2\2\2\u01e5\u01e6\7\u00f3\2\2\u01e6\u01e7"+
		"\5\u0080A\2\u01e7\u01ea\7\u00fd\2\2\u01e8\u01eb\7\30\2\2\u01e9\u01eb\5"+
		"<\37\2\u01ea\u01e8\3\2\2\2\u01ea\u01e9\3\2\2\2\u01eb\u01ed\3\2\2\2\u01ec"+
		"\u01e5\3\2\2\2\u01ed\u01f0\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ee\u01ef\3\2"+
		"\2\2\u01ef\u01f2\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f1\u01f3\5\u00bc_\2\u01f2"+
		"\u01f1\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f6\3\2\2\2\u01f4\u01f5\7\31"+
		"\2\2\u01f5\u01f7\5\u00bc_\2\u01f6\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7"+
		"\t\3\2\2\2\u01f8\u01f9\7\u00e7\2\2\u01f9\u01fa\7\63\2\2\u01fa\u01fb\7"+
		"\u0092\2\2\u01fb\u01fc\7I\2\2\u01fc\u0201\7)\2\2\u01fd\u01fe\7\u00f7\2"+
		"\2\u01fe\u01ff\5\u00b0Y\2\u01ff\u0200\7\u00f6\2\2\u0200\u0202\3\2\2\2"+
		"\u0201\u01fd\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0204"+
		"\7P\2\2\u0204\u0207\7\u00f7\2\2\u0205\u0208\7\30\2\2\u0206\u0208\5<\37"+
		"\2\u0207\u0205\3\2\2\2\u0207\u0206\3\2\2\2\u0208\u0210\3\2\2\2\u0209\u020c"+
		"\7\u00f3\2\2\u020a\u020d\7\30\2\2\u020b\u020d\5<\37\2\u020c\u020a\3\2"+
		"\2\2\u020c\u020b\3\2\2\2\u020d\u020f\3\2\2\2\u020e\u0209\3\2\2\2\u020f"+
		"\u0212\3\2\2\2\u0210\u020e\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0213\3\2"+
		"\2\2\u0212\u0210\3\2\2\2\u0213\u0215\7\u00f6\2\2\u0214\u0216\5\u00bc_"+
		"\2\u0215\u0214\3\2\2\2\u0215\u0216\3\2\2\2\u0216\13\3\2\2\2\u0217\u021a"+
		"\7)\2\2\u0218\u021b\5\16\b\2\u0219\u021b\5\26\f\2\u021a\u0218\3\2\2\2"+
		"\u021a\u0219\3\2\2\2\u021b\r\3\2\2\2\u021c\u0223\5\20\t\2\u021d\u021f"+
		"\5\22\n\2\u021e\u0220\5\24\13\2\u021f\u021e\3\2\2\2\u021f\u0220\3\2\2"+
		"\2\u0220\u0224\3\2\2\2\u0221\u0224\5(\25\2\u0222\u0224\5d\63\2\u0223\u021d"+
		"\3\2\2\2\u0223\u0221\3\2\2\2\u0223\u0222\3\2\2\2\u0224\u0226\3\2\2\2\u0225"+
		"\u0227\5\34\17\2\u0226\u0225\3\2\2\2\u0226\u0227\3\2\2\2\u0227\17\3\2"+
		"\2\2\u0228\u022a\7,\2\2\u0229\u022b\5\u0184\u00c3\2\u022a\u0229\3\2\2"+
		"\2\u022a\u022b\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022e\5\32\16\2\u022d"+
		"\u022f\5|?\2\u022e\u022d\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0234\3\2\2"+
		"\2\u0230\u0231\7\u00f7\2\2\u0231\u0232\5\u00b0Y\2\u0232\u0233\7\u00f6"+
		"\2\2\u0233\u0235\3\2\2\2\u0234\u0230\3\2\2\2\u0234\u0235\3\2\2\2\u0235"+
		"\21\3\2\2\2\u0236\u0237\7P\2\2\u0237\u023a\7\u00f7\2\2\u0238\u023b\7\30"+
		"\2\2\u0239\u023b\5<\37\2\u023a\u0238\3\2\2\2\u023a\u0239\3\2\2\2\u023b"+
		"\u0243\3\2\2\2\u023c\u023f\7\u00f3\2\2\u023d\u0240\7\30\2\2\u023e\u0240"+
		"\5<\37\2\u023f\u023d\3\2\2\2\u023f\u023e\3\2\2\2\u0240\u0242\3\2\2\2\u0241"+
		"\u023c\3\2\2\2\u0242\u0245\3\2\2\2\u0243\u0241\3\2\2\2\u0243\u0244\3\2"+
		"\2\2\u0244\u0246\3\2\2\2\u0245\u0243\3\2\2\2\u0246\u0247\7\u00f6\2\2\u0247"+
		"\23\3\2\2\2\u0248\u0249\t\3\2\2\u0249\u024e\5<\37\2\u024a\u024b\7\u00f3"+
		"\2\2\u024b\u024d\5<\37\2\u024c\u024a\3\2\2\2\u024d\u0250\3\2\2\2\u024e"+
		"\u024c\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u0251\3\2\2\2\u0250\u024e\3\2"+
		"\2\2\u0251\u0252\7,\2\2\u0252\u0257\5\36\20\2\u0253\u0254\7\u00f3\2\2"+
		"\u0254\u0256\5\36\20\2\u0255\u0253\3\2\2\2\u0256\u0259\3\2\2\2\u0257\u0255"+
		"\3\2\2\2\u0257\u0258\3\2\2\2\u0258\25\3\2\2\2\u0259\u0257\3\2\2\2\u025a"+
		"\u0262\7\7\2\2\u025b\u025d\5\20\t\2\u025c\u025e\5\22\n\2\u025d\u025c\3"+
		"\2\2\2\u025d\u025e\3\2\2\2\u025e\u0260\3\2\2\2\u025f\u0261\5\34\17\2\u0260"+
		"\u025f\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0263\3\2\2\2\u0262\u025b\3\2"+
		"\2\2\u0263\u0264\3\2\2\2\u0264\u0262\3\2\2\2\u0264\u0265\3\2\2\2\u0265"+
		"\u0268\3\2\2\2\u0266\u0268\5\30\r\2\u0267\u025a\3\2\2\2\u0267\u0266\3"+
		"\2\2\2\u0268\u0269\3\2\2\2\u0269\u026a\5d\63\2\u026a\27\3\2\2\2\u026b"+
		"\u026d\t\4\2\2\u026c\u026b\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u0279\3\2"+
		"\2\2\u026e\u026f\7\u00e7\2\2\u026f\u0270\5\u00ceh\2\u0270\u0275\7I\2\2"+
		"\u0271\u0273\5\20\t\2\u0272\u0274\5\22\n\2\u0273\u0272\3\2\2\2\u0273\u0274"+
		"\3\2\2\2\u0274\u0276\3\2\2\2\u0275\u0271\3\2\2\2\u0276\u0277\3\2\2\2\u0277"+
		"\u0275\3\2\2\2\u0277\u0278\3\2\2\2\u0278\u027a\3\2\2\2\u0279\u026e\3\2"+
		"\2\2\u027a\u027b\3\2\2\2\u027b\u0279\3\2\2\2\u027b\u027c\3\2\2\2\u027c"+
		"\u027d\3\2\2\2\u027d\u0282\7\35\2\2\u027e\u0280\5\20\t\2\u027f\u0281\5"+
		"\22\n\2\u0280\u027f\3\2\2\2\u0280\u0281\3\2\2\2\u0281\u0283\3\2\2\2\u0282"+
		"\u027e\3\2\2\2\u0283\u0284\3\2\2\2\u0284\u0282\3\2\2\2\u0284\u0285\3\2"+
		"\2\2\u0285\31\3\2\2\2\u0286\u0287\5\u00aaV\2\u0287\u0288\7\u00f2\2\2\u0288"+
		"\u028a\3\2\2\2\u0289\u0286\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u028b\3\2"+
		"\2\2\u028b\u028f\5\u00a8U\2\u028c\u0290\5\u0092J\2\u028d\u028e\7\u00f5"+
		"\2\2\u028e\u0290\5\u00aeX\2\u028f\u028c\3\2\2\2\u028f\u028d\3\2\2\2\u028f"+
		"\u0290\3\2\2\2\u0290\u02a2\3\2\2\2\u0291\u0293\5d\63\2\u0292\u0294\5\u0094"+
		"K\2\u0293\u0292\3\2\2\2\u0293\u0294\3\2\2\2\u0294\u0297\3\2\2\2\u0295"+
		"\u0298\5\u0172\u00ba\2\u0296\u0298\5\u0178\u00bd\2\u0297\u0295\3\2\2\2"+
		"\u0297\u0296\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u02a2\3\2\2\2\u0299\u029a"+
		"\7\u00f7\2\2\u029a\u029c\5d\63\2\u029b\u029d\5\u0094K\2\u029c\u029b\3"+
		"\2\2\2\u029c\u029d\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u029f\7\u00f6\2\2"+
		"\u029f\u02a2\3\2\2\2\u02a0\u02a2\5\u0096L\2\u02a1\u0289\3\2\2\2\u02a1"+
		"\u0291\3\2\2\2\u02a1\u0299\3\2\2\2\u02a1\u02a0\3\2\2\2\u02a2\33\3\2\2"+
		"\2\u02a3\u02a4\7\u0090\2\2\u02a4\u02ac\7w\2\2\u02a5\u02a9\7,\2\2\u02a6"+
		"\u02a7\5\u00aaV\2\u02a7\u02a8\7\u00f2\2\2\u02a8\u02aa\3\2\2\2\u02a9\u02a6"+
		"\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab\u02ad\5\u00a8U"+
		"\2\u02ac\u02a5\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02b2\3\2\2\2\u02ae\u02af"+
		"\7\u00f7\2\2\u02af\u02b0\5`\61\2\u02b0\u02b1\7\u00f6\2\2\u02b1\u02b3\3"+
		"\2\2\2\u02b2\u02ae\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b7\3\2\2\2\u02b4"+
		"\u02b5\7\u00ba\2\2\u02b5\u02b6\7/\2\2\u02b6\u02b8\t\5\2\2\u02b7\u02b4"+
		"\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\35\3\2\2\2\u02b9\u02bc\5\u017e\u00c0"+
		"\2\u02ba\u02bc\5\u0182\u00c2\2\u02bb\u02b9\3\2\2\2\u02bb\u02ba\3\2\2\2"+
		"\u02bc\37\3\2\2\2\u02bd\u02c4\7N\2\2\u02be\u02bf\7\u00a8\2\2\u02bf\u02c0"+
		"\7\u00f7\2\2\u02c0\u02c1\5\32\16\2\u02c1\u02c2\7\u00f6\2\2\u02c2\u02c5"+
		"\3\2\2\2\u02c3\u02c5\5\32\16\2\u02c4\u02be\3\2\2\2\u02c4\u02c3\3\2\2\2"+
		"\u02c5\u02c7\3\2\2\2\u02c6\u02c8\5|?\2\u02c7\u02c6\3\2\2\2\u02c7\u02c8"+
		"\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02cb\5\"\22\2\u02ca\u02cc\5\u00bc"+
		"_\2\u02cb\u02ca\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02ce\3\2\2\2\u02cd"+
		"\u02cf\5\24\13\2\u02ce\u02cd\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02d1\3"+
		"\2\2\2\u02d0\u02d2\5\34\17\2\u02d1\u02d0\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2"+
		"!\3\2\2\2\u02d3\u02eb\7D\2\2\u02d4\u02d5\7\u00e3\2\2\u02d5\u02d6\7\u00f7"+
		"\2\2\u02d6\u02d7\5|?\2\u02d7\u02d8\7\u00f6\2\2\u02d8\u02db\7\u00fd\2\2"+
		"\u02d9\u02dc\5<\37\2\u02da\u02dc\5d\63\2\u02db\u02d9\3\2\2\2\u02db\u02da"+
		"\3\2\2\2\u02dc\u02ec\3\2\2\2\u02dd\u02e0\5$\23\2\u02de\u02e0\5&\24\2\u02df"+
		"\u02dd\3\2\2\2\u02df\u02de\3\2\2\2\u02e0\u02e8\3\2\2\2\u02e1\u02e4\7\u00f3"+
		"\2\2\u02e2\u02e5\5$\23\2\u02e3\u02e5\5&\24\2\u02e4\u02e2\3\2\2\2\u02e4"+
		"\u02e3\3\2\2\2\u02e5\u02e7\3\2\2\2\u02e6\u02e1\3\2\2\2\u02e7\u02ea\3\2"+
		"\2\2\u02e8\u02e6\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9\u02ec\3\2\2\2\u02ea"+
		"\u02e8\3\2\2\2\u02eb\u02d4\3\2\2\2\u02eb\u02df\3\2\2\2\u02ec#\3\2\2\2"+
		"\u02ed\u02ee\7\u00f7\2\2\u02ee\u02ef\5\u00b0Y\2\u02ef\u02f0\7\u00f6\2"+
		"\2\u02f0\u02f1\7\u00fd\2\2\u02f1\u02f2\5d\63\2\u02f2%\3\2\2\2\u02f3\u02f4"+
		"\5\u0080A\2\u02f4\u02f8\7\u00fd\2\2\u02f5\u02f9\7\30\2\2\u02f6\u02f9\5"+
		"d\63\2\u02f7\u02f9\5<\37\2\u02f8\u02f5\3\2\2\2\u02f8\u02f6\3\2\2\2\u02f8"+
		"\u02f7\3\2\2\2\u02f9\'\3\2\2\2\u02fa\u02fc\5*\26\2\u02fb\u02fa\3\2\2\2"+
		"\u02fb\u02fc\3\2\2\2\u02fc\u032e\3\2\2\2\u02fd\u02ff\7B\2\2\u02fe\u0300"+
		"\5\u0184\u00c3\2\u02ff\u02fe\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u0302\3"+
		"\2\2\2\u0301\u0303\t\6\2\2\u0302\u0301\3\2\2\2\u0302\u0303\3\2\2\2\u0303"+
		"\u0304\3\2\2\2\u0304\u030e\5\64\33\2\u0305\u0306\7,\2\2\u0306\u030b\5"+
		"\36\20\2\u0307\u0308\7\u00f3\2\2\u0308\u030a\5\36\20\2\u0309\u0307\3\2"+
		"\2\2\u030a\u030d\3\2\2\2\u030b\u0309\3\2\2\2\u030b\u030c\3\2\2\2\u030c"+
		"\u030f\3\2\2\2\u030d\u030b\3\2\2\2\u030e\u0305\3\2\2\2\u030e\u030f\3\2"+
		"\2\2\u030f\u0310\3\2\2\2\u0310\u0311\7#\2\2\u0311\u0313\5\u0088E\2\u0312"+
		"\u0314\5\u00bc_\2\u0313\u0312\3\2\2\2\u0313\u0314\3\2\2\2\u0314\u0316"+
		"\3\2\2\2\u0315\u0317\5\u00be`\2\u0316\u0315\3\2\2\2\u0316\u0317\3\2\2"+
		"\2\u0317\u0319\3\2\2\2\u0318\u031a\5\u00c0a\2\u0319\u0318\3\2\2\2\u0319"+
		"\u031a\3\2\2\2\u031a\u031c\3\2\2\2\u031b\u031d\5\u0114\u008b\2\u031c\u031b"+
		"\3\2\2\2\u031c\u031d\3\2\2\2\u031d\u0321\3\2\2\2\u031e\u0320\5\u0144\u00a3"+
		"\2\u031f\u031e\3\2\2\2\u0320\u0323\3\2\2\2\u0321\u031f\3\2\2\2\u0321\u0322"+
		"\3\2\2\2\u0322\u0325\3\2\2\2\u0323\u0321\3\2\2\2\u0324\u0326\5\u016c\u00b7"+
		"\2\u0325\u0324\3\2\2\2\u0325\u0326\3\2\2\2\u0326\u0328\3\2\2\2\u0327\u0329"+
		"\5\u0146\u00a4\2\u0328\u0327\3\2\2\2\u0328\u0329\3\2\2\2\u0329\u032b\3"+
		"\2\2\2\u032a\u032c\5\u016c\u00b7\2\u032b\u032a\3\2\2\2\u032b\u032c\3\2"+
		"\2\2\u032c\u032f\3\2\2\2\u032d\u032f\5d\63\2\u032e\u02fd\3\2\2\2\u032e"+
		"\u032d\3\2\2\2\u032f)\3\2\2\2\u0330\u0331\7T\2\2\u0331\u0335\5,\27\2\u0332"+
		"\u0334\5.\30\2\u0333\u0332\3\2\2\2\u0334\u0337\3\2\2\2\u0335\u0333\3\2"+
		"\2\2\u0335\u0336\3\2\2\2\u0336\u0339\3\2\2\2\u0337\u0335\3\2\2\2\u0338"+
		"\u033a\5\60\31\2\u0339\u0338\3\2\2\2\u0339\u033a\3\2\2\2\u033a\u033c\3"+
		"\2\2\2\u033b\u033d\5\62\32\2\u033c\u033b\3\2\2\2\u033c\u033d\3\2\2\2\u033d"+
		"+\3\2\2\2\u033e\u0343\5|?\2\u033f\u0340\7\u00f7\2\2\u0340\u0341\5\64\33"+
		"\2\u0341\u0342\7\u00f6\2\2\u0342\u0344\3\2\2\2\u0343\u033f\3\2\2\2\u0343"+
		"\u0344\3\2\2\2\u0344\u0345\3\2\2\2\u0345\u0346\7\13\2\2\u0346\u0347\5"+
		"d\63\2\u0347-\3\2\2\2\u0348\u0349\7\u00f3\2\2\u0349\u034e\5|?\2\u034a"+
		"\u034b\7\u00f7\2\2\u034b\u034c\5\64\33\2\u034c\u034d\7\u00f6\2\2\u034d"+
		"\u034f\3\2\2\2\u034e\u034a\3\2\2\2\u034e\u034f\3\2\2\2\u034f\u0350\3\2"+
		"\2\2\u0350\u0351\7\13\2\2\u0351\u0352\5d\63\2\u0352/\3\2\2\2\u0353\u0354"+
		"\7\u00c3\2\2\u0354\u0355\t\7\2\2\u0355\u0356\7{\2\2\u0356\u0357\7\16\2"+
		"\2\u0357\u0359\5~@\2\u0358\u035a\7\f\2\2\u0359\u0358\3\2\2\2\u0359\u035a"+
		"\3\2\2\2\u035a\u035c\3\2\2\2\u035b\u035d\7\32\2\2\u035c\u035b\3\2\2\2"+
		"\u035c\u035d\3\2\2\2\u035d\u0360\3\2\2\2\u035e\u035f\7\u00a4\2\2\u035f"+
		"\u0361\7{\2\2\u0360\u035e\3\2\2\2\u0360\u0361\3\2\2\2\u0361\u0364\3\2"+
		"\2\2\u0362\u0363\7\u00a4\2\2\u0363\u0365\7\u0089\2\2\u0364\u0362\3\2\2"+
		"\2\u0364\u0365\3\2\2\2\u0365\u0378\3\2\2\2\u0366\u0367\7\u00f3\2\2\u0367"+
		"\u0369\5~@\2\u0368\u036a\7\f\2\2\u0369\u0368\3\2\2\2\u0369\u036a\3\2\2"+
		"\2\u036a\u036c\3\2\2\2\u036b\u036d\7\32\2\2\u036c\u036b\3\2\2\2\u036c"+
		"\u036d\3\2\2\2\u036d\u0370\3\2\2\2\u036e\u036f\7\u00a4\2\2\u036f\u0371"+
		"\7{\2\2\u0370\u036e\3\2\2\2\u0370\u0371\3\2\2\2\u0371\u0374\3\2\2\2\u0372"+
		"\u0373\7\u00a4\2\2\u0373\u0375\7\u0089\2\2\u0374\u0372\3\2\2\2\u0374\u0375"+
		"\3\2\2\2\u0375\u0377\3\2\2\2\u0376\u0366\3\2\2\2\u0377\u037a\3\2\2\2\u0378"+
		"\u0376\3\2\2\2\u0378\u0379\3\2\2\2\u0379\u037b\3\2\2\2\u037a\u0378\3\2"+
		"\2\2\u037b\u037c\7D\2\2\u037c\u037d\5\u017e\u00c0\2\u037d\61\3\2\2\2\u037e"+
		"\u037f\7k\2\2\u037f\u0384\5~@\2\u0380\u0381\7\u00f3\2\2\u0381\u0383\5"+
		"~@\2\u0382\u0380\3\2\2\2\u0383\u0386\3\2\2\2\u0384\u0382\3\2\2\2\u0384"+
		"\u0385\3\2\2\2\u0385\u0387\3\2\2\2\u0386\u0384\3\2\2\2\u0387\u0388\7D"+
		"\2\2\u0388\u0389\5\u017e\u00c0\2\u0389\u038a\7J\2\2\u038a\u038b\5\u013a"+
		"\u009e\2\u038b\u038c\7\30\2\2\u038c\u038d\5\u013a\u009e\2\u038d\63\3\2"+
		"\2\2\u038e\u0392\5\66\34\2\u038f\u0391\58\35\2\u0390\u038f\3\2\2\2\u0391"+
		"\u0394\3\2\2\2\u0392\u0390\3\2\2\2\u0392\u0393\3\2\2\2\u0393\65\3\2\2"+
		"\2\u0394\u0392\3\2\2\2\u0395\u0396\5:\36\2\u0396\67\3\2\2\2\u0397\u0398"+
		"\7\u00f3\2\2\u0398\u0399\5:\36\2\u03999\3\2\2\2\u039a\u03a6\7\u00f4\2"+
		"\2\u039b\u039c\5\u00aaV\2\u039c\u039d\7\u00f2\2\2\u039d\u039f\3\2\2\2"+
		"\u039e\u039b\3\2\2\2\u039e\u039f\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a1"+
		"\5|?\2\u03a1\u03a2\7\u00f2\2\2\u03a2\u03a3\7\u00f4\2\2\u03a3\u03a6\3\2"+
		"\2\2\u03a4\u03a6\5<\37\2\u03a5\u039a\3\2\2\2\u03a5\u039e\3\2\2\2\u03a5"+
		"\u03a4\3\2\2\2\u03a6\u03a8\3\2\2\2\u03a7\u03a9\5~@\2\u03a8\u03a7\3\2\2"+
		"\2\u03a8\u03a9\3\2\2\2\u03a9;\3\2\2\2\u03aa\u03ab\5> \2\u03ab=\3\2\2\2"+
		"\u03ac\u03b5\5@!\2\u03ad\u03b1\7\u00fa\2\2\u03ae\u03b1\7\u00fb\2\2\u03af"+
		"\u03b1\5\u0188\u00c5\2\u03b0\u03ad\3\2\2\2\u03b0\u03ae\3\2\2\2\u03b0\u03af"+
		"\3\2\2\2\u03b1\u03b2\3\2\2\2\u03b2\u03b4\5@!\2\u03b3\u03b0\3\2\2\2\u03b4"+
		"\u03b7\3\2\2\2\u03b5\u03b3\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6?\3\2\2\2"+
		"\u03b7\u03b5\3\2\2\2\u03b8\u03bd\5B\"\2\u03b9\u03ba\t\b\2\2\u03ba\u03bc"+
		"\5B\"\2\u03bb\u03b9\3\2\2\2\u03bc\u03bf\3\2\2\2\u03bd\u03bb\3\2\2\2\u03bd"+
		"\u03be\3\2\2\2\u03beA\3\2\2\2\u03bf\u03bd\3\2\2\2\u03c0\u03c2\t\t\2\2"+
		"\u03c1\u03c0\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2\u03c3\3\2\2\2\u03c3\u03c4"+
		"\5D#\2\u03c4C\3\2\2\2\u03c5\u03d6\5l\67\2\u03c6\u03d6\5h\65\2\u03c7\u03d6"+
		"\5n8\2\u03c8\u03d6\5p9\2\u03c9\u03d6\5F$\2\u03ca\u03d6\5V,\2\u03cb\u03d6"+
		"\5v<\2\u03cc\u03d6\5r:\2\u03cd\u03d6\5^\60\2\u03ce\u03d6\5T+\2\u03cf\u03d6"+
		"\5R*\2\u03d0\u03d6\5\u0150\u00a9\2\u03d1\u03d6\5\u015c\u00af\2\u03d2\u03d6"+
		"\5J&\2\u03d3\u03d6\5`\61\2\u03d4\u03d6\5d\63\2\u03d5\u03c5\3\2\2\2\u03d5"+
		"\u03c6\3\2\2\2\u03d5\u03c7\3\2\2\2\u03d5\u03c8\3\2\2\2\u03d5\u03c9\3\2"+
		"\2\2\u03d5\u03ca\3\2\2\2\u03d5\u03cb\3\2\2\2\u03d5\u03cc\3\2\2\2\u03d5"+
		"\u03cd\3\2\2\2\u03d5\u03ce\3\2\2\2\u03d5\u03cf\3\2\2\2\u03d5\u03d0\3\2"+
		"\2\2\u03d5\u03d1\3\2\2\2\u03d5\u03d2\3\2\2\2\u03d5\u03d3\3\2\2\2\u03d5"+
		"\u03d4\3\2\2\2\u03d6E\3\2\2\2\u03d7\u03d8\7\u00f7\2\2\u03d8\u03d9\5H%"+
		"\2\u03d9\u03da\7\u00f6\2\2\u03daG\3\2\2\2\u03db\u03dc\5<\37\2\u03dcI\3"+
		"\2\2\2\u03dd\u03e0\5\u0086D\2\u03de\u03e0\5\u014c\u00a7\2\u03df\u03dd"+
		"\3\2\2\2\u03df\u03de\3\2\2\2\u03e0\u03e1\3\2\2\2\u03e1\u03e3\7\u00f7\2"+
		"\2\u03e2\u03e4\5L\'\2\u03e3\u03e2\3\2\2\2\u03e3\u03e4\3\2\2\2\u03e4\u03e5"+
		"\3\2\2\2\u03e5\u03e6\7\u00f6\2\2\u03e6K\3\2\2\2\u03e7\u03f1\7\u00f4\2"+
		"\2\u03e8\u03ed\5N(\2\u03e9\u03ea\7\u00f3\2\2\u03ea\u03ec\5N(\2\u03eb\u03e9"+
		"\3\2\2\2\u03ec\u03ef\3\2\2\2\u03ed\u03eb\3\2\2\2\u03ed\u03ee\3\2\2\2\u03ee"+
		"\u03f1\3\2\2\2\u03ef\u03ed\3\2\2\2\u03f0\u03e7\3\2\2\2\u03f0\u03e8\3\2"+
		"\2\2\u03f1M\3\2\2\2\u03f2\u03f3\5P)\2\u03f3\u03f4\7\u0102\2\2\u03f4\u03f6"+
		"\3\2\2\2\u03f5\u03f2\3\2\2\2\u03f5\u03f6\3\2\2\2\u03f6\u03f7\3\2\2\2\u03f7"+
		"\u03f8\5H%\2\u03f8O\3\2\2\2\u03f9\u03fa\5\u0180\u00c1\2\u03faQ\3\2\2\2"+
		"\u03fb\u03fc\7\u00d8\2\2\u03fc\u0404\7\u00f7\2\2\u03fd\u03ff\t\n\2\2\u03fe"+
		"\u03fd\3\2\2\2\u03fe\u03ff\3\2\2\2\u03ff\u0401\3\2\2\2\u0400\u0402\7\u00ec"+
		"\2\2\u0401\u0400\3\2\2\2\u0401\u0402\3\2\2\2\u0402\u0403\3\2\2\2\u0403"+
		"\u0405\7#\2\2\u0404\u03fe\3\2\2\2\u0404\u0405\3\2\2\2\u0405\u0406\3\2"+
		"\2\2\u0406\u0407\5<\37\2\u0407\u0408\7\u00f6\2\2\u0408\u0414\3\2\2\2\u0409"+
		"\u040a\7D\2\2\u040a\u040b\7\u00f7\2\2\u040b\u040c\5<\37\2\u040c\u040d"+
		"\7\u00f6\2\2\u040d\u0414\3\2\2\2\u040e\u040f\7\u008d\2\2\u040f\u0410\7"+
		"\u00f7\2\2\u0410\u0411\5\u00ceh\2\u0411\u0412\7\u00f6\2\2\u0412\u0414"+
		"\3\2\2\2\u0413\u03fb\3\2\2\2\u0413\u0409\3\2\2\2\u0413\u040e\3\2\2\2\u0414"+
		"S\3\2\2\2\u0415\u0418\7\17\2\2\u0416\u0419\5X-\2\u0417\u0419\5Z.\2\u0418"+
		"\u0416\3\2\2\2\u0418\u0417\3\2\2\2\u0419\u041b\3\2\2\2\u041a\u041c\5\\"+
		"/\2\u041b\u041a\3\2\2\2\u041b\u041c\3\2\2\2\u041c\u041d\3\2\2\2\u041d"+
		"\u041e\7u\2\2\u041eU\3\2\2\2\u041f\u0420\7j\2\2\u0420\u0421\5d\63\2\u0421"+
		"W\3\2\2\2\u0422\u0428\5H%\2\u0423\u0424\7\u00e7\2\2\u0424\u0425\5H%\2"+
		"\u0425\u0426\7I\2\2\u0426\u0427\5H%\2\u0427\u0429\3\2\2\2\u0428\u0423"+
		"\3\2\2\2\u0429\u042a\3\2\2\2\u042a\u0428\3\2\2\2\u042a\u042b\3\2\2\2\u042b"+
		"Y\3\2\2\2\u042c\u042d\7\u00e7\2\2\u042d\u042e\5\u00ceh\2\u042e\u042f\7"+
		"I\2\2\u042f\u0430\5H%\2\u0430\u0432\3\2\2\2\u0431\u042c\3\2\2\2\u0432"+
		"\u0433\3\2\2\2\u0433\u0431\3\2\2\2\u0433\u0434\3\2\2\2\u0434[\3\2\2\2"+
		"\u0435\u0436\7\35\2\2\u0436\u0437\5H%\2\u0437]\3\2\2\2\u0438\u0439\7\u00f7"+
		"\2\2\u0439\u043a\5<\37\2\u043a\u043b\7\u00f6\2\2\u043b\u043c\7\u00f2\2"+
		"\2\u043c\u0444\3\2\2\2\u043d\u043e\5\u00a8U\2\u043e\u043f\7\u00f2\2\2"+
		"\u043f\u0444\3\2\2\2\u0440\u0441\5J&\2\u0441\u0442\7\u00f2\2\2\u0442\u0444"+
		"\3\2\2\2\u0443\u0438\3\2\2\2\u0443\u043d\3\2\2\2\u0443\u0440\3\2\2\2\u0444"+
		"\u044a\3\2\2\2\u0445\u0446\5\u0180\u00c1\2\u0446\u0447\7\u00f2\2\2\u0447"+
		"\u0449\3\2\2\2\u0448\u0445\3\2\2\2\u0449\u044c\3\2\2\2\u044a\u0448\3\2"+
		"\2\2\u044a\u044b\3\2\2\2\u044b\u044d\3\2\2\2\u044c\u044a\3\2\2\2\u044d"+
		"\u044e\5J&\2\u044e_\3\2\2\2\u044f\u0458\5z>\2\u0450\u0451\7\u00cd\2\2"+
		"\u0451\u0458\t\13\2\2\u0452\u0458\5\u012e\u0098\2\u0453\u0458\5\u0080"+
		"A\2\u0454\u0458\5f\64\2\u0455\u0458\5\u0186\u00c4\2\u0456\u0458\7\u010a"+
		"\2\2\u0457\u044f\3\2\2\2\u0457\u0450\3\2\2\2\u0457\u0452\3\2\2\2\u0457"+
		"\u0453\3\2\2\2\u0457\u0454\3\2\2\2\u0457\u0455\3\2\2\2\u0457\u0456\3\2"+
		"\2\2\u0458a\3\2\2\2\u0459\u045b\7B\2\2\u045a\u045c\5\u0184\u00c3\2\u045b"+
		"\u045a\3\2\2\2\u045b\u045c\3\2\2\2\u045c\u045e\3\2\2\2\u045d\u045f\t\f"+
		"\2\2\u045e\u045d\3\2\2\2\u045e\u045f\3\2\2\2\u045f\u0460\3\2\2\2\u0460"+
		"\u0461\5\64\33\2\u0461\u0462\7#\2\2\u0462\u0464\5\u0088E\2\u0463\u0465"+
		"\5\u00bc_\2\u0464\u0463\3\2\2\2\u0464\u0465\3\2\2\2\u0465\u0467\3\2\2"+
		"\2\u0466\u0468\5\u00be`\2\u0467\u0466\3\2\2\2\u0467\u0468\3\2\2\2\u0468"+
		"\u046a\3\2\2\2\u0469\u046b\5\u00c0a\2\u046a\u0469\3\2\2\2\u046a\u046b"+
		"\3\2\2\2\u046b\u046d\3\2\2\2\u046c\u046e\5\u0114\u008b\2\u046d\u046c\3"+
		"\2\2\2\u046d\u046e\3\2\2\2\u046ec\3\2\2\2\u046f\u0470\7\u00f7\2\2\u0470"+
		"\u0471\5(\25\2\u0471\u0473\7\u00f6\2\2\u0472\u0474\5\u00c0a\2\u0473\u0472"+
		"\3\2\2\2\u0473\u0474\3\2\2\2\u0474\u0476\3\2\2\2\u0475\u0477\5\u0114\u008b"+
		"\2\u0476\u0475\3\2\2\2\u0476\u0477\3\2\2\2\u0477\u0479\3\2\2\2\u0478\u047a"+
		"\5\u016c\u00b7\2\u0479\u0478\3\2\2\2\u0479\u047a\3\2\2\2\u047a\u047c\3"+
		"\2\2\2\u047b\u047d\5\u0146\u00a4\2\u047c\u047b\3\2\2\2\u047c\u047d\3\2"+
		"\2\2\u047d\u047f\3\2\2\2\u047e\u0480\5\u016c\u00b7\2\u047f\u047e\3\2\2"+
		"\2\u047f\u0480\3\2\2\2\u0480\u0494\3\2\2\2\u0481\u0482\7\u00f7\2\2\u0482"+
		"\u0483\5d\63\2\u0483\u0485\7\u00f6\2\2\u0484\u0486\5\u00c0a\2\u0485\u0484"+
		"\3\2\2\2\u0485\u0486\3\2\2\2\u0486\u0488\3\2\2\2\u0487\u0489\5\u0114\u008b"+
		"\2\u0488\u0487\3\2\2\2\u0488\u0489\3\2\2\2\u0489\u048b\3\2\2\2\u048a\u048c"+
		"\5\u016c\u00b7\2\u048b\u048a\3\2\2\2\u048b\u048c\3\2\2\2\u048c\u048e\3"+
		"\2\2\2\u048d\u048f\5\u0146\u00a4\2\u048e\u048d\3\2\2\2\u048e\u048f\3\2"+
		"\2\2\u048f\u0491\3\2\2\2\u0490\u0492\5\u016c\u00b7\2\u0491\u0490\3\2\2"+
		"\2\u0491\u0492\3\2\2\2\u0492\u0494\3\2\2\2\u0493\u046f\3\2\2\2\u0493\u0481"+
		"\3\2\2\2\u0494e\3\2\2\2\u0495\u0496\t\r\2\2\u0496\u0497\5\u0186\u00c4"+
		"\2\u0497g\3\2\2\2\u0498\u04c1\7\u0085\2\2\u0499\u049c\5\u0186\u00c4\2"+
		"\u049a\u049c\5\u0182\u00c2\2\u049b\u0499\3\2\2\2\u049b\u049a\3\2\2\2\u049c"+
		"\u049d\3\2\2\2\u049d\u04a2\t\16\2\2\u049e\u049f\7\u00f7\2\2\u049f\u04a0"+
		"\5j\66\2\u04a0\u04a1\7\u00f6\2\2\u04a1\u04a3\3\2\2\2\u04a2\u049e\3\2\2"+
		"\2\u04a2\u04a3\3\2\2\2\u04a3\u04a6\3\2\2\2\u04a4\u04a5\7J\2\2\u04a5\u04a7"+
		"\t\16\2\2\u04a6\u04a4\3\2\2\2\u04a6\u04a7\3\2\2\2\u04a7\u04c2\3\2\2\2"+
		"\u04a8\u04ab\5\u0186\u00c4\2\u04a9\u04ab\5\u0182\u00c2\2\u04aa\u04a8\3"+
		"\2\2\2\u04aa\u04a9\3\2\2\2\u04ab\u04ac\3\2\2\2\u04ac\u04b5\t\17\2\2\u04ad"+
		"\u04ae\7\u00f7\2\2\u04ae\u04b1\5j\66\2\u04af\u04b0\7\u00f3\2\2\u04b0\u04b2"+
		"\5j\66\2\u04b1\u04af\3\2\2\2\u04b1\u04b2\3\2\2\2\u04b2\u04b3\3\2\2\2\u04b3"+
		"\u04b4\7\u00f6\2\2\u04b4\u04b6\3\2\2\2\u04b5\u04ad\3\2\2\2\u04b5\u04b6"+
		"\3\2\2\2\u04b6\u04bf\3\2\2\2\u04b7\u04b8\7J\2\2\u04b8\u04bd\t\17\2\2\u04b9"+
		"\u04ba\7\u00f7\2\2\u04ba\u04bb\5j\66\2\u04bb\u04bc\7\u00f6\2\2\u04bc\u04be"+
		"\3\2\2\2\u04bd\u04b9\3\2\2\2\u04bd\u04be\3\2\2\2\u04be\u04c0\3\2\2\2\u04bf"+
		"\u04b7\3\2\2\2\u04bf\u04c0\3\2\2\2\u04c0\u04c2\3\2\2\2\u04c1\u049b\3\2"+
		"\2\2\u04c1\u04aa\3\2\2\2\u04c2i\3\2\2\2\u04c3\u04c6\7\u010a\2\2\u04c4"+
		"\u04c6\5\u0182\u00c2\2\u04c5\u04c3\3\2\2\2\u04c5\u04c4\3\2\2\2\u04c6k"+
		"\3\2\2\2\u04c7\u04c8\7z\2\2\u04c8\u04c9\7\u00f7\2\2\u04c9\u04ca\t\20\2"+
		"\2\u04ca\u04cb\7#\2\2\u04cb\u04cc\5<\37\2\u04cc\u04cd\7\u00f6\2\2\u04cd"+
		"m\3\2\2\2\u04ce\u04d2\5J&\2\u04cf\u04d2\5v<\2\u04d0\u04d2\5`\61\2\u04d1"+
		"\u04ce\3\2\2\2\u04d1\u04cf\3\2\2\2\u04d1\u04d0\3\2\2\2\u04d2\u04d3\3\2"+
		"\2\2\u04d3\u04dd\7U\2\2\u04d4\u04de\7\u008e\2\2\u04d5\u04d6\7\u00d1\2"+
		"\2\u04d6\u04db\7\u00eb\2\2\u04d7\u04dc\5\u0186\u00c4\2\u04d8\u04dc\7m"+
		"\2\2\u04d9\u04dc\7\u00c7\2\2\u04da\u04dc\5<\37\2\u04db\u04d7\3\2\2\2\u04db"+
		"\u04d8\3\2\2\2\u04db\u04d9\3\2\2\2\u04db\u04da\3\2\2\2\u04dc\u04de\3\2"+
		"\2\2\u04dd\u04d4\3\2\2\2\u04dd\u04d5\3\2\2\2\u04deo\3\2\2\2\u04df\u04e3"+
		"\7\u00f7\2\2\u04e0\u04e4\5J&\2\u04e1\u04e4\5v<\2\u04e2\u04e4\5`\61\2\u04e3"+
		"\u04e0\3\2\2\2\u04e3\u04e1\3\2\2\2\u04e3\u04e2\3\2\2\2\u04e4\u04e5\3\2"+
		"\2\2\u04e5\u04e9\7\u00fb\2\2\u04e6\u04ea\5J&\2\u04e7\u04ea\5v<\2\u04e8"+
		"\u04ea\5`\61\2\u04e9\u04e6\3\2\2\2\u04e9\u04e7\3\2\2\2\u04e9\u04e8\3\2"+
		"\2\2\u04ea\u04eb\3\2\2\2\u04eb\u0506\7\u00f6\2\2\u04ec\u04f0\7l\2\2\u04ed"+
		"\u04ee\7\u00f7\2\2\u04ee\u04ef\7\u010a\2\2\u04ef\u04f1\7\u00f6\2\2\u04f0"+
		"\u04ed\3\2\2\2\u04f0\u04f1\3\2\2\2\u04f1\u04f2\3\2\2\2\u04f2\u04f3\7J"+
		"\2\2\u04f3\u04f7\7\u00c4\2\2\u04f4\u04f5\7\u00f7\2\2\u04f5\u04f6\7\u010a"+
		"\2\2\u04f6\u04f8\7\u00f6\2\2\u04f7\u04f4\3\2\2\2\u04f7\u04f8\3\2\2\2\u04f8"+
		"\u0507\3\2\2\2\u04f9\u04fd\7\u00ea\2\2\u04fa\u04fb\7\u00f7\2\2\u04fb\u04fc"+
		"\7\u010a\2\2\u04fc\u04fe\7\u00f6\2\2\u04fd\u04fa\3\2\2\2\u04fd\u04fe\3"+
		"\2\2\2\u04fe\u04ff\3\2\2\2\u04ff\u0500\7J\2\2\u0500\u0504\7\u009b\2\2"+
		"\u0501\u0502\7\u00f7\2\2\u0502\u0503\7\u010a\2\2\u0503\u0505\7\u00f6\2"+
		"\2\u0504\u0501\3\2\2\2\u0504\u0505\3\2\2\2\u0505\u0507\3\2\2\2\u0506\u04ec"+
		"\3\2\2\2\u0506\u04f9\3\2\2\2\u0507q\3\2\2\2\u0508\u0509\5t;\2\u0509s\3"+
		"\2\2\2\u050a\u050b\7d\2\2\u050b\u050c\7\u00f7\2\2\u050c\u050f\5\u0080"+
		"A\2\u050d\u050e\7\u00f3\2\2\u050e\u0510\5\u0080A\2\u050f\u050d\3\2\2\2"+
		"\u050f\u0510\3\2\2\2\u0510\u0513\3\2\2\2\u0511\u0512\7\u00f3\2\2\u0512"+
		"\u0514\7\u010a\2\2\u0513\u0511\3\2\2\2\u0513\u0514\3\2\2\2\u0514\u0515"+
		"\3\2\2\2\u0515\u0518\7\u00e2\2\2\u0516\u0519\5\u00b0Y\2\u0517\u0519\7"+
		"\u00f4\2\2\u0518\u0516\3\2\2\2\u0518\u0517\3\2\2\2\u0519\u051a\3\2\2\2"+
		"\u051a\u051b\7\u00f6\2\2\u051bu\3\2\2\2\u051c\u051d\7a\2\2\u051d\u0521"+
		"\7\u00f7\2\2\u051e\u0522\5<\37\2\u051f\u0520\7\u009c\2\2\u0520\u0522\5"+
		"d\63\2\u0521\u051e\3\2\2\2\u0521\u051f\3\2\2\2\u0522\u0523\3\2\2\2\u0523"+
		"\u0526\7\13\2\2\u0524\u0527\5x=\2\u0525\u0527\5\u0080A\2\u0526\u0524\3"+
		"\2\2\2\u0526\u0525\3\2\2\2\u0527\u0528\3\2\2\2\u0528\u0529\7\u00f6\2\2"+
		"\u0529w\3\2\2\2\u052a\u05f7\7Z\2\2\u052b\u05f7\7Y\2\2\u052c\u05f7\7X\2"+
		"\2\u052d\u05f7\7\u009f\2\2\u052e\u05f7\7\u00b1\2\2\u052f\u0537\t\21\2"+
		"\2\u0530\u0531\7\u00f7\2\2\u0531\u0534\7\u010a\2\2\u0532\u0533\7\u00f3"+
		"\2\2\u0533\u0535\7\u010a\2\2\u0534\u0532\3\2\2\2\u0534\u0535\3\2\2\2\u0535"+
		"\u0536\3\2\2\2\u0536\u0538\7\u00f6\2\2\u0537\u0530\3\2\2\2\u0537\u0538"+
		"\3\2\2\2\u0538\u05f7\3\2\2\2\u0539\u053b\7\61\2\2\u053a\u053c\7=\2\2\u053b"+
		"\u053a\3\2\2\2\u053b\u053c\3\2\2\2\u053c\u0540\3\2\2\2\u053d\u053e\7\u00f7"+
		"\2\2\u053e\u053f\7\u010a\2\2\u053f\u0541\7\u00f6\2\2\u0540\u053d\3\2\2"+
		"\2\u0540\u0541\3\2\2\2\u0541\u05f7\3\2\2\2\u0542\u0546\7=\2\2\u0543\u0544"+
		"\7\u00f7\2\2\u0544\u0545\7\u010a\2\2\u0545\u0547\7\u00f6\2\2\u0546\u0543"+
		"\3\2\2\2\u0546\u0547\3\2\2\2\u0547\u05f7\3\2\2\2\u0548\u05f7\7]\2\2\u0549"+
		"\u05f7\7\26\2\2\u054a\u054b\7\u0085\2\2\u054b\u054f\7l\2\2\u054c\u054d"+
		"\7\u00f7\2\2\u054d\u054e\7\u010a\2\2\u054e\u0550\7\u00f6\2\2\u054f\u054c"+
		"\3\2\2\2\u054f\u0550\3\2\2\2\u0550\u0551\3\2\2\2\u0551\u0552\7J\2\2\u0552"+
		"\u0556\7\u00c4\2\2\u0553\u0554\7\u00f7\2\2\u0554\u0555\7\u010a\2\2\u0555"+
		"\u0557\7\u00f6\2\2\u0556\u0553\3\2\2\2\u0556\u0557\3\2\2\2\u0557\u05f7"+
		"\3\2\2\2\u0558\u0559\7\u0085\2\2\u0559\u055d\7\u00ea\2\2\u055a\u055b\7"+
		"\u00f7\2\2\u055b\u055c\7\u010a\2\2\u055c\u055e\7\u00f6\2\2\u055d\u055a"+
		"\3\2\2\2\u055d\u055e\3\2\2\2\u055e\u055f\3\2\2\2\u055f\u0560\7J\2\2\u0560"+
		"\u05f7\7\u009b\2\2\u0561\u0565\t\22\2\2\u0562\u0563\7\u00f7\2\2\u0563"+
		"\u0564\7\u010a\2\2\u0564\u0566\7\u00f6\2\2\u0565\u0562\3\2\2\2\u0565\u0566"+
		"\3\2\2\2\u0566\u056d\3\2\2\2\u0567\u0569\7T\2\2\u0568\u056a\7\u008e\2"+
		"\2\u0569\u0568\3\2\2\2\u0569\u056a\3\2\2\2\u056a\u056b\3\2\2\2\u056b\u056c"+
		"\7\u00d1\2\2\u056c\u056e\7\u00eb\2\2\u056d\u0567\3\2\2\2\u056d\u056e\3"+
		"\2\2\2\u056e\u05f7\3\2\2\2\u056f\u05f7\7*\2\2\u0570\u05f7\7\u0084\2\2"+
		"\u0571\u05f7\7E\2\2\u0572\u0576\7!\2\2\u0573\u0574\7\u00f7\2\2\u0574\u0575"+
		"\7\u010a\2\2\u0575\u0577\7\u00f6\2\2\u0576\u0573\3\2\2\2\u0576\u0577\3"+
		"\2\2\2\u0577\u05f7\3\2\2\2\u0578\u05f7\7\u00b7\2\2\u0579\u057a\7s\2\2"+
		"\u057a\u05f7\7\u00b3\2\2\u057b\u057d\7\20\2\2\u057c\u057e\7\u00e4\2\2"+
		"\u057d\u057c\3\2\2\2\u057d\u057e\3\2\2\2\u057e\u0585\3\2\2\2\u057f\u0580"+
		"\7\u00f7\2\2\u0580\u0582\7\u010a\2\2\u0581\u0583\t\23\2\2\u0582\u0581"+
		"\3\2\2\2\u0582\u0583\3\2\2\2\u0583\u0584\3\2\2\2\u0584\u0586\7\u00f6\2"+
		"\2\u0585\u057f\3\2\2\2\u0585\u0586\3\2\2\2\u0586\u058f\3\2\2\2\u0587\u0588"+
		"\7b\2\2\u0588\u058d\7D\2\2\u0589\u058e\5\u0180\u00c1\2\u058a\u058b\5\u0080"+
		"A\2\u058b\u058c\7\u0117\2\2\u058c\u058e\3\2\2\2\u058d\u0589\3\2\2\2\u058d"+
		"\u058a\3\2\2\2\u058e\u0590\3\2\2\2\u058f\u0587\3\2\2\2\u058f\u0590\3\2"+
		"\2\2\u0590\u05f7\3\2\2\2\u0591\u0598\7Q\2\2\u0592\u0593\7\u00f7\2\2\u0593"+
		"\u0595\7\u010a\2\2\u0594\u0596\t\23\2\2\u0595\u0594\3\2\2\2\u0595\u0596"+
		"\3\2\2\2\u0596\u0597\3\2\2\2\u0597\u0599\7\u00f6\2\2\u0598\u0592\3\2\2"+
		"\2\u0598\u0599\3\2\2\2\u0599\u05a2\3\2\2\2\u059a\u059b\7b\2\2\u059b\u05a0"+
		"\7D\2\2\u059c\u05a1\5\u0180\u00c1\2\u059d\u059e\5\u0080A\2\u059e\u059f"+
		"\7\u0117\2\2\u059f\u05a1\3\2\2\2\u05a0\u059c\3\2\2\2\u05a0\u059d\3\2\2"+
		"\2\u05a1\u05a3\3\2\2\2\u05a2\u059a\3\2\2\2\u05a2\u05a3\3\2\2\2\u05a3\u05f7"+
		"\3\2\2\2\u05a4\u05ab\7R\2\2\u05a5\u05a6\7\u00f7\2\2\u05a6\u05a8\7\u010a"+
		"\2\2\u05a7\u05a9\t\23\2\2\u05a8\u05a7\3\2\2\2\u05a8\u05a9\3\2\2\2\u05a9"+
		"\u05aa\3\2\2\2\u05aa\u05ac\7\u00f6\2\2\u05ab\u05a5\3\2\2\2\u05ab\u05ac"+
		"\3\2\2\2\u05ac\u05b5\3\2\2\2\u05ad\u05ae\7b\2\2\u05ae\u05b3\7D\2\2\u05af"+
		"\u05b4\5\u0180\u00c1\2\u05b0\u05b1\5\u0080A\2\u05b1\u05b2\7\u0117\2\2"+
		"\u05b2\u05b4\3\2\2\2\u05b3\u05af\3\2\2\2\u05b3\u05b0\3\2\2\2\u05b4\u05b6"+
		"\3\2\2\2\u05b5\u05ad\3\2\2\2\u05b5\u05b6\3\2\2\2\u05b6\u05f7\3\2\2\2\u05b7"+
		"\u05b9\7b\2\2\u05b8\u05ba\7\u00e4\2\2\u05b9\u05b8\3\2\2\2\u05b9\u05ba"+
		"\3\2\2\2\u05ba\u05be\3\2\2\2\u05bb\u05bc\7\u00f7\2\2\u05bc\u05bd\7\u010a"+
		"\2\2\u05bd\u05bf\7\u00f6\2\2\u05be\u05bb\3\2\2\2\u05be\u05bf\3\2\2\2\u05bf"+
		"\u05f7\3\2\2\2\u05c0\u05c2\7\u00a1\2\2\u05c1\u05c3\7\u00e4\2\2\u05c2\u05c1"+
		"\3\2\2\2\u05c2\u05c3\3\2\2\2\u05c3\u05c7\3\2\2\2\u05c4\u05c5\7\u00f7\2"+
		"\2\u05c5\u05c6\7\u010a\2\2\u05c6\u05c8\7\u00f6\2\2\u05c7\u05c4\3\2\2\2"+
		"\u05c7\u05c8\3\2\2\2\u05c8\u05f7\3\2\2\2\u05c9\u05cd\7\u00a6\2\2\u05ca"+
		"\u05cb\7\u00f7\2\2\u05cb\u05cc\7\u010a\2\2\u05cc\u05ce\7\u00f6\2\2\u05cd"+
		"\u05ca\3\2\2\2\u05cd\u05ce\3\2\2\2\u05ce\u05f7\3\2\2\2\u05cf\u05d3\7\u00a7"+
		"\2\2\u05d0\u05d1\7\u00f7\2\2\u05d1\u05d2\7\u010a\2\2\u05d2\u05d4\7\u00f6"+
		"\2\2\u05d3\u05d0\3\2\2\2\u05d3\u05d4\3\2\2\2\u05d4\u05f7\3\2\2\2\u05d5"+
		"\u05d6\7\u009e\2\2\u05d6\u05d8\t\24\2\2\u05d7\u05d9\7\u00e4\2\2\u05d8"+
		"\u05d7\3\2\2\2\u05d8\u05d9\3\2\2\2\u05d9\u05dd\3\2\2\2\u05da\u05db\7\u00f7"+
		"\2\2\u05db\u05dc\7\u010a\2\2\u05dc\u05de\7\u00f6\2\2\u05dd\u05da\3\2\2"+
		"\2\u05dd\u05de\3\2\2\2\u05de\u05f7\3\2\2\2\u05df\u05f7\7\u0099\2\2\u05e0"+
		"\u05f7\7\u00b0\2\2\u05e1\u05f7\7[\2\2\u05e2\u05eb\7c\2\2\u05e3\u05e4\7"+
		"b\2\2\u05e4\u05e9\7D\2\2\u05e5\u05ea\5\u0180\u00c1\2\u05e6\u05e7\5\u0080"+
		"A\2\u05e7\u05e8\7\u0117\2\2\u05e8\u05ea\3\2\2\2\u05e9\u05e5\3\2\2\2\u05e9"+
		"\u05e6\3\2\2\2\u05ea\u05ec\3\2\2\2\u05eb\u05e3\3\2\2\2\u05eb\u05ec\3\2"+
		"\2\2\u05ec\u05f7\3\2\2\2\u05ed\u05f7\7\u00a2\2\2\u05ee\u05f7\7W\2\2\u05ef"+
		"\u05f7\7?\2\2\u05f0\u05f4\7\u00e1\2\2\u05f1\u05f2\7\u00f7\2\2\u05f2\u05f3"+
		"\7\u010a\2\2\u05f3\u05f5\7\u00f6\2\2\u05f4\u05f1\3\2\2\2\u05f4\u05f5\3"+
		"\2\2\2\u05f5\u05f7\3\2\2\2\u05f6\u052a\3\2\2\2\u05f6\u052b\3\2\2\2\u05f6"+
		"\u052c\3\2\2\2\u05f6\u052d\3\2\2\2\u05f6\u052e\3\2\2\2\u05f6\u052f\3\2"+
		"\2\2\u05f6\u0539\3\2\2\2\u05f6\u0542\3\2\2\2\u05f6\u0548\3\2\2\2\u05f6"+
		"\u0549\3\2\2\2\u05f6\u054a\3\2\2\2\u05f6\u0558\3\2\2\2\u05f6\u0561\3\2"+
		"\2\2\u05f6\u056f\3\2\2\2\u05f6\u0570\3\2\2\2\u05f6\u0571\3\2\2\2\u05f6"+
		"\u0572\3\2\2\2\u05f6\u0578\3\2\2\2\u05f6\u0579\3\2\2\2\u05f6\u057b\3\2"+
		"\2\2\u05f6\u0591\3\2\2\2\u05f6\u05a4\3\2\2\2\u05f6\u05b7\3\2\2\2\u05f6"+
		"\u05c0\3\2\2\2\u05f6\u05c9\3\2\2\2\u05f6\u05cf\3\2\2\2\u05f6\u05d5\3\2"+
		"\2\2\u05f6\u05df\3\2\2\2\u05f6\u05e0\3\2\2\2\u05f6\u05e1\3\2\2\2\u05f6"+
		"\u05e2\3\2\2\2\u05f6\u05ed\3\2\2\2\u05f6\u05ee\3\2\2\2\u05f6\u05ef\3\2"+
		"\2\2\u05f6\u05f0\3\2\2\2\u05f7y\3\2\2\2\u05f8\u05f9\t\25\2\2\u05f9{\3"+
		"\2\2\2\u05fa\u05fb\5\u017e\u00c0\2\u05fb}\3\2\2\2\u05fc\u05fe\7\13\2\2"+
		"\u05fd\u05fc\3\2\2\2\u05fd\u05fe\3\2\2\2\u05fe\u05ff\3\2\2\2\u05ff\u0602"+
		"\5\u017e\u00c0\2\u0600\u0602\7\13\2\2\u0601\u05fd\3\2\2\2\u0601\u0600"+
		"\3\2\2\2\u0602\177\3\2\2\2\u0603\u0604\5\u00aaV\2\u0604\u0605\7\u00f2"+
		"\2\2\u0605\u0607\3\2\2\2\u0606\u0603\3\2\2\2\u0606\u0607\3\2\2\2\u0607"+
		"\u0608\3\2\2\2\u0608\u0609\5|?\2\u0609\u060a\7\u00f2\2\2\u060a\u060c\3"+
		"\2\2\2\u060b\u0606\3\2\2\2\u060b\u060c\3\2\2\2\u060c\u060d\3\2\2\2\u060d"+
		"\u060f\5\u0102\u0082\2\u060e\u0610\5\u00a6T\2\u060f\u060e\3\2\2\2\u060f"+
		"\u0610\3\2\2\2\u0610\u061b\3\2\2\2\u0611\u0612\5\u00aaV\2\u0612\u0613"+
		"\7\u00f2\2\2\u0613\u0614\5\u00acW\2\u0614\u0615\7\u00f2\2\2\u0615\u0616"+
		"\5\u0180\u00c1\2\u0616\u0617\7\u00f2\2\2\u0617\u061b\3\2\2\2\u0618\u061b"+
		"\5\u0082B\2\u0619\u061b\5\u0182\u00c2\2\u061a\u060b\3\2\2\2\u061a\u0611"+
		"\3\2\2\2\u061a\u0618\3\2\2\2\u061a\u0619\3\2\2\2\u061b\u0081\3\2\2\2\u061c"+
		"\u061d\t\26\2\2\u061d\u0083\3\2\2\2\u061e\u061f\5\u017e\u00c0\2\u061f"+
		"\u0085\3\2\2\2\u0620\u0621\5\u00aaV\2\u0621\u0622\7\u00f2\2\2\u0622\u0623"+
		"\5\u00acW\2\u0623\u0624\7\u00f2\2\2\u0624\u0625\5\u0084C\2\u0625\u062c"+
		"\3\2\2\2\u0626\u0627\5\u00aaV\2\u0627\u0628\7\u00f2\2\2\u0628\u0629\5"+
		"\u0084C\2\u0629\u062c\3\2\2\2\u062a\u062c\5\u0084C\2\u062b\u0620\3\2\2"+
		"\2\u062b\u0626\3\2\2\2\u062b\u062a\3\2\2\2\u062c\u0087\3\2\2\2\u062d\u0630"+
		"\5\u0098M\2\u062e\u0630\5\u008aF\2\u062f\u062d\3\2\2\2\u062f\u062e\3\2"+
		"\2\2\u0630\u0635\3\2\2\2\u0631\u0632\7\u00f3\2\2\u0632\u0634\5\u008aF"+
		"\2\u0633\u0631\3\2\2\2\u0634\u0637\3\2\2\2\u0635\u0633\3\2\2\2\u0635\u0636"+
		"\3\2\2\2\u0636\u0089\3\2\2\2\u0637\u0635\3\2\2\2\u0638\u0639\7\u00a8\2"+
		"\2\u0639\u063a\7\u00f7\2\2\u063a\u063b\5\u008cG\2\u063b\u063c\7\u00f6"+
		"\2\2\u063c\u063f\3\2\2\2\u063d\u063f\5\u008cG\2\u063e\u0638\3\2\2\2\u063e"+
		"\u063d\3\2\2\2\u063f\u0641\3\2\2\2\u0640\u0642\5\u008eH\2\u0641\u0640"+
		"\3\2\2\2\u0641\u0642\3\2\2\2\u0642\u0644\3\2\2\2\u0643\u0645\5|?\2\u0644"+
		"\u0643\3\2\2\2\u0644\u0645\3\2\2\2\u0645\u008b\3\2\2\2\u0646\u0647\5\u00aa"+
		"V\2\u0647\u0648\7\u00f2\2\2\u0648\u064a\3\2\2\2\u0649\u0646\3\2\2\2\u0649"+
		"\u064a\3\2\2\2\u064a\u064b\3\2\2\2\u064b\u064f\5\u00a8U\2\u064c\u0650"+
		"\5\u0092J\2\u064d\u064e\7\u00f5\2\2\u064e\u0650\5\u00aeX\2\u064f\u064c"+
		"\3\2\2\2\u064f\u064d\3\2\2\2\u064f\u0650\3\2\2\2\u0650\u0652\3\2\2\2\u0651"+
		"\u0653\5\u0090I\2\u0652\u0651\3\2\2\2\u0652\u0653\3\2\2\2\u0653\u0656"+
		"\3\2\2\2\u0654\u0657\5\u0172\u00ba\2\u0655\u0657\5\u0178\u00bd\2\u0656"+
		"\u0654\3\2\2\2\u0656\u0655\3\2\2\2\u0656\u0657\3\2\2\2\u0657\u0671\3\2"+
		"\2\2\u0658\u065a\5d\63\2\u0659\u065b\5\u0094K\2\u065a\u0659\3\2\2\2\u065a"+
		"\u065b\3\2\2\2\u065b\u065e\3\2\2\2\u065c\u065f\5\u0172\u00ba\2\u065d\u065f"+
		"\5\u0178\u00bd\2\u065e\u065c\3\2\2\2\u065e\u065d\3\2\2\2\u065e\u065f\3"+
		"\2\2\2\u065f\u0671\3\2\2\2\u0660\u0661\7\u00f7\2\2\u0661\u0663\5d\63\2"+
		"\u0662\u0664\5\u0094K\2\u0663\u0662\3\2\2\2\u0663\u0664\3\2\2\2\u0664"+
		"\u0667\3\2\2\2\u0665\u0668\5\u0172\u00ba\2\u0666\u0668\5\u0178\u00bd\2"+
		"\u0667\u0665\3\2\2\2\u0667\u0666\3\2\2\2\u0667\u0668\3\2\2\2\u0668\u0669"+
		"\3\2\2\2\u0669\u066a\7\u00f6\2\2\u066a\u0671\3\2\2\2\u066b\u066e\5\u0096"+
		"L\2\u066c\u066f\5\u0172\u00ba\2\u066d\u066f\5\u0178\u00bd\2\u066e\u066c"+
		"\3\2\2\2\u066e\u066d\3\2\2\2\u066e\u066f\3\2\2\2\u066f\u0671\3\2\2\2\u0670"+
		"\u0649\3\2\2\2\u0670\u0658\3\2\2\2\u0670\u0660\3\2\2\2\u0670\u066b\3\2"+
		"\2\2\u0671\u008d\3\2\2\2\u0672\u0673\7\u00e5\2\2\u0673\u0674\7\r\2\2\u0674"+
		"\u0677\t\27\2\2\u0675\u0678\5<\37\2\u0676\u0678\7\u0098\2\2\u0677\u0675"+
		"\3\2\2\2\u0677\u0676\3\2\2\2\u0678\u0679\3\2\2\2\u0679\u067c\7\t\2\2\u067a"+
		"\u067d\5<\37\2\u067b\u067d\7\u0093\2\2\u067c\u067a\3\2\2\2\u067c\u067b"+
		"\3\2\2\2\u067d\u067f\3\2\2\2\u067e\u0672\3\2\2\2\u067e\u067f\3\2\2\2\u067f"+
		"\u0680\3\2\2\2\u0680\u0681\7\13\2\2\u0681\u0682\7\67\2\2\u0682\u0683\t"+
		"\27\2\2\u0683\u0684\5<\37\2\u0684\u008f\3\2\2\2\u0685\u0687\7\u00c1\2"+
		"\2\u0686\u0688\7\\\2\2\u0687\u0686\3\2\2\2\u0687\u0688\3\2\2\2\u0688\u0689"+
		"\3\2\2\2\u0689\u068a\7\u00f7\2\2\u068a\u068d\5\u00a2R\2\u068b\u068c\7"+
		"\u00f3\2\2\u068c\u068e\5\u00a2R\2\u068d\u068b\3\2\2\2\u068d\u068e\3\2"+
		"\2\2\u068e\u068f\3\2\2\2\u068f\u0695\7\u00f6\2\2\u0690\u0691\7\u00c5\2"+
		"\2\u0691\u0692\7\u00f7\2\2\u0692\u0693\5\u00a4S\2\u0693\u0694\7\u00f6"+
		"\2\2\u0694\u0696\3\2\2\2\u0695\u0690\3\2\2\2\u0695\u0696\3\2\2\2\u0696"+
		"\u0091\3\2\2\2\u0697\u06a8\7\u00ab\2\2\u0698\u0699\7\u00f7\2\2\u0699\u069a"+
		"\5\u00b2Z\2\u069a\u069b\7\u00f6\2\2\u069b\u06a9\3\2\2\2\u069c\u069d\7"+
		"\"\2\2\u069d\u069e\7\u00f7\2\2\u069e\u06a3\5\u00b4[\2\u069f\u06a0\7\u00f3"+
		"\2\2\u06a0\u06a2\5\u00b4[\2\u06a1\u069f\3\2\2\2\u06a2\u06a5\3\2\2\2\u06a3"+
		"\u06a1\3\2\2\2\u06a3\u06a4\3\2\2\2\u06a4\u06a6\3\2\2\2\u06a5\u06a3\3\2"+
		"\2\2\u06a6\u06a7\7\u00f6\2\2\u06a7\u06a9\3\2\2\2\u06a8\u0698\3\2\2\2\u06a8"+
		"\u069c\3\2\2\2\u06a9\u06be\3\2\2\2\u06aa\u06bb\7\u00cf\2\2\u06ab\u06ac"+
		"\7\u00f7\2\2\u06ac\u06ad\5\u00b2Z\2\u06ad\u06ae\7\u00f6\2\2\u06ae\u06bc"+
		"\3\2\2\2\u06af\u06b0\7\"\2\2\u06b0\u06b1\7\u00f7\2\2\u06b1\u06b6\5\u00b6"+
		"\\\2\u06b2\u06b3\7\u00f3\2\2\u06b3\u06b5\5\u00b6\\\2\u06b4\u06b2\3\2\2"+
		"\2\u06b5\u06b8\3\2\2\2\u06b6\u06b4\3\2\2\2\u06b6\u06b7\3\2\2\2\u06b7\u06b9"+
		"\3\2\2\2\u06b8\u06b6\3\2\2\2\u06b9\u06ba\7\u00f6\2\2\u06ba\u06bc\3\2\2"+
		"\2\u06bb\u06ab\3\2\2\2\u06bb\u06af\3\2\2\2\u06bc\u06be\3\2\2\2\u06bd\u0697"+
		"\3\2\2\2\u06bd\u06aa\3\2\2\2\u06be\u0093\3\2\2\2\u06bf\u06c8\7T\2\2\u06c0"+
		"\u06c1\7\u00b6\2\2\u06c1\u06c9\7\u00a8\2\2\u06c2\u06c3\7\21\2\2\u06c3"+
		"\u06c6\79\2\2\u06c4\u06c5\7f\2\2\u06c5\u06c7\5\u00b8]\2\u06c6\u06c4\3"+
		"\2\2\2\u06c6\u06c7\3\2\2\2\u06c7\u06c9\3\2\2\2\u06c8\u06c0\3\2\2\2\u06c8"+
		"\u06c2\3\2\2\2\u06c9\u0095\3\2\2\2\u06ca\u06cb\t\30\2\2\u06cb\u06cd\5"+
		"\u00ba^\2\u06cc\u06ce\5\u00a6T\2\u06cd\u06cc\3\2\2\2\u06cd\u06ce\3\2\2"+
		"\2\u06ce\u0097\3\2\2\2\u06cf\u06d0\7\u00f7\2\2\u06d0\u06d1\5\u0098M\2"+
		"\u06d1\u06d2\7\u00f6\2\2\u06d2\u06d5\3\2\2\2\u06d3\u06d5\5\u008aF\2\u06d4"+
		"\u06cf\3\2\2\2\u06d4\u06d3\3\2\2\2\u06d5\u06d8\3\2\2\2\u06d6\u06d9\5\u009a"+
		"N\2\u06d7\u06d9\5\u009cO\2\u06d8\u06d6\3\2\2\2\u06d8\u06d7\3\2\2\2\u06d9"+
		"\u06da\3\2\2\2\u06da\u06d8\3\2\2\2\u06da\u06db\3\2\2\2\u06db\u06e1\3\2"+
		"\2\2\u06dc\u06dd\7\u00f7\2\2\u06dd\u06de\5\u0098M\2\u06de\u06df\7\u00f6"+
		"\2\2\u06df\u06e1\3\2\2\2\u06e0\u06d4\3\2\2\2\u06e0\u06dc\3\2\2\2\u06e1"+
		"\u0099\3\2\2\2\u06e2\u06e4\7\u0083\2\2\u06e3\u06e2\3\2\2\2\u06e3\u06e4"+
		"\3\2\2\2\u06e4\u06e5\3\2\2\2\u06e5\u06e6\7\u0087\2\2\u06e6\u06f0\5\u008a"+
		"F\2\u06e7\u06e8\78\2\2\u06e8\u06ef\5\u00ceh\2\u06e9\u06ea\7\u00e2\2\2"+
		"\u06ea\u06eb\7\u00f7\2\2\u06eb\u06ec\5\u00b0Y\2\u06ec\u06ed\7\u00f6\2"+
		"\2\u06ed\u06ef\3\2\2\2\u06ee\u06e7\3\2\2\2\u06ee\u06e9\3\2\2\2\u06ef\u06f2"+
		"\3\2\2\2\u06f0\u06ee\3\2\2\2\u06f0\u06f1\3\2\2\2\u06f1\u06fd\3\2\2\2\u06f2"+
		"\u06f0\3\2\2\2\u06f3\u06f9\7h\2\2\u06f4\u06f6\7\u009f\2\2\u06f5\u06f7"+
		"\7\u0083\2\2\u06f6\u06f5\3\2\2\2\u06f6\u06f7\3\2\2\2\u06f7\u06f9\3\2\2"+
		"\2\u06f8\u06f3\3\2\2\2\u06f8\u06f4\3\2\2\2\u06f9\u06fa\3\2\2\2\u06fa\u06fb"+
		"\7\u0087\2\2\u06fb\u06fd\5\u008aF\2\u06fc\u06e3\3\2\2\2\u06fc\u06f8\3"+
		"\2\2\2\u06fd\u009b\3\2\2\2\u06fe\u0700\5\u009eP\2\u06ff\u06fe\3\2\2\2"+
		"\u06ff\u0700\3\2\2\2\u0700\u0709\3\2\2\2\u0701\u0702\5\u00a0Q\2\u0702"+
		"\u0703\7\u0087\2\2\u0703\u070a\3\2\2\2\u0704\u0706\7\u009f\2\2\u0705\u0707"+
		"\5\u00a0Q\2\u0706\u0705\3\2\2\2\u0706\u0707\3\2\2\2\u0707\u0708\3\2\2"+
		"\2\u0708\u070a\7\u0087\2\2\u0709\u0701\3\2\2\2\u0709\u0704\3\2\2\2\u070a"+
		"\u070b\3\2\2\2\u070b\u070d\5\u008aF\2\u070c\u070e\5\u009eP\2\u070d\u070c"+
		"\3\2\2\2\u070d\u070e\3\2\2\2\u070e\u0716\3\2\2\2\u070f\u0710\78\2\2\u0710"+
		"\u0717\5\u00ceh\2\u0711\u0712\7\u00e2\2\2\u0712\u0713\7\u00f7\2\2\u0713"+
		"\u0714\5\u00b0Y\2\u0714\u0715\7\u00f6\2\2\u0715\u0717\3\2\2\2\u0716\u070f"+
		"\3\2\2\2\u0716\u0711\3\2\2\2\u0716\u0717\3\2\2\2\u0717\u009d\3\2\2\2\u0718"+
		"\u0719\7\u00ab\2\2\u0719\u071a\7\16\2\2\u071a\u071b\5\u010e\u0088\2\u071b"+
		"\u009f\3\2\2\2\u071c\u071e\t\31\2\2\u071d\u071f\7\u00a9\2\2\u071e\u071d"+
		"\3\2\2\2\u071e\u071f\3\2\2\2\u071f\u00a1\3\2\2\2\u0720\u0723\7\u010a\2"+
		"\2\u0721\u0723\5\u0182\u00c2\2\u0722\u0720\3\2\2\2\u0722\u0721\3\2\2\2"+
		"\u0723\u00a3\3\2\2\2\u0724\u0727\7\u010a\2\2\u0725\u0727\5\u0182\u00c2"+
		"\2\u0726\u0724\3\2\2\2\u0726\u0725\3\2\2\2\u0727\u00a5\3\2\2\2\u0728\u0729"+
		"\7\u00f7\2\2\u0729\u072a\7\u00fa\2\2\u072a\u072b\7\u00f6\2\2\u072b\u00a7"+
		"\3\2\2\2\u072c\u072d\5\u017e\u00c0\2\u072d\u00a9\3\2\2\2\u072e\u072f\5"+
		"\u017e\u00c0\2\u072f\u00ab\3\2\2\2\u0730\u0731\5\u017e\u00c0\2\u0731\u00ad"+
		"\3\2\2\2\u0732\u0733\5\u017e\u00c0\2\u0733\u00af\3\2\2\2\u0734\u0739\5"+
		"\u0080A\2\u0735\u0736\7\u00f3\2\2\u0736\u0738\5\u0080A\2\u0737\u0735\3"+
		"\2\2\2\u0738\u073b\3\2\2\2\u0739\u0737\3\2\2\2\u0739\u073a\3\2\2\2\u073a"+
		"\u00b1\3\2\2\2\u073b\u0739\3\2\2\2\u073c\u073d\5\u0180\u00c1\2\u073d\u00b3"+
		"\3\2\2\2\u073e\u0741\5\u0180\u00c1\2\u073f\u0741\7\u010a\2\2\u0740\u073e"+
		"\3\2\2\2\u0740\u073f\3\2\2\2\u0741\u00b5\3\2\2\2\u0742\u0745\5\u0180\u00c1"+
		"\2\u0743\u0745\7\u010a\2\2\u0744\u0742\3\2\2\2\u0744\u0743\3\2\2\2\u0745"+
		"\u00b7\3\2\2\2\u0746\u0747\5\u017e\u00c0\2\u0747\u00b9\3\2\2\2\u0748\u0755"+
		"\5d\63\2\u0749\u074c\7\u00f7\2\2\u074a\u074d\5v<\2\u074b\u074d\5J&\2\u074c"+
		"\u074a\3\2\2\2\u074c\u074b\3\2\2\2\u074d\u074e\3\2\2\2\u074e\u074f\7\u00f6"+
		"\2\2\u074f\u0755\3\2\2\2\u0750\u0751\7\u00f7\2\2\u0751\u0752\5\u0080A"+
		"\2\u0752\u0753\7\u00f6\2\2\u0753\u0755\3\2\2\2\u0754\u0748\3\2\2\2\u0754"+
		"\u0749\3\2\2\2\u0754\u0750\3\2\2\2\u0755\u00bb\3\2\2\2\u0756\u0757\7S"+
		"\2\2\u0757\u0758\5\u00ceh\2\u0758\u00bd\3\2\2\2\u0759\u075a\7\23\2\2\u075a"+
		"\u075c\7\16\2\2\u075b\u075d\7\u00a3\2\2\u075c\u075b\3\2\2\2\u075c\u075d"+
		"\3\2\2\2\u075d\u075e\3\2\2\2\u075e\u0762\5\u00ceh\2\u075f\u0760\7F\2\2"+
		"\u0760\u0761\7T\2\2\u0761\u0763\5\u00ceh\2\u0762\u075f\3\2\2\2\u0762\u0763"+
		"\3\2\2\2\u0763\u0770\3\2\2\2\u0764\u0765\7F\2\2\u0765\u0766\7T\2\2\u0766"+
		"\u0767\5\u00ceh\2\u0767\u0768\3\2\2\2\u0768\u0769\7\23\2\2\u0769\u076b"+
		"\7\16\2\2\u076a\u076c\7\u00a3\2\2\u076b\u076a\3\2\2\2\u076b\u076c\3\2"+
		"\2\2\u076c\u076d\3\2\2\2\u076d\u076e\5\u00ceh\2\u076e\u0770\3\2\2\2\u076f"+
		"\u0759\3\2\2\2\u076f\u0764\3\2\2\2\u0770\u00bf\3\2\2\2\u0771\u0772\7&"+
		"\2\2\u0772\u0776\5\u00ceh\2\u0773\u0774\7%\2\2\u0774\u0775\7\16\2\2\u0775"+
		"\u0777\5\u00c2b\2\u0776\u0773\3\2\2\2\u0776\u0777\3\2\2\2\u0777\u0780"+
		"\3\2\2\2\u0778\u0779\7%\2\2\u0779\u077a\7\16\2\2\u077a\u077d\5\u00c2b"+
		"\2\u077b\u077c\7&\2\2\u077c\u077e\5\u00ceh\2\u077d\u077b\3\2\2\2\u077d"+
		"\u077e\3\2\2\2\u077e\u0780\3\2\2\2\u077f\u0771\3\2\2\2\u077f\u0778\3\2"+
		"\2\2\u0780\u00c1\3\2\2\2\u0781\u0786\5\u00c4c\2\u0782\u0783\7\u00f3\2"+
		"\2\u0783\u0785\5\u00c4c\2\u0784\u0782\3\2\2\2\u0785\u0788\3\2\2\2\u0786"+
		"\u0784\3\2\2\2\u0786\u0787\3\2\2\2\u0787\u00c3\3\2\2\2\u0788\u0786\3\2"+
		"\2\2\u0789\u078d\5\u00c6d\2\u078a\u078d\5\u00c8e\2\u078b\u078d\5\u010c"+
		"\u0087\2\u078c\u0789\3\2\2\2\u078c\u078a\3\2\2\2\u078c\u078b\3\2\2\2\u078d"+
		"\u00c5\3\2\2\2\u078e\u078f\t\32\2\2\u078f\u0790\7\u00f7\2\2\u0790\u0791"+
		"\5\u010c\u0087\2\u0791\u0792\7\u00f6\2\2\u0792\u00c7\3\2\2\2\u0793\u0794"+
		"\7~\2\2\u0794\u0795\7\u00c8\2\2\u0795\u0796\7\u00f7\2\2\u0796\u0797\5"+
		"\u010a\u0086\2\u0797\u0798\7\u00f6\2\2\u0798\u00c9\3\2\2\2\u0799\u079e"+
		"\5\u00ccg\2\u079a\u079b\7\u00f3\2\2\u079b\u079d\5\u00ccg\2\u079c\u079a"+
		"\3\2\2\2\u079d\u07a0\3\2\2\2\u079e\u079c\3\2\2\2\u079e\u079f\3\2\2\2\u079f"+
		"\u00cb\3\2\2\2\u07a0\u079e\3\2\2\2\u07a1\u07a4\5\u00c6d\2\u07a2\u07a4"+
		"\5\u010c\u0087\2\u07a3\u07a1\3\2\2\2\u07a3\u07a2\3\2\2\2\u07a4\u00cd\3"+
		"\2\2\2\u07a5\u07a6\5\u00d0i\2\u07a6\u00cf\3\2\2\2\u07a7\u07ac\5\u00d2"+
		"j\2\u07a8\u07a9\7:\2\2\u07a9\u07ab\5\u00d2j\2\u07aa\u07a8\3\2\2\2\u07ab"+
		"\u07ae\3\2\2\2\u07ac\u07aa\3\2\2\2\u07ac\u07ad\3\2\2\2\u07ad\u00d1\3\2"+
		"\2\2\u07ae\u07ac\3\2\2\2\u07af\u07b4\5\u00d4k\2\u07b0\u07b1\7\t\2\2\u07b1"+
		"\u07b3\5\u00d4k\2\u07b2\u07b0\3\2\2\2\u07b3\u07b6\3\2\2\2\u07b4\u07b2"+
		"\3\2\2\2\u07b4\u07b5\3\2\2\2\u07b5\u00d3\3\2\2\2\u07b6\u07b4\3\2\2\2\u07b7"+
		"\u07b8\7\63\2\2\u07b8\u07bb\5\u00d6l\2\u07b9\u07bb\5\u00d6l\2\u07ba\u07b7"+
		"\3\2\2\2\u07ba\u07b9\3\2\2\2\u07bb\u00d5\3\2\2\2\u07bc\u07ce\5\u00d8m"+
		"\2\u07bd\u07ce\5\u0112\u008a\2\u07be\u07ce\5\u00dan\2\u07bf\u07ce\5\u00dc"+
		"o\2\u07c0\u07ce\5\u00dep\2\u07c1\u07ce\5\u00e0q\2\u07c2\u07ce\5\u00e2"+
		"r\2\u07c3\u07ce\5\u00e4s\2\u07c4\u07ce\5\u00e6t\2\u07c5\u07ce\5\u00e8"+
		"u\2\u07c6\u07ce\5\u00eav\2\u07c7\u07ce\5\u00ecw\2\u07c8\u07ce\5\u00ee"+
		"x\2\u07c9\u07ce\5\u00f0y\2\u07ca\u07ce\5\u00f2z\2\u07cb\u07ce\5\u00f4"+
		"{\2\u07cc\u07ce\5\u00f6|\2\u07cd\u07bc\3\2\2\2\u07cd\u07bd\3\2\2\2\u07cd"+
		"\u07be\3\2\2\2\u07cd\u07bf\3\2\2\2\u07cd\u07c0\3\2\2\2\u07cd\u07c1\3\2"+
		"\2\2\u07cd\u07c2\3\2\2\2\u07cd\u07c3\3\2\2\2\u07cd\u07c4\3\2\2\2\u07cd"+
		"\u07c5\3\2\2\2\u07cd\u07c6\3\2\2\2\u07cd\u07c7\3\2\2\2\u07cd\u07c8\3\2"+
		"\2\2\u07cd\u07c9\3\2\2\2\u07cd\u07ca\3\2\2\2\u07cd\u07cb\3\2\2\2\u07cd"+
		"\u07cc\3\2\2\2\u07ce\u00d7\3\2\2\2\u07cf\u07d0\7\37\2\2\u07d0\u07d1\5"+
		"d\63\2\u07d1\u00d9\3\2\2\2\u07d2\u07d4\5\u0080A\2\u07d3\u07d5\5\u00a6"+
		"T\2\u07d4\u07d3\3\2\2\2\u07d4\u07d5\3\2\2\2\u07d5\u07d6\3\2\2\2\u07d6"+
		"\u07d8\7-\2\2\u07d7\u07d9\7\63\2\2\u07d8\u07d7\3\2\2\2\u07d8\u07d9\3\2"+
		"\2\2\u07d9\u07da\3\2\2\2\u07da\u07db\t\33\2\2\u07db\u07e4\3\2\2\2\u07dc"+
		"\u07dd\5<\37\2\u07dd\u07df\7-\2\2\u07de\u07e0\7\63\2\2\u07df\u07de\3\2"+
		"\2\2\u07df\u07e0\3\2\2\2\u07e0\u07e1\3\2\2\2\u07e1\u07e2\t\33\2\2\u07e2"+
		"\u07e4\3\2\2\2\u07e3\u07d2\3\2\2\2\u07e3\u07dc\3\2\2\2\u07e4\u00db\3\2"+
		"\2\2\u07e5\u07e7\5\u0108\u0085\2\u07e6\u07e8\5\u00a6T\2\u07e7\u07e6\3"+
		"\2\2\2\u07e7\u07e8\3\2\2\2\u07e8\u07eb\3\2\2\2\u07e9\u07ec\7\u00fd\2\2"+
		"\u07ea\u07ec\5\u018a\u00c6\2\u07eb\u07e9\3\2\2\2\u07eb\u07ea\3\2\2\2\u07ec"+
		"\u07ed\3\2\2\2\u07ed\u07ef\5d\63\2\u07ee\u07f0\5\u00a6T\2\u07ef\u07ee"+
		"\3\2\2\2\u07ef\u07f0\3\2\2\2\u07f0\u080e\3\2\2\2\u07f1\u07f3\7<\2\2\u07f2"+
		"\u07f1\3\2\2\2\u07f2\u07f3\3\2\2\2\u07f3\u07f4\3\2\2\2\u07f4\u07f6\5<"+
		"\37\2\u07f5\u07f7\5\u00a6T\2\u07f6\u07f5\3\2\2\2\u07f6\u07f7\3\2\2\2\u07f7"+
		"\u07fe\3\2\2\2\u07f8\u07ff\7\u00fd\2\2\u07f9\u07ff\5\u018a\u00c6\2\u07fa"+
		"\u07ff\7\u0108\2\2\u07fb\u07ff\5\u018e\u00c8\2\u07fc\u07ff\7\u0106\2\2"+
		"\u07fd\u07ff\5\u018c\u00c7\2\u07fe\u07f8\3\2\2\2\u07fe\u07f9\3\2\2\2\u07fe"+
		"\u07fa\3\2\2\2\u07fe\u07fb\3\2\2\2\u07fe\u07fc\3\2\2\2\u07fe\u07fd\3\2"+
		"\2\2\u07ff\u0801\3\2\2\2\u0800\u0802\7<\2\2\u0801\u0800\3\2\2\2\u0801"+
		"\u0802\3\2\2\2\u0802\u0808\3\2\2\2\u0803\u0809\5<\37\2\u0804\u0805\7\u00f7"+
		"\2\2\u0805\u0806\5(\25\2\u0806\u0807\7\u00f6\2\2\u0807\u0809\3\2\2\2\u0808"+
		"\u0803\3\2\2\2\u0808\u0804\3\2\2\2\u0809\u080b\3\2\2\2\u080a\u080c\5\u00a6"+
		"T\2\u080b\u080a\3\2\2\2\u080b\u080c\3\2\2\2\u080c\u080e\3\2\2\2\u080d"+
		"\u07e5\3\2\2\2\u080d\u07f2\3\2\2\2\u080e\u00dd\3\2\2\2\u080f\u0810\7\u00f7"+
		"\2\2\u0810\u0811\5\u0108\u0085\2\u0811\u0814\7\u00f6\2\2\u0812\u0815\7"+
		"\u00fd\2\2\u0813\u0815\5\u018a\u00c6\2\u0814\u0812\3\2\2\2\u0814\u0813"+
		"\3\2\2\2\u0815\u0816\3\2\2\2\u0816\u0817\t\34\2\2\u0817\u081a\7\u00f7"+
		"\2\2\u0818\u081b\5\u010c\u0087\2\u0819\u081b\5(\25\2\u081a\u0818\3\2\2"+
		"\2\u081a\u0819\3\2\2\2\u081b\u081c\3\2\2\2\u081c\u081d\7\u00f6\2\2\u081d"+
		"\u0830\3\2\2\2\u081e\u0825\5<\37\2\u081f\u0826\7\u00fd\2\2\u0820\u0826"+
		"\5\u018a\u00c6\2\u0821\u0826\7\u0108\2\2\u0822\u0826\5\u018e\u00c8\2\u0823"+
		"\u0826\7\u0106\2\2\u0824\u0826\5\u018c\u00c7\2\u0825\u081f\3\2\2\2\u0825"+
		"\u0820\3\2\2\2\u0825\u0821\3\2\2\2\u0825\u0822\3\2\2\2\u0825\u0823\3\2"+
		"\2\2\u0825\u0824\3\2\2\2\u0826\u0827\3\2\2\2\u0827\u0828\t\34\2\2\u0828"+
		"\u082b\7\u00f7\2\2\u0829\u082c\5\u0108\u0085\2\u082a\u082c\5(\25\2\u082b"+
		"\u0829\3\2\2\2\u082b\u082a\3\2\2\2\u082c\u082d\3\2\2\2\u082d\u082e\7\u00f6"+
		"\2\2\u082e\u0830\3\2\2\2\u082f\u080f\3\2\2\2\u082f\u081e\3\2\2\2\u0830"+
		"\u00df\3\2\2\2\u0831\u0832\7\u00f7\2\2\u0832\u0833\5\u0108\u0085\2\u0833"+
		"\u0835\7\u00f6\2\2\u0834\u0836\7\63\2\2\u0835\u0834\3\2\2\2\u0835\u0836"+
		"\3\2\2\2\u0836\u0837\3\2\2\2\u0837\u0838\7\'\2\2\u0838\u083b\7\u00f7\2"+
		"\2\u0839\u083c\5\u010c\u0087\2\u083a\u083c\5(\25\2\u083b\u0839\3\2\2\2"+
		"\u083b\u083a\3\2\2\2\u083c\u083d\3\2\2\2\u083d\u083e\7\u00f6\2\2\u083e"+
		"\u0853\3\2\2\2\u083f\u0841\5<\37\2\u0840\u0842\7\63\2\2\u0841\u0840\3"+
		"\2\2\2\u0841\u0842\3\2\2\2\u0842\u0843\3\2\2\2\u0843\u0844\7\'\2\2\u0844"+
		"\u0847\7\u00f7\2\2\u0845\u0848\5\u010e\u0088\2\u0846\u0848\5(\25\2\u0847"+
		"\u0845\3\2\2\2\u0847\u0846\3\2\2\2\u0848\u0849\3\2\2\2\u0849\u084a\7\u00f6"+
		"\2\2\u084a\u0853\3\2\2\2\u084b\u084d\5<\37\2\u084c\u084e\7\63\2\2\u084d"+
		"\u084c\3\2\2\2\u084d\u084e\3\2\2\2\u084e\u084f\3\2\2\2\u084f\u0850\7\'"+
		"\2\2\u0850\u0851\5<\37\2\u0851\u0853\3\2\2\2\u0852\u0831\3\2\2\2\u0852"+
		"\u083f\3\2\2\2\u0852\u084b\3\2\2\2\u0853\u00e1\3\2\2\2\u0854\u0855\5\u0102"+
		"\u0082\2\u0855\u0856\7-\2\2\u0856\u0858\3\2\2\2\u0857\u0854\3\2\2\2\u0857"+
		"\u0858\3\2\2\2\u0858\u0859\3\2\2\2\u0859\u085a\7\n\2\2\u085a\u00e3\3\2"+
		"\2\2\u085b\u085c\5\u0106\u0084\2\u085c\u085e\7-\2\2\u085d\u085f\7\63\2"+
		"\2\u085e\u085d\3\2\2\2\u085e\u085f\3\2\2\2\u085f\u0860\3\2\2\2\u0860\u0861"+
		"\7t\2\2\u0861\u00e5\3\2\2\2\u0862\u0863\5<\37\2\u0863\u0865\7-\2\2\u0864"+
		"\u0866\7\63\2\2\u0865\u0864\3\2\2\2\u0865\u0866\3\2\2\2\u0866\u0867\3"+
		"\2\2\2\u0867\u0869\7\67\2\2\u0868\u086a\7\u00d9\2\2\u0869\u0868\3\2\2"+
		"\2\u0869\u086a\3\2\2\2\u086a\u086b\3\2\2\2\u086b\u086c\7\u00f7\2\2\u086c"+
		"\u086d\5\u00fe\u0080\2\u086d\u086e\7\u00f6\2\2\u086e\u00e7\3\2\2\2\u086f"+
		"\u0870\5\u0110\u0089\2\u0870\u0871\7-\2\2\u0871\u0872\7\u00b4\2\2\u0872"+
		"\u00e9\3\2\2\2\u0873\u0875\5<\37\2\u0874\u0876\7\63\2\2\u0875\u0874\3"+
		"\2\2\2\u0875\u0876\3\2\2\2\u0876\u0877\3\2\2\2\u0877\u0878\7\60\2\2\u0878"+
		"\u087b\5<\37\2\u0879\u087a\7x\2\2\u087a\u087c\5<\37\2\u087b\u0879\3\2"+
		"\2\2\u087b\u087c\3\2\2\2\u087c\u00eb\3\2\2\2\u087d\u087f\5<\37\2\u087e"+
		"\u0880\7\63\2\2\u087f\u087e\3\2\2\2\u087f\u0880\3\2\2\2\u0880\u0881\3"+
		"\2\2\2\u0881\u0883\7\u0095\2\2\u0882\u0884\7\67\2\2\u0883\u0882\3\2\2"+
		"\2\u0883\u0884\3\2\2\2\u0884\u0887\3\2\2\2\u0885\u0888\5J&\2\u0886\u0888"+
		"\5\u0106\u0084\2\u0887\u0885\3\2\2\2\u0887\u0886\3\2\2\2\u0888\u00ed\3"+
		"\2\2\2\u0889\u088b\5<\37\2\u088a\u088c\7\63\2\2\u088b\u088a\3\2\2\2\u088b"+
		"\u088c\3\2\2\2\u088c\u088d\3\2\2\2\u088d\u088e\7\r\2\2\u088e\u088f\5<"+
		"\37\2\u088f\u0890\7\t\2\2\u0890\u0891\5<\37\2\u0891\u00ef\3\2\2\2\u0892"+
		"\u0893\7\u00b9\2\2\u0893\u0894\7\u00f7\2\2\u0894\u0895\5L\'\2\u0895\u0896"+
		"\7\u00f6\2\2\u0896\u00f1\3\2\2\2\u0897\u0899\5\u0106\u0084\2\u0898\u089a"+
		"\7\63\2\2\u0899\u0898\3\2\2\2\u0899\u089a\3\2\2\2\u089a\u089b\3\2\2\2"+
		"\u089b\u089d\7\u00ce\2\2\u089c\u089e\7\67\2\2\u089d\u089c\3\2\2\2\u089d"+
		"\u089e\3\2\2\2\u089e\u089f\3\2\2\2\u089f\u08a0\5\u0106\u0084\2\u08a0\u00f3"+
		"\3\2\2\2\u08a1\u08a2\7v\2\2\u08a2\u08a3\7\u00f7\2\2\u08a3\u08a4\5\u0102"+
		"\u0082\2\u08a4\u08a5\7\u00f3\2\2\u08a5\u08a8\5\u00fc\177\2\u08a6\u08a7"+
		"\7\u00f3\2\2\u08a7\u08a9\5\u00fa~\2\u08a8\u08a6\3\2\2\2\u08a8\u08a9\3"+
		"\2\2\2\u08a9\u08aa\3\2\2\2\u08aa\u08ab\7\u00f6\2\2\u08ab\u00f5\3\2\2\2"+
		"\u08ac\u08ad\7\u00db\2\2\u08ad\u08ae\7\u00f7\2\2\u08ae\u08b1\5\u0102\u0082"+
		"\2\u08af\u08b0\7\u00f3\2\2\u08b0\u08b2\5\u00f8}\2\u08b1\u08af\3\2\2\2"+
		"\u08b1\u08b2\3\2\2\2\u08b2\u08b3\3\2\2\2\u08b3\u08b4\7\u00f3\2\2\u08b4"+
		"\u08b7\5\u00fc\177\2\u08b5\u08b6\7\u00f3\2\2\u08b6\u08b8\5\u00fa~\2\u08b7";
	private static final String _serializedATNSegment1 =
		"\u08b5\3\2\2\2\u08b7\u08b8\3\2\2\2\u08b8\u08b9\3\2\2\2\u08b9\u08ba\7\u00f6"+
		"\2\2\u08ba\u00f7\3\2\2\2\u08bb\u08bc\5\u0100\u0081\2\u08bc\u00f9\3\2\2"+
		"\2\u08bd\u08be\5\u0100\u0081\2\u08be\u00fb\3\2\2\2\u08bf\u08c0\5\u0186"+
		"\u00c4\2\u08c0\u00fd\3\2\2\2\u08c1\u08c3\7\u00a8\2\2\u08c2\u08c1\3\2\2"+
		"\2\u08c2\u08c3\3\2\2\2\u08c3\u08c7\3\2\2\2\u08c4\u08c5\5\u00aaV\2\u08c5"+
		"\u08c6\7\u00f2\2\2\u08c6\u08c8\3\2\2\2\u08c7\u08c4\3\2\2\2\u08c7\u08c8"+
		"\3\2\2\2\u08c8\u08c9\3\2\2\2\u08c9\u08d5\5\u0180\u00c1\2\u08ca\u08cc\7"+
		"\u00a8\2\2\u08cb\u08ca\3\2\2\2\u08cb\u08cc\3\2\2\2\u08cc\u08d0\3\2\2\2"+
		"\u08cd\u08ce\5\u00aaV\2\u08ce\u08cf\7\u00f2\2\2\u08cf\u08d1\3\2\2\2\u08d0"+
		"\u08cd\3\2\2\2\u08d0\u08d1\3\2\2\2\u08d1\u08d2\3\2\2\2\u08d2\u08d4\5\u0180"+
		"\u00c1\2\u08d3\u08cb\3\2\2\2\u08d4\u08d7\3\2\2\2\u08d5\u08d3\3\2\2\2\u08d5"+
		"\u08d6\3\2\2\2\u08d6\u00ff\3\2\2\2\u08d7\u08d5\3\2\2\2\u08d8\u08d9\7\u010a"+
		"\2\2\u08d9\u0101\3\2\2\2\u08da\u08db\5\u017e\u00c0\2\u08db\u0103\3\2\2"+
		"\2\u08dc\u08dd\5\u017e\u00c0\2\u08dd\u0105\3\2\2\2\u08de\u08df\5\u00aa"+
		"V\2\u08df\u08e0\7\u00f2\2\2\u08e0\u08e2\3\2\2\2\u08e1\u08de\3\2\2\2\u08e1"+
		"\u08e2\3\2\2\2\u08e2\u08e6\3\2\2\2\u08e3\u08e4\5\u00a8U\2\u08e4\u08e5"+
		"\7\u00f2\2\2\u08e5\u08e7\3\2\2\2\u08e6\u08e3\3\2\2\2\u08e6\u08e7\3\2\2"+
		"\2\u08e7\u08eb\3\2\2\2\u08e8\u08e9\5\u0104\u0083\2\u08e9\u08ea\7\u00f2"+
		"\2\2\u08ea\u08ec\3\2\2\2\u08eb\u08e8\3\2\2\2\u08eb\u08ec\3\2\2\2\u08ec"+
		"\u08ed\3\2\2\2\u08ed\u08ee\5\u0102\u0082\2\u08ee\u0107\3\2\2\2\u08ef\u08f4"+
		"\5<\37\2\u08f0\u08f1\7\u00f3\2\2\u08f1\u08f3\5<\37\2\u08f2\u08f0\3\2\2"+
		"\2\u08f3\u08f6\3\2\2\2\u08f4\u08f2\3\2\2\2\u08f4\u08f5\3\2\2\2\u08f5\u0109"+
		"\3\2\2\2\u08f6\u08f4\3\2\2\2\u08f7\u08f8\7\u00f7\2\2\u08f8\u08ff\7\u00f6"+
		"\2\2\u08f9\u08fa\7\u00f7\2\2\u08fa\u08fb\5\u0108\u0085\2\u08fb\u08fc\7"+
		"\u00f6\2\2\u08fc\u08ff\3\2\2\2\u08fd\u08ff\5<\37\2\u08fe\u08f7\3\2\2\2"+
		"\u08fe\u08f9\3\2\2\2\u08fe\u08fd\3\2\2\2\u08ff\u090c\3\2\2\2\u0900\u0908"+
		"\7\u00f3\2\2\u0901\u0902\7\u00f7\2\2\u0902\u0909\7\u00f6\2\2\u0903\u0904"+
		"\7\u00f7\2\2\u0904\u0905\5\u0108\u0085\2\u0905\u0906\7\u00f6\2\2\u0906"+
		"\u0909\3\2\2\2\u0907\u0909\5<\37\2\u0908\u0901\3\2\2\2\u0908\u0903\3\2"+
		"\2\2\u0908\u0907\3\2\2\2\u0909\u090b\3\2\2\2\u090a\u0900\3\2\2\2\u090b"+
		"\u090e\3\2\2\2\u090c\u090a\3\2\2\2\u090c\u090d\3\2\2\2\u090d\u010b\3\2"+
		"\2\2\u090e\u090c\3\2\2\2\u090f\u0914\5\u010e\u0088\2\u0910\u0911\7\u00f3"+
		"\2\2\u0911\u0913\5\u010e\u0088\2\u0912\u0910\3\2\2\2\u0913\u0916\3\2\2"+
		"\2\u0914\u0912\3\2\2\2\u0914\u0915\3\2\2\2\u0915\u010d\3\2\2\2\u0916\u0914"+
		"\3\2\2\2\u0917\u0918\7\u00f7\2\2\u0918\u0919\5\u0108\u0085\2\u0919\u091a"+
		"\7\u00f6\2\2\u091a\u091d\3\2\2\2\u091b\u091d\5\u0108\u0085\2\u091c\u0917"+
		"\3\2\2\2\u091c\u091b\3\2\2\2\u091d\u010f\3\2\2\2\u091e\u091f\5\u017e\u00c0"+
		"\2\u091f\u0111\3\2\2\2\u0920\u0921\7\u00f7\2\2\u0921\u0922\5\u00ceh\2"+
		"\u0922\u0923\7\u00f6\2\2\u0923\u0113\3\2\2\2\u0924\u0925\7\u009a\2\2\u0925"+
		"\u0927\5\u011e\u0090\2\u0926\u0928\5\u0118\u008d\2\u0927\u0926\3\2\2\2"+
		"\u0927\u0928\3\2\2\2\u0928\u092c\3\2\2\2\u0929\u092b\5\u011a\u008e\2\u092a"+
		"\u0929\3\2\2\2\u092b\u092e\3\2\2\2\u092c\u092a\3\2\2\2\u092c\u092d\3\2"+
		"\2\2\u092d\u0115\3\2\2\2\u092e\u092c\3\2\2\2\u092f\u0930\t\35\2\2\u0930"+
		"\u0932\7\u00a0\2\2\u0931\u092f\3\2\2\2\u0931\u0932\3\2\2\2\u0932\u0939"+
		"\3\2\2\2\u0933\u0937\7M\2\2\u0934\u0938\7r\2\2\u0935\u0936\7\u00ca\2\2"+
		"\u0936\u0938\7\u00b8\2\2\u0937\u0934\3\2\2\2\u0937\u0935\3\2\2\2\u0938"+
		"\u093a\3\2\2\2\u0939\u0933\3\2\2\2\u0939\u093a\3\2\2\2\u093a\u0117\3\2"+
		"\2\2\u093b\u093c\7\u00bc\2\2\u093c\u093d\t\36\2\2\u093d\u093e\7A\2\2\u093e"+
		"\u0119\3\2\2\2\u093f\u0940\7\u00b8\2\2\u0940\u0941\5\u011c\u008f\2\u0941"+
		"\u0942\78\2\2\u0942\u0943\7\u00f7\2\2\u0943\u0944\5d\63\2\u0944\u0945"+
		"\7\u00f6\2\2\u0945\u0946\5\u0122\u0092\2\u0946\u0947\5\u0116\u008c\2\u0947"+
		"\u011b\3\2\2\2\u0948\u0949\5\u0180\u00c1\2\u0949\u011d\3\2\2\2\u094a\u094b"+
		"\7\u0091\2\2\u094b\u094d\5\u0120\u0091\2\u094c\u094a\3\2\2\2\u094c\u094d"+
		"\3\2\2\2\u094d\u094e\3\2\2\2\u094e\u094f\5\u0122\u0092\2\u094f\u0950\5"+
		"\u0116\u008c\2\u0950\u0951\5\u0128\u0095\2\u0951\u011f\3\2\2\2\u0952\u0953"+
		"\5\u0180\u00c1\2\u0953\u0121\3\2\2\2\u0954\u0956\5\u009eP\2\u0955\u0957"+
		"\5\u0080A\2\u0956\u0955\3\2\2\2\u0956\u0957\3\2\2\2\u0957\u0959\3\2\2"+
		"\2\u0958\u0954\3\2\2\2\u0958\u0959\3\2\2\2\u0959\u095a\3\2\2\2\u095a\u095b"+
		"\7r\2\2\u095b\u095c\7\16\2\2\u095c\u095d\7\u00f7\2\2\u095d\u095e\5\u0124"+
		"\u0093\2\u095e\u095f\7\u00f6\2\2\u095f\u0960\7\u0094\2\2\u0960\u0961\7"+
		"\u00f7\2\2\u0961\u0962\5\u0124\u0093\2\u0962\u0963\7\u00f6\2\2\u0963\u0123"+
		"\3\2\2\2\u0964\u0969\5\u0126\u0094\2\u0965\u0966\7\u00f3\2\2\u0966\u0968"+
		"\5\u0126\u0094\2\u0967\u0965\3\2\2\2\u0968\u096b\3\2\2\2\u0969\u0967\3"+
		"\2\2\2\u0969\u096a\3\2\2\2\u096a\u0125\3\2\2\2\u096b\u0969\3\2\2\2\u096c"+
		"\u0971\5<\37\2\u096d\u096f\7\13\2\2\u096e\u096d\3\2\2\2\u096e\u096f\3"+
		"\2\2\2\u096f\u0970\3\2\2\2\u0970\u0972\5\u0080A\2\u0971\u096e\3\2\2\2"+
		"\u0971\u0972\3\2\2\2\u0972\u0127\3\2\2\2\u0973\u0979\7\u00c0\2\2\u0974"+
		"\u097a\7N\2\2\u0975\u0977\7\u00e0\2\2\u0976\u0978\7\7\2\2\u0977\u0976"+
		"\3\2\2\2\u0977\u0978\3\2\2\2\u0978\u097a\3\2\2\2\u0979\u0974\3\2\2\2\u0979"+
		"\u0975\3\2\2\2\u0979\u097a\3\2\2\2\u097a\u097d\3\2\2\2\u097b\u097c\t\37"+
		"\2\2\u097c\u097e\7;\2\2\u097d\u097b\3\2\2\2\u097d\u097e\3\2\2\2\u097e"+
		"\u0980\3\2\2\2\u097f\u0973\3\2\2\2\u097f\u0980\3\2\2\2\u0980\u098c\3\2"+
		"\2\2\u0981\u0982\7\u0086\2\2\u0982\u0983\7\u00f7\2\2\u0983\u0984\7\u010a"+
		"\2\2\u0984\u098a\7\u00f6\2\2\u0985\u0986\7\u00de\2\2\u0986\u0987\7\u00f7"+
		"\2\2\u0987\u0988\5\u00ceh\2\u0988\u0989\7\u00f6\2\2\u0989\u098b\3\2\2"+
		"\2\u098a\u0985\3\2\2\2\u098a\u098b\3\2\2\2\u098b\u098d\3\2\2\2\u098c\u0981"+
		"\3\2\2\2\u098c\u098d\3\2\2\2\u098d\u098e\3\2\2\2\u098e\u098f\7\u00f7\2"+
		"\2\u098f\u0990\5\u012a\u0096\2\u0990\u0991\7\u00f6\2\2\u0991\u0129\3\2"+
		"\2\2\u0992\u0997\5\u012c\u0097\2\u0993\u0994\7\u00f3\2\2\u0994\u0996\5"+
		"\u012c\u0097\2\u0995\u0993\3\2\2\2\u0996\u0999\3\2\2\2\u0997\u0995\3\2"+
		"\2\2\u0997\u0998\3\2\2\2\u0998\u012b\3\2\2\2\u0999\u0997\3\2\2\2\u099a"+
		"\u09a0\7N\2\2\u099b\u099d\7\u00e0\2\2\u099c\u099e\7\7\2\2\u099d\u099c"+
		"\3\2\2\2\u099d\u099e\3\2\2\2\u099e\u09a0\3\2\2\2\u099f\u099a\3\2\2\2\u099f"+
		"\u099b\3\2\2\2\u099f\u09a0\3\2\2\2\u09a0\u09a1\3\2\2\2\u09a1\u09a3\5\u012e"+
		"\u0098\2\u09a2\u09a4\5\u0146\u00a4\2\u09a3\u09a2\3\2\2\2\u09a3\u09a4\3"+
		"\2\2\2\u09a4\u09a5\3\2\2\2\u09a5\u09a6\7\u00fd\2\2\u09a6\u09a7\5<\37\2"+
		"\u09a7\u012d\3\2\2\2\u09a8\u09a9\5\u0134\u009b\2\u09a9\u09ac\7\u00f9\2"+
		"\2\u09aa\u09ad\5\u013e\u00a0\2\u09ab\u09ad\5\u0130\u0099\2\u09ac\u09aa"+
		"\3\2\2\2\u09ac\u09ab\3\2\2\2\u09ad\u09ae\3\2\2\2\u09ae\u09af\7\u00f8\2"+
		"\2\u09af\u012f\3\2\2\2\u09b0\u09b5\5\u0132\u009a\2\u09b1\u09b2\7\u00f3"+
		"\2\2\u09b2\u09b4\5\u0132\u009a\2\u09b3\u09b1\3\2\2\2\u09b4\u09b7\3\2\2"+
		"\2\u09b5\u09b3\3\2\2\2\u09b5\u09b6\3\2\2\2\u09b6\u0131\3\2\2\2\u09b7\u09b5"+
		"\3\2\2\2\u09b8\u09bc\5\u00ceh\2\u09b9\u09bc\5<\37\2\u09ba\u09bc\5\u0136"+
		"\u009c\2\u09bb\u09b8\3\2\2\2\u09bb\u09b9\3\2\2\2\u09bb\u09ba\3\2\2\2\u09bc"+
		"\u0133\3\2\2\2\u09bd\u09be\5\u0102\u0082\2\u09be\u0135\3\2\2\2\u09bf\u09c0"+
		"\7\"\2\2\u09c0\u09d4\5\u0102\u0082\2\u09c1\u09c2\7\'\2\2\u09c2\u09c5\7"+
		"\u00f7\2\2\u09c3\u09c6\5\u013c\u009f\2\u09c4\u09c6\5d\63\2\u09c5\u09c3"+
		"\3\2\2\2\u09c5\u09c4\3\2\2\2\u09c6\u09c7\3\2\2\2\u09c7\u09c8\7\u00f6\2"+
		"\2\u09c8\u09d5\3\2\2\2\u09c9\u09ca\7\60\2\2\u09ca\u09cc\5\u0138\u009d"+
		"\2\u09cb\u09c9\3\2\2\2\u09cb\u09cc\3\2\2\2\u09cc\u09cd\3\2\2\2\u09cd\u09ce"+
		"\7#\2\2\u09ce\u09cf\5\u013a\u009e\2\u09cf\u09d0\7J\2\2\u09d0\u09d1\5\u013a"+
		"\u009e\2\u09d1\u09d2\t \2\2\u09d2\u09d3\5\u013a\u009e\2\u09d3\u09d5\3"+
		"\2\2\2\u09d4\u09c1\3\2\2\2\u09d4\u09cb\3\2\2\2\u09d5\u0137\3\2\2\2\u09d6"+
		"\u09d7\5\u0186\u00c4\2\u09d7\u0139\3\2\2\2\u09d8\u09da\t!\2\2\u09d9\u09d8"+
		"\3\2\2\2\u09d9\u09da\3\2\2\2\u09da\u09db\3\2\2\2\u09db\u09de\7\u010a\2"+
		"\2\u09dc\u09de\5\u0186\u00c4\2\u09dd\u09d9\3\2\2\2\u09dd\u09dc\3\2\2\2"+
		"\u09de\u013b\3\2\2\2\u09df\u09e4\5\u013a\u009e\2\u09e0\u09e1\7\u00f3\2"+
		"\2\u09e1\u09e3\5\u013a\u009e\2\u09e2\u09e0\3\2\2\2\u09e3\u09e6\3\2\2\2"+
		"\u09e4\u09e2\3\2\2\2\u09e4\u09e5\3\2\2\2\u09e5\u013d\3\2\2\2\u09e6\u09e4"+
		"\3\2\2\2\u09e7\u09e8\7\"\2\2\u09e8\u09e9\7\u00f7\2\2\u09e9\u09ea\5\u00b0"+
		"Y\2\u09ea\u09eb\7\u00f6\2\2\u09eb\u09ec\7\'\2\2\u09ec\u09ef\7\u00f7\2"+
		"\2\u09ed\u09f0\5\u0142\u00a2\2\u09ee\u09f0\5d\63\2\u09ef\u09ed\3\2\2\2"+
		"\u09ef\u09ee\3\2\2\2\u09f0\u09f1\3\2\2\2\u09f1\u09f2\7\u00f6\2\2\u09f2"+
		"\u013f\3\2\2\2\u09f3\u09f4\7\u00f7\2\2\u09f4\u09f5\5\u013c\u009f\2\u09f5"+
		"\u09f6\7\u00f6\2\2\u09f6\u0141\3\2\2\2\u09f7\u09fc\5\u0140\u00a1\2\u09f8"+
		"\u09f9\7\u00f3\2\2\u09f9\u09fb\5\u0140\u00a1\2\u09fa\u09f8\3\2\2\2\u09fb"+
		"\u09fe\3\2\2\2\u09fc\u09fa\3\2\2\2\u09fc\u09fd\3\2\2\2\u09fd\u0143\3\2"+
		"\2\2\u09fe\u09fc\3\2\2\2\u09ff\u0a01\7L\2\2\u0a00\u0a02\7\7\2\2\u0a01"+
		"\u0a00\3\2\2\2\u0a01\u0a02\3\2\2\2\u0a02\u0a06\3\2\2\2\u0a03\u0a06\7+"+
		"\2\2\u0a04\u0a06\7\62\2\2\u0a05\u09ff\3\2\2\2\u0a05\u0a03\3\2\2\2\u0a05"+
		"\u0a04\3\2\2\2\u0a06\u0a09\3\2\2\2\u0a07\u0a0a\5(\25\2\u0a08\u0a0a\5d"+
		"\63\2\u0a09\u0a07\3\2\2\2\u0a09\u0a08\3\2\2\2\u0a0a\u0145\3\2\2\2\u0a0b"+
		"\u0a0d\7;\2\2\u0a0c\u0a0e\7\u00c9\2\2\u0a0d\u0a0c\3\2\2\2\u0a0d\u0a0e"+
		"\3\2\2\2\u0a0e\u0a0f\3\2\2\2\u0a0f\u0a10\7\16\2\2\u0a10\u0a14\5\u0148"+
		"\u00a5\2\u0a11\u0a13\5\u014a\u00a6\2\u0a12\u0a11\3\2\2\2\u0a13\u0a16\3"+
		"\2\2\2\u0a14\u0a12\3\2\2\2\u0a14\u0a15\3\2\2\2\u0a15\u0147\3\2\2\2\u0a16"+
		"\u0a14\3\2\2\2\u0a17\u0a19\5<\37\2\u0a18\u0a1a\7\f\2\2\u0a19\u0a18\3\2"+
		"\2\2\u0a19\u0a1a\3\2\2\2\u0a1a\u0a1c\3\2\2\2\u0a1b\u0a1d\7\32\2\2\u0a1c"+
		"\u0a1b\3\2\2\2\u0a1c\u0a1d\3\2\2\2\u0a1d\u0a20\3\2\2\2\u0a1e\u0a1f\7\u00a4"+
		"\2\2\u0a1f\u0a21\7{\2\2\u0a20\u0a1e\3\2\2\2\u0a20\u0a21\3\2\2\2\u0a21"+
		"\u0a24\3\2\2\2\u0a22\u0a23\7\u00a4\2\2\u0a23\u0a25\7\u0089\2\2\u0a24\u0a22"+
		"\3\2\2\2\u0a24\u0a25\3\2\2\2\u0a25\u0149\3\2\2\2\u0a26\u0a27\7\u00f3\2"+
		"\2\u0a27\u0a29\5<\37\2\u0a28\u0a2a\7\f\2\2\u0a29\u0a28\3\2\2\2\u0a29\u0a2a"+
		"\3\2\2\2\u0a2a\u0a2c\3\2\2\2\u0a2b\u0a2d\7\32\2\2\u0a2c\u0a2b\3\2\2\2"+
		"\u0a2c\u0a2d\3\2\2\2\u0a2d\u0a30\3\2\2\2\u0a2e\u0a2f\7\u00a4\2\2\u0a2f"+
		"\u0a31\7{\2\2\u0a30\u0a2e\3\2\2\2\u0a30\u0a31\3\2\2\2\u0a31\u0a34\3\2"+
		"\2\2\u0a32\u0a33\7\u00a4\2\2\u0a33\u0a35\7\u0089\2\2\u0a34\u0a32\3\2\2"+
		"\2\u0a34\u0a35\3\2\2\2\u0a35\u014b\3\2\2\2\u0a36\u0a37\5\u0084C\2\u0a37"+
		"\u014d\3\2\2\2\u0a38\u0a39\5\u014c\u00a7\2\u0a39\u0a3b\7\u00f7\2\2\u0a3a"+
		"\u0a3c\t\f\2\2\u0a3b\u0a3a\3\2\2\2\u0a3b\u0a3c\3\2\2\2\u0a3c\u0a3e\3\2"+
		"\2\2\u0a3d\u0a3f\5<\37\2\u0a3e\u0a3d\3\2\2\2\u0a3e\u0a3f\3\2\2\2\u0a3f"+
		"\u0a44\3\2\2\2\u0a40\u0a41\7\u00f3\2\2\u0a41\u0a43\5<\37\2\u0a42\u0a40"+
		"\3\2\2\2\u0a43\u0a46\3\2\2\2\u0a44\u0a42\3\2\2\2\u0a44\u0a45\3\2\2\2\u0a45"+
		"\u0a49\3\2\2\2\u0a46\u0a44\3\2\2\2\u0a47\u0a48\t\"\2\2\u0a48\u0a4a\7\u00a4"+
		"\2\2\u0a49\u0a47\3\2\2\2\u0a49\u0a4a\3\2\2\2\u0a4a\u0a4b\3\2\2\2\u0a4b"+
		"\u0a4c\7\u00f6\2\2\u0a4c\u014f\3\2\2\2\u0a4d\u0a5d\5\u0166\u00b4\2\u0a4e"+
		"\u0a5d\5\u0162\u00b2\2\u0a4f\u0a5d\5\u0164\u00b3\2\u0a50\u0a5d\5\u0168"+
		"\u00b5\2\u0a51\u0a5d\5\u016a\u00b6\2\u0a52\u0a55\5\u014e\u00a8\2\u0a53"+
		"\u0a54\t\"\2\2\u0a54\u0a56\7\u00a4\2\2\u0a55\u0a53\3\2\2\2\u0a55\u0a56"+
		"\3\2\2\2\u0a56\u0a57\3\2\2\2\u0a57\u0a58\7\u00aa\2\2\u0a58\u0a59\7\u00f7"+
		"\2\2\u0a59\u0a5a\5\u0154\u00ab\2\u0a5a\u0a5b\7\u00f6\2\2\u0a5b\u0a5d\3"+
		"\2\2\2\u0a5c\u0a4d\3\2\2\2\u0a5c\u0a4e\3\2\2\2\u0a5c\u0a4f\3\2\2\2\u0a5c"+
		"\u0a50\3\2\2\2\u0a5c\u0a51\3\2\2\2\u0a5c\u0a52\3\2\2\2\u0a5d\u0151\3\2"+
		"\2\2\u0a5e\u0a5f\7g\2\2\u0a5f\u0a65\7\u00f7\2\2\u0a60\u0a66\7\u00f4\2"+
		"\2\u0a61\u0a63\t\f\2\2\u0a62\u0a61\3\2\2\2\u0a62\u0a63\3\2\2\2\u0a63\u0a64"+
		"\3\2\2\2\u0a64\u0a66\5<\37\2\u0a65\u0a60\3\2\2\2\u0a65\u0a62\3\2\2\2\u0a66"+
		"\u0a67\3\2\2\2\u0a67\u0a6d\7\u00f6\2\2\u0a68\u0a69\7\u00aa\2\2\u0a69\u0a6a"+
		"\7\u00f7\2\2\u0a6a\u0a6b\5\u0154\u00ab\2\u0a6b\u0a6c\7\u00f6\2\2\u0a6c"+
		"\u0a6e\3\2\2\2\u0a6d\u0a68\3\2\2\2\u0a6d\u0a6e\3\2\2\2\u0a6e\u0153\3\2"+
		"\2\2\u0a6f\u0a71\5\u009eP\2\u0a70\u0a6f\3\2\2\2\u0a70\u0a71\3\2\2\2\u0a71"+
		"\u0a76\3\2\2\2\u0a72\u0a74\5\u0146\u00a4\2\u0a73\u0a75\5\u0158\u00ad\2"+
		"\u0a74\u0a73\3\2\2\2\u0a74\u0a75\3\2\2\2\u0a75\u0a77\3\2\2\2\u0a76\u0a72"+
		"\3\2\2\2\u0a76\u0a77\3\2\2\2\u0a77\u0155\3\2\2\2\u0a78\u0a79\7\u00da\2"+
		"\2\u0a79\u0a80\t#\2\2\u0a7a\u0a7b\7\25\2\2\u0a7b\u0a80\7>\2\2\u0a7c\u0a7d"+
		"\5<\37\2\u0a7d\u0a7e\t#\2\2\u0a7e\u0a80\3\2\2\2\u0a7f\u0a78\3\2\2\2\u0a7f"+
		"\u0a7a\3\2\2\2\u0a7f\u0a7c\3\2\2\2\u0a80\u0157\3\2\2\2\u0a81\u0a88\t$"+
		"\2\2\u0a82\u0a89\5\u0156\u00ac\2\u0a83\u0a84\7\r\2\2\u0a84\u0a85\5\u0156"+
		"\u00ac\2\u0a85\u0a86\7\t\2\2\u0a86\u0a87\5\u0156\u00ac\2\u0a87\u0a89\3"+
		"\2\2\2\u0a88\u0a82\3\2\2\2\u0a88\u0a83\3\2\2\2\u0a89\u0159\3\2\2\2\u0a8a"+
		"\u0a8d\7g\2\2\u0a8b\u0a8d\5\u0086D\2\u0a8c\u0a8a\3\2\2\2\u0a8c\u0a8b\3"+
		"\2\2\2\u0a8d\u015b\3\2\2\2\u0a8e\u0aa4\5\u0160\u00b1\2\u0a8f\u0aa4\5\u015e"+
		"\u00b0\2\u0a90\u0aa4\5\u0168\u00b5\2\u0a91\u0aa4\5\u016a\u00b6\2\u0a92"+
		"\u0a93\5\u015a\u00ae\2\u0a93\u0a99\7\u00f7\2\2\u0a94\u0a9a\7\u00f4\2\2"+
		"\u0a95\u0a97\t\f\2\2\u0a96\u0a95\3\2\2\2\u0a96\u0a97\3\2\2\2\u0a97\u0a98"+
		"\3\2\2\2\u0a98\u0a9a\5<\37\2\u0a99\u0a94\3\2\2\2\u0a99\u0a96\3\2\2\2\u0a9a"+
		"\u0a9b\3\2\2\2\u0a9b\u0aa1\7\u00f6\2\2\u0a9c\u0a9d\7\u00aa\2\2\u0a9d\u0a9e"+
		"\7\u00f7\2\2\u0a9e\u0a9f\5\u0154\u00ab\2\u0a9f\u0aa0\7\u00f6\2\2\u0aa0"+
		"\u0aa2\3\2\2\2\u0aa1\u0a9c\3\2\2\2\u0aa1\u0aa2\3\2\2\2\u0aa2\u0aa4\3\2"+
		"\2\2\u0aa3\u0a8e\3\2\2\2\u0aa3\u0a8f\3\2\2\2\u0aa3\u0a90\3\2\2\2\u0aa3"+
		"\u0a91\3\2\2\2\u0aa3\u0a92\3\2\2\2\u0aa4\u015d\3\2\2\2\u0aa5\u0aa6\7\u00ac"+
		"\2\2\u0aa6\u0aa7\7\u00f7\2\2\u0aa7\u0aa8\5\u010e\u0088\2\u0aa8\u0aa9\7"+
		"\u00f6\2\2\u0aa9\u0aaa\7\u00e8\2\2\u0aaa\u0aab\7%\2\2\u0aab\u0aac\7\u00f7"+
		"\2\2\u0aac\u0aad\7;\2\2\u0aad\u0aae\7\16\2\2\u0aae\u0ab0\5<\37\2\u0aaf"+
		"\u0ab1\t%\2\2\u0ab0\u0aaf\3\2\2\2\u0ab0\u0ab1\3\2\2\2\u0ab1\u0ab4\3\2"+
		"\2\2\u0ab2\u0ab3\7\u00a4\2\2\u0ab3\u0ab5\t&\2\2\u0ab4\u0ab2\3\2\2\2\u0ab4"+
		"\u0ab5\3\2\2\2\u0ab5\u0ac1\3\2\2\2\u0ab6\u0ab7\7\u00f3\2\2\u0ab7\u0ab9"+
		"\5<\37\2\u0ab8\u0aba\t%\2\2\u0ab9\u0ab8\3\2\2\2\u0ab9\u0aba\3\2\2\2\u0aba"+
		"\u0abd\3\2\2\2\u0abb\u0abc\7\u00a4\2\2\u0abc\u0abe\t&\2\2\u0abd\u0abb"+
		"\3\2\2\2\u0abd\u0abe\3\2\2\2\u0abe\u0ac0\3\2\2\2\u0abf\u0ab6\3\2\2\2\u0ac0"+
		"\u0ac3\3\2\2\2\u0ac1\u0abf\3\2\2\2\u0ac1\u0ac2\3\2\2\2\u0ac2\u015f\3\2"+
		"\2\2\u0ac3\u0ac1\3\2\2\2\u0ac4\u0ac5\7p\2\2\u0ac5\u0ac6\7\u00f7\2\2\u0ac6"+
		"\u0ac7\5\u010e\u0088\2\u0ac7\u0ac8\7\u00f6\2\2\u0ac8\u0ac9\7\u00e8\2\2"+
		"\u0ac9\u0aca\7%\2\2\u0aca\u0acb\7\u00f7\2\2\u0acb\u0acc\7;\2\2\u0acc\u0acd"+
		"\7\16\2\2\u0acd\u0acf\5<\37\2\u0ace\u0ad0\t%\2\2\u0acf\u0ace\3\2\2\2\u0acf"+
		"\u0ad0\3\2\2\2\u0ad0\u0ad3\3\2\2\2\u0ad1\u0ad2\7\u00a4\2\2\u0ad2\u0ad4"+
		"\t&\2\2\u0ad3\u0ad1\3\2\2\2\u0ad3\u0ad4\3\2\2\2\u0ad4\u0ae0\3\2\2\2\u0ad5"+
		"\u0ad6\7\u00f3\2\2\u0ad6\u0ad8\5<\37\2\u0ad7\u0ad9\t%\2\2\u0ad8\u0ad7"+
		"\3\2\2\2\u0ad8\u0ad9\3\2\2\2\u0ad9\u0adc\3\2\2\2\u0ada\u0adb\7\u00a4\2"+
		"\2\u0adb\u0add\t&\2\2\u0adc\u0ada\3\2\2\2\u0adc\u0add\3\2\2\2\u0add\u0adf"+
		"\3\2\2\2\u0ade\u0ad5\3\2\2\2\u0adf\u0ae2\3\2\2\2\u0ae0\u0ade\3\2\2\2\u0ae0"+
		"\u0ae1\3\2\2\2\u0ae1\u0161\3\2\2\2\u0ae2\u0ae0\3\2\2\2\u0ae3\u0ae4\7\u00ac"+
		"\2\2\u0ae4\u0ae5\7\u00f7\2\2\u0ae5\u0ae6\7\u00f6\2\2\u0ae6\u0ae7\7\u00aa"+
		"\2\2\u0ae7\u0ae8\7\u00f7\2\2\u0ae8\u0ae9\5\u009eP\2\u0ae9\u0aea\7\u00f6"+
		"\2\2\u0aea\u0163\3\2\2\2\u0aeb\u0aec\t\'\2\2\u0aec\u0aed\7\u00f7\2\2\u0aed"+
		"\u0aee\5<\37\2\u0aee\u0aef\7\u00f6\2\2\u0aef\u0af0\7\u00e8\2\2\u0af0\u0af1"+
		"\7%\2\2\u0af1\u0af2\7\u00f7\2\2\u0af2\u0af3\5\u0146\u00a4\2\u0af3\u0af9"+
		"\7\u00f6\2\2\u0af4\u0af5\7\u00aa\2\2\u0af5\u0af6\7\u00f7\2\2\u0af6\u0af7"+
		"\5\u009eP\2\u0af7\u0af8\7\u00f6\2\2\u0af8\u0afa\3\2\2\2\u0af9\u0af4\3"+
		"\2\2\2\u0af9\u0afa\3\2\2\2\u0afa\u0165\3\2\2\2\u0afb\u0afc\7p\2\2\u0afc"+
		"\u0afd\7\u00f7\2\2\u0afd\u0afe\7\u00f6\2\2\u0afe\u0aff\7\u00aa\2\2\u0aff"+
		"\u0b00\7\u00f7\2\2\u0b00\u0b01\5\u009eP\2\u0b01\u0b02\7\u00f6\2\2\u0b02"+
		"\u0167\3\2\2\2\u0b03\u0b04\5\u015a\u00ae\2\u0b04\u0b0a\7\u00f7\2\2\u0b05"+
		"\u0b0b\7\u00f4\2\2\u0b06\u0b08\t\f\2\2\u0b07\u0b06\3\2\2\2\u0b07\u0b08"+
		"\3\2\2\2\u0b08\u0b09\3\2\2\2\u0b09\u0b0b\5<\37\2\u0b0a\u0b05\3\2\2\2\u0b0a"+
		"\u0b07\3\2\2\2\u0b0b\u0b0c\3\2\2\2\u0b0c\u0b0d\7\u00f6\2\2\u0b0d\u0b0e"+
		"\7\u0088\2\2\u0b0e\u0b0f\7\u00f7\2\2\u0b0f\u0b10\7p\2\2\u0b10\u0b11\t"+
		"&\2\2\u0b11\u0b12\5\u0146\u00a4\2\u0b12\u0b18\7\u00f6\2\2\u0b13\u0b14"+
		"\7\u00aa\2\2\u0b14\u0b15\7\u00f7\2\2\u0b15\u0b16\5\u0154\u00ab\2\u0b16"+
		"\u0b17\7\u00f6\2\2\u0b17\u0b19\3\2\2\2\u0b18\u0b13\3\2\2\2\u0b18\u0b19"+
		"\3\2\2\2\u0b19\u0169\3\2\2\2\u0b1a\u0b1b\7\u008c\2\2\u0b1b\u0b1c\7\u00f7"+
		"\2\2\u0b1c\u0b1f\5<\37\2\u0b1d\u0b1e\7\u00f3\2\2\u0b1e\u0b20\5\u0186\u00c4"+
		"\2\u0b1f\u0b1d\3\2\2\2\u0b1f\u0b20\3\2\2\2\u0b20\u0b21\3\2\2\2\u0b21\u0b22"+
		"\7\u00f6\2\2\u0b22\u0b23\7\u00e8\2\2\u0b23\u0b24\7%\2\2\u0b24\u0b25\7"+
		"\u00f7\2\2\u0b25\u0b26\5\u0146\u00a4\2\u0b26\u0b2c\7\u00f6\2\2\u0b27\u0b28"+
		"\7\u00aa\2\2\u0b28\u0b29\7\u00f7\2\2\u0b29\u0b2a\5\u009eP\2\u0b2a\u0b2b"+
		"\7\u00f6\2\2\u0b2b\u0b2d\3\2\2\2\u0b2c\u0b27\3\2\2\2\u0b2c\u0b2d\3\2\2"+
		"\2\u0b2d\u016b\3\2\2\2\u0b2e\u0b2f\7\"\2\2\u0b2f\u0b38\7N\2\2\u0b30\u0b31"+
		"\7\67\2\2\u0b31\u0b35\5\u016e\u00b8\2\u0b32\u0b34\5\u0170\u00b9\2\u0b33"+
		"\u0b32\3\2\2\2\u0b34\u0b37\3\2\2\2\u0b35\u0b33\3\2\2\2\u0b35\u0b36\3\2"+
		"\2\2\u0b36\u0b39\3\2\2\2\u0b37\u0b35\3\2\2\2\u0b38\u0b30\3\2\2\2\u0b38"+
		"\u0b39\3\2\2\2\u0b39\u0b3f\3\2\2\2\u0b3a\u0b40\7\64\2\2\u0b3b\u0b3c\7"+
		"\u00e6\2\2\u0b3c\u0b40\7\u010a\2\2\u0b3d\u0b3e\7\u00cb\2\2\u0b3e\u0b40"+
		"\7\u008f\2\2\u0b3f\u0b3a\3\2\2\2\u0b3f\u0b3b\3\2\2\2\u0b3f\u0b3d\3\2\2"+
		"\2\u0b3f\u0b40\3\2\2\2\u0b40\u016d\3\2\2\2\u0b41\u0b42\5\u00aaV\2\u0b42"+
		"\u0b43\7\u00f2\2\2\u0b43\u0b45\3\2\2\2\u0b44\u0b41\3\2\2\2\u0b44\u0b45"+
		"\3\2\2\2\u0b45\u0b49\3\2\2\2\u0b46\u0b47\5\u00a8U\2\u0b47\u0b48\7\u00f2"+
		"\2\2\u0b48\u0b4a\3\2\2\2\u0b49\u0b46\3\2\2\2\u0b49\u0b4a\3\2\2\2\u0b4a"+
		"\u0b4b\3\2\2\2\u0b4b\u0b4c\5\u0102\u0082\2\u0b4c\u016f\3\2\2\2\u0b4d\u0b51"+
		"\7\u00f3\2\2\u0b4e\u0b4f\5\u00aaV\2\u0b4f\u0b50\7\u00f2\2\2\u0b50\u0b52"+
		"\3\2\2\2\u0b51\u0b4e\3\2\2\2\u0b51\u0b52\3\2\2\2\u0b52\u0b56\3\2\2\2\u0b53"+
		"\u0b54\5\u00a8U\2\u0b54\u0b55\7\u00f2\2\2\u0b55\u0b57\3\2\2\2\u0b56\u0b53"+
		"\3\2\2\2\u0b56\u0b57\3\2\2\2\u0b57\u0b58\3\2\2\2\u0b58\u0b59\5\u0102\u0082"+
		"\2\u0b59\u0171\3\2\2\2\u0b5a\u0b5c\7\u00af\2\2\u0b5b\u0b5d\7\u00e9\2\2"+
		"\u0b5c\u0b5b\3\2\2\2\u0b5c\u0b5d\3\2\2\2\u0b5d\u0b5e\3\2\2\2\u0b5e\u0b5f"+
		"\7\u00f7\2\2\u0b5f\u0b61\5\u015c\u00af\2\u0b60\u0b62\5~@\2\u0b61\u0b60"+
		"\3\2\2\2\u0b61\u0b62\3\2\2\2\u0b62\u0b6a\3\2\2\2\u0b63\u0b64\7\u00f3\2"+
		"\2\u0b64\u0b66\5\u015c\u00af\2\u0b65\u0b67\5~@\2\u0b66\u0b65\3\2\2\2\u0b66"+
		"\u0b67\3\2\2\2\u0b67\u0b69\3\2\2\2\u0b68\u0b63\3\2\2\2\u0b69\u0b6c\3\2"+
		"\2\2\u0b6a\u0b68\3\2\2\2\u0b6a\u0b6b\3\2\2\2\u0b6b\u0b6d\3\2\2\2\u0b6c"+
		"\u0b6a\3\2\2\2\u0b6d\u0b6e\5\u0174\u00bb\2\u0b6e\u0b6f\5\u0176\u00bc\2"+
		"\u0b6f\u0b70\7\u00f6\2\2\u0b70\u0173\3\2\2\2\u0b71\u0b72\7\"\2\2\u0b72"+
		"\u0b78\5\u0080A\2\u0b73\u0b74\7\u00f7\2\2\u0b74\u0b75\5\u00b0Y\2\u0b75"+
		"\u0b76\7\u00f6\2\2\u0b76\u0b78\3\2\2\2\u0b77\u0b71\3\2\2\2\u0b77\u0b73"+
		"\3\2\2\2\u0b78\u0175\3\2\2\2\u0b79\u0b7a\7\'\2\2\u0b7a\u0b8d\7\u00f7\2"+
		"\2\u0b7b\u0b8e\5(\25\2\u0b7c\u0b81\7\n\2\2\u0b7d\u0b7e\7\u00f3\2\2\u0b7e"+
		"\u0b80\7\n\2\2\u0b7f\u0b7d\3\2\2\2\u0b80\u0b83\3\2\2\2\u0b81\u0b7f\3\2"+
		"\2\2\u0b81\u0b82\3\2\2\2\u0b82\u0b8e\3\2\2\2\u0b83\u0b81\3\2\2\2\u0b84"+
		"\u0b86\5\u010e\u0088\2\u0b85\u0b87\5~@\2\u0b86\u0b85\3\2\2\2\u0b86\u0b87"+
		"\3\2\2\2\u0b87\u0b88\3\2\2\2\u0b88\u0b89\7\u00f3\2\2\u0b89\u0b8b\5\u010e"+
		"\u0088\2\u0b8a\u0b8c\5~@\2\u0b8b\u0b8a\3\2\2\2\u0b8b\u0b8c\3\2\2\2\u0b8c"+
		"\u0b8e\3\2\2\2\u0b8d\u0b7b\3\2\2\2\u0b8d\u0b7c\3\2\2\2\u0b8d\u0b84\3\2"+
		"\2\2\u0b8e\u0b8f\3\2\2\2\u0b8f\u0b90\7\u00f6\2\2\u0b90\u0177\3\2\2\2\u0b91"+
		"\u0b94\7\u00dd\2\2\u0b92\u0b93\t(\2\2\u0b93\u0b95\7\u00a4\2\2\u0b94\u0b92"+
		"\3\2\2\2\u0b94\u0b95\3\2\2\2\u0b95\u0b96\3\2\2\2\u0b96\u0b9c\7\u00f7\2"+
		"\2\u0b97\u0b9d\5\u0080A\2\u0b98\u0b99\7\u00f7\2\2\u0b99\u0b9a\5\u00b0"+
		"Y\2\u0b9a\u0b9b\7\u00f6\2\2\u0b9b\u0b9d\3\2\2\2\u0b9c\u0b97\3\2\2\2\u0b9c"+
		"\u0b98\3\2\2\2\u0b9d\u0b9e\3\2\2\2\u0b9e\u0b9f\5\u0174\u00bb\2\u0b9f\u0ba0"+
		"\5\u017a\u00be\2\u0ba0\u0ba1\7\u00f6\2\2\u0ba1\u0179\3\2\2\2\u0ba2\u0ba3"+
		"\7\'\2\2\u0ba3\u0ba9\7\u00f7\2\2\u0ba4\u0baa\5\u0080A\2\u0ba5\u0ba6\7"+
		"\u00f7\2\2\u0ba6\u0ba7\5\u00b0Y\2\u0ba7\u0ba8\7\u00f6\2\2\u0ba8\u0baa"+
		"\3\2\2\2\u0ba9\u0ba4\3\2\2\2\u0ba9\u0ba5\3\2\2\2\u0baa\u0bb3\3\2\2\2\u0bab"+
		"\u0bb1\7\13\2\2\u0bac\u0bb2\5\u017c\u00bf\2\u0bad\u0bae\7\u00f7\2\2\u0bae"+
		"\u0baf\5\u017c\u00bf\2\u0baf\u0bb0\7\u00f6\2\2\u0bb0\u0bb2\3\2\2\2\u0bb1"+
		"\u0bac\3\2\2\2\u0bb1\u0bad\3\2\2\2\u0bb2\u0bb4\3\2\2\2\u0bb3\u0bab\3\2"+
		"\2\2\u0bb3\u0bb4\3\2\2\2\u0bb4\u0bc9\3\2\2\2\u0bb5\u0bbb\7\u00f3\2\2\u0bb6"+
		"\u0bbc\5\u0080A\2\u0bb7\u0bb8\7\u00f7\2\2\u0bb8\u0bb9\5\u00b0Y\2\u0bb9"+
		"\u0bba\7\u00f6\2\2\u0bba\u0bbc\3\2\2\2\u0bbb\u0bb6\3\2\2\2\u0bbb\u0bb7"+
		"\3\2\2\2\u0bbc\u0bc5\3\2\2\2\u0bbd\u0bc3\7\13\2\2\u0bbe\u0bc4\5\u017c"+
		"\u00bf\2\u0bbf\u0bc0\7\u00f7\2\2\u0bc0\u0bc1\5\u017c\u00bf\2\u0bc1\u0bc2"+
		"\7\u00f6\2\2\u0bc2\u0bc4\3\2\2\2\u0bc3\u0bbe\3\2\2\2\u0bc3\u0bbf\3\2\2"+
		"\2\u0bc4\u0bc6\3\2\2\2\u0bc5\u0bbd\3\2\2\2\u0bc5\u0bc6\3\2\2\2\u0bc6\u0bc8"+
		"\3\2\2\2\u0bc7\u0bb5\3\2\2\2\u0bc8\u0bcb\3\2\2\2\u0bc9\u0bc7\3\2\2\2\u0bc9"+
		"\u0bca\3\2\2\2\u0bca\u0bcc\3\2\2\2\u0bcb\u0bc9\3\2\2\2\u0bcc\u0bcd\7\u00f6"+
		"\2\2\u0bcd\u017b\3\2\2\2\u0bce\u0bd1\7\u010a\2\2\u0bcf\u0bd1\5\u0186\u00c4"+
		"\2\u0bd0\u0bce\3\2\2\2\u0bd0\u0bcf\3\2\2\2\u0bd1\u017d\3\2\2\2\u0bd2\u0bdf"+
		"\5\u0180\u00c1\2\u0bd3\u0bdf\7?\2\2\u0bd4\u0bdf\7@\2\2\u0bd5\u0bdf\7\u00e3"+
		"\2\2\u0bd6\u0bdf\7\u00d9\2\2\u0bd7\u0bdf\7\u00cd\2\2\u0bd8\u0bdf\7\u00ea"+
		"\2\2\u0bd9\u0bdf\7\u00d1\2\2\u0bda\u0bdf\7\5\2\2\u0bdb\u0bdf\7k\2\2\u0bdc"+
		"\u0bdf\7g\2\2\u0bdd\u0bdf\7\u00d9\2\2\u0bde\u0bd2\3\2\2\2\u0bde\u0bd3"+
		"\3\2\2\2\u0bde\u0bd4\3\2\2\2\u0bde\u0bd5\3\2\2\2\u0bde\u0bd6\3\2\2\2\u0bde"+
		"\u0bd7\3\2\2\2\u0bde\u0bd8\3\2\2\2\u0bde\u0bd9\3\2\2\2\u0bde\u0bda\3\2"+
		"\2\2\u0bde\u0bdb\3\2\2\2\u0bde\u0bdc\3\2\2\2\u0bde\u0bdd\3\2\2\2\u0bdf"+
		"\u017f\3\2\2\2\u0be0\u0be1\t)\2\2\u0be1\u0181\3\2\2\2\u0be2\u0be6\7\u00ed"+
		"\2\2\u0be3\u0be4\7\u00f0\2\2\u0be4\u0be6\7\u010a\2\2\u0be5\u0be2\3\2\2"+
		"\2\u0be5\u0be3\3\2\2\2\u0be6\u0183\3\2\2\2\u0be7\u0be8\7\u010f\2\2\u0be8"+
		"\u0185\3\2\2\2\u0be9\u0bea\7\u00ec\2\2\u0bea\u0187\3\2\2\2\u0beb\u0bef"+
		"\7\u0104\2\2\u0bec\u0bed\7\u0103\2\2\u0bed\u0bef\7\u0103\2\2\u0bee\u0beb"+
		"\3\2\2\2\u0bee\u0bec\3\2\2\2\u0bef\u0189\3\2\2\2\u0bf0\u0bf8\7\u0105\2"+
		"\2\u0bf1\u0bf2\7\u0106\2\2\u0bf2\u0bf8\7\u0108\2\2\u0bf3\u0bf4\7\3\2\2"+
		"\u0bf4\u0bf8\7\u00fd\2\2\u0bf5\u0bf6\7\4\2\2\u0bf6\u0bf8\7\u00fd\2\2\u0bf7"+
		"\u0bf0\3\2\2\2\u0bf7\u0bf1\3\2\2\2\u0bf7\u0bf3\3\2\2\2\u0bf7\u0bf5\3\2"+
		"\2\2\u0bf8\u018b\3\2\2\2\u0bf9\u0bfd\7\u0107\2\2\u0bfa\u0bfb\7\u0106\2"+
		"\2\u0bfb\u0bfd\7\u00fd\2\2\u0bfc\u0bf9\3\2\2\2\u0bfc\u0bfa\3\2\2\2\u0bfd"+
		"\u018d\3\2\2\2\u0bfe\u0c02\7\u0109\2\2\u0bff\u0c00\7\u0108\2\2\u0c00\u0c02"+
		"\7\u00fd\2\2\u0c01\u0bfe\3\2\2\2\u0c01\u0bff\3\2\2\2\u0c02\u018f\3\2\2"+
		"\2\u01bd\u0195\u019b\u01a3\u01a6\u01a9\u01ac\u01af\u01b6\u01ba\u01c1\u01c4"+
		"\u01c7\u01cf\u01d3\u01d5\u01d8\u01e3\u01ea\u01ee\u01f2\u01f6\u0201\u0207"+
		"\u020c\u0210\u0215\u021a\u021f\u0223\u0226\u022a\u022e\u0234\u023a\u023f"+
		"\u0243\u024e\u0257\u025d\u0260\u0264\u0267\u026c\u0273\u0277\u027b\u0280"+
		"\u0284\u0289\u028f\u0293\u0297\u029c\u02a1\u02a9\u02ac\u02b2\u02b7\u02bb"+
		"\u02c4\u02c7\u02cb\u02ce\u02d1\u02db\u02df\u02e4\u02e8\u02eb\u02f8\u02fb"+
		"\u02ff\u0302\u030b\u030e\u0313\u0316\u0319\u031c\u0321\u0325\u0328\u032b"+
		"\u032e\u0335\u0339\u033c\u0343\u034e\u0359\u035c\u0360\u0364\u0369\u036c"+
		"\u0370\u0374\u0378\u0384\u0392\u039e\u03a5\u03a8\u03b0\u03b5\u03bd\u03c1"+
		"\u03d5\u03df\u03e3\u03ed\u03f0\u03f5\u03fe\u0401\u0404\u0413\u0418\u041b"+
		"\u042a\u0433\u0443\u044a\u0457\u045b\u045e\u0464\u0467\u046a\u046d\u0473"+
		"\u0476\u0479\u047c\u047f\u0485\u0488\u048b\u048e\u0491\u0493\u049b\u04a2"+
		"\u04a6\u04aa\u04b1\u04b5\u04bd\u04bf\u04c1\u04c5\u04d1\u04db\u04dd\u04e3"+
		"\u04e9\u04f0\u04f7\u04fd\u0504\u0506\u050f\u0513\u0518\u0521\u0526\u0534"+
		"\u0537\u053b\u0540\u0546\u054f\u0556\u055d\u0565\u0569\u056d\u0576\u057d"+
		"\u0582\u0585\u058d\u058f\u0595\u0598\u05a0\u05a2\u05a8\u05ab\u05b3\u05b5"+
		"\u05b9\u05be\u05c2\u05c7\u05cd\u05d3\u05d8\u05dd\u05e9\u05eb\u05f4\u05f6"+
		"\u05fd\u0601\u0606\u060b\u060f\u061a\u062b\u062f\u0635\u063e\u0641\u0644"+
		"\u0649\u064f\u0652\u0656\u065a\u065e\u0663\u0667\u066e\u0670\u0677\u067c"+
		"\u067e\u0687\u068d\u0695\u06a3\u06a8\u06b6\u06bb\u06bd\u06c6\u06c8\u06cd"+
		"\u06d4\u06d8\u06da\u06e0\u06e3\u06ee\u06f0\u06f6\u06f8\u06fc\u06ff\u0706"+
		"\u0709\u070d\u0716\u071e\u0722\u0726\u0739\u0740\u0744\u074c\u0754\u075c"+
		"\u0762\u076b\u076f\u0776\u077d\u077f\u0786\u078c\u079e\u07a3\u07ac\u07b4"+
		"\u07ba\u07cd\u07d4\u07d8\u07df\u07e3\u07e7\u07eb\u07ef\u07f2\u07f6\u07fe"+
		"\u0801\u0808\u080b\u080d\u0814\u081a\u0825\u082b\u082f\u0835\u083b\u0841"+
		"\u0847\u084d\u0852\u0857\u085e\u0865\u0869\u0875\u087b\u087f\u0883\u0887"+
		"\u088b\u0899\u089d\u08a8\u08b1\u08b7\u08c2\u08c7\u08cb\u08d0\u08d5\u08e1"+
		"\u08e6\u08eb\u08f4\u08fe\u0908\u090c\u0914\u091c\u0927\u092c\u0931\u0937"+
		"\u0939\u094c\u0956\u0958\u0969\u096e\u0971\u0977\u0979\u097d\u097f\u098a"+
		"\u098c\u0997\u099d\u099f\u09a3\u09ac\u09b5\u09bb\u09c5\u09cb\u09d4\u09d9"+
		"\u09dd\u09e4\u09ef\u09fc\u0a01\u0a05\u0a09\u0a0d\u0a14\u0a19\u0a1c\u0a20"+
		"\u0a24\u0a29\u0a2c\u0a30\u0a34\u0a3b\u0a3e\u0a44\u0a49\u0a55\u0a5c\u0a62"+
		"\u0a65\u0a6d\u0a70\u0a74\u0a76\u0a7f\u0a88\u0a8c\u0a96\u0a99\u0aa1\u0aa3"+
		"\u0ab0\u0ab4\u0ab9\u0abd\u0ac1\u0acf\u0ad3\u0ad8\u0adc\u0ae0\u0af9\u0b07"+
		"\u0b0a\u0b18\u0b1f\u0b2c\u0b35\u0b38\u0b3f\u0b44\u0b49\u0b51\u0b56\u0b5c"+
		"\u0b61\u0b66\u0b6a\u0b77\u0b81\u0b86\u0b8b\u0b8d\u0b94\u0b9c\u0ba9\u0bb1"+
		"\u0bb3\u0bbb\u0bc3\u0bc5\u0bc9\u0bd0\u0bde\u0be5\u0bee\u0bf7\u0bfc\u0c01";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}