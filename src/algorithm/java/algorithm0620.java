package javastudy;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class algorithm0620 {

	public static void main(String[] args) throws IOException {

		Scanner N = new Scanner(System.in); /// 중요 오차범위가 있기 때문에 int가 아닌 double형을 써야한다 - 자동형변환이 되면서 자료형이 큰쪽으로 변환한다

		int[] arr = new int[N.nextInt()];// 배열을 입력받으려면 값안에 nextInt를 해준다

		for (int i = 0; i < arr.length; i++) { // 배열의 길이을 arr에 다시 담는다
			arr[i] = N.nextInt();

		}
		N.close();

		int sum = 0;
		Arrays.sort(arr);// 원소를 받아서 정렬한다- 최댓값이 배열의 마지막원소이다

		for (int i = 0; i < arr.length; i++) {
			sum += ((arr[i] / arr[arr.length - 1]) * 100);

		}
		System.out.println(sum / arr.length);
	}
}