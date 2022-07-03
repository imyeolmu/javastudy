package javastudy;

import java.io.IOException;

public class algorithm0703 {

	// 입력받기 숫자-> 문자 입력받기

	public static void main(String[] args) throws IOException {

		int count = 0;
		int value;

		while (true) {

			value = System.in.read();

			if (value == '\n') {
				break;
			}

			if (value < 68) // 코드 값만 알아내면 되므로 65=a
				count += 3; // 1이 2초걸린다고 했으니 옆에있는 -3초부터시작 한다
			else if (value < 71)
				count += 4; // 4초걸림
			else if (value < 74)
				count += 5;
			else if (value < 77)
				count += 6;
			else if (value < 80)
				count += 7;
			else if (value < 84)
				count += 8;
			else if (value < 87)
				count += 9;
			else
				count += 10;

		}
		System.out.print(count);
	}
}
