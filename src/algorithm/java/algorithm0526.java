package algorithm.java;
import java.util.Scanner;

public class algorithm0526 {
public static void main(String[] args) {
   

   Scanner sc = new Scanner(System.in);
   
   int A = sc.nextInt();
   int B = sc.nextInt();

   
   System.out.println((A>B) ? ">" : ((A<B) ? "<" : "==" ));
   // 삼항 연산자:                     아니면     < 출력   다 아니면 == 출력 
   
   }
}