public class Day14_3 {
    public String solution(String cipher, int code) {
        cipher = "^"+cipher; // 'cipher' 문자열 맨 앞의 의미없는 문자 하나 추가
        int cipher_length = cipher.length();
        String answer = "";
        StringBuilder result = new StringBuilder();
        // 1. 입력된 문자열 'cipher' 길이만큼 순회
        for (int i=1; i<cipher_length; i++){
            // 2. i 나누기 code 나머지 값이 0일 때, 결과 문자열의 추가
            if (i%code == 0){
                result.append(cipher.charAt(i));
            }
        }
        answer = result.toString();
        // 3. 위 과정을 마무리한 후 결과 리턴
        return answer;
    }
}
