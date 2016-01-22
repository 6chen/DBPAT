package com.dbpat.springmvc.model;

import org.springframework.stereotype.Component;

/**
 * Created by YUSIN on 16/1/22.
 */

@Component
public class CollectTabPo {
    protected String clctTabId;
    protected String clctTabNm;
    protected String exportSql;
    protected String importSql;

    @Override
    public String toString() {
        return "CollectTabPo{" +
                "clctTabId='" + clctTabId + '\'' +
                ", clctTabNm='" + clctTabNm + '\'' +
                ", exportSql='" + exportSql + '\'' +
                ", importSql='" + importSql + '\'' +
                '}';
    }

    public String getClctTabId() {
        return clctTabId;
    }

    public void setClctTabId(String clctTabId) {
        this.clctTabId = clctTabId;
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
}
