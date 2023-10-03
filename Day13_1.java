public class Day13_1 {
    public int solution(String s) {
        int answer = 0;
        int s_length = s.length();
        String current_string = ""; // 10, 100, 1000 과 같은 숫자를 누적해 비교하기 위한 변수
        String current_char = ""; // 입력된 's' 문자열에서 하나의 문자를 가져와 비교하기 위한 변수
        int before_value = 0; // 바로 전 숫자를 기억하기 위한 변수
        int[] result = new int[2]; // 'check_string' 함수 실행 후 결과와 바로 전 숫자를 기억하기 위한 배열

        // 1. 입력된 문자열을 순회
        for (int i = 0; i < s_length; i++) {
            // 순회하는 문자가 공백이 나오기 전까지 새로운 문자열의 누적
            current_char = String.valueOf(s.charAt(i));
            if (current_char.equals(" ")) {
                // 공백이 나오면 누적된 문자열을 검사
                System.out.println(i + "번째 " + "current_string: " + current_string + "\nanswer: " + answer
                        + "\nbefore_value: " + before_value);
                result = check_string(current_string, answer, before_value);
                answer = result[0];
                before_value = result[1];
                current_string = ""; // 새로운 문자를 누적하기 위해 초기화
            } else {
                current_string += current_char;

                // 마지막 문자가 'Z'가 아닐 때, 정수로 형변환 후 더하기
                if (i == s_length - 1 && !current_string.equals("Z")) {
                    System.out.println(i + "번째 " + current_string);
                    answer += Integer.parseInt(current_string);
                }

                // 마지막 문자가 'Z'일 때, 'check_string' 함수 실행
                if (i == s_length - 1 && current_string.equals("Z")){
                    result = check_string(current_string, answer, before_value);
                    answer = result[0];
                }
            }
        }
        System.out.println("결과는: " + answer);
        // 4. 위 과정을 마무리한 후 결과 리턴
        return answer;
    }

    // 이 함수는 'Z' 문자를 만났을 때 바로 전 숫자를 빼주는 로직과 'Z'문자를 안 만났을 때 결과를 누적하기 위한 로직이 수행된다.
    private int[] check_string(String current_string, int answer, int before_value) {
        int[] result = new int[2];
        System.out.println("what current_string: "+current_string);
        current_string = current_string.trim();
        if (current_string.equals("Z")) { // 해당 문자열이 'Z'라면, 바로 전 숫자를 뺀다.
            System.out.println("check_string 함수 실행!\nanswer: " + answer + "before_value" + before_value);
            answer -= before_value; // 누적된 결과 - 바로 전 숫자
            result[0] = answer;
            result[1] = before_value;
            return result;
        } else { // 해당 문자열이 'Z'가 아니면, 숫자를 더한다.
            int value = Integer.parseInt(current_string);
            answer += value; // 결과를 누적하기 위함
            before_value = value; // 바로 전 숫자를 기억하기 위함
            result[0] = answer;
            result[1] = before_value;
            return result;
        }
    }

    public static void main(String[] args) {
        new Day13_1().solution("10 Z 20 Z");
    }
}
