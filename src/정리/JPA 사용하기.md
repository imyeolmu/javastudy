### JPA 사용해보기

순서
---
1.영속성

2.자바의 영속성

3.My Batis 와 JPA

4.JPA란?

5.Spring Data + JPA

6.My Batis에서 JPA로 migration하기

&nbsp;


1.영속성
---

프로그램에서 발생하는 데이터들을 물리적인 저장소에 저장하는 행위

객체지향 애플리케이션에서는 객체를 특정 저장소에 저장하는 행위

프로그램이 종료되어도 해당 데이터들은 남아있게 한다.

자바에서는 SQL을 통해 RDBMS에 데이터를 저장하는 행위



관계형 데이터 베이스와 자바 사이에 어떤 관계를 가지는지를 확인 해본다.


2.자바의 영속성
---
자바에서는 객체를 영속화 할때 OR 맵핑과 SQL 맵핑을 사용한다.

OR 맵핑은 객체 지향적 (ORM) : JPA

SQL 맵핑은 테이블 지향적 (SQL Mapping) :My baits

목표가 다르기 때문에 패러다임이 일치하지 않는다고 표현한다.




3.My Batis와 JPA
---

- MY Batis

My Batis는 JDBC를 좀더 편하게 사용할 수 있도록 객체를 SQL이나 저장 프로시저와 매핑해주는 퍼시스턴스 프레임워크이다.

SQL Mapper이다.


다른 프레임워크들에 비해 간단하다(Simple)

소스코드와 SQL의 분리되어 생산성이 높고 DBA와 협업이 가능하여 작업분배가 가능하다.

SQL을 직접 다룰 수 있다(복잡한 쿼리, 함수, 저장 프로시저등)



단점: 반복적인 코드와 CRUD SQL 작업

SQL 과 데이터베이스 벤더에 대한 종속성( 오라클에서 my sql로 넘어갈떄 쿼리문을 my sql로 바꿔야 한다. )


- JPA 

crud의 작업을 개발자가 반복적으로 작성하지 않아 생산성이 향샹 된다.

마이바티스 같은 경우 컬럼 추가 및 삭제시 crudd 쿼리를 모두 수정해야하는 경우가 발생하나 JPA는 하지 않아되서 유지 보수에 좋다.

데이터베이스 벤더마다 다른 데이터 타입이나 SQL을 JPA를 이용하면 손쉽게 사용 할 수 있다.

SQL 중심에서 객체 중심으로 개발이 가능 하다

객체와 관계형 데이터 베이스 사이의 패러다임의 불일치로 발생하는 문제를 해결한다(상속, 연관,객체그래프등)

&nbsp;

4.JPA란?
---

JAVA Persistence API

자바 진영의 ORM 기술 표준

ORM(Object-Reational Mapping)

데이터베이스 객체를 자바 객체로 매핑하여 객체 간의 관계를 바탕으로 SQL을 자동으로 생성한다.

- Spring Data

다양한 데이터 저장소에 대한 접근을 추상화하기 위한 Spring 프로젝트

JPA, JDBC, Redis, MongoDB등

- Spring Data JPA

Repository 추상화를 통해 interface 선언만으로도 구현 가능

메서드 이름으로 쿼리 생성

Web Support(페이징, 정렬, 도메인클래스, 컨버터등)



5.Spring  Data + JPA 





&nbsp;

5.My Batis에서 JPA로 migration하기
---

- 의존성(DI- Dependency Injection) 라이브러리 추가 하기

Spring Data JPA사용

```java
<!-- https://mvnrepository.com/artifact/org.springframework.data/spring-data-jpa -->
<dependency>    
<groupId>org.springframework.data<groupId>  
<artifactId>spring-data-jpa</artifactId>  
<version>2.4.2</version>
</dependency>
```
