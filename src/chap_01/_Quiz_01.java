package chap_01;

public class _Quiz_01 {
    public static void main(String[] args){
        // 퀴즈 1
        // 버스 도착 정보를 출력하는 프로그램을 작성하시오.
        // 각정보는 적절한 자료형 변수에 정의 합니다.

        // [정보]
        // 1. 버스번호는 "1234" , "상암08"과 같은 형태
        // 2. 남은 시간은 분단위 (예: 3분, 5분)
        // 3. 남은 거리는 km단위 (예: 1.5km , 0.8km)

        // [결과]
        // 상암 08번 버스
        // 약 3분 후 도찯
        // 남은 거리 1.2km

        // => 내가 쓴 답
        String busName = "상암 08번";
        int min = 3;
        double leftKm = 1.2;

        System.out.println(busName + "버스");
        System.out.println("약" + min + "분 후 도착");
        System.out.println("남은 거리" + leftKm + "km");

        // 정답 1:57:22

        //버스 번호(1234,상암08)
        String busNo = "상암08";

        // 남은 시간(3분,5분)
        int minute = 3;

        // 남은거리 (1.5km, 0.8km)
        double distance = 1.2;

        System.out.println(busNo + "번 버스");
        System.out.println("약" + minute +"분후 도착");
        System.out.println("남은 거리" + distance + "km");
    }
}
