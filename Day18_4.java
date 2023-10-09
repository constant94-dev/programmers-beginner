import java.util.Arrays;

public class Day18_4 {
    public String solution(String my_string) {
        String answer = "";
        int my_string_length = my_string.length();
        char[] my_stringToChar = my_string.toCharArray();
        // 1. 입력된 문자열 my_string 길이만큼 순회
        char current_char = '0';
        for (int i=0; i<my_string_length; i++){
            current_char = my_string.charAt(i);
            // 2. 순회시마다 대문자인지 소문자인지 검사
            if (current_char >= 65 && current_char <= 90){
                current_char = (char) (current_char + 32);
                my_stringToChar[i] = current_char;
            }
        }
        Arrays.sort(my_stringToChar); // 3. 순회가 끝난 후 알파벳 순서대로 정렬
        answer = String.valueOf(my_stringToChar);
        System.out.println("결과는: "+answer);
        // 4. 위 과정을 마무리한 후 결과 리턴
        return answer;
    }
    public static void main(String[] args) {
        new Day18_4().solution("Bcad");
    }
}