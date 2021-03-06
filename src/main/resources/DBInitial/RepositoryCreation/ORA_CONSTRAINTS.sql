CREATE TABLE ORA_CONSTRAINTS
(
  JB_ID             VARCHAR2(32) NOT NULL,
  BIZ_AREA_ID       VARCHAR2(32) NOT NULL,
  TRGT_ID           VARCHAR2(32) NOT NULL,
  JB_EXEC_CNT       NUMBER       NOT NULL,
  TABLE_NAME        VARCHAR2(30) NOT NULL,
  CONSTRAINT_NAME   VARCHAR2(30) NOT NULL,
  CONSTRAINT_TYPE   VARCHAR2(1),
  SEARCH_CONDITION  LONG,
  R_OWNER           VARCHAR2(30),
  R_CONSTRAINT_NAME VARCHAR2(30),
  DELETE_RULE       VARCHAR2(9),
  STATUS            VARCHAR2(8),
  INDEX_OWNER       VARCHAR2(30),
  INDEX_NAME        VARCHAR2(30)
);