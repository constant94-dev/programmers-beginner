class Solution {
    public int solution(int n, int k) {
        // 양꼬치: n, 음료수: k
        int answer = 0;
        // 1. `n` 나누기 10을 했을 때, 할인 받을 음료수 수
        int drink_discount = n/10;
        if (drink_discount == 0) { // 1-1. 몫이 0 일 때, 음료수 할인 안함
            answer = (n*12000)+(k*2000); // 2. 양꼬치 가격과 음료수 가격 연산
        } else { // 1-2. 몫이 0 아닐 때, 음료수 할인 함
            answer = (n*12000)+(k*2000)-(drink_discount*2000); // 2. 양꼬치 가격과 음료수 가격 연산
        }
        // 3. 총 지불 비용 리턴
        return answer;
    }
}