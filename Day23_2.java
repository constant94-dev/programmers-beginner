public class Day23_2 {
    public int[] solution(int[][] score) {
        // 1. 입력된 2차원 배열을 순회
        int sLength = score.length;
        int[] answer = new int[sLength];
        double[] average = new double[sLength];
        for (int i=0; i<sLength; i++){
            // 2. 순회시마다 평균을 구한다.
            average[i] = (score[i][0] + score[i][1]) / 2d;
        }
        for (double aver : average){
            System.out.println("평균 점수는요: "+aver);
        }
        
        // 3. 평균 점수대로 등수를 매긴다.
        int rank = 1;
        int aLength = average.length;
        for (int i=0; i<aLength; i++){
            for (int j=0; j<aLength; j++){
                if (i == j) continue;
                if (average[i] < average[j]){ // 현재 비교중인 평균점수가 작을 때, 등수가 1 떨어진다.
                    rank++;
                }
            }
            answer[i] = rank; // 연산이 끝난 등수를 결과에 저장
            rank = 1; // 다음 평균점수에 등수를 매기기 위한 초기화
        }
        for (int result : answer){
            System.out.println("결과는: "+result);
        }
        // 4. 위 과정을 마무한후 결과 리턴
        return answer;
    }
    public static void main(String[] args) {
        int[][] score = {{80, 70}, {90, 50}, {40, 70}, {50, 80}};
        int[][] score2 = {{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}};
        int[][] score3 = {{0, 0}, {100, 100}, {1, 100}, {100, 1}, {50, 50}, {1, 50}, {50, 1}, {1, 99}, {99, 1}, {100, 50}};
        new Day23_2().solution(score3);
    }
}
