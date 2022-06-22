package javastudy;

import java.io.IOException;
import java.util.Scanner;

public class algorithm0621 {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in); /// 

		/*
		 * 배열값을 출력 배열값을 입력 입력된배열값을 비교 배열값의 입력값을 o이면 1점 연속:2점 아니면 0점 +1점 된다 배열값이 x 면 0점
		 * 
		 */

		String[] arr = new String[in.nextInt()]; // N만큼 입력받기... ?

		// n값만큼 배열을 입력받는거를 해야하는거....?
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.next();// 다시 받아야하는데... 배열을

		}
		in.close(); // 일단 배열 받기

		// 받은 배열을 돌리기
		for (int i = 0; i < arr.length; i++) { // 배열의 길이만큼 반복문을 돌리게 되는데

			int cnt = 0; // 연속 횟수
			int sum = 0;// 누적합산

			for (int j = 0; j < arr[i].length(); j++) { // 담은 i의 배열만큼 반복문을 돌린다

				if (arr[i].charAt(j) == 'O') { // O이면 연속으로 합산한다

					cnt++;
				}

				else {
					cnt = 0; // o가 아니면 cnt는 0이다
				}
				sum += cnt;
			}

			System.out.println(sum);
		}
	}
}