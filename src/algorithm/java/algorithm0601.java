package algorithm.java;

import java.util.Scanner;

public class algorithm0601 {
	public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int sum = 0;
      	if( a == b ){ //
      		if( b == c ){
      		    sum += 10000 + (a * 1000); //세개 모두 같을 경우
      		    System.out.println(sum);
      		} else if( b != c ){
      			sum = 0;
      			sum += 1000 + ( a * 100 ); //두개 모두 같은 경우
      			System.out.println(sum);
      	    }
      	} else if(a == c) {
      		sum += 1000 + ( a * 100);//두개 모두 같을경우
      		System.out.println(sum);
      	} else if ( b == c) {
      		sum += 1000 + ( b * 100);
      		System.out.println(sum);//두개 모두 같을경우
      	} else {
      		if(a>b && a>c ) {// a 가 b 보다 크고 a 가 c 보다 클때
      			System.out.println(a * 100);//모두 다른눈이 나오는경우
      		} else if(b>a && b>c) { // b가 a 보다 크고 b가 c 보다 클때
      			System.out.println(b * 100);//모두 다른눈이 나오는경우
      		} else {
      			System.out.println(c * 100);//모두 다른눈이 나오는경우
      		}
      	}
    }
}