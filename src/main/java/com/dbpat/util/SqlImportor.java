package com.dbpat.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by YUSIN on 16/1/7.
 */
public class SqlImportor {

    private List<File> fileList = null;
    private List<String> sqlList = null;

    public SqlImportor() {
        fileList = new ArrayList<File>();
        sqlList = new ArrayList<String>();
    }

    public List<File> getFileList() {
        return fileList;
    }

    public void setFileList(List<File> fileList) {
        this.fileList = fileList;
    }

    public List<String> getSqlList() {
        return sqlList;
    }

    public void setSqlList(List<String> sqlList) {
        this.sqlList = sqlList;
    }

    public static void main(String[] args) {
        File dir = new File("./OracleSQLFiles");

        SqlImportor sqlImportor = new SqlImportor();

        List<String> sqlList = null;

        if (dir.isDirectory()) {
            sqlList = sqlImportor.getAllSqlFromFil(dir);
        }

        for (String sql : sqlList) {
            System.out.println(sql);
        }
    }

    public List<File> getAllFilesFromDir(File dir) {
        File[] dirList = dir.listFiles();
        for (File subDir : dirList) {
            if (subDir.isDirectory()) {
                getAllFilesFromDir(subDir);
                continue;
            }
            fileList.add(subDir);
        }
        return fileList;
    }

    public List<String> getAllSqlFromFil(File dir) {
        fileList = getAllFilesFromDir(dir);

        for (File file : fileList) {
            try {
                BufferedReader in = new BufferedReader(new FileReader(file));
                String str;
                StringBuilder sqlString = new StringBuilder();
                while ((str = in.readLine()) != null) {
                    sqlString.append(" " + str.trim());
                }
                sqlList.add(sqlString.toString());
            } catch (IOException e) {
            }
        }

        return sqlList;
    }



}
