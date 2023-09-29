class Solution {
    public int[][] solution(int[] num_list, int n) {
        int num_list_length = num_list.length;
        int row_init = num_list_length / n;
        // 1. 2차원 배열 크기 정한다.
        int[][] answer = new int[row_init][n];
        // 2. num_list 길이만큼 순회한다.
        int row = 0;
        int column = 0;
        for (int i=0; i<num_list_length; i++){
            // 3. 배열요소 한개의 값이 n만큼 채워지면 다음 배열요소에 저장
            // 현재 순회가 n 번째인지 확인해야한다.
            // 어떻게? 'i' 나누기 'n' 나머지 값이 '0' 이면 'row' 1 증가
            if (i != 0) { // 'num_list' 의 첫번째 요소는 아래 로직을 태우지 않는다.
                          // 왜냐하면, i 가 0 일 때, 바로 'row' 가 증가하기 때문이다.
                if(i%n == 0){
                    row++;
                    column = 0;
                } else {
                    column++;
                }
            }
            answer[row][column] = num_list[i];
        }
        // 4. 위 과정을 마무리 후 결과 리턴
        return answer;
    }
}