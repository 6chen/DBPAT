CREATE TABLE JB_EXEC_HIST
(
  JB_ID VARCHAR2(32) NOT NULL,
  BIZ_AREA_ID VARCHAR2(32) NOT NULL,
  TRGT_ID     VARCHAR2(32) NOT NULL,
  JB_EXEC_CNT NUMBER NOT NULL,
  JB_EXEC_ED_TM VARCHAR2(32),
  JB_EXEC_ST_TM VARCHAR2(32)
);


ALTER TABLE JB_EXEC_HIST ADD CONSTRAINT JB_EXEC_HIST_PK PRIMARY KEY (JB_ID, BIZ_AREA_ID, TRGT_ID, JB_EXEC_CNT);
