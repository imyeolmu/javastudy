package javastudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class algorithm0713 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		// int타입은 -2의 31승~ 2의 31승 -1범위 까지 /long 타입 -2의 63승 -1까지밖에 담지 못한다
		// long형은 억이나 조 단위의 이나 무한까지는 아니기 때문에 무한의 수를 표현할때는
		// BigInteger를 사용한다

		BigInteger A = new BigInteger(st.nextToken());
		BigInteger B = new BigInteger(st.nextToken());

		A = A.add(B);

		System.out.println(A.toString());
	}
}