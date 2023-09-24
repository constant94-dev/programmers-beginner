class Solution {
    public int solution(int n) {
        int answer = 0;
        // 1. 입려 값 `n` 만큼 순회한다.
        for (int i=0; i<=n; i+=2){
            // 2. 결과 변수의 i 값을 누적한다.
            answer += i;
        }
        return answer;
    }
}