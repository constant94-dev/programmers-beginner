class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        int my_string_length = my_string.length();
        for (int i=0; i<my_string_length; i++){ // 1. 문자열을 순회한다.
            for (int j=0; j<n; j++){ // 2. 순회하는 문자마다 `n`만큼 문자를 추가한다.
                answer += my_string.charAt(i); // 3. 결과 문자열의 추가한다.
            }
        }
        // 4. 결과 문자열을 확인하고 리턴
        return answer;
    }
}