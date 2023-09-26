class Solution {
    public int[] solution(int[] num_list) {
        // 1. 입력된 배열의 공간만큼 배열 선언
        int num_list_length = num_list.length;
        int[] answer = new int[num_list_length];
        
        // 2. num_list 길이만큼 반복한다.
        for (int i=0; i<num_list_length; i++){
            // 3. 거꾸로 반복되는 원소를 배열의 추가한다.
            answer[i] = num_list[(num_list_length-1)-i];
        }
        // 4. 뒤집은 배열 리턴
        return answer;
    }
}