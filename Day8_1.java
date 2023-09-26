class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int arraySpace = (num2-num1)+1; // (종료값 - 시작값)+1 한 값이 결과 배열에 필요한 공간이다.
        int[] answer = new int[arraySpace]; // 위 조건 연산 결과만큼 answer 배열 공간을 만든다.
        
        // 1. 순회 조건 시작값은 num1, 종료값은 num2
        int result_idx = 0; // 'i' 값은 numbers 순회를 위해, 'result_idx' 값은 answer 순서를 위해 사용
        for (int i=num1; i<=num2; i++) {
            // 2. 순회하는 값을 결과 배열의 순서대로 저장한다.
            answer[result_idx] = numbers[i];
            result_idx++;
        }
        // 3. 결과 배열을 리턴
        return answer;
    }
}