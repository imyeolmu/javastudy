### 인터셉터 적용하기02

4.Interceptor 적용하기
---


- interceptor 클래스 작성하기

xml설정을 해준다.

interceptor 클래스를 따로 관리하기 위해서 com.supermm.interceptor를 만든다

LoginInterceptor.java와 AdminInterceptor.java 를 생성한다

---

```xml

    <!-- 인터셉터 적용 -->
    <interceptors>
        <interceptor>
            <mapping path="/login.do"></mapping>
            <beans:bean id="loginIntreceptor" class="com.supermm.interceptor.LoginInterceptor"></beans:bean>
        </interceptor>
        <interceptor>
            <mapping path="/admin/**"></mapping>
            <beans:bean id="AdminIntreceptor" class="com.supermm.interceptor.AdminInterceptor"></beans:bean>
        </interceptor>
    </interceptors>
```

&nbsp;

- LoginInterceptor.java


이전 작업 중 세션이 완전이 제거 되지 않아 로그인을 위해 새로운 세션을 저장할 떄 발생 할 수 있는 에러를 방지하기 위해 로그인 메서드가 있는 membercontroller.java에 진입하기 전 세션을 제거하는 작업을 한다

```java


public class LoginInterceptor implements HandlerInterceptor{
	
	// controller 에 진입하기전에 preHandle() 메서드를 오버라이딩 한다
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		return true;

```

controller에 진입하기전에 작업을 해야하므로  preHandle() 메서드를 오버라이딩 한다.

```java

public class LoginInterceptor implements HandlerInterceptor{
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		System.out.println("LoginInterceptor tpreHandle 작동");
		
		HttpSession session = request.getSession();
		
		session.invalidate();
		// TODO Auto-generated method stub
		return true;
	}

	

}

```
세션을 제거해주는 코드를 설정한다.

printIn을 이용해서 작동되는지 확인한다


&nbsp;

---

- AdminInerceptor.java