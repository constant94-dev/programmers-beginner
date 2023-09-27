// 패턴 분석
class Day9_4 {
    public int solution(int balls, int share) {
        // (balls:30,share:15) 가 입력 값일 때
        // 분자: (30*29・・・・・15*14・・・・・*2*1)
        // 분모: (15*14・・・・・*2*1)(15*14・・・・・*2*1)
        // 분모의 15~1까지 분자의 15~1까지 사라질 수 있는 패턴
        // 분자: (30*29・・・・・*17*16)
        // 분모: (15*14・・・・・*2*1)
        // 아래가 분석한 패턴을 코드로 표현
        long answer = 1;
        int shareIndex = 1;
        for (int i = share + 1; i <= balls; i++) {
            answer *= i;
            answer /= shareIndex;
            shareIndex++;
        }
        return (int) answer;
    }

    public static void main(String[] args) {
        System.out.println("기댓값 -> " + new Day9_4().solution(20, 5));
    }
}

// 재귀 최적화 전
// class Solution {
// public int recur_df(int ballsAndShare) {
// // 1. 상태 값: (팩토리얼 시작 값)
// // 2. 종료 조건: 입력된 값이 0일 때 종료
// // 3. 점화식: 주어진 수부터 1씩 차감하며 곱해준다.
// if (ballsAndShare == 0)
// return 1;

// return ballsAndShare * recur_df(ballsAndShare - 1);
// }

// public int recur_ds(int balls) {
// // recur_df 로직과 동일함
// if (balls == 0)
// return 1;

// return balls * recur_ds(balls - 1);
// }

// public int recur_nt(int share) {
// // recur_df 로직과 동일함
// if (share == 0)
// return 1;

// return share * (recur_nt(share - 1));
// }

// public int solution(int balls, int share) {
// int answer = 0;
// // 1. 서로 다른 n개 중 m개를 뽑는 공식 사용
// // 1-1. 공식: n!/(n-m)!*m!
// if (balls == share) {
// answer = 0;
// } else {
// int ballsAndShare = balls - share;
// int denomiratorFirst = recur_df(ballsAndShare);
// int denomiratorSecond = recur_ds(share);
// int numerator = recur_nt(balls);
// answer = numerator / (denomiratorFirst * denomiratorSecond);
// }

// // 2. 위 과정이 마무리된 후 결과 리턴
// return answer;
// }
// }

// 재귀 최적화 후
// clase Solution {
    // private int optimizer_value = 0;

    // public Long recur_df(int ballsAndShare) {
    // // 1. 상태 값: (팩토리얼 시작 값)
    // // 2. 종료 조건: 입력된 값이 0일 때 종료
    // // 3. 점화식: 주어진 수부터 1씩 차감하며 곱해준다.
    // if (ballsAndShare == 0)
    // return 1L;

    // return ballsAndShare * recur_df(ballsAndShare - 1);
    // }

    // public Long recur_ds(int share) {
    // // recur_df 로직과 동일함
    // if (share == 0)
    // return 1L;

    // //System.out.println(share + "번째!");
    // return share * recur_ds(share - 1);
    // }

    // public Long recur_nt(int balls) {
    // // recur_df 로직과 동일함
    // if (balls == optimizer_value)
    // return 1L;

    // //System.out.println(balls + "번째!");
    // return balls * (recur_nt(balls - 1));
    // }

    // public void recur_optimizer(int balls, int share) {
    // if (share > balls / 2) {
    // // 1. recur_ds() 재귀 생략, recur_df() & recur_nt() 재귀만 사용
    // // 2. balls - (balls-share) 결과 값을 recur_nt(팩토리얼 수행할 값) 파라미터 값으로 전달
    // // 3. optimizer_value 값을 전역변수로 선언해 재귀 최적화 함수에서 모두 사용
    // optimizer_value = balls - (balls - share);

    // int ballsAndShare = balls - share;
    // String denomiratorFirst = String.valueOf(recur_df(ballsAndShare));
    // String numerator = String.valueOf(recur_nt(balls));
    // int dfLength = denomiratorFirst.length();
    // int ntLength = numerator.length();
    // if (dfLength>18 || ntLength>18) {
    // BigInteger dfValue = new BigInteger(denomiratorFirst);
    // BigInteger ntValue = new BigInteger(numerator);

    // BigInteger resultBig = ntValue.divide(dfValue);
    // } else {
    // Long dfValue = Long.parseLong(denomiratorFirst);
    // Long ntValue = Long.parseLong(numerator);

    // Long resultLong = ntValue / dfValue;
    // }
    // } else {
    // // recur_df() 재귀 생략, recur_ds() & recur_nt() 재귀만 사용
    // // 2. balls - share 결과 값을 recur_nt(팩토리얼 수행할 값) 파라미터 값으로 전달
    // // 3. optimizer_value 값을 전역변수로 선언해 재귀 최적화 함수에서 모두 사용
    // optimizer_value = balls - share;
    // Long denomiratorSecond = recur_ds(share);
    // Long numerator = recur_nt(balls);
    // Long result = numerator / denomiratorSecond;
    // System.out.println("numerator: "+numerator+"\ndenomiratorFirst:
    // "+denomiratorSecond+"\nresult: " + result);
    // // return result;
    // }
    // }

    // public int solution(int balls, int share) {
    // int answer = 0;
    // // 1. 서로 다른 n개 중 m개를 뽑는 공식 사용
    // // 1-1. 공식: n!/(n-m)!*m!
    // if (balls == share) {
    // System.out.println("입력 값 두개가 같아요!");
    // answer = 1;
    // } else {
    // System.out.println("입력 값 두개가 같지 않아요!");
    // // 재귀문 최적화 함수
    // recur_optimizer(balls, share);
    // }
    // // 2. 위 과정이 마무리된 후 결과 리턴
    // return answer;
    // }
// }