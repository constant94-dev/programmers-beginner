import java.util.Arrays;

class Solution {
 
    public int solution(int[] array) {
        int answer = 0;
        // 1. 입력된 배열을 정렬한다.
        Arrays.sort(array);
        // 2. 정렬된 배열 중간 번호를 찾는다.
        int centerNum = array.length/2;
        // 3. 배열의 중간 값을 리턴한다.
        answer = array[centerNum];
        return answer;
    }

    public static void main(String[] args) {
        int[] array = { 9, -1, 0 };
        Solution solution = new Solution();
        System.out.println(solution.solution(array));
    }

}