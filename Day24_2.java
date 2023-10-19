public class Day24_2 {
    public String solution(String bin1, String bin2) {
        String answer = "";
        int num1 = Integer.parseInt(bin1,2); // 2진수를 10진수로 변환 
        int num2 = Integer.parseInt(bin2,2); // 2진수를 10진수로 변환
        System.out.println("num1: "+num1+"\nnum2: "+num2);

        answer = Integer.toBinaryString(num1+num2); // 10진수를 2진수로 변환
        System.out.println("결과는: "+answer);
        // 5. 위 과정을 마무리한 후 결과 리턴
        return answer;
    }

    public static void main(String[] args) {
        new Day24_2().solution("10", "11");
    }
}
