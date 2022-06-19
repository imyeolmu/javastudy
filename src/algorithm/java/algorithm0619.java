package javastudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class algorithm0619 {

	public static void main(String[] args) throws IOException {

		// 배열 이용해서 풀이하기
		// 42로 나눴을 떄 나머지로 올 수 있는 수는 0~41이다
		// 길이가 42인 boolean배열을 생성한다-> boolean 배열의 디폴트값은 false이단
		boolean arr[] = new boolean[42];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i <= 10; i++) {
			arr[Integer.parseInt(br.readLine()) % 42] = true;// 나머지 값의 인덱스를 문자형으로 바꾼후 입력이 종료되면 true값인 배열원소의 개수를 세워준다

		}
		int count = 0;
		for (boolean value : arr) {
			if (value) { // value가 true이면
				count++;

			}

		}

		System.out.println(count);

	}
}

/*
 * hashset을 사용할수도 있다 // hashset은 처음 객체를 생성할떄 hashset Integer형으로 선언했기때문에 int나
 * Integer형으로 객체를 넣어야한다 중복되는 값이 ㅇ없으면 true 중복되어 저장이 안되면 false 중복저장불가능 순서개념이 없으므로
 * 정렬시에는 리스트로 변환후에 정렬해야한다
 *
 * HashSet<Integer> h =new HashSet<Integer>(); for (int i =0; i<10; i++){
 * h.add(in.nextInt()%42); } in.close(); System.out.print(h.size());// size
 * 저장되어있는 원소의 개수
 * 
 */
