package com.dbpat.util.oraclesql;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by YUSIN on 16/1/7.
 */
public class AntlrEngine {
    private OracleSqlParser parser = null;
    private ParseTree tree = null;

    public void doParsing(String oraSql) throws IOException {
        InputStream is = new ByteArrayInputStream(oraSql.getBytes());
        ANTLRInputStream input = new ANTLRInputStream(is);
        OracleSqlLexer lexer = new OracleSqlLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        parser = new OracleSqlParser(tokens);
        tree = parser.compilationUnit();
    }

    public OracleSqlParser getParser() {
        return parser;
    }

    public ParseTree getTree() {
        return tree;
    }
}
