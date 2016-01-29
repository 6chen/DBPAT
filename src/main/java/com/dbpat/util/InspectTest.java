package com.dbpat.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by YUSIN on 16/1/7.
 */
public class InspectTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException {

        InspectJob inspectJob = new InspectJob();
        inspectJob.setJobName("YUSIN INSPECT JOB TEST :");

//        File dir = new File("./OracleSQLFiles");
//        SqlImportor sqlImportor = new SqlImportor();

        // Set inspect SQLs
        List<String> inspectSqlList = new ArrayList<String>();
//        inspectSqlList = sqlImportor.getAllSqlFromFil(dir);
        inspectSqlList.add("SELECT *\n" +
                "  FROM EMP\n" +
                "WHERE DEPTNO = 10\n" +
                "  AND JOB = 'STAFF';");

        inspectSqlList.add("SELECT *\n" +
                "  FROM EMP\n" +
                "WHERE DEPTNO = 10\n" +
                "  AND ENAME = :ENAME;");
//

        inspectSqlList.add("SELECT *\n" +
                "FROM EMP\n" +
                "WHERE YUSIN(ENAME) = TO_CHAR('ADMIN')\n" +
                "      AND TO_CHAR(JOB) LIKE '%A%'\n" +
                "      AND TO_CHAR(HIREDATE) BETWEEN '20150101' AND '20151231'\n" +
                "      AND REGEXP_COUNT(ENAME, '[A-Z]') = 3\n" +
                "      AND DEPTNO = 10\n" +
                "      AND LENGTH(ENAME) > 10\n" +
                "      AND SAL > (SELECT AVG(SAL)\n" +
                "                 FROM EMP\n" +
                "                 WHERE TRIM(DPETNO) = 10 AND LENGTH(ENAME) > 10);");

//        inspectSqlList.add("select * from emp");
//        inspectSqlList.add("select * from dept");
//        inspectSqlList.add("select * from order");
        inspectJob.setInspectSqlList(inspectSqlList);

        // Set inspect Rules
        List<String> inspectRuleList = new ArrayList<String>();
//        inspectRuleList.add("ChkSelectAsterisk");
//        inspectRuleList.add("ChkUseHint");
//        inspectRuleList.add("ChkNoBindVariable");
        inspectRuleList.add("NoBindVariable");
        inspectRuleList.add("SelectAsteriskCheck");
        inspectRuleList.add("UseHintCheck");
        inspectRuleList.add("UseLeftPredFunc");
        inspectRuleList.add("UseNestedCASE");
        inspectRuleList.add("UseNestedDECODE");
        inspectRuleList.add("UseNestedSubqeury");
        inspectJob.setInspectRuleList(inspectRuleList);

        inspectJob.doJob();
    }
}
