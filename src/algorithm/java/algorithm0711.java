package javastudy;

import java.util.Scanner;

public class algorithm0711 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int[][] APT = new int[15][15]; // 앞의 인덱스는 층 뒤의 인덱스는 호

		// k층의 n호 = (k-1)층 + 1호 + (k-1)층 + 2호

		// 2차원 배열 사용하기

		for (int i = 0; i < 15; i++) {
			APT[i][1] = 1; // i층 1호
			APT[0][1] = i; // 0층 i호 -> 1층의 2호부터 14호까지 반복해야한다

		}
		for (int i = 0; i < 15; i++) {
			for (int j = 2; j < 15; j++) { // 2호부터 15호까지
				APT[i][j] = APT[i][j - 1] + APT[i - 1][j];

			}
		}

		// 테스트 부분
		int T = in.nextInt();

		for (int i = 0; i < T; i++) {
			int k = in.nextInt();
			int n = in.nextInt();
			System.out.println(APT[k][n]);
		}
	}
}

//	a층의 b호 
//	
//	a-1의 1호부터b호까지 합만큼의 사람들을 데려와야한다
//	
//	k층의 n호에 몇명이 사는지 출력
//	
//	0층  1 호 i 호에는 ㅑ명이 산다
//	
