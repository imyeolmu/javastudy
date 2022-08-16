### Chart.js사용하기


Chart.js란?

8개의 차트 유형을 지원하는 데이터 시각화를 위한 자유의 오픈 소스 자바스크립트 라이브러리이다 





순서
---
 
1.Mapper처리

2.Service처리

3.contrller처리

4.view 처리


---

기본적으로 CRUD와 같은 방법으로 진행한다

1.Mapper처리
---

차트에 총 회원수와 이번주 회원수, 1~5일전 가입 회원의 데이터를 시각화 하기 위해서 데이터를 뽑는다

- Dashmapper.java

```






```


- DashMapper.xml
```


```




```jsp

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ include file="./inc/admin-header.jsp"%>
<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.6.0/Chart.js"></script>


	</div>
	<div class="container mt-5 me-5">
	 <!-- Start Single Info -->
    <div class="single-info d-flex justify-content-center mb-4">
        <h6 style="font-weight:500">회원수</h6>
        <span class="ms-2" style="color:#ffd66b; font-weight:700">${total}</span>
        <h6 style="font-weight:500" class="ms-2">오늘가입수</h6>
         <span class="ms-2" style="color:#ffd66b; font-weight:700">${totalto}</span>
        <h6 style="font-weight:500" class="ms-2">이번주가입수</h6>
        <span class="ms-2" style="color:#ffd66b; font-weight:700">${totalw}</span>
    </div>
    <!-- End Single Info -->
	
	<canvas id="myChart" height="350" width="500"></canvas>
<script>
  const labels = [
    '5일전',
    '4일전',
    '3일전',
    '2일전',
    '1일전',
    '오늘',
    ]


  const data = {
    labels: labels,
    datasets: [{
      label: '회원수',
      backgroundColor: 'rgba(171, 147, 201, 0.3)',
      borderColor :"rgba(171, 147, 201, 0.5)",
	  pointBackgroundColor : "rgba(171, 147, 201, 0.5)",
	  pointBorderColor : "rgba(171, 147, 201, 0.8)",
      data: ['${five}', '${four}','${three}','${two}','${one}', '${totalto}'],
    }]
  };

  const config = {
    type: 'line',
    data: data,
    options: {}
  };

      
const myChart = new Chart(
       document.getElementById('myChart'),
       config
     );
      
</script>
	</div>
</section>

<%@ include file="./inc/footer.jsp"%>
```

- AdminController