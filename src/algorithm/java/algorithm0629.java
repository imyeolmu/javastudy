package javastudy;

import java.io.IOException;
import java.util.Scanner;

public class algorithm0629 {
	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);

		int T = in.nextInt();
		for (int i = 0; i < T; i++) {

			int R = in.nextInt();
			String S = in.next(); // nextLine으로 읽으면 공백까지 읽기때문에 next로 받아야한다

			for (int j = 0; j < S.length(); j++) {
				for (int k = 0; k < R; k++) { // R 만큼 반복 출력
					System.out.print(S.charAt(j));
				}
			}

			System.out.println();
		}
	}
}
