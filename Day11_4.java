class Solution {
    public int recur(int i){
        // 2. 재귀의 조건
        // 2-1. 상태값: (i)
        // 2-2. 종료조건: i가 0이면 종료
        // 2-3. 점화식: n부터 1씩 줄어든다.
        if (i==0) return 1;
        
        return i * recur(i-1);
    }
    public int solution(int n) {
        int answer = 0;
        int result = 0;
        for (int i=1; i<=10; i++){
            // 1. 1부터 10까지 재귀를 만든다.
            // 재귀의 결과가 n 보다 크면 이전 상태 값이 결과이다.
            result = recur(i);
            System.out.println(result);
            if (result > n){
                answer = i-1;
                break; // 재귀 결과 값이 n 보다 클 때 멈춰야한다.
                       // 왜냐하면, 이후의 재귀 결과 값이 answer 변수의 저장되기 때문에 n 보다 작은 값을 찾지 못한다.
            } else {
                answer = i;
            }
        }
        // 3. 위 과정을 마무리한 후 결과 리턴
        return answer;
    }
}