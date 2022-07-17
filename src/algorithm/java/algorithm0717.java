package javastudy;

public class algorithm0717 {

	public static void main(String[] args) {

// 빈칸 공백을 생각 해야한다
//		for (int i = 10; i >= 1; i--) {
//
//			for (int j = 10; j >= i; j--) {
//
//				System.out.printf("");
//			}
//
//			for (int k = 1; k <= i; k++) {
//				System.out.printf("%c", '☆');
//			}
//
//			System.out.println();
//		}
//	}

		for (int j = 0; j < 5; j++) {
			for (int i = 5; i > j; i--) {

				System.out.printf("%c", '☆');
			}

			System.out.println();

		}
	}
}