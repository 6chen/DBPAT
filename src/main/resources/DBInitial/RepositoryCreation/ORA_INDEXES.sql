CREATE TABLE ORA_INDEXES
 (
   BIZ_AREA_ID                      VARCHAR2(10),
   TRGT_ID                          VARCHAR2(10),
   INDEX_NAME                       VARCHAR2(30) NOT NULL,
   INDEX_TYPE                       VARCHAR2(27),
   TABLE_NAME                       VARCHAR2(30) NOT NULL,
   UNIQUENESS                       VARCHAR2(9),
   TABLESPACE_NAME                  VARCHAR2(30),
   BLEVEL                           NUMBER,
   LEAF_BLOCKS                      NUMBER,
   DISTINCT_KEYS                    NUMBER,
   AVG_LEAF_BLOCKS_PER_KEY          NUMBER,
   AVG_DATA_BLOCKS_PER_KEY          NUMBER,
   CLUSTERING_FACTOR                NUMBER,
   NUM_ROWS                         NUMBER,
   SAMPLE_SIZE                      NUMBER,
   PARTITIONED                      VARCHAR2(3)
 );