public class Day16_3 {
    public int solution(String my_string) {
        int answer = 0;
        // 1. 입력된 문자열 my_string을 공백 기준으로 나눈다.
        String[] my_string_split = my_string.split(" ");
        answer = Integer.parseInt(my_string_split[0]);
        int split_length = my_string_split.length;
        for (int i=1; i<split_length; i++) { // 2. 나누어진 문자열 배열을 순회
            if (my_string_split[i].equals("+")){ // 3. 문자열 배열 값이 '+'일 때, 더한다. 
                answer += Integer.parseInt(my_string_split[i+1]);
            }
            if (my_string_split[i].equals("-")){ // 4. 문자열 배열 값이 '-'일 때, 뺀다.
                answer -= Integer.parseInt(my_string_split[i+1]);
            }
        }
        System.out.println("결과는: " + answer);
        // 5. 위 과정을 마무리한 후 결과 리턴
        return answer;
    }

    public static void main(String[] args) {
        new Day16_3().solution("123 + 45 - 1");
    }
}
