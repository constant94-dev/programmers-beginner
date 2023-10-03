public class Day13_2 {
    public int[] solution(String[] strlist) {
        int strlist_length = strlist.length;
        int[] answer = new int[strlist_length]; // 입력된 문자열 배열 길이로 결과 배열 초기화
        int str_result = 0;
        // 1. 입력된 문자열 배열을 순회
        for (int i = 0; i < strlist_length; i++) {
            // 2. 순회하는 문자열마다 길이를 구한다.
            str_result = strlist[i].length();
            answer[i] = str_result; // 3. 구해진 길이를 결과 배열의 순서대로 저장
        }

        for (int result : answer) {
            System.out.println("결과는: " + result);
        }

        // 4. 위 과정을 마무리한 후 결과 리턴
        return answer;
    }

    public static void main(String[] args) {
        String[] test = { "We", "are", "the", "world!" };
        new Day13_2().solution(test);
    }
}
