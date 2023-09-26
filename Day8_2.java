import java.util.HashMap;
class Solution {
    public String solution(int age) {
        String answer = "";
        String ageString = Integer.toString(age);
                
        // 1. HashMap 사용해 0~9까지 key(숫자):value(알파벳) 형태로 초기화
        HashMap<Integer, String> ageMap = new HashMap<>() {
                {
                        put(0, "a");
                        put(1, "b");
                        put(2, "c");
                        put(3, "d");
                        put(4, "e");
                        put(5, "f");
                        put(6, "g");
                        put(7, "h");
                        put(8, "i");
                        put(9, "j");
                }
        };
        // 2. 'age' 값을 한자리씩 비교해 문자값으로 변경
        int ageString_length = ageString.length();
        int find_age = 0;
        for (int i = 0; i < ageString_length; i++) {
                find_age = ageString.charAt(i)-'0'; // 아스키 코드에 기반하여 문자 값을 입력된 정수 그대로 가져오기 위한 방법
                answer += ageMap.get(find_age);
        }
        // 3. 변경이 완료된 문자열 결과를 리턴
        return answer;
    }
}