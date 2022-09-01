### Servlet Filter

순서
---
1.Servlet filter?

2.서블릿 필터 메서드

3.서블릿 필터 등록


1.servlet filter
---
Filter는 J2EE 표준 스펙으로 Servlet API 2.3부터 등장 하였고
Dispathcher Servlet에 요청이 되기 전 후에 부가작업을 처리하는 객체이다.

&nbsp;

----
2.Servlet filter 메서드
---


init과 doFilter는 디폴트 메서드에서 선택적으로 오버라이딩 할 수 있다.

- init
```java
@override
public void init(final FilterConfig filterConfig) throws ServletExcetion{
    log.info("LogionFilter.init");

}
```
 FilterConfig: Filter의 정보를 가지고 있는 객체

xml에 적은 정보들이 FilterConfig 객체가 담고 있어서 초기화할때 사용 가능하다.

생성 될때 한번만 사용한다.

- doFilter
```java
@Override
	public void doFilter(ServletRequest request, ServletResponse response, 
			FilterChain chain)
			throws IOException, ServletException {
        System.out.println("before");
		chain.doFilter(request, response);
		System.out.println("after");
	}

}

```
 doFilter는 request와 response라는 파라미터가 존재한다. Http정보를 읽을 수 있다.

 __chain.doFilter를 호출해야한다. 
 그렇지 않으면 다음필터로 넘어가지 않는다.__ 
 
 init은 생성 될때 한번만 사용하지만 doFilter는 init과 다르게 요청이 들어올 때마다 실행 되어서 직접적인 인증과 부가적인 작업은 doFilter를 사용한다.


 +) Filter chain: Filter가 여러개 모여 형성된 체인이다.


- destory

```java
@Override
public void destory(){
     log.info("LoginFilter.destory");
}
```
destory는 소멸이 될때 한번만 호출한다.

-----

&nbsp;

3.서블릿 필터 등록
----

- component
```java
@Component
public class LoginFilter implements Filter{

}

```
모든 url에 적용가능하기 때문에 좋지 않다

&nbsp;

- WebFilter와 ServletComponentScan


```java
@WebFilter(urlpatterns="/users/me/*")
public class LoginFilter implements Filter {

```
urlpatterns으로 url을 분류할 수 있다.


```java
@ServletComponentScan
public class Application {
    public static void main(String[] args) {SpringApplication.run(Application.class, args);}

}

```
@ServletComponentScan을 붙어야만 등록이 된다.

@ServletComponentScan: 빈을 등록 해주는 것인데 대상이 웹 필터나 웹 서블릿, 그다음에 웹 리스너와 같이 서블릿 객체들을 서블릿 컨테이너 위에 올려주는 동작을 해주는 어노테이션이다.

그러나 서블릿 컨테이너에 지정되기 때문에 순서를 지정할 수 없다 

- FilterRegistrationBean

```java
@Bean
    public FilterRegistrationBean addFilter() {
        FilterRegistrationBean <Filter>   filterRegistrationBean  = new FilterRegistrationBean <>();

        filterRegistrationBean.setFilter(new LoginFliter(JWtTokenProvider));
        filterRegistrationBean.setOrder(1);
        filterRegistrationBean.addUrlpatterns("/users/me/*");
        return filterRegistrationBean;
    }

```
객체를 만든다.

setFilter: 필터를 등록해준다.

setOrder: 순서를 지정

addUrlpatterns:url를 지정 해줄 수 있다.

순서와 url을 지정해주고 싶으면 사용한다.
