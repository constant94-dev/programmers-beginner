public class Day14_4 {
    public String solution(String my_string) {
        String answer = "";
        int my_string_length = my_string.length();
        StringBuilder result = new StringBuilder();
        int current_value = 0; 
        char current_char = '0';
        // 1. 입력된 문자열 'my_string' 길이만큼 순회
        for (int i=0; i<my_string_length; i++){
            System.out.println("반복문 시작!");
            // 2. 순회마다 아스키코드를 응용해 대문자와 소문자를 변환
            current_value = my_string.charAt(i);
            System.out.println("current_value: "+current_value);
            if (current_value >= 97){ // 소문자를 대문자로
                System.out.println("소문자를 대문자로");
                current_char = (char) (current_value - 32);
                result.append(current_char);
            } else if (current_value >= 65) { // 대문자를 소문자로
                System.out.println("대문자를 소문자로");
                current_char = (char) (current_value + 32);
                result.append(current_char);
            }
        }
        answer = result.toString();
        System.out.println("결과는: "+answer);
        // 3. 위 과정을 마무리한 후 결과 리턴
        return answer;
    }
    public static void main(String[] args) {
        new Day14_4().solution("abCdEfghIJ");
    }
}