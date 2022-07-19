package javastudy;

public class algorithm0719 {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("");
			}
			for (int j = 0; j < 5 - i; j++) {
				System.out.print("*");
			}

			System.out.println();

		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < i + 2; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}
}

// print 와 println :  공통점: 형식에 구애 받지 않을 때 사용 한다
//print: 줄바꿈이 필요하지 않을 때 사용한다
