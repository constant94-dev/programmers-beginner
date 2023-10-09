public class Day18_1 {
    public int solution(String str1, String str2) {
        int answer = 0;
        // 1. 입력된 문자열 str1 안에 str2 가 있는지 검사
        if (str1.contains(str2)){ // 1-1. 있다면, 결과 1 저장
            answer = 1;
        } else { // 1-2. 없다면, 결과 2 저장
            answer = 2;
        }
        // 2. 위 과정을 마무리한 후 결과 리턴
        return answer;
    }
}