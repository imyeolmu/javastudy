package javastudy;

import java.util.Scanner;

public class algorithm0714 {
			public static void main(String[] args) {
				
				
				
// 여기에서 소수는 0.001과 0.235가 아닌 1과 자기자신을 의미한다 
// 기본적이 ㄴ소수 판별법
				
//Number이라는 숫자를 판별한다고 가정한다
				Scanner in = new Scanner(System.in);
				
				int N = in.nextInt();
				
				int count = 0;
				
				for(int i = 0; i < N; i++) {
					
					// 소수인경우 true, 아닌경우 false   
					boolean isPrime = true;
					
					int num = in.nextInt();
					
					if(num == 1) {	// 1 인경우 다음 반복문으로
						continue;
					}
					//2~ Number-1까지 중 나누어 떨어지는 약수가 있는지 판별한다
					//Number =2 의 경우 자연스럽게 for문을 검사하지 않게 됨
					for(int j = 2; j <= Math.sqrt(num); j++) {
						if(num % j == 0) {
							isPrime = false;	// 소수가 아니므로 false 로 바꿔줌
							break;
						}
					}
					if(isPrime) {	// 소수인경우 count 값 1 증가
						count++;
					}
				}
				System.out.println(count);
			}
		 
		}

}}
