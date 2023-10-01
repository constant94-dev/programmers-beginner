import java.util.Arrays;

public class Day12_2 {
    public int[] solution(String my_string) {
        int my_string_length = my_string.length();
        int[] answer = {};
        String current_value = ""; // 현재 비교하는 문자
        int result_space = 0; // 결과 배열 공간 변수
        StringBuilder result_value = new StringBuilder();
        // 1. 입력된 문자열 'my_string' 문자 하나씩 순회
        for (int i=0; i<my_string_length; i++){
            current_value = String.valueOf(my_string.charAt(i));
            // 2. 'isNumeric()' 내장 함수 사용해 숫자 판별
            Boolean numeric_check = isNumeric(current_value);
            if (numeric_check) { // 3. 숫자일 때, 새로운 문자열의 저장
                result_value.append(current_value);
                result_space++; // 결과 배열의 필요한 공간을 알아내기 위한 변수
            }
        }
        answer = new int[result_space]; // 결과 배열 초기화
        for (int i=0; i<result_space; i++){
            answer[i] = Integer.parseInt(String.valueOf(result_value.charAt(i)));
        }
        Arrays.sort(answer); // 오름차순 정렬
        for (int a : answer){
            System.out.println(a);
        }
        // 4. 위 과정을 마무리한 후 결과 리턴
        return answer;
    }

    private Boolean isNumeric(String current_value) {
        return current_value != null && current_value.matches("^[0-9]*$"); // 숫자만 등장하는지 확인
    }

    public static void main(String[] args) {
        System.out.println(new Day12_2().solution("hi12392"));
    }
}
