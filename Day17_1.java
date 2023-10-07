public class Day17_1 {
    public int solution(int num, int k) {
        int answer = -1;
        // 1. 입력된 수 num과 k를 문자열로 변환
        String numStr = String.valueOf(num);
        String kStr = String.valueOf(k);
        // 2. 문자열 num 첫번째 요소에 의미없는 문자 추가
        numStr = "^"+numStr;
        // 3. 문자열 num 길이만큼 순회
        int numStr_length = numStr.length();
        String current_char = "";
        for (int i=0; i<numStr_length; i++){
            current_char = String.valueOf(numStr.charAt(i));
            if (current_char.equals(kStr)){ // 4. 순회마다 문자열 k와 같은지 비교
                answer = i; // 4-1. 같을 때, 해당 인덱스 저장
                break; // 첫 발견했을 때 인덱스가 답이기 때문에 이후 인덱스는 검사하지 않는다.
            }
        }
        System.out.println("결과는: "+answer);
        // 5. 위 과정을 마무리한 후 결과 리턴
        return answer;
    }
    public static void main(String[] args) {
        new Day17_1().solution(232443, 4);
    }
}
