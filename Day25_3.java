public class Day25_3 {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int idx = 0;
        int currentTotal = 0;
        int length = 0;
        // 1. total이 될 때 까지 반복
        while (true) {
            System.out.println("현재 idx: "+idx);
            // 2. 시작 인덱스부터 1씩 큰 값을 num개 더한다.
            length = idx+num;
            for (int i=idx; i<length; i++){
                currentTotal += i;
                System.out.println("현재 currentTotal: "+currentTotal);
            }
            if (currentTotal == total){ // 3. num개 더한 값이 total일 때, stop
                break;
            } else if (currentTotal < total){ // 4. num개 더한 값이 total 보다 작을 때, 시작 인덱스 1증가
                idx++;
            } else if(currentTotal > total){ // 5. num개 더한 값이 total 보다 클 때 시작 인덱스 1감소
                idx--;
            }
            currentTotal = 0;
        }
        
        int answerLength = answer.length;
        for (int i=0; i<answerLength; i++){
            answer[i] = idx;
            idx++;
        }

        for (int a : answer){
            System.out.println("결과는: "+a);
        }
        // 6. 위 과정을 마무리한 후 결과 리턴
        return answer;
    }
    public static void main(String[] args) {
        new Day25_3().solution(3, 12);
    }
}
