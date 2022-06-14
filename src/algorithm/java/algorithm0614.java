package javastudy;


import java.util.Scanner;

public class algorithm0614 {
	

		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
	 
			
			int N = in.nextInt();
			
			int num = N;
			int cnt = 0;
		
				while(true) {
//					int a = (num/10); 2
//					int b = (num%10); 6
//					int c=(a+b)%10;  8  아래와 같이 쓸 수도 있다
			
					num=num%10*10+(num/10+num%10)%10;
					//6에 10을 곱해주고 60 (%10*10) 8은(num/10+num%10)%10
					cnt++;
					if(N==num) break;
				}
				System.out.println(cnt); //사이클의 개수를 출력    	
				
				in.close();
					
					
					
			}
			
			
			

}

    
//만약 26이면 2와 6을 따로 봐야한다 20에서 2를 만들려면 26을 10으로 
//나눈 몫이 되고 6을 만들려면 26을 10으로 나눈 나머지(b)이 된다
//2와 6을 더하고 나눈 나머지가 해당하는 값이다(c)

			

	