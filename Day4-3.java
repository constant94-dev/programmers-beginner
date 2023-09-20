class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        int mok = 0;
        int remainder = 0;
        // 1. 먹는 사람이 피자 조각 수보다 작거나 같을 때, 1을 리턴
        if (n <= slice) {
            answer = 1;
        } else { // 2. 먹는 사람이 피자 조각 수보다 많을 때, 피자 조각 수와 먹는 사람 수를 나눈다.
            // 3. 몫과 나머지를 구한다.
            mok = n/slice;
            remainder = n%slice;
            
            if (remainder == 0){ // 3-1. 나머지가 0 일 때, 몫을 리턴
                answer = mok;
            } else { // 3-2. 나머지가 0 아닐 때, 몫+1 리턴
                answer = mok + 1;
            }
        }
        return answer;
    }
}