class Day12_1 {
    // public String solution_1(String my_string) {
    //     String answer = "";
    //     int my_string_length = my_string.length();
    //     String current_string = "";
    //     // 1. 입력된 문자열 my_string 순회
    //     System.out.println("입력된 문자열 길이: " + my_string_length);
    //     for (int i = 0; i < my_string_length; i++) {
    //         // 2. 순회할 때 마다 알파벳 모음과 비교
    //         current_string = String.valueOf(my_string.charAt(i));
    //         System.out.println("현재 비교중인 문자입니다: " + current_string);
    //         if (current_string.equals("a") || current_string.equals("e") || current_string.equals("i")
    //                 || current_string.equals("o")
    //                 || current_string.equals("u")) { // 2-1. 같을 때, 해당 문자 제거
    //             System.out.println("문자제거합니다!");
    //             answer = my_string.replace(current_string, "");
    //         }
    //         // 2-2. 다를 때, 지나간다.
    //     }
    //     // 3. 위 과정을 마무리한 후 결과 리턴
    //     return answer;
    // }

    public String solution_2(String my_string) {
        String answer = "";
        String charToRemove = "aeiou";
        // 1. 입력된 문자열 my_string 순회
        for (char c : charToRemove.toCharArray()) { // 2. 순회할 때 마다 알파벳 모음과 비교
            System.out.println("현재 비교중인 문자입니다: " + c);
            // 2-1. 'charToRemove' 문자열을 하나씩 비교해 'my_string' 문자열의 포함되어 있다면 제거한다.
            my_string = my_string.replace(String.valueOf(c), "");
        }
        answer = my_string;
        // 3. 위 과정을 마무리한 후 결과 리턴
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new Day12_1().solution_2("bus"));
    }
}