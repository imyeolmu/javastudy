package algorithm.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class algorithm0520 {
public static void main(String[] args) throws IOException {
    
    //br.readLine()을 통해 읽어온것을 split("")하여 공백단위로 나눠준뒤 String 배열에 각각 저장하는 방법이다
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] str = br.readLine().split("");
    int a = Integer.parseInt(str[0]);
    int b = Integer.parseInt(str[1]);
    
    System.out.println(a/b);
    
    
 }   
}