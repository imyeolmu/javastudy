package javastudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class algorithm0710 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		// H:건물 층수 Y:층수 X:엘레베이터로 부터 떨어진거리

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");

			int H = Integer.parseInt(st.nextToken());
			st.nextToken(); // W 는 그냥 버린다.
			int N = Integer.parseInt(st.nextToken());
			// 건물층수(N)%층수(H)-> 나머지 값이 층수
			if (N % H == 0) { // H층이 배정받는 층수이다
				sb.append((H * 100) + (N / H)).append('\n');

			} else {
				sb.append(((N % H) * 100) + ((N / H) + 1)).append('\n');
			} // 최소 백부터 시작하므로 100을 곱한다 거리는 +1을 해준다
		}
		System.out.print(sb);

	}
}
