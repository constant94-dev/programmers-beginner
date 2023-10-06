public class Day16_1 {
    public int solution(String message) {
        int answer = 0;
        // 1. 입력된 문자열 message 길이를 구한다.
        int msg_length = message.length();
        // 2. message 길이에서 2를 곱한다.
        answer = msg_length * 2;
        // 3. 위 과정을 마무리한 후 결과 리턴
        return answer;
    }    
}