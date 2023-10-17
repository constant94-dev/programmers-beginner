public class Day23_4 {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        // 1. 입력된 db 배열을 순회
        String id = id_pw[0];
        String pw = id_pw[1];
        int db_length = db.length;
        for (int i = 0; i < db_length; i++) {
            // 2. 순회시마다 입력된 id 비교
            if (id.equals(db[i][0])) { // 2-1. 아이디 같을 때, pw 비교
                answer = pwCheck(pw, db[i][1]);
                break;
            } else { // 2-2. 아이디 다를 때, fail
                answer = "fail";
            }
        }
        System.out.println("결과는: " + answer);
        // 4. 위 과정을 마무리한 후 결과 리턴
        return answer;
    }

    private String pwCheck(String input_pw, String db_pw) {
        String result = "";
        if (input_pw.equals(db_pw)) { // 3. 비밀번호 같을 때, login
            result = "login";
        } else { // 3-1. 비밀번호 다를 때, wrong pw
            result = "wrong pw";
        }
        return result;
    }

    public static void main(String[] args) {
        String[] id_pw = { "meosseugi", "1234" };
        String[][] db = { { "rardss", "123" }, { "meosseugi", "1234" }, { "yyoom", "1234" } };
        new Day23_4().solution(id_pw, db);
    }
}
