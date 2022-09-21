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

   // 삼항 연산자 인데 &는 비트 연산자 0x1은 0x의 16진수로 1 