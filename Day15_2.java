public class Day15_2 {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        StringBuilder result = new StringBuilder(my_string);
        // 1. 입력된 문자열 'my_string' 특정 인덱스 문자 접근
        char num1_char = my_string.charAt(num1);
        char num2_char = my_string.charAt(num2);
        // 1-1. 입력된 num1 과 num2 인덱스에 해당하는 문자를 교체한다.
        result.setCharAt(num1, num2_char);
        result.setCharAt(num2, num1_char);

        answer = result.toString();
        // 2. 위 과정을 마무리한 후 결과 리턴
        return answer;
    }
}
