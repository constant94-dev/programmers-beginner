import java.util.ArrayList;
import java.util.List;

public class Day17_2 {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        // 1. 결과를 저장할 임시 리스트를 생성
        List<Integer> result = new ArrayList<>();
        // 2. 입력된 정수 배열 numlist 길이만큼 순회
        for (int num : numlist){
            if (num%n == 0) { // 3. 순회시마다 입력된 수 n 으로 나눈다.
                // 3-1. 나머지가 0 일 때, 리스트에 추가
                result.add(num);
            }
        }
        int result_size = result.size();
        answer = new int[result_size];
        // 4. 순회가 끝나면 리스트에 값을 결과 배열에 저장
        for (int i=0; i<result_size; i++){
            answer[i] = result.get(i);
        }
        System.out.println("결과는: "+answer.length);
        // 5. 위 과정을 마무리한 후 결과리턴
        return answer;
    }
    public static void main(String[] args) {
        int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        new Day17_2().solution(3, numlist);
    }
}
