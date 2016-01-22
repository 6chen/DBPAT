CREATE TABLE ORA_TABLES
(
  JB_ID                     VARCHAR2(32) NOT NULL,
  BIZ_AREA_ID               VARCHAR2(32) NOT NULL,
  TRGT_ID                   VARCHAR2(32) NOT NULL,
  JB_EXEC_CNT               NUMBER       NOT NULL,
  TABLE_NAME                VARCHAR2(30) NOT NULL,
  TABLESPACE_NAME           VARCHAR2(30),
  NUM_ROWS                  NUMBER,
  BLOCKS                    NUMBER,
  EMPTY_BLOCKS              NUMBER,
  AVG_SPACE                 NUMBER,
  CHAIN_CNT                 NUMBER,
  AVG_ROW_LEN               NUMBER,
  AVG_SPACE_FREELIST_BLOCKS NUMBER,
  SAMPLE_SIZE               NUMBER,
  PARTITIONED               VARCHAR2(3),
  TEMPORARY                 VARCHAR2(1)
);