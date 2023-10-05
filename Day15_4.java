import java.util.ArrayList;
import java.util.List;

public class Day15_4 {
    public int[] solution(int n) {
        int[] answer = {};
        List<Integer> result = new ArrayList<>();
        // 1. 입력된 정수 n까지 순회
        for (int i=1; i<=n; i++){
            // 2. 순회마다 n에서 현재 순회 수를 나눈다.
            if (n%i == 0){ // 2-1. 나머지가 0일 때, 결과 배열의 저장
                result.add(i);
            }
        }
        int result_size = result.size();
        answer = new int[result_size];
        int answer_length = answer.length;
        for (int i=0; i<answer_length; i++){
            answer[i] = result.get(i);
        }
        System.out.println("결과는: "+answer_length);
        // 3. 위 과정을 마무리한 후 결과 리턴
        return answer;
    }
    public static void main(String[] args) {
        new Day15_4().solution(24);
    }
}