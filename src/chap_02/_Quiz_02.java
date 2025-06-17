package chap_02;

public class _Quiz_02 {
    public static void main(String[] args){
        // 퀴즈
        /*
        어린이 키에 따른 놀이 기구 탑승 가능 여부를 확인하는 프로그램을 작성하시오.

        조건
        1. 키가 120cm이상인 경우에만 탑승가능
        2. 삼항 연산자 이용

        실행결과
        => 키가 115cm 이므로 탑승 불가능합니다.
        => 키가 121cm 이므로 탑승 가능합니다.
         */

        // 나의 풀이
        int kidLength = 115;
        int kidLength2 = 121;

        String okToRide = (kidLength >= 120) ? "탑승 가능합니다" : "탑승 불가능합니다";
        String okToRide2 = (kidLength2 >= 120) ? "탑승 가능합니다" : "탑승 불가능합니다";
        System.out.println("키가 " + kidLength + "cm 이므로 "+ okToRide);
        System.out.println("키가 " + kidLength2 + "cm 이므로 "+ okToRide2);


        // 정답 풀이 및 해설
        int height = 115;
        int height2 = 121;

        String result = (height >= 120) ? "탑승 가능합니다" : "탑승 불가능합니다";
        String reslt2 = (height2 >= 120) ? "탑승 가능합니다" : "탑승 불가능합니다";

        System.out.println("키가 " + height + "cm 이므로 "+ result);
        System.out.println("키가 " + height2 + "cm 이므로 "+ reslt2);



    }
}
