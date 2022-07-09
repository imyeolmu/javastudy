package javastudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class algorithm0709 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// 높이가 v
		// 낮에는 A미터
		// 밤에는 B미터
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());

		// A-B의 차이값보다 작은 나머지가 존재하면 다음날 올라가야한다 ->최소한의 일수가 된다

		int day = (V - B) / (A - B);
		if ((V - B) % (A - B) != 0) // 나머지가 있는 경우 하루가 더 소요하게 된다

			day++;

		System.out.println(day);
	}
}