CREATE TABLE ORA_TAB_PARTITIONS
 (
   BIZ_AREA_ID               VARCHAR2(10),
   TRGT_ID                   VARCHAR2(10),
   TABLE_NAME                VARCHAR2(30),
   COMPOSITE                 VARCHAR2(3),
   PARTITION_NAME            VARCHAR2(30),
   HIGH_VALUE                LONG,
   PARTITION_POSITION        NUMBER,
   TABLESPACE_NAME           VARCHAR2(30),
   NUM_ROWS                  NUMBER,
   BLOCKS                    NUMBER,
   SAMPLE_SIZE               NUMBER
 );