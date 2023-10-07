import java.util.ArrayList;
import java.util.List;

public class Day17_4 {
    public String[] solution(String[] quiz) {
        String[] answer = {};
        List<String> result = new ArrayList<>();
        // 1. 입력된 문자열 배열 길이만큼 순회
        for (String qiuzElement : quiz) {
            System.out.println("현재 퀴즈: " + qiuzElement);
            result.add(quizOperating(qiuzElement)); // 4. 연산을 수행한 결과를 저장
        }
        for (String r : result) {
            System.out.println("결과는: " + r);
        }

        int result_size = result.size();
        answer = new String[result_size];
        for (int i=0; i<result_size; i++){
            answer[i] = result.get(i);
        }
        // 5. 위 과정을 마무리한 후 결과 리턴
        return answer;
    }

    private String quizOperating(String quiz) {
        // 2. 순회시마다 공백을 기준으로 나눈다.
        String[] split_quiz = quiz.split(" ");
        int result = 0;
        int firstElement = Integer.parseInt(split_quiz[0]);
        int secondElement = Integer.parseInt(split_quiz[2]);
        int resultElement = Integer.parseInt(split_quiz[4]);
        // 3. 나누어진 새로운 문자열 배열을 응용해 연산을 수행
        if (split_quiz[1].equals("+")) {
            result = firstElement + secondElement;
        }
        if (split_quiz[1].equals("-")) {
            result = firstElement - secondElement;
        }

        if (result == resultElement) { // 연산으로 만들어낸 결과가 입력된 결과 값과 같을 때
            return "O";
        } else { // 연산으로 만들어낸 결과가 입력된 결과 값과 다를 때
            return "X";
        }
    }

    public static void main(String[] args) {
        String[] quiz = { "3 - 4 = -3", "5 + 6 = 11" };
        new Day17_4().solution(quiz);
    }
}
