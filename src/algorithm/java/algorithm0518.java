
package algorithm.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class algorithm0518 {
   public static void main (String[] args) throws IOException {
      BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
      
      String str = br.readLine();// ReadlLine을 통해 입력받아 연산한다 -readline은 한행을 전부 다 읽기때문에 문자열을 공백단위로 분리 해준다
      StringTokenizer st = new StringTokenizer(str,""); //문자열분리- 문자열을 반환하니 parseInt로 변환시켜준다
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      
     
      System.out.println(a-b);
      
   }
}
   //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   //StringTokenizer st = new StringTokenizer(br.readLine()," "); - String 변수를 생성안하고 입력과 동시에 구분자로 분리해줘도 된다
   //int a = Integer.parseInt(st.nextToken());
   //int b = Integer.parseInt(st.nextToken());
   
   //System.out.println(a-b); 