import java.util.Arrays;

public class Day21_3 {
    public int solution(int[] sides) {
        int answer = 0;
        // 1. 입력된 정수 배열을 오름차순 정렬
        Arrays.sort(sides);
        // 2. 마지막 요소가 가장 긴 변일 때, 마지막 요소부터 1씩 차감하며 (첫 요소+차감된 수) 값을 구한다.
        for (int i=sides[1]; i>=0; i--){
            if(sides[0]+i > sides[1]){ // 2-1. 마지막 요소보다 클 때, 결과 1증가
                System.out.println("첫번째 조건 결과 1증가!!!!");
                answer++;
            } else { // 2-2. 마지막 요소보다 작을 때, stop
                break;
            }
        }
        
        // 3. 나머지 한 변이 가장 긴 변일 때, 마지막 요소부터 1씩 증가한 값을 구한다.
        int start = sides[1]+1;
        int end = sides[0]+sides[1];
        for (int i=start; i<end; i++){
            if (end > i){ // 3-1. (첫 요소+마지막 요소) 값보다 작을 때, 결과 1증가
                System.out.println("두번째 조건 결과 1증가!!!!");
                answer++;
            } else { // 3-2. 클 때, stop
                break;
            }
        }
        System.out.println("결과는: "+answer);
        // 4. 위 과정을 마무리한 후 결과 리턴
        return answer;
    }
    public static void main(String[] args) {
        int[] sides = {11,7};
        new Day21_3().solution(sides);
    }
}
