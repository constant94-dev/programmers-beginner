import java.util.ArrayList;
import java.util.List;

public class Day23_3 {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] pronun = {"aya","ye","woo","ma"};
        List<String> result = new ArrayList<>();
        // 1. 발음할 수 있는 단어 조합
        result = combi(pronun);
        for (String str : result){
            System.out.println("조합 결과: "+str);
        }
        // 2. 입력된 문자열 배열 순회
        int resultSize = result.size();
        for (String babbString : babbling){
            // 3. 순회시마다 발음할 수 있는 단어 배열과 비교
            for (int i=0; i<resultSize; i++){
                if (result.get(i).equals(babbString)){ // 3-1. 같을 때, 결과 1증가
                    answer++;
                }
            }
        }
        
        System.out.println("결과는: "+answer);
        // 4. 위 과정을 마무리한 후 결과 리턴
        return answer;
    }
    private List<String> combi(String[] pronun) {
        // [0]: aya, [1]: ye, [2]: woo, [3]: ma
        int length = pronun.length;
        List<String> strTwo = new ArrayList<>();
        
        // 첫번째는 단어 2개 조합
        for (int i=0; i<length; i++){
            for (int j=0; j<length; j++){
                if (i==j) continue;
                strTwo.add(pronun[i]+pronun[j]);
            }
        }

        for (String str : strTwo){
            System.out.println("2개 조합: "+str);
        }
        
        // 두번째는 단어 3개 조합
        List<String> strThree = new ArrayList<>();
        int strThreeSize = strTwo.size();
        String currentThree = "";
        for (int i=0; i<strThreeSize; i++){
            currentThree = strTwo.get(i);
            if (!currentThree.contains(pronun[0])){
                strThree.add(currentThree+pronun[0]);
            }
            if (!currentThree.contains(pronun[1])){
                strThree.add(currentThree+pronun[1]);
            }
            if (!currentThree.contains(pronun[2])){
                strThree.add(currentThree+pronun[2]);
            }
            if (!currentThree.contains(pronun[3])){
                strThree.add(currentThree+pronun[3]);
            }
        }
        for (String str : strThree){
            System.out.println("3개 조합: "+str);
        }

        // 세번째는 단어 4개 조합
        List<String> strFour = new ArrayList<>();
        int strFourSize = strThree.size();
        String currentFour = "";
        for (int i=0; i<strFourSize; i++){
            currentFour = strThree.get(i);
            if (!currentFour.contains(pronun[0])){
                strFour.add(currentFour+pronun[0]);
            }
            if (!currentFour.contains(pronun[1])){
                strFour.add(currentFour+pronun[1]);
            }
            if (!currentFour.contains(pronun[2])){
                strFour.add(currentFour+pronun[2]);
            }
            if (!currentFour.contains(pronun[3])){
                strFour.add(currentFour+pronun[3]);
            }
        }
        for (String str : strFour){
            System.out.println("4개 조합: "+str);
        }

        List<String> mergeList = new ArrayList<>(){{
            add(pronun[0]);
            add(pronun[1]);
            add(pronun[2]);
            add(pronun[3]);
        }};
        mergeList.addAll(strTwo);
        mergeList.addAll(strThree);
        mergeList.addAll(strFour);
        
        return mergeList;
    }

    public int soultion_after(String[] babbling){
        int answer = 0;

        for(int i = 0; i < babbling.length; i++) {
            babbling[i] = babbling[i].replaceFirst("aya", "0"); // 'aya' 문자열을 '0'으로 변경
            babbling[i] = babbling[i].replaceFirst("woo", "0"); // 'woo' 문자열을 '0'으로 변경
            babbling[i] = babbling[i].replaceFirst("ye", "0"); // 'ye' 문자열을 '0'으로 변경
            babbling[i] = babbling[i].replaceFirst("ma", "0"); // 'ma' 문자열을 '0'으로 변경
            babbling[i] = babbling[i].replace("0", ""); // '0' 문자열을 ""으로 변경
            
            if(babbling[i].equals("")) answer++; // "" 문자열이 비어있다면 결과 1 증가 
        }
        
        return answer;
    }

    public static void main(String[] args) {
        String[] babbling = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
        new Day23_3().solution(babbling);
    }
}
