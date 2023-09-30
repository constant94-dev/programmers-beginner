class Solution {
    public int solution(int n) {
        int answer = 0;
        // 1. 입력된 자연수 n 만큼 순회한다.
        for (int i=4; i<=n; i++){
            if (i==5 || i==7){ // 1,2,3,5,7은 합성수가 아니다.
                continue;
            }
            // 2. 순회시마다 2,3,5,7로 나누어진다면, 합성수이다.
            if (i%2==0 || i%3==0 || i%5==0 || i%7==0){
                answer++;
            }
        }
        // 3. 위 과정을 마무리한 후 결과 리턴
        return answer;
    }
}