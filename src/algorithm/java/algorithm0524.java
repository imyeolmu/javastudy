package algorithm.java;

import java.util.Scanner;

//백준알고리즘 10430번
public class algorithm0524 {
public static void main(String[] args) {
    
  Scanner in = new Scanner(System.in);
  

	int A = in.nextInt();
	int B = in.nextInt();
	int C = in.nextInt();
  
  System.out.println((A+B)%C);
  System.out.println( (A%C + B%C)%C );
  System.out.println( (A*B)%C);
  System.out.println((A%B*B%C)%C);

}
	
	}
