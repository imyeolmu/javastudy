

짝수 홀수

//나의 풀이
class Solution {
 public String solution(int num) {

        if(num %2 == 0) {
            return ("Even");
        } else
            return ("Odd");
  }
}



//다른 사람 풀이

public class EvenOrOdd {
    String evenOrOdd(int num) {
        return num % 2 == 0 ? "Even": "Odd";
    }

}

//삼항 연산자 이용해보기 

public class EvenOrOdd {
    String evenOrOdd(int num) {
        String result = "";

        result = (num & 0x1) == 1 ? "Odd" : "Even";
        return result;
    }

   // 삼항 연산자 인데 &는 비트 연산자로 and의 의미를 가지며 모두 1일떄 1일때 1을 반환한다.
   //0이되면 짝수인 even을 반환하게 되고 1이되면 odd을 반환하게 된다 : 0X1은 16진수이며 비트로 변환 할 시  0001|0000 16이다
   
   

   약수의합


class Solution {
    public int solution(int n) {
        int answer = 0;
        
     for(int i=1; i<=n; i++){
         if(n%i==0){
             answer += i;
         
     }       
        }
    
        
        return answer;
    }
}



//i는 입력될 값을 for반복문을 통해 돌고 약수는 입력된 값이 0으로 나누어질때 약수가 되므로
//그것을 확인하기 위해서 n으로 나누어준다. answer으로 return해야하기 때문에 n을 반복문을 돌면서 증감해준다.




평균 구하기


class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        double sum = 0;

        for (int i = 0; i < arr.length; i++)
        {
         sum += arr[i];   
        }
        answer = sum/arr.length;
        return answer;
    }
}

//배열은 length를 이용한다. arr[i]를 이용하여 반복문을 돌면서 배열을 돈다. 
//그값을 sum에 합쳐서 갯수를 가지고 값을 나눠준다.

자릿수 구하기

//문자열로 변환해서 구해보기

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String s = Integer.toString(n); //int n을 String으로 변환
        
        for(int i=0; i<s.length(); i++){
            answer += Integer.parseInt(s.substring(i, i+1));
        }
        return answer;
    }
}

//정수형은 자릿수를 더할 수 없으니 문자열로 형변환을 하여 tostring으로 변환한다. 
// 변환을 한후 다시 정수형으로 형변환을 한다 . substring으로 문자열을 가른다. substring(a: 시작값.b: 종료값)
//그 합을 answer에 더해서 return시킨다. 


// 정수나눗셈

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        while(n > 0){
            answer += n%10;
            n/=10;
        }
        return answer;
    }
}

// 1의 자리를 만들기 위해서 10으로 나눈 나머지를 더해주고 
//n을 10으로 나누면서 한자리씩 소거해나가는 방법 이다.

public class GugudanClass {
	
	public static void main(String[] args) {
		
		for(int i = 1; i <= 9; i++) {
			
			for(int j=1; j <= 9; j++) {
				
				System.out.println(i + " * " + j + " = " + i * j);
				
			}
			
			System.out.println();
		}
	}
}



// 별 찍기 
public class GugudanClass {
	
	public static void main(String[] args) {

for(int i=0;i<4;i++){
	for(int j=0;j<3-i;j++){
		System.out.print(" "); 
	}
	for(int j=0;j<2*i+1;j++){
		System.out.print("*"); 
	}
	System.out.println("");
} 