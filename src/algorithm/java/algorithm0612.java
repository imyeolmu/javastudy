package javastudy;


import java.util.Scanner;

public class algorithm0612 {
	

		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
	 
			while(true) { // 무한루프 설정 해준뒤 
			
			int A = in.nextInt();
			int B = in.nextInt();//테스트 케이스를 입력받고 
	  
			if(A==0 && B==0) { // A와 B가 0일 경우 &&을 통해 break로 반복문을 빠져나간다
				in.close();
				break; 
			}
			
			System.out.println(A+B);
			}
		}
	
	}
