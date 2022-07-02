package javastudy;

import java.util.Scanner;

public class algorithm0702 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Scanner in = new Scanner(System.in);

		int A = in.nextInt();
		int B = in.nextInt();

		in.close();
		// reverse을 사용하여 구할 수 도있다-> StringBuilder가 포함하고 있음
		// append로 넣어진값은 타입이 바뀜 (StringBuilder타입)
		A = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
		B = Integer.parseInt(new StringBuilder().append(B).reverse().toString());

		System.out.print(A > B ? A : B);

	}
}
// 이와 같이 구할 수도 있다
//		int A = sc.nextInt();

//		int B = sc.nextInt();
//
//		System.out.println(num(A));
//		System.out.println(nun(B));
//
//	}

//
//	public static int num(int A) {
//		int result = 0; //만약 435를 입력 받는다면 % 연산으로 5을 얻어서 100을 곱하면 700이 된다 다음 단계는 10, 반복하면 534가 된다 
//		while (A != 0) {
//			result = result * 10 + A % 10;
//			A /= 10;