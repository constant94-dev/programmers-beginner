public class Day25_4 {
    public int solution(int[] common) {
        int answer = 0;
        int length = common.length-1;
        // 1. 입력된 정수 배열 common 등비일 때와 등차일 때로 분기
        int minusOneAndZero = common[1] - common[0];
        int minusTwoAndOne = common[2] - common[1];

        if (minusOneAndZero == minusTwoAndOne){ // 2. 등차일 때, 마지막 원소+등차값
            answer = common[length]+minusOneAndZero;
        } else { // 3. 등비일 때, 마지막 원소*등비값            
            answer = common[length]*(common[length]/common[length-1]);
        }
        // 4. 위 과정을 마무리한 후 결과 리턴
        return answer;
    }
    public static void main(String[] args) {
        int[] common = {2,4,8};
        new Day25_4().solution(common);
    }
}
