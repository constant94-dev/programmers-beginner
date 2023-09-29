class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        int dot_length = dot.length;
        // 1. 입력된 배열 값 'dot' 길이만큼 순회
        for (int i=0; i<dot_length; i++){
            // 2. '0'을 기준으로 x,y 좌표 양수,음수 판별
            if (dot[i] >= 0){
                dot[i] = 1; // 양수
            } else {
                dot[i] = -1; // 음수
            }
        }
        
        // 3. 해당 좌표 값을 사분면 값과 비교
        if (dot[0] == 1 && dot[1] == 1){
            answer = 1;
        } else if (dot[0] == -1 && dot[1] == 1){
            answer = 2;
        } else if (dot[0] == -1 && dot[1] == -1){
            answer = 3;
        } else if(dot[0] == 1 && dot[1] == -1){
            answer = 4;
        }
        // 4. 위 과정 마무리 후 결과 리턴
        return answer;
    }
}