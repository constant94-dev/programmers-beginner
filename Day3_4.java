import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> solution(int n) {
        List<Integer> answer = new ArrayList<Integer>();
        // 1. 입력된 수 만큼 반복해 짝수를 제거한다.
        for (int i=1; i<=n; i++){
            // 2. 제거 조건
            if(i%2==0){ // 2-1. `2`로 나누어지면 패스
                continue;
            } else { // 2-2. 나누어지지 않는다면 배열에 추가
                answer.add(i);
            }
        }

        // 3. 홀수 배열 오름차순 리턴
        return answer;
    }
}