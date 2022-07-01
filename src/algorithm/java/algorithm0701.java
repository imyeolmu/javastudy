package javastudy;

import java.util.Scanner;
import java.util.StringTokenizer;

public class algorithm0701 {
	public static void main(String[] args) {

		// 영어 대소문자의 공백
		// 공백을 기준으로 단어를 세는 거 같다

		Scanner sc = new Scanner(System.in);

		String A = sc.nextLine(); // 문자열

		// StringTokenizer을 사용하기
		// StringTokenizer을 분리 기준으로 공백으로 지정해주면 공백을 나누어 토큰으로 저장해준다

		StringTokenizer st = new StringTokenizer(A, "");
		System.out.println(st.countTokens());// 토큰의 개수를 세주면 끝

		// 단순히 문자열을 받아서 ""공백을 기준으로 어떻게 해야할지 몰랐는데 stringtokenizer을 이용해서
		// 간단하게 해결할 수 있다!

	}
}
