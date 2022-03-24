package algorithm.java;
import java.util.Scanner;
//백준 2739 구구단
public class algorithm0324 {
	public static void main (String[]args) {
		
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		
		in.close();
		
	for (int i = 1; i <10;i++) {
		System.out.println(a+" * "+i+" = "+(a*i));
    	}
	}
}

// 각 문자열 사이에는 공백을 반드시 넣어줘야 한다

