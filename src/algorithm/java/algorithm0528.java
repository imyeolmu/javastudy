package day01;

import java.util.Scanner;

public class algorithm0528 {
public static void main(String[] args) {
   

   Scanner sc = new Scanner(System.in);
   
   int A = sc.nextInt();
   // 4의배수인지 확인한후 400으로 나누어서 확인/100으로 나누어서 떨어지는지 확인한다
   if (A%4==0) {  //4의 배수이면서 400의 배수 일경우
      if(A%400==0)// 내부 조건문 수행 - 4의배수이면서 400의 배수인경우
      System.out.println("1");
      else if (A%100==0)  //4의배수이면서 100의 배수일경우
      System.out.println("0");
      else System.out.println("1");
   }
   else 
      System.out.println("0");
   
   }
}