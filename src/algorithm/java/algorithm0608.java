package algorithm;

import java.util.Scanner;

public class algorithm0608 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		
		for(int i=1; i<=A; i++) {
			
			int B = sc.nextInt();
			int C = sc.nextInt();
			
			System.out.println("Case #" + i + ": " + B + " + " + C + " = " + (B+C));
			// 전에는 입력받은 것의 합만 구하면 되었으나  이문제는 식 자체를 ""에 문자를 넣고(연산자) +로 연결 시킨다 
			
		}
		sc.close();
		
	}
	
	
	
}
