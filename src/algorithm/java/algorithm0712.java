package javastudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class algorithm0712 {
	public static void main(String[] args) throws IOException {

		// 설탕을 N키로 배달해야한다 봉지 3키로랑 5키로 있음
		// 키로수를 못만들면 -1 을 출력하세요
		// 경우의 수를 계산해서 풀어야한다
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		// n이 4또는 7인경우
		if (N == 4 || N == 7) {
			System.out.println(-1);
		}
		// n이 5의 배수인경우(5로 나눈 나머지가 0인겨우)
		else if (N % 5 == 0) {
			System.out.println(N / 5);
		}
		// n이 5의 배수+1또는 5의 배수 +3인경우(5로 나눈나머지가 1또는 3인경우)
		else if (N % 5 == 1 || N % 5 == 3) { // 5의 배수가 있던 자리는 5의 배수 +3 = 5의 자리
			System.out.println((N / 5) + 1);
		} // n이 5의 배수 +2또는 5의 배수 +4인경우(5로 나눈 나머지가 2인경우 또는 4인경우)
		else if (N % 5 == 2 || N % 5 == 4) {
			System.out.println((N / 5) + 2);
		}
	}
}
