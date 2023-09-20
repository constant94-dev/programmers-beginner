class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int numbers_sum = 0;
        int numbers_length = numbers.length;
        
        // 1. numbers 배열을 순회한다.
        for (int value : numbers){
            numbers_sum += value; // 1-1. 순회하는 값을 더해서 총합을 구한다.
            answer = (double) numbers_sum/numbers_length; // 1-2. 총합을 numbers 배열의 길이로 나눈다.
        }
        // 2. 나누어진 값을 리턴한다.
        return answer;
    }
}