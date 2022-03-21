package algorithm.java;

import java.util.Scanner;
//백주 2573번 문제
public class algorithm0321 {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	int A = in.nextInt();
	
	in.close();
	
	
    if(A%4==0) {
    	//4의 배수 일경우
    	if(A%400==0) System.out.println("1");
    	//4의 배수 이면서 400의 배수 일 경우
    	else if(A%100==0) System.out.println("0");
    	//4의 배수 이면 서 100의 배수 일 경우
    	else System.out.println("1");
    	//4의 배수 일 경우
    }
    else System.out.println("0");
    //4의 배수도 아닐 경우 
    }
    	
    }


	/*조건: 4의 배수는 윤년으로 1을 출력하나 100의 배수일 경우 윤년이 아니라
	 * 0을 출혁해야한다
	 * 4의 배수임을 여부 파악,400으로 나뉘어 떨어지는지.100으로 나뉘어지는지 확인
	 * 삼항 연산자를 중첩으로 풀 수도 있음
	 * System.out.println(A%400==0)?(A%400==0)?"1");:(A%100==0)?"0";"1"):"0");
	 */
	