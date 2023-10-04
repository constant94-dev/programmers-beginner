public class Day14_1 {
    public int solution(int[] array, int n) {
        int answer = 0;
        int array_length = array.length;
        int[] gap = new int[array_length];
        // 1. 입력된 정수 배열 'array'를 순회
        for (int i=0; i<array_length; i++){
            // 2. 순회마다 정수 n을 뺀 절대값을 새로운 정수 배열의 저장
            gap[i] = Math.abs(array[i]-n);
            System.out.println("gap 배열의 저장된 값: "+gap[i]);
        }
        
        int gap_length = gap.length;
        int target_idx = 0;
        int min_value = 9999;
        // 3. 새로운 정수 배열을 순회
        for (int i=0; i<gap_length; i++){
            // 4. 순회마다 이전 값과 비교해 가장 작은 값의 인덱스를 기억
            if (gap[i] < min_value){
                min_value = gap[i];
                target_idx = i;
            } else if(gap[i] == min_value){ // 4-1. 값이 같다면 더 작은 수의 인덱스를 기억
                if (array[target_idx] > array[i]){
                    target_idx = i;
                }
            }
        }
        answer = array[target_idx];
        System.out.println("결과는: "+answer);
        // 5. 위 과정을 마무리한 후 결과 리턴
        return answer;
    }
    public static void main(String[] args) {
        int[] array = {10,11,13};
        new Day14_1().solution(array, 12);
    }
}
