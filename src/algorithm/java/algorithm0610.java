package javastudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class algorithm0610 {
	
	public static void main(String[] args) throws Exception, IOException {
		
	 BufferedReader br = null;

	 br = new BufferedReader(new InputStreamReader(System.in));
	 
	 int n =Integer.parseInt(br.readLine());
	 
	 br.close(); // 닫아주기
	 
	 for(int i =1; i<n; i++) {
		 for(int j =1; j<=n-i; j++) {
			System.out.println(""); // 공백 출력의 경우 for 문의 j는 n-i의 값만큼 반복해주면 된다 
		 }
		 
		 for(int k =1; k<=i; k++) { //별의 개수는 i의 값만큼 출력 for 문을 외부 for 문 아래에 하나 써야 한다
			 System.out.println("*");
		 }
		 System.out.println();
		 
	 }
	}

}
