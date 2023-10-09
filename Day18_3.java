public class Day18_3 {
    public int solution(int n, int t) {
        int answer = 0;
        // 1. 입력된 정수 t만큼 순회
        for (int i=0; i<t; i++){
            // 2. 순회시마다 n을 두배한 값을 누적
            n = n*2;
        }
        answer = n; // 순회가 끝난 후 결과를 저장
        // 3. 위 과정을 마무리한 후 결과 리턴
        return answer;
    }
}