public class Day14_2 {
    public int solution(int order) {
        int answer = 0;
        // 1. 입력된 정수 'order'를 문자열로 변환
        String orderStr = String.valueOf(order);
        int orderStr_length = orderStr.length();
        String currentStr = "";
        // 2. 변환된 문자열을 순회
        for (int i=0; i<orderStr_length; i++) {
            currentStr = String.valueOf(orderStr.charAt(i));
            if (currentStr.equals("3") || currentStr.equals("6") || currentStr.equals("9")){
                answer++; // 3. 순회마다 3,6,9 중 하나와 일치하면 결과 1 증가
            }
        }
        System.out.println("결과는: "+answer);
        // 4. 위 과정을 마무리한 후 결과 리턴
        return answer;
    }

    public static void main(String[] args) {
        new Day14_2().solution(29423);
    }
}
