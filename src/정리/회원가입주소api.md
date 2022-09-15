### 회원가입주소

순서
---
1.view단 변경하기

2.스크립트 추가하기

3.주소메서드 추가하기


1.view단 변경하기
---


```jsp

<input class="form-control" name="addr1" readonly="readonly">
										
<input class="form-control address2" name="addr2" readonly="readonly">
								
<input class="form-control address_input_3"  name="addr3" placeholder="상세주소를 입력하세요" >
								
```

주소 입력창이 사용자가 변경 할 수 없도록 모두 한다.



2.스크립트 추가하기
---

```jsp
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
```

통합로딩방식을 이용하였다.


```jsp

 /*카카오 api  */
		  function join_daum_address(){



```

api를 사용하기위한 메서드를 추가한다.


&nbsp; 



3.주소메서드 추가하기
---

```jsp
			   
  new daum.Postcode({
 oncomplete: function(data) {


```
팝업창을 띄우는 코드를 추가해준다.


```jsp
<div class="col-sm-3">
							<div class="button">
								<button type="button" class="btn m-3"
									onclick="join_daum_address();">주소 찾기</button>
							</div>
						</div>
```
주소찾기 버튼을 누를시 메서드가 실행 될 수 있게 jsp를 설정한다.



API 홈페이지 주소에 가서 필요한 소스코드를 복사한다.

[사용자가 선택한 값 이용하기]의 예제코드 복사

위의 function(data)에서 data는 팝업창에서 선택한 주소에 대한 정보를 반환하는 객체변수이다.(data에 무슨 속성이 있는지는 홈페이지에 나와있다.)




```jsp      
 // 주소변수 문자열 과 참고항목 문자열 합치기 
	addr += extraAddr;
```
참고 항목이 없기 때문에 주소가 입력되는 필드에 추가 항목 필드에 입력될 정보가 함께 입력되도록 만든다. 

주소데이터와 추가 항목 데이터가 합쳐지도록 코드를 추가한다. 


&nbsp; 


```jsp

  addr += extraAddr;
		                 
  } else {
  addr += ' ';
  }

```
두번째 if 문 else 내부의 코드를 지우고 새로운 코드를 추가해준다. (기존의 코드는 추가 항목 필드에 아무것도 입력되지 않게 하기 위한 코드이다. 추가항목 필드가 따로 없기 때문에 제거한다.)


&nbsp; 

```jsp
 // 우편번호와 주소 정보를 해당 필드에 넣는다.
		                 $("[name=addr1]").val(data.zonecode);
		                 $("[name=addr2]").val(addr);
		                 
		                 // 커서를 상세주소 필드로 이동한다.
		          		$("[name=addr3]").attr("readonly",false);
		          		$("[name=addr3]").focus();  
			        	
		
			        	
			       }
		     }).open();
		 }
	

```

우편번호와 주소 정보를  해당 필드에 넣어주는 코드를 수정해준다.

상세주소 입력란 disabled 속성 변경 및 커서를 상세주소 필드로 이동한다.


```jsp
  /*카카오 api  */
		  function join_daum_address(){
			   
			   new daum.Postcode({
			        oncomplete: function(data) {


			       	
		  	    		var addr = ''; // 주소 변수
		                 var extraAddr = ''; // 참고항목 변수

		            
		                 if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
		                     addr = data.roadAddress;
		                 } else { // 사용자가 지번 주소를 선택했을 경우(J)
		                     addr = data.jibunAddress;
		                 }

		                 // 사용자가 선택한 주소가 도로명 타입일때 참고항목을 조합한다.
		                 if(data.userSelectedType === 'R'){
		                     // 법정동명이 있을 경우 추가한다. (법정리는 제외)
		                     // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
		                     if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
		                         extraAddr += data.bname;
		                     }
		                     // 건물명이 있고, 공동주택일 경우 추가한다.
		                     if(data.buildingName !== '' && data.apartment === 'Y'){
		                         extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);
		                     }
		                     // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
		                     if(extraAddr !== ''){
		                         extraAddr = ' (' + extraAddr + ')';
		                     }
		                     // 주소변수 문자열 과 참고항목 문자열 합치기 
		                    addr += extraAddr;
		                 
		                 } else {
		                     addr += ' ';
		                 }

		                 // 우편번호와 주소 정보를 해당 필드에 넣는다.
		                 $("[name=addr1]").val(data.zonecode);
		                 $("[name=addr2]").val(addr);
		                 
		                 // 커서를 상세주소 필드로 이동한다.
		          		$("[name=addr3]").attr("readonly",false);
		          		$("[name=addr3]").focus();  
			        	
		
			        	
			       }
		     }).open();
		 }
	
```