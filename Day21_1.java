public class Day21_1 {
    public static void main(String[] args) {
        String my_string = "1a2b3c4d123Z";
        new Day21_1().solution_after(my_string);
    }

    private int solution_after(String my_string) {
        int answer = 0;
        // 1. 입력된 문자열 my_string 문자를 소문자or대문자를 기준으로 나눈다.
        String[] arrStr = my_string.split("[a-zA-Z]");
        // 2. 문자열 배열 길이만큼 순회
        for (String str : arrStr){
            // 3. 순회시마다 문자열이 비어 있다면 '0', 비어있지 않다면 정수로 변환 후 누적
            answer += str.isEmpty() ? 0 : Integer.parseInt(str);
        }
        System.out.println("결과는: "+answer);
        // 4. 위 과정을 마무리한 후 결과 리턴
        return answer;
    }

    public int solution_before(String my_string) {
        int answer = 0;
        // 1. 입력된 문자열 my_string 길이만큼 순회
        int my_string_length = my_string.length();
        String current_str = "";
        int begin = 0;
        int end = 0;
        int[] result = new int[3];
        for (int i = 0; i < my_string_length; i++) {
            current_str = String.valueOf(my_string.charAt(i));
            if (isNumeric(current_str)) { // 2. 순회시마다 각 문자가 숫자인지 판별
                System.out.println(i + "번째 인덱스는 숫자야!!!");
                // 2-1. 숫자 일 때, end 변수의 인덱스+1 저장
                end = i + 1;
            } else { // 2-2. 숫자가 아닐 때, begin,end 모두 0 이 아닌지 비교
                System.out.println(i + "번째 인덱스는 숫자 아니야!!!");
                System.out.println("현재 begin: "+begin+"\t현재 end: "+end);
                result = checkZero(begin, end, my_string);
                System.out.println("문자열을 정수 변환 후 값: " + result[0]);
                answer += result[0];
                begin = result[1];
                end = result[2];
                begin = i+1; // begin의 인덱스+1 저장
                System.out.println("문자열 정수 변환 후 begin: "+begin+"\tend: "+end);
            }
        }
        System.out.println("결과는: " + answer);
        // 5. 위 과정을 마무리한 후 결과 리턴
        return answer;
    }

    private int[] checkZero(int begin, int end, String my_string) {
        int[] result = {0,0,0}; // 0번 요소는 정수 변환 값, 1번 요소는 begin, 2번 요소는 end
        // 3. 모두 '0' 아닐 때, begin~end 까지 문자열을 정수 변환 후 누적
        if (begin != 0 && end != 0) {
            result[0] = Integer.parseInt(my_string.substring(begin, end));
            // 4. begin,end 모두 '0' 초기화
            //result[1] = 0;
            //result[2] = 0;
        } else if (begin == 0 && end != 0) {
            // 문자열의 첫 번째 요소가 숫자인 경우
            result[0] = Integer.parseInt(my_string.substring(begin, end));
        }
        return result;
    }

    private boolean isNumeric(String current_str) {
        return current_str != null && current_str.matches("\\d*"); // 문자열이 정수인지 판단
    }
}
