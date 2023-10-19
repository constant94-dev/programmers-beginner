public class Day24_3 {
    public int solution(String before, String after) {
        int answer = 0;
        // 1. 입력된 문자열 after 길이만큼 순회
        int length = after.length();
        int currentBefore = 0;
        int currentAfter = 0;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < after.length(); j++) {
                // 2. 순회시마다 인덱스별 문자 비교
                currentBefore = before.charAt(i)-'0';
                currentAfter = after.charAt(j)-'0';
                if (currentBefore == currentAfter) { // 2-1. 같을 때, 해당 문자 제거
                    after = after.substring(0, j) + after.substring(j+1);
                    System.out.println("현재 after: "+after);
                    break; // 문자 하나당 한개의 문자만 삭제해야 되기 때문에 stop
                }
            }
        }

        // 3. 순회가 끝난 후 after 길이 비교
        if (after.length() == 0){ // 3-1. 0 일 때, 결과 1 저장
            answer = 1;
        } else { // 3-2. 0 아닐 때, 결과 0 저장
            answer = 0;
        }
        System.out.println("결과는: " + answer);
        // 4. 위 과정을 마무리한 후 결과 리턴
        return answer;
    }

    public static void main(String[] args) {
        new Day24_3().solution("lionkingis", "lioniskinn");
    }
}
