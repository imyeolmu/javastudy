package algorithm.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class algorithm0602{
	public static void main(String[] args) throws NumberFormatException, IOException {
		
	//BufferReader를 사용해보자
	
			
		BufferedReader br = null;
		
		br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());// parseint:문자열을 숫자열로 바꿔주는역할 readline: 문자의 한줄씩 가져온다
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder(); //split말고 문자열 분리하기
		//BurreredReader 클래스의 메서드로 입력을 읽어들이면 라인단위로 읽게된다
		//버퍼리드말고 문자에 따라 문자열을 나누고 싶을때 사용가능하다
		//String:문자열을 
		//Tokenizer:토큰화한다-> 분리된 문자열 조각
		
		
		for(int i = 0 ; i<n; i++) {
			
			st = new StringTokenizer(br.readLine(),"");
			sb.append(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()));
			sb.append('\n');
		}

	System.out.println(sb);
   
		}

  
}
