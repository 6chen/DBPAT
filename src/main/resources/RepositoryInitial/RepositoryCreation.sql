CREATE TABLE REP_BIZ_AREA
(
  biz_area_id    VARCHAR2(10)  NOT NULL,
  biz_area_nm    VARCHAR2(20)  NOT NULL,
  biz_area_descr VARCHAR2(100) NOT NULL
);


INSERT INTO REP_BIZ_AREA VALUES ('BIZ0001', 'Biz Area No 1', 'This Bizarea is created for test');


SELECT
  biz_area_id    AS bizAreaId,
  biz_area_nm    AS bizAreaNm,
  biz_area_descr AS bizAreaDescr
FROM REP_BIZ_AREA