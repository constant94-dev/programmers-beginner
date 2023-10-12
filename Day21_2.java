import java.util.ArrayList;
import java.util.List;

public class Day21_2 {
    public int solution(int[][] board) {
        int answer = 0;
        List<int[]> targetList = new ArrayList<>();
        // 1. 입력된 정수 배열 board 칸 수 만큼 순회
        int board_length = board.length;
        System.out.println("지뢰 밭: "+board_length);
        // board 값이 1일 때, 해당 좌표 새로운 정수 배열의 저장
        // 정수 배열 길이만큼 보드 생성
        for (int i=0; i<board_length; i++){
            for (int j=0; j<board_length; j++){
                // 2. 순회시마다 값이 1인지 비교
                if (board[i][j] == 1){
                    int[] target = {i,j}; // 지뢰 정보
                    targetList.add(target); // 지뢰 정보 저장
                }
            }
        }

        // 리스트에 저장한 지뢰 정보를 불러와 위험지역 조사
        int targetList_size = targetList.size();
        for (int target = 0; target<targetList_size; target++){
            int y = targetList.get(target)[0]; // 첫번째 요소는 y좌표
            int x = targetList.get(target)[1]; // 두번째 요소는 x좌표
            board = dangerArea(board, y, x); // 위험지역 조사
        }
        
        // 3. 순회가 끝난 후 board 칸 수 만큼 순회
        for (int i=0; i<board_length; i++){
            for (int j=0; j<board_length; j++){
                if (board[i][j] == 0){ // 3-1. 0일 때, 안전지역 1 증가
                    answer++;
                }
            }
        }
        System.out.println("결과는: "+answer);
        // 4. 위 과정을 마무리한 후 결과 리턴
        return answer;
    }
    private int[][] dangerArea(int[][] board, int y, int x) {
        int board_length = board.length;
        // board 범위에 벗어나는지 검사
        if (x-1 >= 0){ // 좌
            board[y][x-1] = 1;
        }
        if (y-1 >= 0){ // 상
            board[y-1][x] = 1;
        }
        if (x+1 < board_length){ // 우
            board[y][x+1] = 1;
        }
        if (y+1 < board_length){ // 하
            board[y+1][x] = 1;
        }
        if (y-1 >= 0 && x-1 >= 0){ // 대각선 왼쪽 위
            board[y-1][x-1] = 1;
        }
        if (y-1 >= 0 && x+1 < board_length){ // 대각선 오른쪽 위
            board[y-1][x+1] = 1;
        }
        if (y+1 < board_length && x-1 >= 0){ // 대각선 왼쪽 아래
            board[y+1][x-1] = 1;
        }
        if (y+1 < board_length && x+1 < board_length){ // 대각선 오른쪽 아래
            board[y+1][x+1] = 1;
        }
        return board;
    }
    public static void main(String[] args) {
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 1, 0}, {0, 0, 0, 0, 0}};
        new Day21_2().solution(board);
    }
}
