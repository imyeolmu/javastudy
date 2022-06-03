package algorithm.java;



import java.util.Scanner;


public class algorithm0603{
	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int sum = 0;
		for (int i=0; i<= N; i++)
		{ //자바는 괄호를 열고 조건문 수행시 수행할 반목문을 넣는다
			sum = sum+i;
				
		}
		System.out.println(sum);
	}
}