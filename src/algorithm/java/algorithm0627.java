package javastudy;

import java.io.IOException;
import java.util.Scanner;

public class algorithm0627 {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		// 숫자로 받아서

		int N = sc.nextInt();
		// 공백 없이 쓴다고 해서 trim을 어디에 써야할지 그거에 포커스를 맞춰져 있어
		// 문제도 제대로 파악 못함
//		char ch.trim() = (char).N;

		String a = sc.next();
		sc.close();

		int sum = 0;

		for (int i = 0; i < N; i++) {

			sum += a.charAt(i) - '0'; // 첫번쨰 원소부터 반복문을 통한 마지막 원소의 누적합을 구한다
			// charAt는 자바의 인덱스 값을 가져오는 것으로 문자열중 하나만 가져온다-> char->int로 변환할떄 아스키 코드값을 가져온단
			// charAt는 아스키코드 값을 반환하므로 반드시 -48,-0을 해줘야 우리가 입력 받은 값을 그대로 사용가능하다
		}

		System.out.println(sum);

	}
}
