class Solution {
    public int solution(int n) {
        int answer = 0;
        int mok = 0;
        int remainder = 0;
        
        if (n <= 7){ // 1. 입력된 수 n이 7보다 작거나 같다면, 1을 리턴
            answer = 1;
        } else if (n > 7){ // 2. 입력된 수 n이 7보다 크다면, n/7와 n%7 수행
            mok = n/7;
            remainder = n%7;
            
            if (remainder == 0){ // 2-1. n%7 가 0 일때, n/7 값을 리턴
                answer = mok;
            }
            if (remainder != 0){ // 2-2. n%7 가 0 아닐때, (n/7)+1 리턴
                answer = mok+1;
            }
        }
        return answer;
    }
}