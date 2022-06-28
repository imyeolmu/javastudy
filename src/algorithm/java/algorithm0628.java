package javastudy;

import java.io.IOException;
import java.util.Scanner;

public class algorithm0628 {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		// 배열을 생성:문자열s에 각 문자의 위치를 가리킬 배열

		int A[] = new int[26];

		for (int i = 0; i < A.length; i++) {
			A[i] = -1; // -1로 초기화된 배열

		}
		// a가 처음 등장하는 위치? : 인덱스값? 아니면 아스키코드값?
		// 각 문자를 검사해서 charAT에 저장해준다
		String S = sc.nextLine();
		for (int i = 0; i < S.length(); i++) {
			char ch = S.charAt(i);

			// A는 문자열 s에 각 문자열의 위치를 가리킬 배열
			if (A[ch - 'a'] == -1) {// 동일 문자가 포함된 경우 -1로 초기화를 해야한다
				A[ch - 'a'] = i; // ch: 문자인코딩값 -97 : 만약 b-'a'이면 1이되고 A[1]=b가 된다
			}

		}

		for (int val : A) {// 출력하기
			System.out.println(val + " ");
		}

	}
}
