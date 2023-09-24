class Solution {
    public String solution(String my_string, String letter) {
        String answer = my_string;
        int my_string_length = my_string.length();
        char compare_letter = letter.charAt(0);
        System.out.println("길이: "+my_string_length+"\nletter: "+compare_letter);
        // 1. 문자열을 순회한다.
         for (int i=0; i<my_string_length; i++){
             // 2. 순회하는 문자마다 'letter'에 저장된 문자를 비교한다.
             char compare_my_string = my_string.charAt(i);
             System.out.println("비교문자열: "+compare_my_string);
            if (compare_my_string == compare_letter) {
                 // 3. 비교하는 문자가 같다면, 해당 문자는 제거
                 answer = my_string.replace(letter,"");
                 System.out.println(answer);
             } else {
                // 4. 비교하는 문자가 다르다면, 지나간다.
                continue;
            }
         }
        // 5. 최종 결과를 저장한 문자열을 리턴
        return answer;
    }
}