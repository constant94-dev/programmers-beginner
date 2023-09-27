import java.util.HashMap;
class Solution {
    public String solution(String rsp) {
        StringBuilder rspResult = new StringBuilder();
        String answer = "";
        // 1. 가위 바위 보 표를 만든다.
        HashMap<Integer, String> rspMap = new HashMap<>(){{
            put(2, "0");
            put(0, "5");
            put(5, "2");
        }};
        
        // 2. 입력된 'rsp' 값을 가위 바위 보 표와 비교한다.
        int rsp_length = rsp.length();
        int rspKey = 0;
        for (int i=0; i<rsp_length; i++){
            rspKey = rsp.charAt(i) - '0';
            // 3. 올바른 값으로 치환한다.
            rspResult.append(rspMap.get(rspKey));
        }
        answer = rspResult.toString(); // 'StringBuilder'의 누적된 문자열 결과 변수의 대입
        // 4. 위 과정을 마무리한 후 결과 리턴
        return answer;
    }
}