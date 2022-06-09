package javastudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class algorithm0609 {
	
	public static void main(String[] args) throws Exception, IOException {
		
	 BufferedReader br = null;

	 br = new BufferedReader(new InputStreamReader(System.in));
	 
	 int n =Integer.parseInt(br.readLine());
	 
	 br.close(); // ╢щ╬фаж╠Б
	 
	 for(int i =1; i<n; i++) {
		 for(int j =1; j<=i; j++) {
			 System.out.println("*");
		 }
		 
		 System.out.println();
		 
		 
	 }
	 
 }

}
