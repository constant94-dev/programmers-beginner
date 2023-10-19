public class Day24_1 {
    public int solution(int chicken) {
        int answer = 0;
        int coupon = chicken; // 1. 쿠폰은 치킨 수 만큼 지급된다.
        int service = 0;
        while (true) {
            if (coupon < 10) break; // 2. 남은 쿠폰 수가 10보다 작을 때, stop
            
            // 3. 남은 쿠폰 수가 10보다 크거나 같을 때, 10으로 나눈다.
            service = coupon/10; // 3-1. 몫은, 서비스 치킨 수
            coupon = coupon%10; // 3-2. 나머지는, 남은 쿠폰 수

            coupon += service; // 서비스 치킨 수만큼 쿠폰이 지급

            answer += service; // 서비스 치킨 수 누적
        }
        
        // 4. 위 과정을 마무리한 후 결과 리턴
        System.out.println("결과는: " + answer);
        return answer;
    }

    public static void main(String[] args) {
        new Day24_1().solution(100);
    }
}
