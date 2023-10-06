public class Day16_2 {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int array_length = array.length;
        answer[0] = array[0]; // 가장 큰 수 초기화
        answer[1] = 0; // 가장 큰 수 인덱스 초기화
        
        // 1. 입력된 정수배열 array 순회
        for (int i=1; i<array_length; i++){
            // 2. 순회마다 해당 인덱스 값과 가장 큰 값을 비교
            if (array[i] > answer[0]){
                // 2-1. 현재 가장 큰 값 보다 크다면, 가장 큰 수를 교체
                answer[0] = array[i];
                answer[1] = i;
            }
        }
        // 3. 위 과정을 마무리한 후 결과 리턴
        return answer;
    }
}
