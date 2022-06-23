package javastudy;

public class algorithm0623 {

	long sum(int[] a) {
		long hap = 0; // 변수 초기화 부분에서 int로 주게되면 문제 없이 실행되나
		for (int i = 0; i < a.length; i++) // return을 받게 되면
			// 배열의 크기가 3,000,000이고 배열의 각 원소의 최대크기는 1,000,000이기 때문에 넘는경우 long으로 선언
			hap += a[i];

		return hap;
	}

}
// 클래스 test라고 했는데 이건 public class Test로 하면되고
//		long N[] = new long[in.next()]; // long형으로 받으라고함
//		int sum = 0;
//			sum += N[i];
//		for (int i = 0; i <= N.length; i++) {
//			 
