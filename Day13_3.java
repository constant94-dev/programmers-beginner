public class Day13_3 {
    public String solution(String my_string) {
        String answer = "";
        StringBuilder result = new StringBuilder();
        int my_string_length = my_string.length();
        char current_char = '0';

        // 1. 입력된 문자열을 순회
        for (int i=0; i<my_string_length; i++){
            current_char = my_string.charAt(i); // 문자열에서 문자하나 가져오기
            if (!result.toString().contains(String.valueOf(current_char))){ // 2. 결과 문자열의 포함되지 않았다면 문자를 추가한다.
                result.append(current_char);
            }
        }
        answer = result.toString();
        System.out.println("결과는: "+answer);
        // 3. 위 과정을 마무리한 후 결과 리턴
        return answer;
    }
        

    public static void main(String[] args) {
        new Day13_3().solution("people");
    }
}
