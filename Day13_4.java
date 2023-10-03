import java.util.Arrays;

public class Day13_4 {
    public int solution_before(int[] sides) {
        int answer = 0;
        int sides_length = sides.length;
        int max = 0;
        int two_side = 0;
        // 1. 입력된 정수배열을 순회
        for (int i=1; i<sides_length; i++){
            if (sides[i] > max){ // 2. 가장 긴 변을 찾는다.
                max = sides[i];
            }
        }
        
        // 3. 가장 긴 변을 뺀 나머지 변을 합한다.
        for (int side : sides){
            if (!(side == max)){
                two_side += side;
            }
        }
        // 4. 나머지 변을 합한 값이 가장 긴 변보다 크다면 1을 리턴, 아니면 2를 리턴
        System.out.println("two_side: "+two_side+"\nmax: "+max);
        if (two_side > max){
            System.out.println("만들 수 있어~~~~~");
            answer = 1;
        } else {
            System.out.println("만들 수 없어~~~~~");
            answer = 2;
        }
        return answer;
    }

    public int solution_after(int[] sides){
        int answer = 0;
        Arrays.sort(sides); // 내장 라이브러리를 사용해 정수배열을 오름차순 정렬
        int two_side = sides[0]+sides[1]; // 첫 번째 + 두 번째 요소를 더한다.
        int max_side = sides[2]; // 세 번째 요소가 가장 긴 변이다.

        if (two_side > max_side){ // 가장 긴 변보다 나머지 두 변의 합이 크다면 삼각형 완성
            answer = 1;
        } else {
            answer = 2;
        }
        // 위 과정을 마무리한 후 결과 리턴
        return answer;
    }
}
