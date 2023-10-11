public class Day19_3 {
    public int solution(int[] array, int n) {
        int answer = 0;
        // 1. 입력된 정수 배열 array 길이만큼 순회
        for (int num : array){
            // 2. 순회시마다 입력된 정수 n과 비교
            if (num == n){
                answer++; // 2-1. 같을 때, 결과 1 증가
            }
        }
        // 3. 위 과정을 마무리한 후 결과 리턴
        return answer;
    }
}
