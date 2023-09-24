class Solution {
    public String solution(String my_string) {
        String answer = "";
        int my_string_length = my_string.length();
        // 1. 입력된 문자열을 마지막 인덱스부터 순회한다.
        for (int i=0; i<my_string_length; i++){
            // 2. 새로운 문자열의 첫번째 인덱스부터 추가한다.
            answer += my_string.charAt((my_string_length-1)-i);
        }
        // 3. 문자열을 확인 후 리턴
        return answer;
    }
}