package com.dbpat.mvc.model;

import org.springframework.stereotype.Component;

@Component
public class DbmsTypePerClctTab {
    private String dbmsTypId;
    private String seq;
    private String clctTabNm;
    private String exportSql;
    private String importSql;

    public String getDbmsTypId() {
        return dbmsTypId;
    }

    public void setDbmsTypId(String dbmsTypId) {
        this.dbmsTypId = dbmsTypId;
    }

    public String getSeq() {
        return seq;
    }

    public void setSeq(String seq) {
        this.seq = seq;
    }

    public String getClctTabNm() {
        return clctTabNm;
    }

    public void setClctTabNm(String clctTabNm) {
        this.clctTabNm = clctTabNm;
    }

    public String getExportSql() {
        return exportSql;
    }

    public void setExportSql(String exportSql) {
        this.exportSql = exportSql;
    }

    public String getImportSql() {
        return importSql;
    }

    public void setImportSql(String importSql) {
        this.importSql = importSql;
    }

    @Override
    public String toString() {
        return "DbmsTypePerClctTab{" +
                "dbmsTypId='" + dbmsTypId + '\'' +
                ", seq='" + seq + '\'' +
                ", clctTabNm='" + clctTabNm + '\'' +
                ", exportSql='" + exportSql + '\'' +
                ", importSql='" + importSql + '\'' +
                '}';
    }
}
