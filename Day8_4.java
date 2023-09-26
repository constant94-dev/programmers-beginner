class Solution {
    public int solution(int n) {
        int answer = 0;
        int remainder = 0;
        // 1. 1부터 입력값 n까지 순회한다.
        for (int i=1; i<=n; i++){
            // 2. n나누기 순회하는 값의 나머지를 구한다.
            remainder = n%i;
            // 3. 나머지가 '0'이면 결과 값을 1 증가한다.
            if (remainder == 0){
                answer++;
            }
        }
        // 4. 위 과정이 마무리된 후 결과 값을 리턴
        return answer;
    }
}