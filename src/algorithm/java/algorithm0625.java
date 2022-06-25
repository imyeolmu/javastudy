package javastudy;

import java.util.Scanner;

public class algorithm0625 {
	public static void main(String[] args) {
		

	// 등차수열 ,,, 5,10,15,20의 규칙

//x의 각 자리가 등차수열으 이룬다? 뭔말이지 110 이면 3자리수경우 한수가 나올수 없기 때문에 
	// 2의 자리수의 한수의 개수(1의 자리,2의 자리는 한수이다): 99라는것
	// 한수 : 각 자릿수들이 등차수열을 이루는 수

	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt(), i, k, han = 0;

	int a[] = new int[3];
	
	for(i=1;i<=n;i++){ //각 자릿수를 담을 배열의 크기는 3이면 4자릿수 이상의 경우는 계산하지 못한다 에러가 난다 별도로 처리해야함
		if (0 < i && i < 100)
			han = i;
		else if (i == 1000) // 4자릿수는 한수가 아니므로 브레이크문을 만들어 빠져 나가게한다
			break;
		else {
			k = 0;
			int t = i;
			// 자릿수 쪼개기 -> while 문과 배열 이용 해서 배열을 저장하도록 한다
			while (t > 0) {
				a[k] = t % 10; //k는 배열의 인덱스 0,1,2순으로 증가한다 
				t /= 10;//t는 i값을 담을 임시변수  나머지를담는다 
				k++;  //반복문을 돌리게 되면 중간자리인 2가 담기고 첫쨰자리인 1이 담기게 된다 -> 각 자릿수를 역순을 ㅗ배열하여 저장
			}
			if (a[0] - a[1] == a[1] - a[2]) // 각자릿수별 나뉜수가 한수이지 아닌지 알야한다
				han++;
		}
	}

}
