package javastudy;

import java.util.Scanner;

public class algorithm0630 {
	public static void main(String[] args) {

		// 가장 많이 사용된 알파벳,,,
		// 입력을 배열로 받아야하나..
		// 일단 입력받고 for문 돌면서 알파벳이 전에꺼랑 중복되는지 확인 하기
		// 많이 사용하는 알파벳 수가 중복되면 ?으로 출력되게 하기
		//

		Scanner sc = new Scanner(System.in);

		int arr[] = new int[26]; // 빈도수를 나타내는 배열임 문자열을 받는것이 아님 (계속 헷갈)
		String A = sc.next(); // 문자열//

		for (int i = 0; i < A.length(); i++) {
			// 반복문을 돌면서 배열 원소를 증가 시켜줘야한다
			// 문제는 대문자와 소문자를 중복하지 않는다고 했다
			// 코드의 값이 A는 97이고 코의 a는 65이므로 -65,-97해줘서 각각의 값을 구한다

			if (65 <= A.charAt(i) && A.charAt(i) <= 90) { // 대문자
				arr[A.charAt(i) - 65]++; // 해당 인덱스의 값 1 증가
			}

			else { // 소문자
				arr[A.charAt(i) - 97]++; // 97이 아닌 A를 빼도된다 위에도 a를 빼도 된다
			}
		}

	}
}
