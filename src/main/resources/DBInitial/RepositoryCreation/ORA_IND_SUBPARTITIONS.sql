CREATE TABLE ORA_IND_SUBPARTITIONS
 (
   BIZ_AREA_ID                      VARCHAR2(10),
   TRGT_ID                          VARCHAR2(10),
   INDEX_NAME                       VARCHAR2(30) NOT NULL,
   PARTITION_NAME                   VARCHAR2(30),
   SUBPARTITION_NAME                VARCHAR2(30),
   HIGH_VALUE                       LONG,
   SUBPARTITION_POSITION            NUMBER,
   TABLESPACE_NAME                  VARCHAR2(30) NOT NULL,
   BLEVEL                           NUMBER,
   LEAF_BLOCKS                      NUMBER,
   DISTINCT_KEYS                    NUMBER,
   AVG_LEAF_BLOCKS_PER_KEY          NUMBER,
   AVG_DATA_BLOCKS_PER_KEY          NUMBER,
   CLUSTERING_FACTOR                NUMBER,
   NUM_ROWS                         NUMBER,
   SAMPLE_SIZE                      NUMBER
 );