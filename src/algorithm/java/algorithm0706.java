package javastudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class algorithm0706 {
	public static void main(String[] args) throws IOException {

//A: 고정비용 B는  가변비용 C는 노트북 가격

//	총비용 (:B의 값 * C )+A
//  총 수입: C*n
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine()); // readline은 한줄로 통쨰로 읽기 때문에 공백으로 해서 분리 해야한다

		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());

		if (C <= B) {
			System.out.println("-1");
		}

		else {
			System.out.println((A / (C - B)) + 1); // c-b가 음수이면 손익이 생기지 않는다
			// A/(C-B))+1의 값이 0보다 크거나 같으면 손익 분기점이 생기지 않는다는것
		}
		// 3개를 입력받는다

		// b와 c를 곱한다 곱해서 b

	}
}
