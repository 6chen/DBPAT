CREATE TABLE JB_PARSING_DTL
(
  JB_ID         VARCHAR2(32) NOT NULL,
  BIZ_AREA_ID   VARCHAR2(32) NOT NULL,
  TRGT_ID       VARCHAR2(32) NOT NULL,
  JB_EXEC_CNT   NUMBER       NOT NULL,
  SQL_ID        VARCHAR2(13) NOT NULL,
  JB_PARSING_ED_TM TIMESTAMP NOT NULL,
  JB_PARSING_ST_TM TIMESTAMP NOT NULL
);

