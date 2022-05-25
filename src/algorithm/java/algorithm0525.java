package algorithm.java;

import java.util.Scanner;

//백준알고리즘2588번
public class algorithm0525{
public static void main(String[] args) {
    
  Scanner in = new Scanner(System.in);
  

  // 문자열로 받아 두번째 입력으로 들어오는 정수를 분리하여 각각 곱한값을 출력(3~5) 한 뒤 마지막에는 원래 식의 연산 값을 출력해주어야 한다.
	int A = in.nextInt();
	String B = in.next(); 
	
	
  
  System.out.println(A*(B.charAt(2)-'0'));
  System.out.println(A*(B.charAt(1)-'0')); //charAt으로 각 자리수를 참조해준다 -문자열의 인덱스 위치에 있는 문자(Character) 값을 반환한다.
  System.out.println(A*(B.charAt(0)-'0'));//이때 반환 되는 값은 아스키코드값인 문자 (char)이다
  System.out.println(A * Integer.parseInt(B));

}
	
	}
