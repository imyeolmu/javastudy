
package algorithm.java;

import java.util.Scanner;

public class algorithm0529 {
	
	public static void main(String[] args) {
		
		
		 Scanner in = new Scanner(System.in);
		 
		 int x = in.nextInt();
		 int y= in.nextInt();
		 
		 //x좌표가 0보다 큰지 작은지 식벽해야한다 y좌표의 값에따라 최종적으로 몇사분면에 있는지 검사한다
		 if(x>0) {
			 if(y>0) {
				 System.out.println(1);
			 }
			 else {
				 System.out.println(4);
			 }
		 }
		 else {
			 if(y>0) {
				 System.out.println(2);
			 }
			 else {
				 System.out.println(3);
			 }
		 }
		 
	}
	

}