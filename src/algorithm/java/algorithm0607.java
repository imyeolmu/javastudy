package algorithm;

import java.util.Scanner;

;

public class algorithm0607{
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		
		
		for (int i = 1; i <=A ; i++){ // 같다라는 부등호 까먹지 않기
			
			int B = sc.nextInt();
			int C = sc.nextInt();
			
			System.out.println("Case #" + i + ": " + (B + C));
			
			
		
		}
	
	
		sc.close();// 파일을 읽을 때는 항상 닫는게 좋다
	
	}	
}
