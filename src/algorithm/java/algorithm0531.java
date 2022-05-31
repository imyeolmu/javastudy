package algorithm.java;

import java.util.Scanner;

public class algorithm0531 {
   public static void main (String[] args) {

      Scanner in = new Scanner (System.in);
            
      int A = in.nextInt();//A는 현재 시간
      int B = in.nextInt();//B는 현재분 
      int C = in.nextInt();//C는 훈제오리를 요리하는데 걸리는시간
      
      A += C/60; //요리시간의 몫부분 
      B += C%60; //요리시간의 나머지 부분
      
      if(B>=60) { 
    	  A+=1;
    	  B-=60;
      }
      if(A>=24) {
    	  A-=24;
      }	  
      System.out.println(A+""+B);
      }
      
   }

