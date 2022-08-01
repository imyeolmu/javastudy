### Notice-list 구현 하기


&nbsp;

DB
======



 ANOTICE 테이블

```sql

reate table anotice
(
    nno  int,
    ntitle varchar2(100) not null,
    nwriter_id varchar2(20) not null,
    ncontent varchar2(3000) not null,
    nregdate date DEFAULT SYSDATE,
    updatedate date default sysdate,
    nhit  int DEFAULT 0,
    nfiles varchar2(3000)
    );

-- 자동증가
ALTER TABLE anotice ADD (
  CONSTRAINT anotice PRIMARY KEY (nno));
    
    
--시퀀스
CREATE SEQUENCE anotice_seq START WITH 1;


-- 트리거
CREATE OR REPLACE TRIGGER anotice_bir 
BEFORE INSERT ON anotice
FOR EACH ROW

BEGIN
  SELECT anotice_seq.NEXTVAL
  INTO   :new.nno
  FROM   dual;
END;
````


&nbsp;



순서 
===



1.Mapper처리/테스트 

2.service처리/테스트

3.controller 처리/테스트

4.view 처리


-----------------------





&nbsp;


&nbsp;


Mapper 처리 및 테스트 
-------

&nbsp;

- NoticeMapper.java

&nbsp;

NoticeMapper.java를 테스트 하기 앞서 오라클에 위의 테이블을 생성한 후 아래의 코드를 작성한다

```java
public List<NoticeVO> Noticelist();

```
&nbsp;

------------------------------

__* SELECT 결과 하나의 행에 대한 정보만 얻을 경우 VO를 클래스타입으로 받아도 되나 리스트 같이 두개의 행으로 이루 어져 있을 경우 List타입으로 반환 받는다*__

------------------------------
&nbsp;


NoticeMappperTest.java에서 juit 테스트를 실행한다 





&nbsp;








```xml
<select id="Noticelist" resultType="com.supermm.model.NoticeVO">
		select * from anotice order by nno
	</select>

```
&nbsp;

페이징 처리한 목록 페이지

```xml

<select id="getNoticePaging"
		resultType="com.supermm.model.NoticeVO">	
		  <![CDATA[
        
        select nno, ntitle, nwriter_id, ncontent, nregdate, updatedate from(
        
                select  rownum  as rn, nno, ntitle, nwriter_id, ncontent, nregdate, updatedate
                  
                from anotice where rownum <= #{pageNum} * #{amount} 
    ]]>            
                <if test="keyword != null">
                    and ntitle like '%'||#{keyword}||'%' 
                </if>
    
    <![CDATA[
                    
                )
                    
        where rn > (#{pageNum} -1) * #{amount}
    
    ]]>
    
    </select>

```

공지사항의 검색 부분을 처리하기 위해 위의 쿼리문을 넣어준다 

