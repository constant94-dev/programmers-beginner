class Solution {
    public int[] solution(int[] numbers, String direction) {
        int numbers_length = numbers.length;
        int[] answer = new int[numbers_length];
        int answer_length = answer.length;
        // 1. 입력값 'direction' 을 left,right 로 분기
        if (direction.equals("left")){
            System.out.println("왼쪽!");
            // 2. left 일 때, 배열의 첫 요소가 배열의 끝 요소로 이동
            answer[answer_length-1] = numbers[0];
            // 나머지 요소를 채운다.
            // answer[0] ~ answer[answer_length-2] 까지 반복
            for (int i=0; i<answer_length-1; i++){
                answer[i] = numbers[i+1];
            }
        } else if (direction.equals("right")){
            System.out.println("오른쪽!");
            // 3. right 일 때, 배열의 끝 요소가 배열의 첫 요소로 이동
            answer[0] = numbers[numbers_length-1];
            // 나머지 요소를 채운다.
            // answer[1] ~ answer[answer_length-1] 까지 반복
            for (int i=1; i<answer_length; i++){
                answer[i] = numbers[i-1];
            }
        }
        // 4. 위 과정을 마무리한 후 결과 리턴
        return answer;
    }
}