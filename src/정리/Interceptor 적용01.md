### 인터 셉터 적용 하기

&nbsp;



메인 페이지에서 관리자계정으로만 로그인 했을 경우 관리자 페이지로 이동 할 수 있는 버튼이 보이게 하였다.

일반로그인을 하지 않아도 url을 알고 있다면 접속이 가능하다.

관리자 페이지 접속 메소드에 세션 체크를 하여  권한이 없는 관리자가 접근 시 메서드가 실행 되지 않게 해야한다.

(url 맵핑을 admin으로 붙이지 않았기 때문에 실행 불가 함으로 방법만 알기로 함-> 모든 url을 바꿔야하기때문)

&nbsp;


순서
---

1.인터셉터란?

2.인터셉터 사용하는이유?

3.인터셉터 메소드

4.인터셉터 적용하기

&nbsp;

1.Interceptor(인터셉터)란?
---

낚아채다라는 의미를 가지며 필터와 달리 Spring이 제공하는 기술 이다. 

서블릿이 컨트롤러를 호출하기 전과 호출후에 요청과 응답을 참조하거나 가공할 수 있는 기능을 제공한다.

한번의 작성으로 일괄적으로 관리할 수 있는 수단으로 Interceptor를 이용 한다.



&nbsp;

------

2.Interceptor을 사용하는 이유?(+ Servlet Filter)
---

Controller의 핸들러가 실행 되기전이나 후에 추가적인 작업을 원할 때 사용한다(로그인 체크 및 권한 체크등)

ex) 관리자계정의 핸들러 작성이 많으면 메모리 낭비와 서버의 부하가 발생한다. 또한 코드가 누락 되면서 관리자 확인문제가 발생한다.

따라서 이런 문제점을 줄이기 위해 인터셉터를 사용할 수 있다.

```
인터셉터 클래스에 한번만 작성하여 메모리 낭비를 감소 시키고 코드 누락의 위험성을 줄여준다
```
&nbsp;


- Servlet Fileter와 Interceptor

|servlet filter||interceptor|
|:---|---:|:---:|
|자바 표준 스펙|| 스프링이 제공하는 기술|
|다음필터를 위해 개발자가 명시적으로 작성 해야한다.(chain.doFileter)|| 다음 인터셉터를 위해 개발자가 신경을 쓰지 않아도 된다.|
|ServletRequest, ServletResponse를 필터 체이닝 중간 새로운 객체로 바꿀수 있다|| ServletRequest, ServletResponse를 인터셉터 체이닝 중간 새로운 객체로 바꿀수 없다|
|필터에서 예외가 발생하면 @ControllerAdvice에서 처리하지 못한다.|| 인터셉터에서 예외가 발생하면 @ControllerAdvice에서 처리가능하다.|


+) 인터셉터 같은 경우 인터셉터 자체가 dispathcherServlet에서 호출되기 때문에 @controllerAdvice의 관리 영역에 있어 예외가 처리 가능하다

filter 경우 그 과정이 전후에 처리 하기 때문에 불가능 하다 


&nbsp;



----
3.Interceptor의 메소드
---

- PreHandle
```java
default boolean preHandle(HttpServletRequest request, HttpServletResponse response, object handler)
throws Exception{


    return true;
}
```
PreHandle은 Handler가 실행되기 전에 실행되는 메서드로 비지니스 로직에서 공통적으로 처리 할 사항이 있을 경우 사용한다


- PostHandle

```java
default void postHandle(HttpServletRequest request, HttpServletResponse response, object handler)
    @Nullable ModelAndView modelAndView) throws Exception {

    }
```
PostHandle Handler가 실행된 이후에 실행되는 메서드 이다.
파라미터로 Modelandview를 받아 추가적인 작업을 하고 싶을 경우 사용한다.

- afterCompletion

```java
default void afterCompletion(HttpServletRequest request, HttpServletResponse response, object handler)
    @Nullable Exception ex) throws Exception{
    }


```
afterCompletion는 postHandler와 마찬가지로 Handler 이후에 실행되는 메서드이다.
파라미터로 exception이 넘어오게 된다. 비지니스로직에서 예외가 발생했다면 afterCompletion을 이용해서 처리 할 수 있다.
추가적으로 afterCompletion은 어떤 리소스들을 정리 할때도 사용이 가능하다.


-----

_3개의 메소드 모두 default메소드이기 때문에 사용자가 사용하고 싶은 메소드를 선택해서 사용하면 된다._

