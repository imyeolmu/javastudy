package javastudy;

import java.util.Scanner;

public class algorithm0715 {

	public static boolean prime[];

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int N = sc.nextInt();

		// 소수를 판별하는 방법
		// 에라토스테네스의 체-> 여러개의 소수를 구하고 싶을때 체를 거르듯이 하는 방법
		// 방법:2을 제외한 2의 배수인 수를 모두거르고, 3을 제외한 3의배수를 모두거르고,5의 배수를 제외를 모두 거르고,
		// 계속 반복하는 것이다
		// 구하려는 범위의 최댓값의 제곱근까지만 반복하면된다.

		prime = new boolean[N + 1]; // 배열을 생성
		get_prime();

		// 소수 합 및 최솟값
		int sum = 0;
		int min = Integer.MAX_VALUE;
		for (int i = M; i <= N; i++) {
			if (prime[i] == false) { // false = 소수
				sum += i;
				if (min == Integer.MAX_VALUE) { // 첫 소수가 최솟값임
					min = i;
				}
			}
		}

		if (sum == 0) { // 소수가 없다면
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
		}

	}

	// 에라토스테네스 체 알고리즘
	public static void get_prime() {
		prime[0] = true;
		prime[1] = true;

		for (int i = 2; i <= Math.sqrt(prime.length); i++) {
			for (int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}

	}
}
