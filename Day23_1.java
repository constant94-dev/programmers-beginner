import java.util.Arrays;

public class Day23_1 {
    public int[] solution(int[] numlist, int n) {
        int numlist_length = numlist.length;
        int[] answer = new int[numlist_length];
        Arrays.sort(numlist); // 입력된 정수 배열 오름차순 정렬
        
        for (int i=0; i<numlist_length; i++){
            for (int j=0; j<numlist_length; j++){
                if (i == j){ // 같은 인덱스는 지나간다.
                    continue;
                }
                System.out.println(i+"번째 numlist[i]: "+numlist[i]+" / numlist[j]: "+numlist[j]);
                if (Math.abs(n-numlist[i]) <= Math.abs(n-numlist[j])){
                    int temp = numlist[i];
                    numlist[i] = numlist[j];
                    numlist[j] = temp;
                }
                //System.out.println(i+"번째 numlist[i]: "+numlist[i]+" / numlist[j]: "+numlist[j]);
            }
        }
        answer = numlist; // 순회가 끝난 리스트를 결과배열의 대입
        // 위 과정을 마무리한 후 결과 리턴
        return answer;
    }
    public static void main(String[] args) {
        int[] numlist = {1, 2, 3, 4, 5, 6};
        new Day23_1().solution(numlist, 4);
    }
}
