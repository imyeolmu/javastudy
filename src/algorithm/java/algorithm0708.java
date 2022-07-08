package javastudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class algorithm0708 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

// 반복문으로 입력받은 정수가 몇번쨰 사선라인에 있는지를 확인한다

		int num = Integer.parseInt(br.readLine());

		int a_count = 1, b_count = 0; // 직진 대각선 누적합

		while (true) {

			// 사선라인의 수를 더하면 짝수 일때와 홀수 일때가 있다 그것에 따라 규칙이 달라진다
			//직전 대각선 누적합+ 해당 대각선 개수 이용한 범위 판별
			if (num <= a_count + b_count) {

				if (a_count % 2 == 1) { //대각선의 개수가 홀수이다
					//분모가 큰수부터시작
					//분모는 대각선 개수 - (num번째- 직전 대각선까지의 누적합-1)
					//분자는 num 번째 - 직전 대각선까지의 누적합

					System.out.print((a_count - (num - b_count - 1)) + "/" + (num - b_count));
					break;
				}
				
				else { // 대각선의 개수가 짝수라면 홀수일때의 출력을 반대로
					System.out.println((num - b_count))+ "/" + (a_count - (num- a_count - 1)));;
				}
				

			} else {
				b_count += a_count;
				a_count++;
			}

		}

	}
}