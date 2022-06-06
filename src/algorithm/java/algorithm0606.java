package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class algorithm0606{
	public static void main(String[] args) throws Throwable, IOException {
		
	

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	
	int N = Integer.parseInt(br.readLine());
	br.close();
	
	while(N>0) { 
		System.out.println(N);
		N--; //입력받은 값을 감소연산자를 이용하여 다운 시킨다
		}
	
	}	
}
