public class Day16_4 {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        // 1. 입력된 문자열 배열 두개의 길이를 구한다.
        int s1_length = s1.length;
        int s2_length = s2.length;
        // 2. 이중 반복문을 사용해 두개의 문자열 배열을 순회
        for (int i=0; i<s1_length; i++){
            for (int j=0; j<s2_length; j++){
                if (s1[i].equals(s2[j])){ // 3. 순회시마다 요소가 같은지 비교
                    answer++; // 3-1. 같을 때, 결과 1증가
                }
            }
        }
        System.out.println("결과는: "+answer);
        // 4. 위 과정을 마무리한 후 결과 리턴
        return answer;
    }
    public static void main(String[] args) {
        String[] s1 = {"a","b","c"};
        String[] s2 = {"comm","b","d","p","c"};
        new Day16_4().solution(s1, s2);
    }
}
