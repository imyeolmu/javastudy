package algorithm.java;

import java.util.Scanner; 
//문제: 백준 1330번 
public class algorithm0320 {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	//Scanner 객체 생성-in,input,sc,scan이 대체로 들어감
	//system.in이 들어가야함(사용자로부터 입력받기 위한 스트림)
	
	int A = in.nextInt();
	int B = in.nextInt();
	//Scanner의 입력 메소드 int 형 입력 및 리턴
	in.close();
	
	if(A>B) System.out.println(">");
	else if(A<B) System.out.println("<");
	else System.out.println("==");
}
	
}

 /*  Scanner 클래스 특징
  *  기본적인 데이터 타입들을 Scanner의 메소드를 사용하여 입력
  *  Scanner을 사용시 util패키지를 경로의 Scanner 클래스를 호출-lang패키지가 아니면 import을 통해 호출
  *  공백(띄어쓰기) 및 개행(줄 바꿈)을 기준으로 읽는다
*/