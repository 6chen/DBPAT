CREATE TABLE ORA_TABLES
  (
    BIZ_AREA_ID               VARCHAR2(10),
    TRGT_ID                   VARCHAR2(10),
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