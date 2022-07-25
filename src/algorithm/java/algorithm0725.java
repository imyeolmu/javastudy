package javastudy;

public class algorithm0725 {
	public static void main(String[] args) {

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3 - i; j++) {
				System.out.println(" ");
			}

			for (int j = 0; j < 2 * i + 1; j++) {

				System.out.println("*");
			}
			System.out.println("");
		}
	}
}