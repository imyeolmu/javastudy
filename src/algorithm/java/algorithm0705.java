package javastudy;

import java.util.Scanner;

public class algorithm0705 {
	// 문제는 이해됬는데 내가 풀이하는 방식이 맞나
	// 배열로 받고 다 조건 비교 연산을 통해 조건을 달고
	// 마지막조건도 다는것..

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		int count = 0;
		int N = in.nextInt(); // 그룸단를 N번쨰 돌린다

		for (int i = 0; i < N; i++) {
			if (check() == true) {// check가 true 라면 count을 1증가 시킨다
				count++;
			}
		}
		System.out.println(count);
	}

	// 그룹단어가 맞는지 안맞는지 확인해서 true 값만 확인하면 되므로 boolean 값을 사용해야한다
	public static boolean check() {
		boolean[] check = new boolean[26];
		int prev = 0; // prev변수는 반복문에서 문자를 꺼내 올떄 앞선 문자와 연속되는지를 확인한다
		String str = in.next();

		for (int i = 0; i < str.length(); i++) {
			int now = str.charAt(i); // i 번째 문자 저장 (현재 문자)

			// 앞선 문자와 i 번째 문자가 같지 않다면? 종복된 문자인지 검사를 한다
			if (prev != now) {

				// 해당 문자가 처음 나오는 경우 (false 인 경우)
				if (check[now - 'a'] == false) { // 만약 aaba 일경우 a 97 이므로 check[0] true가 되고
													// 두번쨰 a는 건너뛰고 b는 count[1] 이고 flase가 발생한다
					check[now - 'a'] = true; // 이때 true 로 바꿔준다
					prev = now; // 다음 턴을 위해 prev 도 바꿔준다
				}

				// 해당 문자가 이미 나온 적이 있는 경우 (그룹단어가 아니게 됨)
				else { // 마지막 a는 이미 나온적이 있기떄문에 return해서 false으로 함수를 종료시키고
					return false; // 함수 종료시킨다
				}
			}

			// 앞선 문자와 i 번째 문자가 같다면? (연속된 문자) 중복된 문자 검사는 하지 않아도 된다
			// else 문은 없어도 됨
			else {
				continue;
			}
		}
		return true;
	}
}

//		Scanner in = new Scanner(System.in);
//		String B []  = new B[];
//		
//		int N = in.nextInt();
//		
//		for (int i=0; i<N;  i++) {
//			
//			if (int j = 0,j< )
//		
//		}
//
//		
//		String B = in.nextLine();
//		String C = in.nextLine();
//		
//		
//		
//		
//		
//		
//	}
//}
