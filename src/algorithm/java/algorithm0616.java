package javastudy;

import java.util.Scanner;

public class algorithm0616 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int[] A = new int[9];
		int size = A.length;
		int max = 0;
		int cnt = 0;

		for (int i = 0; i < 9; i++) {
			A[i] = in.nextInt(); // 배열A에 입력받은 값을 넣어주기
		}
		for (int i = 0; i < 9; i++) { // 받은 배열을 돌려 max값과 사이클 값을 출력한다
			if (A[i] > max) {
				max = A[i];
				cnt = i + 1;
			}
		}
		System.out.println(max);
		System.out.println(cnt);
	}
}
