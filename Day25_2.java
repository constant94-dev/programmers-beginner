public class Day25_2 {
    public int solution(int M, int N) {
        int answer = 0;
        int cutWidth = 0;
        int cutHeight = 0;
        // 1. 입력된 M,N 값이 1일 때, 결과 '0' 리턴
        if (M == 1 && N == 1){
            return answer;
        }
        // 1-1. 입력된 M,N으로 가로자르기 횟수, 세로 한 줄 자르기 횟수 구하기
        cutWidth = M-1;
        cutHeight = N-1;
        // 2. 가로로 나눈 후 세로 자르기 횟수 구하기
        cutHeight = cutHeight * M;
        answer = cutWidth+cutHeight;
        System.out.println("결과는: "+answer);
        // 3. 위 과정을 마무리한 후 결과 리턴
        return answer;
    }
    public static void main(String[] args) {
        new Day25_2().solution(2, 5);
    }
}
