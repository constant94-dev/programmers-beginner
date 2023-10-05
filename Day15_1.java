import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Iterator;

public class Day15_1 {
    public long solution(String numbers) {
        long answer = 0;
        // HashMap 생성
        HashMap<String, String> numberMap = new HashMap<>() {
            {
                put("zero", "0");
                put("one", "1");
                put("two", "2");
                put("three", "3");
                put("four", "4");
                put("five", "5");
                put("six", "6");
                put("seven", "7");
                put("eight", "8");
                put("nine", "9");
            }
        };

        for (Entry<String, String> pair : numberMap.entrySet()){
            if (numbers.contains(pair.getKey())){
                numbers = numbers.replaceAll(pair.getKey(), pair.getValue());
            }
        }
        answer = Long.parseLong(numbers);
        // 3. 위 과정을 마무리한 후 결과 리턴
        return answer;
    }

    public static void main(String[] args) {
        new Day15_1().solution("onefourzerosixseven");
    }

    public long solution_before_1(String numbers) {
        // HashMap 생성
        HashMap<String, Integer> numberMap = new HashMap<>() {
            {
                put("zero", 0);
                put("one", 1);
                put("two", 2);
                put("three", 3);
                put("four", 4);
                put("five", 5);
                put("six", 6);
                put("seven", 7);
                put("eight", 8);
                put("nine", 9);
            }
        };
        long answer = 0;
        StringBuilder result = new StringBuilder();

        // 1. 생성한 HashMap 사이즈 만큼 반복
        numberMap.forEach((k, v) -> {
            if (numbers.contains(k)) { // 1-1. 반복할 때마다 HashMap의 포함 되는지 검사
                result.append(v); // 2. 포함되면 해당 value 값을 결과의 하니씩 추가
            }
        });
        char[] result_char = result.toString().toCharArray(); // 순서가 보장되지 않은 결과 값을 정렬하기 위해 char[] 변환
        Arrays.sort(result_char); // 오름차순 정렬

        answer = Integer.parseInt(new StringBuilder(new String(result_char)).toString()); // 숫자형태로 변환 후 저장
        // 3. 위 과정을 마무리한 후 결과 리턴
        return answer;
    }

    public long solution_before_2(String numbers) {
        long answer = 0;
        // HashMap 생성
        HashMap<String, String> numberMap = new HashMap<>() {
            {
                put("zero", "0");
                put("one", "1");
                put("two", "2");
                put("three", "3");
                put("four", "4");
                put("five", "5");
                put("six", "6");
                put("seven", "7");
                put("eight", "8");
                put("nine", "9");
            }
        };

        Iterator<Entry<String, String>> itr = numberMap.entrySet().iterator();

        while(itr.hasNext()){
            Entry<String, String> entry = itr.next();
            if (numbers.contains(entry.getKey())){
                numbers = numbers.replaceAll(entry.getKey(), entry.getValue());
            }
        }
        answer = Integer.parseInt(numbers);
        // 3. 위 과정을 마무리한 후 결과 리턴
        return answer;
    }
}
