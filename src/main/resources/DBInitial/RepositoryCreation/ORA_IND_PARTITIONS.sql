CREATE TABLE ORA_IND_PARTITIONS
 (
   BIZ_AREA_ID                VARCHAR2(10),
   TRGT_ID                    VARCHAR2(10),
   INDEX_NAME                 VARCHAR2(30),
   COMPOSITE                  VARCHAR2(3),
   PARTITION_NAME             VARCHAR2(30),
   HIGH_VALUE                 LONG,
   PARTITION_POSITION         NUMBER,
   TABLESPACE_NAME            VARCHAR2(30),
   BLEVEL                     NUMBER,
   LEAF_BLOCKS                NUMBER,
   DISTINCT_KEYS              NUMBER,
   AVG_LEAF_BLOCKS_PER_KEY    NUMBER,
   AVG_DATA_BLOCKS_PER_KEY    NUMBER,
   CLUSTERING_FACTOR          NUMBER,
   NUM_ROWS                   NUMBER,
   SAMPLE_SIZE                NUMBER
 );