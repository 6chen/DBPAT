CREATE TABLE JB_ISPT_DTL
(
  JB_ID         VARCHAR2(32) NOT NULL,
  BIZ_AREA_ID   VARCHAR2(32) NOT NULL,
  TRGT_ID       VARCHAR2(32) NOT NULL,
  JB_EXEC_CNT   NUMBER       NOT NULL,
  SQL_ID        VARCHAR2(13) NOT NULL,
  RL_ID         VARCHAR2(32) NOT NULL,
  ISPT_RLT      NUMBER,
  JB_ISPT_ED_TM VARCHAR2(32) NOT NULL,
  JB_ISPT_ST_TM VARCHAR2(32) NOT NULL
);



ALTER TABLE JB_ISPT_DTL ADD CONSTRAINT JB_ISPT_DTL_PK PRIMARY KEY (JB_ID, BIZ_AREA_ID, TRGT_ID, JB_EXEC_CNT, SQL_ID, RL_ID);
