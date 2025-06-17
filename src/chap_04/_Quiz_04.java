package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        //Quiz 04 주차 요금 정산 프로그램
        /*
        [조건]
        주차요금은 시간당 4000원 (일일 최대 요금은 30000원)
        경차 또는 장애인 차량은 최종 요금에서 50% 할인

        [주차요금 예시]
        일반 차량 5시간 주차시 20000원
        경차 5시간 주차시 10000원
        장애인 차량 10시간 주차시 15000원

        [실행결과]
        일반 차량 5시간 주차시 20000원
        => 주차요금은 20000원 입니다.

        경차 5시간 주차시 10000원
        => 주차요금은 10000원입니다.

        장애인 차량 10시간 주차시
        => 주차요금은 15000원입니다.

         */
        int hour = 5; //주차 시간
        boolean smallCar = false; //경차
        boolean handicappedCar = false; // 장애차량 여부


        int fee = hour * 4000;

        //30000원 초과시 일일 최대요금으로 수정
        if (fee > 30000) {
            fee = 30000;
        }

        // 경차 또는 장애인차량 50% 할인
        if (smallCar || handicappedCar){
            fee /= 2; //50% 할인 적용
        }

        //실행 결과
        System.out.println("주차 요금은 " + fee + "원 입니다.");

    }
}
