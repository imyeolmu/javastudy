package javastudy;

import java.util.Scanner;

public class algorithm0704 {
	public static void main(String[] args) {

//문제 자체도 이해 못하겠다  타이핑을 하면서 이해 해보기로 했다
		Scanner in = new Scanner(System.in);
		// 이번 알고리즘은 의사코드로 작성한다 : 실제 컴퓨터에서 사용 할수 없다 : 컴파일이 안되서 에러가 발생한다
		// 의사코드를 쓰는 이유는 자바가 아닌 다른 언어에서 쓸 경우를 대비해서 사용한다
		String str = in.nextLine();

		int count = 0;
		// 문자의 개수를 셀 문자열 count를 만들고 문자열에 대해 문자열 길이만큼
		// 반복할 반복문을 구성한다
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);// charAt메소드는 문자열을 배열로 보고 해당 위치와 문자를 반환하는 메소드 이다 시작값=0

			if (ch == 'c') { // 만약 ch 가 c 라면?
				if (i < str.length() - 1) {
					if (str.charAt(i + 1) == '=') { // 만약 ch 다음 문자가 '=' 이라면?-> 하나의 문자로 해야되므로
						// i+1 까지가 하나의 문자이므로 다음 문자를 건너 뛰기 위해 1 증가
						i++;
					} else if (str.charAt(i + 1) == '-') {
						i++;
					}
				}
			}

			else if (ch == 'd') {
				if (i < str.length() - 1) {
					if (str.charAt(i + 1) == 'z') { // 인덱스 참조 범위를 벗어났다는 에러가 뜨는데
						// 이는 마지막 다음 문자가 존재 하지 않는데 charAt를 통해 참조하려고 하니 에러를 뱉는다
						// 해결방법은 문자열 길이에서 -1만큼 작을 경우에,dz=는 -2
						if (i < str.length() - 2) {
							if (str.charAt(i + 2) == '=') { // dz= 일 경우
								i += 2;

							}
						}
					}

					else if (str.charAt(i + 1) == '-') { // d- 일 경우
						i++;
					}
				}
			}

			else if (ch == 'l') {
				if (i < str.length() - 1) {
					if (str.charAt(i + 1) == 'j') { // lj 일 경우
						i++;
					}
				}
			}

			else if (ch == 'n') {
				if (i < str.length() - 1) {
					if (str.charAt(i + 1) == 'j') { // nj 일 경우
						i++;
					}
				}
			}

			else if (ch == 's') {
				if (i < str.length() - 1) {
					if (str.charAt(i + 1) == '=') { // s= 일 경우
						i++;
					}
				}
			}

			else if (ch == 'z') {
				if (i < str.length() - 1) {
					if (str.charAt(i + 1) == '=') { // z= 일 경우
						i++;
					}
				}
			} // 참조가 벗어나지 않게 한다

			count++;

		}

		System.out.println(count);
	}
}
