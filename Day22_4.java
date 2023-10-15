import java.util.ArrayList;
import java.util.List;

public class Day22_4 {
    public int solution(int a, int b) {
        int answer = 0;
        int common = 0;
        List<Integer> numbers = new ArrayList<>();
        // 1. 입력된 정수 a,b의 최대공약수를 구한다.
        common = gcd(a, b);
        // 2. 기약분수를 만든다. (최대공약수로 분자와 분모를 나누면 기약분수다.)
        a = a/common;
        b = b/common;
        if (b == 1){
            answer = 1;
        }
        // 3. 기약분수의 분모의 소인수가 2 또는 5라면 유한소수다.
        numbers = smallNum(b);
        for (int num : numbers){
            System.out.println("현재 번호는: "+num);
            if (num == 2 || num == 5){
                answer = 1;
            } else {
                answer = 2;
                break;
            }
        }
        System.out.println("결과는: "+answer);
        // 4. 위 과정을 마무리한 후 결과 리턴
        return answer;
    }
    private List<Integer> smallNum(int b) { // 소인수분해
        List<Integer> numbers = new ArrayList<>();
        int idx = 2;
        while (true) {
            if (b == 1){
                return numbers;
            }

            if (b%idx == 0){
                b = b/idx;
                numbers.add(idx);
            } else {
                idx++;
            }
        }
    }
    private int gcd(int a, int b) { // 유클리드 호제법
        if (a%b == 0) return b;

        return gcd(b, a%b);
    }
    public static void main(String[] args) {
        new Day22_4().solution(14, 15);
    }
}
