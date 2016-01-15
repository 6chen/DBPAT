CREATE TABLE RL_SET
(
  RL_SET_ID     VARCHAR2(32)  NOT NULL,
  RL_SET_NM     VARCHAR2(50)  NOT NULL,
  RL_SET_DESCR  VARCHAR2(100) NOT NULL,
  RL_SET_ST_TM  VARCHAR2(32)  NOT NULL,
  RL_SET_UPT_TM VARCHAR2(32)
);


INSERT INTO RL_SET
VALUES (SYS_GUID(), 'QUERY PROCESS', 'This rule set inlucde all of the query process rules!',
        TO_CHAR(SYSDATE, 'YYYYMMDDHH24MISS'), NULL);
INSERT INTO RL_SET
VALUES (SYS_GUID(), 'PARSING PROCESS', 'This rule set inlucde all of the query process rules!',
        TO_CHAR(SYSDATE, 'YYYYMMDDHH24MISS'), NULL);
INSERT INTO RL_SET
VALUES
  (SYS_GUID(), 'TEST1', 'This rule set inlucde all of the query process rules!', TO_CHAR(SYSDATE, 'YYYYMMDDHH24MISS'),
   NULL);
INSERT INTO RL_SET
VALUES
  (SYS_GUID(), 'TEST2', 'This rule set inlucde all of the query process rules!', TO_CHAR(SYSDATE, 'YYYYMMDDHH24MISS'),
   NULL);
COMMIT;