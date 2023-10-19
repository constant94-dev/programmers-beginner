public class Day24_4 {
    public int solution(int i, int j, int k) {
        int answer = 0;
        // 1. 입력된 i부터 j까지 순회
        String current = "";
        for (int start=i; start<=j; start++){
            // 2. 순회시마다 k가 몇 개 포함되는지 확인
            current = String.valueOf(start);
            answer += kContain(current, k);
        }
        System.out.println("결과는: "+answer);
        // 4. 위 과정을 마무리한 후 결과 리턴
        return answer;
    }
    private int kContain(String current, int k) {
        int length = current.length();
        int result = 0;
        for (int i=0; i<length; i++){
            if (current.charAt(i)-'0' == k){ // 3. 포함되면 결과 1 증가
                result++;
            }   
        }
        return result;
    }
    public static void main(String[] args) {
        new Day24_4().solution(1, 13, 1);
    }
}
