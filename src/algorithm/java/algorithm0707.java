package javastudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class algorithm0707 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 벌집의 개수는 1부터 시작한다
		// 벌집은 6배로 한겹씩 쌓아진다 카운트 한 값을 마지막에 출력한다

		int N = Integer.parseInt(br.readLine());

		int count = 1;// 반복문이 반복되는 횟수를 카운트한다

		int range = 2; // 범위 (최솟값 기분)

		if (N == 1) {
			System.out.print(1);
		}

		else {
			while (range <= N) { // 범위가 N보다 커지기 직전까지 반복 최솟값과 N만 검사하면서 해당 범위 수인지 체크만 해준다
				range = range + (6 * count); // 6배수씩 증가한다
				count++;
			}
			System.out.print(count);
		}
	}
}
