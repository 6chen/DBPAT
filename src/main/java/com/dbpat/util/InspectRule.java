package com.dbpat.util;

import com.dbpat.util.oraclesql.OracleSqlParser;
import org.antlr.v4.runtime.tree.ParseTree;

public interface InspectRule {
    void apply(OracleSqlParser parser, ParseTree tree);
}
