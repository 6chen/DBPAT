package com.dbpat.mvc.model;

import org.springframework.stereotype.Component;

@Component
public class Target {
    protected String trgtId;
    protected String trgtNm;
    protected String trgtTyp;
    protected String ip;
    protected String prt;
    protected String usrId;
    protected String pw;
    protected String serv;
    protected String schm;
    protected String path;
    protected Integer clctCycl;

    public String getTrgtId() {
        return trgtId;
    }

    public void setTrgtId(String trgtId) {
        this.trgtId = trgtId;
    }

    public String getTrgtNm() {
        return trgtNm;
    }

    public void setTrgtNm(String trgtNm) {
        this.trgtNm = trgtNm;
    }

    public String getTrgtTyp() {
        return trgtTyp;
    }

    public void setTrgtTyp(String trgtTyp) {
        this.trgtTyp = trgtTyp;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPrt() {
        return prt;
    }

    public void setPrt(String prt) {
        this.prt = prt;
    }

    public String getUsrId() {
        return usrId;
    }

    public void setUsrId(String usrId) {
        this.usrId = usrId;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getServ() {
        return serv;
    }

    public void setServ(String serv) {
        this.serv = serv;
    }

    public String getSchm() {
        return schm;
    }

    public void setSchm(String schm) {
        this.schm = schm;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getClctCycl() {
        return clctCycl;
    }

    public void setClctCycl(Integer clctCycl) {
        this.clctCycl = clctCycl;
    }

    @Override
    public String toString() {
        return "Target{" +
                "trgtId='" + trgtId + '\'' +
                ", trgtNm='" + trgtNm + '\'' +
                ", trgtTyp='" + trgtTyp + '\'' +
                ", ip='" + ip + '\'' +
                ", prt='" + prt + '\'' +
                ", usrId='" + usrId + '\'' +
                ", pw='" + pw + '\'' +
                ", serv='" + serv + '\'' +
                ", schm='" + schm + '\'' +
                ", path='" + path + '\'' +
                ", clctCycl=" + clctCycl +
                '}';
    }
}
