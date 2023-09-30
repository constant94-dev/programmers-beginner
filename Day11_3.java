class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int numbers_length = numbers.length;
        int max_first = numbers[0];
        int max_second = 0;
        // 1. 입력된 정수 배열 numbers 순회
        for (int i=1; i<numbers_length; i++){
            // 2. 현재 값과 다음 값을 비교해 가장 큰 수 찾기
            if (max_first < numbers[i]) {
                max_first = numbers[i];
            }
        }
        
        if (max_first != numbers[0]){ // 'max_second' 초기 값 설정을 위한 분기
            max_second = numbers[0];
        } else {
            max_second = numbers[1];
        }
        
        // 3. 가장 큰 수를 빼고 numbers 순회
        for (int i=1; i<numbers_length; i++){
            if (numbers[i] == max_first){
                continue;
            }
            // 4. 현재 값과 다음 값을 비교해 두번째 큰 수 찾기
            if (max_second < numbers[i]){
                max_second = numbers[i];
            }
        }
        
        answer = max_second * max_first;
        // 5. 위 과정을 마무리한 후 결과 리턴
        return answer;
    }
}