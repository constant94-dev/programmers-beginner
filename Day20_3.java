import java.util.Arrays;

public class Day20_3 {
    public int solution(int[] numbers) {
        int answer = 0;
        // 1. 입력된 정수 배열 numbers 오름차순 정렬
        Arrays.sort(numbers);
        // 2. 오름차순 정렬 후, numbers[0],numbers[1] 요소가 음수일 때, 두 요소를 곱한 값을 최대 결과로 저장
        int numbers_length = numbers.length;
        int negativeResult = 0;
        int positiveResult = 0;
        int maxFirst = numbers[numbers_length - 1];
        int maxSecond = numbers[numbers_length - 2];
        if (numbers[0] < 0 && numbers[1] < 0) {
            negativeResult = numbers[0] * numbers[1];
        }
        // 3. 첫째,둘째 최대값 곱하기
        positiveResult = maxFirst * maxSecond;
        if (negativeResult < positiveResult) {
            answer = positiveResult;
        } else {
            answer = negativeResult;
        }
        if (numbers_length == 2){ // 정수 배열 요소가 2개일 때, 음수or양수 신경쓰지 않고 두 요소를 곱한 값이 최대값이 된다.
            answer = positiveResult;
        }
        System.out.println("결과는: " + answer);
        // 4. 위 과정을 마무리한 후 결과 리턴
        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = { -10000,10000 };
        new Day20_3().solution(numbers);
    }
}
