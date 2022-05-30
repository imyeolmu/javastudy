package day01;

import java.util.Scanner;

public class algorithm {
   public static void main (String[] args) {

      Scanner in = new Scanner (System.in);
            
      int H = in.nextInt();
      int M = in.nextInt();
      
      in.close();
      
      if(M<45) {//시간이 45분보다 작을때 
         H--; // 1시간을 빼야한다
         M=60-(45-M); 
         if(H<0) {  
            H = 23;
         }
         System.out.println(H+""+M);
         
         
      }
      else {
         System.out.println(H+""+(M-45));
      }
      
   }
}