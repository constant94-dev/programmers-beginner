public class Day25_1 {
    public int solution(String A, String B) {
        int answer = 0;
        int length = A.length();

        // 문자열을 밀기 전 A와 B가 같을 때, '0' 저장 후 종료
        if (A.equals(B)){
            System.out.println("결과는: "+answer);
            return answer;
        }
        
        String current = A;
        // 1. 입력된 문자열 A 길이 만큼 순회
        for (int i=0; i<length; i++){
            System.out.println("들어왔어!");
            // 2. 순회시마다 문자열 한 칸 밀기
            current = pushRight(current);
            // 3. 한 칸 밀어진 문자열과 입력된 문자열 B 비교
            if (current.equals(B)){ // 4. 같을 때, 해당 인덱스 +1 저장
                answer = i+1;
                break; // 최소 횟수를 구하기 위한 반복 stop
            }
        }

        if (answer == 0) answer = -1; // 문자열을 밀어서 B를 만들 수 없을 때는 -1 반환
            
        
        System.out.println("결과는: "+answer);
        // 5. 위 과정을 마무리한 후 결과 리턴
        return answer;
    }
    private String pushRight(String a) {
        int length = a.length();
        int pointer = length-1;
        char[] origin = a.toCharArray();
        String[] pushStr = new String[length];
        StringBuilder result = new StringBuilder();
        
        pushStr[0] = String.valueOf(origin[pointer]);
        // 현재 문자열에서 끝 문자를 첫 문자로 이동
        for (int i=1; i<length; i++){
            pushStr[i] = String.valueOf(origin[i-1]);
        }

        for (String str : pushStr){
            System.out.println("저장된 문자: "+str);
            result.append(str);
        }
        
        return result.toString();
    }
    public static void main(String[] args) {
        new Day25_1().solution("apple", "elppa");
    }
}
