package algorithm.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class algorithm0604{
	public static void main(String[] args) throws IOException {
		
		
	
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		//Writer은 out이므로 stream out을 써야한다
		
		int N = Integer.parseInt(br.readLine()); //readline으로 한줄씩 받는다 
//		parsleInt는 문자열을 -> int 형으로 변경
		
		StringTokenizer st;
		//문자열 조각 내기
		for(int i  = 0; i<N; i++) { 
			st= new StringTokenizer(br.readLine(),""); //문자열 생성과 동시에 문자를 받는다
			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+ "\n");
		}
		br.close();
		
		bw.flush();
		bw.close();
		
		
		
	}
		
		
		
		
	}

}