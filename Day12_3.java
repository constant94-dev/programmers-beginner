public class Day12_3 {
    public int solution(String my_string) {
        int answer = 0;
        // 1. 입력된 문자열 my_string 문자 하나씩 순회
        for (char current_string : my_string.toCharArray()) {
            // 2. 'isNumeric' 함수를 사용해 숫자 판별
            Boolean numeric_check = isNumeric(String.valueOf(current_string));
            if (numeric_check) {
                // 3. 숫자일 때, 합하고 누적한다.
                answer += Integer.parseInt(String.valueOf(current_string));
            }
        }
        // 4. 위 과정을 마무리한 후 결과 리턴
        return answer;
    }

    private Boolean isNumeric(String current_string) {
        return current_string != null && current_string.matches("^[0-9]*$");
    }
}
