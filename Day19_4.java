public class Day19_4 {
    public int solution(int[] array, int height) {
        int answer = 0;
        // 1. 입력된 정수 배열 array 길이만큼 순회
        for (int num : array){
            // 2. 순회시마다 입력된 정수 height와 비교
            if (num > height){ // 2-1. height 보다 클 때, 결과 1 증가
                answer++;
            }
        }
        // 3. 위 과정을 마무리한 후 결과 리턴
        return answer;
    }
}
