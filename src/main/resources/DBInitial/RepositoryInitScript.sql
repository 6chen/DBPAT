-- 업무 영역 테이블

DROP TABLE BIZ_AREA PURGE;

CREATE TABLE BIZ_AREA
(
  biz_area_id    VARCHAR2(32)  NOT NULL, -- 업무영역 아이디
  biz_area_st_tm VARCHAR2(32)  NOT NULL, -- 업무영역 유효 시작 일시
  biz_area_ed_tm VARCHAR2(32)  NOT NULL, -- 업무영역 유효 종료 일시
  biz_area_nm    VARCHAR2(50)  NOT NULL, -- 업무영역 명칭
  biz_area_descr VARCHAR2(100) NOT NULL  -- 업무영역 설명
);

ALTER TABLE biz_area ADD CONSTRAINT biz_area_pk PRIMARY KEY (biz_area_id, biz_area_st_tm, biz_area_ed_tm);

-- 업무 영역 테이블 테스트 데이터 삽입

INSERT INTO BIZ_AREA VALUES
  (sys_guid(), TO_CHAR(SYSDATE, 'YYYYMMDDHH24MISS'), TO_CHAR('99991231235959'), 'Biz Area No 1',
   'This Bizarea is created for test');

INSERT INTO BIZ_AREA
VALUES (sys_guid(), TO_CHAR(SYSDATE, 'YYYYMMDDHH24MISS'), TO_CHAR('99991231235959'), 'Biz Area No 2', '한글 테스트');

