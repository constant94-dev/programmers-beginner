public class Day21_4 {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        // 1. 입력된 문자열 배열 'spell'을 연결된 문자열로 만든다.
        StringBuilder spellStr = new StringBuilder();
        for (String str : spell) {
            spellStr.append(str);
        }

        int dic_length = dic.length;
        String dic_element = "";
        for (int i = 0; i < dic_length; i++) {
            dic_element = removeDuplicate(dic[i]); // dic[i] 요소 중복 문자 제거
            System.out.println("dic_element: "+dic_element);
            // 2. 연결된 문자열이 문자열 배열 'dic'의 포함되는지 확인
            answer = spellCheck(dic_element, spellStr.toString());
            if (answer == 1){
                break;
            }
        }
        System.out.println("결과는: " + answer);
        // 3. 위 과정을 마무리한 후 결과 리턴
        return answer;
    }

    private String removeDuplicate(String element) {
        StringBuilder result = new StringBuilder();
        char[] checkDuplicate = element.toCharArray();
        for (char check : checkDuplicate){
            if (!result.toString().contains(String.valueOf(check))){ // result 문자열의 check 담겨진 문자가 포함되지 않으면 추가
                result.append(check);
            }
        }
        return result.toString();
    }

    private int spellCheck(String dic, String spellStr) {
        int dic_length = dic.length();
        int spellStr_length = spellStr.length();
        int check = 0;
        int result = 0;
        String current_str = "";
        for (int i = 0; i < dic_length; i++) {
            current_str = String.valueOf(dic.charAt(i));
            System.out.println("현재 비교중인 문자는: " + current_str);
            if (spellStr.contains(current_str)){
                System.out.println("포함되나요????????????????????");
                check++;
            }
        }

        if (check == spellStr_length){
            System.out.println("결과는 1이야~~~~~~");
            result = 1; // 포함된 횟수가 spellStr 길이와 같으면 결과는 1이야!!!
        } else {
            result = 2;
        }
        check = 0; // spell 확인이 끝나면 다음 확인을 위해 '0' 초기화
        return result;
    }

    public static void main(String[] args) {
        String[] spell = { "p", "o", "s" };
        String[] dic = { "sod", "eocd", "qixm", "adio", "soo" };
        new Day21_4().solution(spell, dic);
    }
}
