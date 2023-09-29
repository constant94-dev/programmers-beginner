import java.util.ArrayList;
import java.util.List;

public class Day10_3 {

    public int solution(int[] numbers, int k) {
        int answer = 0;
        int current_number = 1;
        List<Integer> new_numbers = new ArrayList<>();

        int numbers_length = numbers.length; // 입력된 배열 길이
        int target_idx = (k - 1) * 2; // 'k'번째 인덱스 번호
        int add_array = target_idx / numbers_length; // 새롭게 필요한 'numbers' 수
        // 1. 'k'번째 사람을 찾기 위한 1차원 배열 초기화
        for (int i = 0; i <= add_array; i++) {
            for (int num : numbers) {
                new_numbers.add(num);
            }
        }

        int new_numbers_size = new_numbers.size();
        System.out.println("새로운 리스트 길이: "+new_numbers_size);
        int i = 0;
        // 2. 배열 길이만큼 반복
        for (i = 0; i < new_numbers_size; i+=2) {
            // 3. 한 칸씩 건너뛰며 'k' 와 같은지 비교
            System.out.println("현재 확인하는 i: "+i+" 현재 확인하는 값: "+new_numbers.get(i));
            if (current_number == k){
                answer = new_numbers.get(i);
                break;
            } else {
                current_number++;
            }
        }
        // 4. 위 과정 마무리 후 결과 리턴
        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3 };
        System.out.println(new Day10_3().solution(numbers, 3));
    }
}
