class Solution {
    public int lcm(int person){
        int gcd_value = gcd(person, 6); // 3-1. 최대공약수를 구한다.
        return (person*6)/gcd_value; // 최소공배수는 두 정수를 곱한 값에 최대공약수를 나누면된다.
    }
    public int gcd(int person, int slice){
        // 유클리드호제법으로 작성된 최대공약수 로직
        if (person % slice == 0) return slice;
        return gcd(slice, person % slice);
    }
    
    public int solution(int n) {
        int answer = 0;
        int lcm_value = 0;
        // 1. 입력된 수 n이 1,2,3,6 일때, 1을 리턴
        if (n==1 || n==2 || n==3 || n==6){
            answer = 1;
        } else { // 2. 입력된 수 n이 1,2,3,6이 아닐때, n과 6의 최소공배수 만큼의 피자 조각이 필요하다.
            lcm_value = lcm(n); // 3. 최소공배수를 구한다.
            answer = lcm_value/6; // 4. 최소공배수 나누기 6 한 값을 리턴
        }
        return answer;
    }
}