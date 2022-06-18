package javastudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class algorithm0618 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[10]; // 0에서 9까지 체크할 길이 10의 int 배열을 생성

		int val = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
		// val에 readline 으로 읽은 값을 곱해서 저장한다 int 을 string 으로 변환
		String str = String.valueOf(val);

		for (int i = 0; i < str.length(); i++) {// for문을 이용해서 문자값을 추출한다
			arr[(str.charAt(i) - 48)]++; // index값을 1증가 시킨다
		}

		for (int v : arr) { // 배열 원소에 저장된 모든 값을 출력하기
			System.out.println(v);
		}

	}
}
