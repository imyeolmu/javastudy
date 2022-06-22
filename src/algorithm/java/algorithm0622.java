package javastudy;

import java.io.IOException;
import java.util.Scanner;

public class algorithm0622 {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);
		// n값만큼 배열을 입력받는거를 해야하는거....? 테스트케이스의 배열의 수를 받는다
		int A = in.nextInt(); // 테스트 케이스 수 입력받기
		// 그 배열의 수를 받아서 첫번쨰 인덱스만큼의 배열을 또 돌려야 하는건가?
		// 받은 배열을 돌리기
		// 배열의 길이만큼 반복문을 돌리게 되는데 첫번쨰 인덱스의 값만큼 돌리는지 모르겠음

		for (int i = 0; i < A; i++) {
			int[] N = new int[in.nextInt()];// 학생수 입력받기
			int sum = 0;
			int avg = 0;
			int standard_cnt = 0;// 평균이상의 학생수
			float statand_avg = 0; // 평균 점수 보다 높은 학생수 비율

			for (int j = 0; j < N.length; j++) {
				N[j] = in.nextInt();
				{ // N배열의 길이만큼 반복문을 돌려서 N배열에 저장한다
					sum += N[j];// 학생들의 총점을 sum 변수에 저장한다
				}
				avg = sum / (N.length);

				for (int k = 0; k < N.length; k++)
					// 총점수.학생수를 계산하여 평균점수를 avg에 저장한다
					if (N[k] > avg) {
						standard_cnt++; // 평균 점수보다 높은(초과) 학생 수를 standard_cnt 변수에 저장
					}
			}

			float standard_avg = (float) standard_cnt / N.length * 100;// 소수점 셋쨰자리까지 출력해야하므로 학생수(standard_cnt)를 실수형으로 변환
																		// 하고
			// 폄균 점수보다 높은 학생 수/총학새수를 계산하고 100을 곱해주면 평균넘는 학생의 비율을 알아낼수있다
			System.out.println(String.format("%.3f", standard_avg) + "%");
			// 이후 마지막으로 String.format을 사용하여 소수점 3자리까지 표시한다
		}
	}
}