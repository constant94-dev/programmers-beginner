class Solution {
    public int[] solution(int[] num_list) {
        // 1. 결과를 보여줄 길이 2개 배열 생성
        int[] answer = new int[2];
        // 1-1. odd: 홀수, even: 짝수 변수 선언
        int odd = 0;
        int even = 0;
        int remainder = 0; // 나머지 값 임시 저장 변수
        int num_list_length = num_list.length;
        // 2. 입력된 배열을 순회한다.
        for (int i=0; i<num_list_length; i++){
            remainder = num_list[i] % 2; // 3. 나누기 2를 했을 때
            if (remainder == 0){ // 3-1. 나머지가 0 이면, 짝수 수 증가
                even++;
            } else { // 3-2. 나머지가 0 아니면, 홀수 수 증가
                odd++;
            }
        }
        answer[0] = even; // 짝수
        answer[1] = odd; // 홀수
        // 4. 짝수,홀수 담은 배열 리턴
        return answer;
    }
}