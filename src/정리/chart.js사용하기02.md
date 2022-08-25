&nbsp;

3.Controller 처리
---

- AdminController

```java

@Controller("adminController")
public class AdminController {
	

	@Autowired
	private ChartService cservice;

	  int total = cservice.getmembercnt();
	     int totalto = cservice.getmemberto();
	      int totalw = cservice.getmembercntw();
	      int one = cservice.getmemberone();
	      int two = cservice.getmembertwo();
	      int three = cservice.getmemberthr();
	      int four = cservice.getmemberfour();
	      int five = cservice.getmemberfive();
	      model.addAttribute("total", total);
	      model.addAttribute("totalto", totalto);
	      model.addAttribute("totalw", totalw);
	      model.addAttribute("one",one);
	      model.addAttribute("two",two);
	      model.addAttribute("three",three);
	      model.addAttribute("four",four);
	      model.addAttribute("five",five);
	    
```

service에 맞는 객체를 처리 한다 



&nbsp;


4.View 처리
---



- admin-main.jsp


```jsp
<script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.6.0/Chart.js"></script>

```
Chart.js를 사용하기 위해서는 위의 script를 적어야한다 





```jsp
	<canvas id="myChart" height="350" width="500"></canvas>

```
Chart.js를 사용하기 위해서는 Chart.js를 그릴 영역인 canvas를 지정해야 하고 id를 부여한다 





```jsp

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



```

data에 cotroller에서 model로 담은  값을 넣어 적용한다



&nbsp;
```jsp

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


