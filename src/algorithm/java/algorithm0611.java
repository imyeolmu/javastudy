package javastudy;


import java.util.Scanner;

public class algorithm0611 {
	

		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
	 
			int N = in.nextInt();
			int X = in.nextInt();
			int arr[] = new int[N];
	        
			for (int i = 0; i < N; i++) {
				arr[i] = in.nextInt(); // arr에 있는 배열을 꺼냄 
			}
	 
			in.close();
	        
			for (int i = 0; i < N; i++) {
				if (arr[i] < X) { //arr에 있는 배열을 꺼내서 x와 비교하여 출력한다 
					System.out.print(arr[i] + " ");
				}
			}
		}
	}
