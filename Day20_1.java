public class Day20_1 {
    public int solution(int[][] dots) {
        int answer = 0;
        int horizon_min = dots[0][1];
        int vertical_min = dots[0][0];
        int horizon_max = dots[0][1];
        int vertical_max = dots[0][0];
        int horizon_result = 0;
        int vertical_result = 0;
        int dots_temp = 0; // 순회시마다 비교할 dots 임시 저장 변수
        // 1. 입력된 2차원 정수 배열 dots 길이만큼 순회
        int dots_length = dots.length;
        for (int i=1; i<dots_length; i++){
            // 2. 순회시마다 y좌표 최소값과 최대값 찾기
            dots_temp = dots[i][0];
            if (dots_temp > vertical_max){
                vertical_max = dots_temp;
            }
            if (dots_temp < vertical_min){
                vertical_min = dots_temp;
            }
        }
        // 3. 순회가 끝난 후 y좌표 최대값 - 최소값이 세로길이
        vertical_result = vertical_max - vertical_min;
        
        // 4. dots 길이만큼 순회
        for (int i=1; i<dots_length; i++){
            // 5. 순회시마다 x좌표 최소값과 최대값 찾기
            dots_temp = dots[i][1];
            if (dots_temp > horizon_max){
                horizon_max = dots_temp;
            }
            if(dots_temp < horizon_min){
                horizon_min = dots_temp;
            }
        }
        // 6. 순회가 끝난 후 x좌표 최대값 - 최소값이 가로길이
        horizon_result = horizon_max - horizon_min;
        // 7. 위 과정을 마무리한 후 가로x세로 결과 리턴
        answer = horizon_result * vertical_result;
        System.out.println("결과는: "+answer);
        return answer;
    }
    public static void main(String[] args) {
        int[][] dots = {{1, 1}, {2, 1}, {2, 2}, {1, 2}};
        new Day20_1().solution(dots);
    }
}
