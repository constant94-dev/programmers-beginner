public class Day20_2 {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = { 0, 0 };
        // 1. 입력된 문자열 배열 keyinput 길이만큼 순회
        int horizon_max = board[0] / 2;
        int horizon_min = board[0] / 2 * -1;
        int vertical_max = board[1] / 2;
        int vertical_min = board[1] / 2 * -1;

        for (String key : keyinput) {
            // 2. 순회시마다 방향키 비교 [x,y]
            if (key.equals("left") && horizon_min < answer[0]) { // 2-1. left 일 때, x좌표 -1, board 범위 검사
                answer[0]--;
            } else if (key.equals("right") && horizon_max > answer[0]) { // 2-2. right 일 때, x좌표 +1, board 범위 검사
                answer[0]++;
            } else if (key.equals("up") && vertical_max > answer[1]) { // 2-3. up 일 때, y좌표 +1, board 범위 검사
                answer[1]++;
            } else if (key.equals("down") && vertical_min < answer[1]) { // 2-4. down 일 때, y좌표 -1, board 범위 검사
                answer[1]--;
            }
        }
        System.out.println("결과는: " + answer[0] + "," + answer[1]);
        // 3. 위 과정을 마무리한 후 결과 리턴
        return answer;
    }

    public static void main(String[] args) {
        String[] keyinput = { "right" };
        int[] board = { 1, 1 };
        new Day20_2().solution(keyinput, board);
    }
}
