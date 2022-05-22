package algorithm.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class algorithm0521 {
public static void main(String[] args) throws IOException {
    
//	 BuffereReader :Scanner 입력방식에 비해 훨씬 빠른게 장점이다.
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String str = br.readLine();//readLine()한 줄로 입력되어 공백 단위로 구별해주어야 하기 때문에 readLine() 을 통해 입력 받아야 한다.
    StringTokenizer st = new StringTokenizer(str," ");
//    StringTokenizer 와 String.split 은 모두 문자열이기 때문에 반환되는 값을 Integer.parseInt()로 int 형으로 변환시켜준다.
    int a = Integer.parseInt(st.nextToken());// 문자열에서 숫자열로 추출
    int b = Integer.parseInt(st.nextToken());
    
    System.out.println(a+b); 
    System.out.println(a-b);
    System.out.println(a*b);
    System.out.println(a/b);
    System.out.println(a%b);
    
 }   
}
