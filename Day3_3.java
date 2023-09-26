import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int max = 0; // 1. 가장 큰 수 선언

        // 2. 입력된 배열 오름차순 정렬
        Arrays.sort(array);
        // 2-1. 정렬된 배열 중 가장 큰 수 max 설정
        max = array[array.length-1];
        // 3. 가장 큰 수 + 1 만큼 새로운 배열 생성 (각 수 count를 위함)
        int[] count = new int[max + 1];
        // 4. 입력된 배열길이 만큼 반복해 각 수 count
        for (int i = 0; i < array.length; i++) {
            count[array[i]]++;
        }
        // 5. 새로운 배열길이 만큼 반복해 최빈값 찾기
        for (int i = 1; i < count.length; i++) {
            if (max < count[i]) {
                max = count[i];
                answer = i; // 최빈값 인덱스 번호
            } else if(max == count[i]) { // 최빈값이 여러개
                answer = -1;
            }
        }
        // 6. 최빈값 리턴
        return answer;
    }
}