class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        // 1. money가 5,500 이상 or 미만 분기
        if (money >= 5500) { // 2. 5,500 이상, money와 5,500 나눈다.
            // 2-1. 몫을 첫번째 인덱스, 나머지를 두번째 인덱스 추가한다.
            int mok = money/5500;
            int remainder = money%5500;
            System.out.println("아메리카노 잔 수: "+mok+" / 남는 돈: "+remainder);
            answer[0] = mok;
            answer[1] = remainder;
        } else { // 3. 5,500 미만, [0, money]
            answer[0] = 0;
            answer[1] = money;
        }
        // 4. 결과 값을 리턴
        return answer;
    }
}