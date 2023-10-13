public class Day22_1 {
    public int solution(int n) {
        int answer = 0;
        // 1. 입력된 정수 n크기 만큼 순회
        for (int i = 1; i <= n; i++) {
            if (n == 1 || n == 2){
                break;
            }

            // 2. 순회시마다 3의 배수인지 3이 포함되는지 검사
            if (isThree(i) || isMultiple(i)) {
                // 2-1. 3의 배수 or 3이 포함될 때, 마을에서 쓰는 숫자 x
                System.out.println("3의 배수 or 3이 포함!!!!!!!");
                n++;
            }
        }
        answer = n;
        System.out.println("결과는: " + answer);
        // 3. 위 과정을 마무리한 후 결과 리턴
        return answer;
    }

    private boolean isMultiple(int current) { // 3의 배수인지 검사
        boolean result = false;
        if (current%3 == 0){
            result = true;
        }
        return result;
    }

    private boolean isThree(int current) { // 3이 포함되는 검사
        boolean result = false;
        if (String.valueOf(current).contains("3")){
            result = true;
        }
        return result;
    }

    public static void main(String[] args) {
        new Day22_1().solution(15);
    }
}
