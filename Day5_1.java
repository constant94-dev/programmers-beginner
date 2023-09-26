// 변경 전
class Solution_before {
    public int solution(int price) {
        int answer = 0;
        int discount = 0;
        // 1. 옷 가격별로 분기한다.
        if (price >= 500000) { // 1-1. 500,000 이상 20% 할인
            discount = (int) (price * 0.2);
            answer = price - discount;
        } else if(price >= 300000 && price < 500000){ // 1-2. 300,000 이상 10% 할인
            discount = (int) (price * 0.1);
            answer = price - discount;
        } else if(price >= 100000) { // 1-3. 100,000 이상 5% 할인
            discount = (int) (price * 0.05);
            answer = price - discount;
        } else { // 할인이 안되는 가격은 그대로 리턴
            answer = price;
        }
        // 2. 소수점 이하를 버린 정수 리턴
        return answer;
    }
}

// 변경 후
class Solution_after {
    public int solution(int price) {
        int answer = 0;
        // 1. 옷 가격별로 분기한다.
        if (price >= 500000) { // 1-1. 500,000 이상 20% 할인
            answer = (int) (price * 0.8);
        } else if(price >= 300000){ // 1-2. 300,000 이상 10% 할인
            answer = (int) (price * 0.9);
        } else if(price >= 100000) { // 1-3. 100,000 이상 5% 할인
            answer = (int) (price * 0.95);
        } else { // 할인이 안되는 가격은 그대로 리턴
            answer = price;
        }
        // 2. 소수점 이하를 버린 정수 리턴
        return answer;
    }
}