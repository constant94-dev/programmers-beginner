class Solution {
    public int solution(int[] box, int n) {
        int answer = 1;
        int dice = 0;
        // 1. 입력된 정수 배열 'box'를 'n'으로 순서대로 나눈다.
        for (int box_value : box) {
            // 2. 나누어진 값을 곱한다.
            dice = box_value / n;
            answer *= dice;
        }
        // 3. 위 과정이 마무리되면 결과 리턴
        return answer;
    }
}