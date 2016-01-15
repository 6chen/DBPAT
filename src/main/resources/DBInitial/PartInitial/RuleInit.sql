CREATE TABLE RL
(
  RL_ID	 VARCHAR2(32)  NOT NULL ,
  RL_NM	 VARCHAR2(50)  NOT NULL ,
  RL_CLS VARCHAR2(20),
  RL_DESCR	 VARCHAR2(100)  NOT NULL,
  RL_SET_ID	 VARCHAR2(32)  NOT NULL,
  RL_ST_TM VARCHAR2(32) NOT NULL,
  RL_UPT_TM VARCHAR2(32)
);

ALTER TABLE RL ADD CONSTRAINT RL_PK PRIMARY KEY (RL_ID);

INSERT INTO RL VALUES (SYS_GUID(), 'RULE1', 'ruleClass1', 'This is Rule 1', (SELECT RL_SET_ID FROM RL_SET WHERE ROWNUM <= 1), TO_CHAR(SYSDATE, 'YYYYMMDDHH24MISS'), NULL);
INSERT INTO RL VALUES (SYS_GUID(), 'RULE2', 'ruleClass2', 'This is Rule 2', (SELECT RL_SET_ID FROM RL_SET WHERE ROWNUM <= 1), TO_CHAR(SYSDATE, 'YYYYMMDDHH24MISS'), NULL);
INSERT INTO RL VALUES (SYS_GUID(), 'RULE3', 'ruleClass3', 'This is Rule 3', (SELECT RL_SET_ID FROM RL_SET WHERE ROWNUM <= 1), TO_CHAR(SYSDATE, 'YYYYMMDDHH24MISS'), NULL);

