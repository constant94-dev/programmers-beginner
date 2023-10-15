public class Day22_3 {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] overlapLine = new int[201];
        // 1. 입력된 2차월 배열 길이만큼 순회
        int length = lines.length;
        for (int i=0; i<length; i++){
            overlapLine = overLap(lines[i][0], lines[i][1], overlapLine); // 2. 순회시마다 선분 그리기
        }
        
        // 5. 순회가 끝난 후 겹쳐진 선분 찾기
        int overlap_length = overlapLine.length;
        for (int i=0; i<overlap_length; i++){
            if (overlapLine[i] >= 2){
                answer++;
            }
        }
        System.out.println("결과는: "+answer);
        // 6. 위 과정을 마무리한 후 결과 리턴
        return answer;
    }
    
    private int[] overLap(int start, int end, int[] overlapLine) {
        start = start+100; // 선분 시작점을 음수가 아닌 양수만 사용하기 위함
        end = end+100; // 선분 끝점을 음수가 아닌 양수만 사용하기 위함
        // 3. 인자값의 start부터 end전 까지 순회
        for(int i=start; i<end; i++){
            // 4. 순회시마다 각 인덱스 번호를 찾아가 1 증가
            overlapLine[i]++;
        }
        return overlapLine;
    }

    public static void main(String[] args) {
        int[][] lines = {{0, 1}, {2, 5}, {3, 9}};
        new Day22_3().solution(lines);
    }
}
