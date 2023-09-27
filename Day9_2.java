import java.util.HashMap;
class Solution {
    public String solution(String letter) {
        String answer = "";
        HashMap<String, String> morseMap = new HashMap<>(){{
            put(".-", "a");
            put("-...", "b");
            put("-.-.", "c");
            put("-..", "d");
            put(".", "e");
            put("..-.", "f");
            put("--.", "g");
            put("....", "h");
            put("..", "i");
            put(".---", "j");
            put("-.-", "k");
            put(".-..", "l");
            put("--", "m");
            put("-.", "n");
            put("---", "o");
            put(".--.", "p");
            put("--.-", "q");
            put(".-.", "r");
            put("...", "s");
            put("-", "t");
            put("..-", "u");
            put("...-", "v");
            put(".--", "w");
            put("-..-", "x");
            put("-.--", "y");
            put("--..", "z");
        }};
        // 1. 입력된 문자열 'letter'를 공백을 기준으로 나눈다.
        String[] letter_split = letter.split(" ");

        // 2. 나누어진 문자열을 모스부호표와 순서대로 비교한다.
        for (String morse : letter_split) {
            answer += morseMap.get(morse); // 3. 모스부호를 올바른 문자로 치환한다.
        }
        // 4. 위 과정을 마무리한 후 결과를 리턴
        return answer;
    }
}