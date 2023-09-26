class Solution {
    public int[] recur(int[] answer, int[] emergency, int maxValue, int emergencyPriority, int emergency_length){
        // 주어진 배열을 순회하며 가장 큰 수를 찾고 수를 하나씩 제외해가며 결과를 만들어야한다.
        // 가장 큰 수를 한번 찾는 반복문이 필요하다.
        // 이후의 가장 큰 수를 찾으려면 이전의 찾은 수를 제외하고 반복문을 실행한다.
        // 상태 값: (결과를 담을 배열, 가장 큰 수를 찾는 반복문을 실행할 배열, 가장 큰 수 초기값, 현재 응급도 순서, 응급실 환자 수),
        // 종료 조건: 응급도 순서가 응급실 환자 수와 같을 때 종료,
        // 점화식: 어떻게 상태를 전이시켜 종료조건에 가깝게 할 것인가? 재귀를 수행할 때마다 응급도 순서가 증가한다.
        if (emergencyPriority == emergency_length) {
            // 마지막 응급도 순서를 세팅 후 리턴
            for (int i=0; i<emergency_length; i++) {
                if(emergency[i] != 0) {
                    answer[i] = emergencyPriority;
                    return answer;
                }
            }
        }
        
        int currentMax_idx = 0;
        // 3. 현재 비교하는 가장 큰 값 인덱스 번호를 결과 배열 인덱스의 현재 응급도 순서로 세팅한다.
        for (int i=0; i<emergency_length; i++){
            if (maxValue < emergency[i]){
                maxValue = emergency[i];
                currentMax_idx = i;
            }
        }
        emergency[currentMax_idx] = 0; // 현재 가장높은 진료순서 인덱스의 값을 '0' 변경
        answer[currentMax_idx] = emergencyPriority; // 현재 응급도를 가장 큰 값 인덱스로 결과 배열의 대입
        emergencyPriority++; // 다음 응급도 순서로 증가
        recur(answer,emergency,0,emergencyPriority,emergency_length);
        
        return answer;
    }
    
    public int[] solution(int[] emergency) {
        int emergency_length = emergency.length;
        int[] answer = new int[emergency_length]; // 결과 배열은 입력된 배열 길이만큼 공간을 생성
        
        // 1. 응급도 변수 선언
        int emergencyPriority = 1;
        // 2. 가장 큰 수를 찾는다.
        answer = recur(answer, emergency, 0, emergencyPriority, emergency_length);

        // 4. 위 과정이 마무리 되면 결과 배열을 리턴
        return answer;
    }
}