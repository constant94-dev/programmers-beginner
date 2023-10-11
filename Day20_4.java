public class Day20_4 {
    public String solution(String polynomial) {
        String answer = "";
        // 1. 입력된 문자 polynomial 공백을 기준으로 나눈다.
        String[] poly_split = polynomial.split(" ");
        // 2. 나누어진 문자열 배열을 순회
        String x_split = "";
        int xValue = 0;
        int num = 0;
        for (String split : poly_split) {
            // 3. 순회시마다 x가 포함되는지 0<polynomial<100 사이 수 인지 비교
            if (split.contains("x")) { // 3-1. x가 포함될 때, x의 계수를 누적
                x_split = split.replaceAll("[^\\d]", "");
                if (x_split.equals("")) { // x계수가 1일 때
                    xValue += 1;
                } else { // x계수가 1이 아닐 때
                    xValue += Integer.parseInt(x_split);
                }
            }
            if (isNumeric(split)) { // 3-2. 0<polynomial<100 사이 수 일 때, 일반 수를 누적
                num += Integer.parseInt(split);
            }
        }
        System.out.println("중간 결과:\n x계수: " + xValue + "\n 일반 수: " + num);

        // 4. x의 계수와 일반 수가 0보다 클 때, "?x + 일반 수" 형태의 문자열로 변환
        if (xValue > 1 && num > 0) {
            answer = String.valueOf(xValue) + "x + " + String.valueOf(num);
        } else if (xValue > 1 && num == 0) { // 5. x의 계수만 존재할 때, "?x" 형태의 문자열로 변환
            answer = String.valueOf(xValue) + "x";
        } else if (num > 0 && xValue == 0) { // 6. 일반 수만 존재할 때, "?" 형태의 문자열로 변환
            answer = String.valueOf(num);
        } else if (xValue == 1 && num == 0) { // x계수가 1이고 일반 수가 0 이면 "x" 형태의 문자열만 반환
            answer = "x";
        } else if (xValue == 1 && num > 0) { // x계수가 1이고 일반 수가 0 보다 크면 "x + ?" 형태의 문자열로 변환
            answer = "x + " + String.valueOf(num);
        }
        System.out.println("결과는: " + answer);
        // 7. 위 과정을 마무리한 후 결과 리턴
        return answer;
    }

    private Boolean isNumeric(String split) {
        return split != null && split.matches("\\d*"); // 문자열이 양수인지 판단
        // return strValue != null && strValue.matches("[-+]?\\d*\\.?\\d+"); // 문자열이
        // 양수or음수 소수점 아래자리 확인해 정수인지 판단
    }

    public static void main(String[] args) {
        String polynomial = "x + 100 + 102";
        new Day20_4().solution(polynomial);
    }
}
