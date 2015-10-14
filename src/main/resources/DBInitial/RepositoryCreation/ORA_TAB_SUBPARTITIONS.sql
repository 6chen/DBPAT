CREATE TABLE ORA_TAB_SUBPARTITIONS
 (
   BIZ_AREA_ID                    VARCHAR2(10),
   TRGT_ID                        VARCHAR2(10),
   TABLE_NAME                     VARCHAR2(30) NOT NULL,
   PARTITION_NAME                 VARCHAR2(30),
   SUBPARTITIONS_NAME             VARCHAR2(30),
   HIGH_VALUE                     LONG,
   SUBPARTITION_POSITION          NUMBER,
   TABLESPACE_NAME                VARCHAR2(30) NOT NULL,
   NUM_ROWS                       NUMBER,
   BLOCKS                         NUMBER,
   SAMPLE_SIZE                    NUMBER
 );