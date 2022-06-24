package javastudy;

public class algorithm0624 {

	public static void main(String[] args) {

		boolean[] check = new boolean[10001]; // 1부터 10000이므로

		for (int i = 1; i < 10001; i++) {
			int n = d(i);

			if (n < 10001) { // 10000 이 넘는 수는 필요가 없음
				check[n] = true;
			}
		}

		StringBuilder sb = new StringBuilder();

		for (int i = 1; i < 10001; i++) {
			if (!check[i]) { // false 인 인덱스만 출력
				sb.append(i).append('\n');
			}
		}
		System.out.println(sb);
	}

	// n값과 각자리 수를 더한다
	// n으로 시작해서 n=33 d(n)= 39 d(d(n)) = 51(39+3+9)
	public static int d(int num) {

		int sum = num;

		while (num != 0) {
			// 난 여기만 생각 했다,,, 모르겠다 어렵다,,
			sum = sum + (num % 10); // 1의 자릿수를 구하는식
			num = num / 10; // 10의 자릿수를 구하는식
		}
		return sum;
	}
}