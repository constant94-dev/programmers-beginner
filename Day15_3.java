import java.util.HashMap;
import java.util.Map.Entry;

public class Day15_3 {
    public String solution(String s) {
        String answer = "";
        StringBuilder result = new StringBuilder();
        // 1. HashMap 생성
        HashMap<String, Integer> alphabetMap = new HashMap<>() {
            {
                put("a", 0);
                put("b", 0);
                put("c", 0);
                put("d", 0);
                put("e", 0);
                put("f", 0);
                put("g", 0);
                put("h", 0);
                put("i", 0);
                put("j", 0);
                put("k", 0);
                put("l", 0);
                put("m", 0);
                put("n", 0);
                put("o", 0);
                put("p", 0);
                put("q", 0);
                put("r", 0);
                put("s", 0);
                put("t", 0);
                put("u", 0);
                put("v", 0);
                put("w", 0);
                put("x", 0);
                put("y", 0);
                put("z", 0);
            }
        };
        String current_char = "";
        int s_length = s.length();
        for (int i = 0; i < s_length; i++) {
            // 2. 문자가 등장할 때마다 1씩 증가
            current_char = String.valueOf(s.charAt(i));
            alphabetMap.put(current_char, alphabetMap.get(current_char) + 1);

        }
        // 3. HashMap의 값이 1을 찾는다.
        for (Entry<String, Integer> pair : alphabetMap.entrySet()) {
            if (pair.getValue() == 1){
                result.append(pair.getKey());
            }
        }
        answer = result.toString();
        System.out.println("결과는: "+answer);
        // 4. 위 과정을 마무리한 후 결과 리턴
        return answer;
    }
    public static void main(String[] args) {
        new Day15_3().solution("abcabcadc");
    }
}
