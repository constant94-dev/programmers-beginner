import java.util.Scanner;

// StringBuilder 사용 후
class Solution_after {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder triangle = new StringBuilder();
        
        // 1. 입력한 수 만큼 반복한다.
        for (int i=0; i<n; i++){
            // 2. 반복횟수가 증가할 때마다 '*'을 하나씩 더 출력한다.
            triangle.append('*');
            System.out.println(triangle);
        }
        sc.close();
    }
}

// StringBuilder 사용 전
class Solution_before {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String triangle = "";
        
        // 1. 입력한 수 만큼 반복한다.
        for (int i=0; i<n; i++){
            // 2. 반복횟수가 증가할 때마다 '*'을 하나씩 더 출력한다.
            triangle += '*';
            System.out.println(triangle);
        }
        sc.close();
    }
}