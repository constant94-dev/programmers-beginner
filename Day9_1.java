class Solution {
    public int solution(int hp) {
        int answer = 0;
        int general_ant_power = 5; // 장군개미 공격력
        int soldier_ant_power = 3; // 병정개미 공격력
        int worker_ant_power = 1; // 일개미 공격력
        int general_ant = 0; // 장군개미 수
        int soldier_ant = 0; // 병정개미 수
        int worker_ant = 0; // 일개미 수
        int next_ant = 0; // 다음번 연산할 개미 수
        // 1. 입력된 hp 값을 장군개미 공격력으로 나눈다.
        general_ant = hp/general_ant_power;
        next_ant = hp%general_ant_power;
        // 1-1. 장군개미 공격력으로 나눈 나머지 값이 '0'이 아닐 때, 병정개미 공격력으로 나눈다.
        if (next_ant != 0) {
            soldier_ant = next_ant/soldier_ant_power;
            next_ant = next_ant%soldier_ant_power;
        }
        // 2. 병정개미 공격력으로 나눈 나머지 값이 '0'이 아닐 때, 일개미 공격력으로 나눈다.
        if (next_ant != 0) {
            worker_ant = next_ant/worker_ant_power;
        }
        // 모든 개미들의 수를 더한다.
        answer = general_ant + soldier_ant + worker_ant;
        // 3. 위 과정을 마무리한 후 결과 리턴
        return answer;
    }
}