### Chart.js사용하기01

&nbsp;


Chart.js란?

8개의 차트 유형을 지원하는 데이터 시각화를 위한 자유의 오픈 소스 자바스크립트 라이브러리이다 

&nbsp;




순서
---
 
1.Mapper처리

2.Service처리

3.contrller처리

4.view 처리


---
관리자 페이지의 메인부분인 대시보드에서 관리자가 한눈에 데이터를 파악 할 수 있게 Chart.js를 사용해보자

기본적으로 CRUD와 같은 방법으로 진행한다

&nbsp;

1.Mapper처리
---

차트에 총 회원수와 이번주 회원수, 1~5일전 가입 회원의 데이터를 시각화 하기 위해서 데이터를 뽑는다

&nbsp;


- Chartmapper.java

```java

	//총회원수
	public int getmembercnt();
	
	//오늘 가입수
	public int getmemberto();
	
	//이번주 가입 회원수
	public int getmembercntw();
	
	//1일전
	public int getmemberone();
	
	//2일전
	public int getmembertwo();
	
	//3일전
	public int getmemberthr();
	
	//4일전
	public int getmemberfour();
	
	//5일전
	public int getmemberfive();

}

```

쿼리를 요청하는 메소드를 작성한다

&nbsp;


- ChartMapper.xml

```java
 총 회원수 
	select count(*) from member

	//오늘 가입수

	select (
	select count(*) from member where regdate >= to_char(trunc(sysdate),'yyyy/mm/dd')) from dual


	//이번주 가입 회원수
	      select (
	select count(*) from member where regdate > to_char(trunc(sysdate,'iw'),'yyyy/mm/dd'))
	from dual
	        
	//1일전
  select (
	select count(*) from member where regdate >= to_char(trunc(sysdate-1),'yyyy/mm/dd')) from dual
	//2일전
  select (
	select count(*) from member where regdate >= to_char(trunc(sysdate-2),'yyyy/mm/dd')) from dual

	//3일전
select (
	select count(*) from member where regdate >= to_char(trunc(sysdate-3),'yyyy/mm/dd')) from dual
	//4일전
select (
	select count(*) from member where regdate >= to_char(trunc(sysdate-4),'yyyy/mm/dd')) from dual
	//5일전
  select (
	select count(*) from member where regdate >= to_char(trunc(sysdate-5),'yyyy/mm/dd')) from dual

```

xml 파일을 mapper의 역할로 만들기 위해서 Mapper 인터페이스의 경로를 포함하는 인터페이스의 이름을 작성해야한다.

__마이바티스가 Mapper 인터페이스와 XML을 인터페이스이름과 namespace 속성값을 가지고 판단하기 때문에 중요하다__




&nbsp;


2.Service처리
---
- ChartService.java

```java
	//총회원수
    public int getmembercnt();
    
    //오늘가입수
    public int getmemberto();
    
    //이번주 가입
    public int getmembercntw();
    
    //1일전
    public int getmemberone();
    
    //2일전
    public int getmembertwo();
    
    //3일전
    public int getmemberthr();
    
    //4일전
    public int getmemberfour();
    
    //5일전
    public int getmemberfive();
```
인터페이스에 차트에 대한 기능을 수행하는 메소드들을 작성한다

&nbsp;

- ChartServicelmpl.java

```java

@Repository
public class ChartServiceImpl implements ChartService{

	//총회원수 
	public int getmembercnt() {

		return mapper.getmembercnt();

	}
	
	//오늘 회원수
	public int getmemberto() {

		return mapper.getmemberto();
	}
	// 이번주
	public int getmembercntw() {

		return mapper.getmembercntw();
	}

	//1일전
	public int getmemberone() {

		return mapper.getmemberone();

	}

	// 2일전
	public int getmembertwo() {

		return mapper.getmembertwo();
	}

	// 3일전
	public int getmemberthr() {

		return mapper.getmemberthr();
	}

	// 4일전
	public int getmemberfour() {
		return mapper.getmemberfour();
	}

	// 5일전
	public int  getmemberfive() {
		return mapper.getmemberfive();

	}
}

```

해당 클래스가 Chartservice 인터페이스를 구현한다 의미의 키워드를 작성한다


해당클래스가 DB에 접근하는 모든 코드가 모여있다는것을 인식하게 @Repository 처리를 해준다

