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