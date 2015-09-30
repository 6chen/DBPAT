CREATE TABLE BIZ_AREA
(
  biz_area_id    VARCHAR2(10)  NOT NULL,
  biz_area_nm    VARCHAR2(20)  NOT NULL,
  biz_area_descr VARCHAR2(100) NOT NULL
);


INSERT INTO BIZ_AREA VALUES ('BIZ0001', 'Biz Area No 1', 'This Bizarea is created for test');


SELECT
  biz_area_id    AS bizAreaId,
  biz_area_nm    AS bizAreaNm,
  biz_area_descr AS bizAreaDescr
FROM BIZ_AREA;



CREATE SEQUENCE BIZ_AREA_SEQ
INCREMENT BY 1
START WITH 1
MAXVALUE 9999;



CREATE TABLE TRGT
(
  biz_area_id     VARCHAR2(10)  NOT NULL,
  trgt_id     VARCHAR2(10)  NOT NULL,
  trgt_nm     VARCHAR2(20)  NOT NULL,
  trgt_typ     VARCHAR2(20)  NOT NULL,
  ip	 VARCHAR2(50),
  prt	 VARCHAR2(50),
  dbms_typ	 VARCHAR2(20),
  usr_id	 VARCHAR2(10),
  pw	 VARCHAR2(20),
  serv	 VARCHAR2(20),
  schm	 VARCHAR2(20),
  dbms_typ_num	 NUMBER(10),
  pth	 VARCHAR2(50),
  clct_cycl	 NUMBER(20)
);

INSERT INTO TRGT(biz_area_id, trgt_id, trgt_nm, trgt_typ, ip, prt, usr_id, pw, serv, schm, dbms_typ_id) VALUES ('BIZ0001','TRGT0001','DBECRDB1','01','210.110.136.101','1521','SCOTT','TIGER','','SCOTT','DBMS0001');
INSERT INTO TRGT(biz_area_id, trgt_id, trgt_nm, trgt_typ, ip, prt, usr_id, pw, serv, schm, dbms_typ_id) VALUES ('BIZ0001','TRGT0002','DBECRDB2','01','210.110.136.102','1521','SCOTT','TIGER','','SCOTT','DBMS0001');
INSERT INTO TRGT(biz_area_id, trgt_id, trgt_nm, trgt_typ, ip, prt, usr_id, pw, serv, schm, dbms_typ_id) VALUES ('BIZ0001','TRGT0003','DBECRDB3','01','210.110.136.103','1521','SCOTT','TIGER','','SCOTT','DBMS0001');
INSERT INTO TRGT(biz_area_id, trgt_id, trgt_nm, trgt_typ, ip, prt, usr_id, pw, serv, schm, dbms_typ_id) VALUES ('BIZ0001','TRGT0004','DBECRDB4','01','210.110.136.104','1521','SCOTT','TIGER','','SCOTT','DBMS0001');

CREATE TABLE DBMS_TYP(
  DBMS_TYP_ID VARCHAR2(10),
  DBMS_TYP_NM VARCHAR2(20),
  DBMS_VER VARCHAR2(20)
);


