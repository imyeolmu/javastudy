package javastudy;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class algorithm0615 {
	
public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
	
	int N = in.nextInt();
	int[] A = new int[N];
	int size = A.length;
	
	 for (int i=0; i<N; i++ ) {
		 A[i]= in.nextInt(); //배열A에 입력받은 값을 넣어주기
	 }
	 in.close();
		Arrays.sort(A);//Arrays.sort 오름차순으로 정렬해주는 메소드 첫번쨰 메소드는 최솟값 최댓값은 마지막
		 System.out.println(A[0]+" "+ A[N-1]);
		 
		 

	 
	
	
	}
}