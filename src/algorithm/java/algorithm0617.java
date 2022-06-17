package javastudy;

import java.util.Scanner;

public class algorithm0617 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int value = (in.nextInt() * in.nextInt() * in.nextInt()); // 입력과 동시에 곱해줘서 value에 담음
		String str = Integer.toString(value);// int형을 string 형으로 변환
		in.close();

		for (int i = 0; i < 10; i++) { // 반복
			int count = 0; // 변수 0으로 초기화
			for (int j = 0; j < str.length(); j++) {// 이중for문
				if ((str.charAt(j) - '0') == i) {
					count++;
				}

			}
			System.out.println(count);
		}

	}
}