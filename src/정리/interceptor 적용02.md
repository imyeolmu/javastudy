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
/admin 경로가 붙는 모든 url을 대상을 한다
(url 맵핑을 admin으로 붙이지 않았기 때문에 실행 불가 함으로 방법만 알기로 함-> 모든 url을 바꿔야함)

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

&nbsp;


- AdminInerceptor.java

관리자 메서드에 접근하는 사용자의 adminCk이 1인지 확인하는 작업이 필요하다.



member에서 session정보를 memberVO 변수에 담은 후 adminCk의 값을 호출하는 코드를 작성해야한다. 

```java
public class AdminInterceptor implements HandlerInterceptor{
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		
		HttpSession session = request.getSession();
		
		MemberVO vo = (MemberVO)session.getAttribute("member");
		
```
preHandle() 메소드를 오버라이딩한다.

member에서 session을 호출 시켜서 memeberVo 타입의 VO 변수에 저장한다.

```java
public class AdminInterceptor implements HandlerInterceptor{
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		
		HttpSession session = request.getSession();
		
		MemberVO vo = (MemberVO)session.getAttribute("member");

		
		if(vo == null || vo.getAdminchk() == 0) {
			
			response.sendRedirect("/client-main");
			
			return false;
		}
		
		
		return true; //관리자 계정 로그인 경우 
	}
	
  

}

```
if문을 이용하여 vo가 null 이거나 getAdminchk() 메서드 반환 값이 0이면 main페이지로 반환 되도록 한다.

아닐경우 admincontroller.java에 접근 하도록 한다.


(url 맵핑을 /admin으로 붙이지 않았기 때문에 실행 불가 함으로 방법만 알기로 함-> 모든 url을 바꿔야함)