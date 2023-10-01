import java.util.HashSet;
import java.util.Iterator;

public class Day12_4 {
    public HashSet<Integer> recur(int n, int current_value, HashSet<Integer> result){
        // 상태 값: (현재 몫, 나누어야 할 값)
        // 종료 조건: 현재 몫이 1 일 때 종료
        // 점화식: n / current 값을 통해 n 이 1로 수렴
        if (n==1) {
            result.add(current_value);
            return result; // 2. 현재 몫이 1일 때, 멈춘다.
        }

        int mok = n/current_value;
        int remainder = n%current_value;
        System.out.println("몫: "+mok+"\n나머지: "+remainder);

        if (remainder == 0){ // 1-1. 나머지 값이 0 일 때, 해당 값을 저장한다.
            result.add(current_value);
            recur(mok, current_value, result);
        } else { // 1-2. 나머지 값이 0 아닐 때, 지나간다.
            current_value++;
            recur(n, current_value, result);
        }
        return result;
    }
    public int[] solution(int n) {
        HashSet<Integer> result = new HashSet<Integer>();
        int[] answer = {};
        // 1. 입력된 자연수 n을 2부터 n까지 나눈다.
        result = recur(n, 2, result);
        System.out.println(result);

        Object[] resultArray = result.toArray();
        int result_length = resultArray.length;
        answer = new int[result_length];
        for (int i=0; i<result_length; i++){
            answer[i] = (int) resultArray[i];
        }
        // 3. 위 과정을 마무리한 후 결과 리턴
        return answer;
    }
    public static void main(String[] args) {
        new Day12_4().solution(420);
    }
}
