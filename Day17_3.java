public class Day17_3 {
    public int solution(int n) {
        int answer = 0;
        // 1. 입력된 수 n을 문자열로 변환
        String nStr = String.valueOf(n);
        // 2. 문자열 길이만큼 순회
        int nStr_length = nStr.length();
        String current_char = "";
        for (int i=0; i<nStr_length; i++){
            current_char = String.valueOf(nStr.charAt(i));
            answer += Integer.parseInt(current_char); // 순회시마다 값을 더해 결과의 누적
        }
        // 4. 위 과정을 마무리한 후 결과 리턴
        return answer;
    }
}
