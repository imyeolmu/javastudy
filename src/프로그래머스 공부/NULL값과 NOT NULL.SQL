-- 이름이 없는 동물
--동물 보호소에 들어온 동물 중, 이름이 없는 채로 들어온 동물의 ID를 조회하는 SQL 문을 작성해주세요. 단, ID는 오름차순 정렬되어야 합니다


SELECT ANIMAL_ID FROM ANIMAL_INS 
WHERE NAME IS NOT NULL 
ORDER BY ANIMAL_ID  ASC;



--이름이 있는 동물 
--동물 보호소에 들어온 동물 중, 이름이 있는 동물의 ID를 조회하는 SQL 문을 작성해주세요. 단, ID는 오름차순 정렬되어야 합니다.

```SQL
SELECT ANIMAL_ID FROM ANIMAL_INS 
WHERE NAME IS NOT NULL 
ORDER BY ANIMAL_ID  ASC;
```

--SELECT 다음 조건문을 쓸 때는 WERER를 쓴다. 
--추가적으로 내림차순(ASC)이나 오름차순(DESC)가 필요할때는 ORDER BY를 써서 사용한다
