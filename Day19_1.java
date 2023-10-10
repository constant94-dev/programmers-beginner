public class Day19_1 {
    public int solution(int[] array) {
        int answer = 0;
        StringBuilder numbers = new StringBuilder();
        // 1. 입력된 정수 배열 array 길이만큼 순회
        for (int num : array){
            // 2. 순회마다 문자열로 변경 후 StringBuilder 요소로 추가
            numbers.append(String.valueOf(num));
        }
        
        // 3. StringBuilder 값을 새로운 문자열의 대입
        String result = numbers.toString();
        // 4. 새로운 문자열 길이만큼 순회
        int result_length = result.length();
        String current_char = "";
        for (int i=0; i<result_length; i++){
            // 5. 순회마다 7과 같은지 비교
            current_char = String.valueOf(result.charAt(i));
            if (current_char.equals("7")){
                answer++; // 5-1. 같다면, 결과 1증가
            }
        }
        System.out.println("결과는: "+answer);
        // 6. 위 과정을 마무리한 후 결과 리턴
        return answer;
    }
    public static void main(String[] args) {
        int[] array = {10,29};
        new Day19_1().solution(array);
    }
}
