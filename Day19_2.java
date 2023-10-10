public class Day19_2 {
    public String[] solution_after(String my_str, int n){
        String[] answer = {};
        int my_str_length = my_str.length();
        int my_str_remainder = my_str_length % n;
        int my_str_mok = my_str_length / n;
        if (my_str_remainder != 0) { // 정수 n 으로 입력된 문자열이 나누어 떨어지지 않을 때
            answer = new String[my_str_mok + 1];
        } else { // 정수 n 으로 입력된 문자열이 나누어 떨어질 때
            answer = new String[my_str_mok];
        }

        int answer_length = answer.length;
        for (int i=0; i<answer_length; i++){
            int length = my_str.length();
            if (length >= n){ // 현재 문자열 길이가 나누어야하는 정수 n 보다 크거나 같을 때, 첫번째 요소부터 n까지 저장
                answer[i] = my_str.substring(0, n);
                my_str = my_str.substring(n, length);
            } else { // 현재 문자열 길이가 나누어야하는 정수 n 보다 작을 때, 첫번째 요소부터 현재 길이까지 저장
                answer[i] = my_str.substring(0, length);
            }
        }
        for (String str : answer){
            System.out.println("결과는: "+str);
        }
        return answer;
    }

    public static void main(String[] args) {
        new Day19_2().solution_after("abc1Addfggg4556b", 6);
    }

    public String[] solution_before(String my_str, int n) {
        String[] answer = {};
        int my_str_length = my_str.length();
        int my_str_remainder = my_str_length % n;
        int my_str_mok = my_str_length / n;
        if (my_str_remainder != 0) { // 정수 n 으로 입력된 문자열이 나누어 떨어지지 않을 때
            answer = new String[my_str_mok + 1];
        } else { // 정수 n 으로 입력된 문자열이 나누어 떨어질 때
            answer = new String[my_str_mok];
        }
        answer = strFit(answer, n, my_str, my_str_remainder);
        for (String str : answer) {
            System.out.println("결과는: " + str);
        }
        // 3. 위 과정을 마무리한 후 결과 리턴
        return answer;
    }

    private String[] strFit(String[] answer, int n, String my_str, int my_str_remainder) {
        int remainder = 9999;
        int mok = 9999;
        int my_str_length = my_str.length();
        for (int i = 0; i < my_str_length; i++) {
            if (i != 0)
                remainder = i % n;

            System.out.println("현재 remainder: " + remainder);
            if (remainder == 0) { // 2-1. 나머지가 0일 때, 결과 배열의 추가
                mok = i / n;
                answer[mok - 1] = my_str.substring(i - n, i);
                System.out.println("현재까지 answer: " + answer[mok - 1]);
            }
            
            System.out.println("my_str_remainder: "+my_str_remainder);
            if (i == my_str_length - 1) { // 2-2. 마지막 인덱스 수행할 때, 나머지 문자열 처리
                System.out.println("strFitCatch 실행 전!!!!");
                answer = strFitCatch(answer, n, i, mok, remainder, my_str_length, my_str);
            }
        }
        return answer;
    }

    private String[] strFitCatch(String[] answer, int n, int idx, int mok, int remainder, int my_str_length, String my_str) {
        if (remainder != 0) {
            mok = idx / n;
            answer[mok] = my_str.substring(idx - remainder, my_str_length);
            System.out.println("현재 인덱스: " + idx + "\n현재까지 answer: " + answer[mok - 1]);
        }
        return answer;
    }
}
