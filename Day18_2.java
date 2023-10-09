public class Day18_2 {
    public int solution(int n) {
        int answer = 0;
        // 1. 입력된 정수 n만큼 순회
        for (int i=1; i<n; i++){
            // 2. 순회시마다 n을 나눈다.
            int mok = n/i;
            int remainder = n%i;
            if (mok == i && remainder == 0){ // 2-1. 몫이 나누는 값과 같다면, 1을 리턴
                answer = 1;
                break;
            } else { // 2-2. 다르다면, 2를 리턴
                answer = 2;
            }
        }
        System.out.println("결과는: "+answer);
        // 3. 위 과정을 마무리한 후 결과 리턴
        return answer;
    }
    public static void main(String[] args) {
        new Day18_2().solution(976);
    }
}