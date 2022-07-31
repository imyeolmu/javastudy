### Read 구현 


&nbsp;

1.퍼시스턴트 계층
===
> NoticeMapper.xml

&nbsp;

목록 조회 하기

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