package chap_04;

public class _10_Break {
    public static void main(String[] args) {
        //break
        // 치킨 집 매일 20마리만 판매(1인 1매)
        // 손님 50명 대기

        // For문
        int max = 20;
        for (int i = 0; i < 50; i++) {
            System.out.println(i + "번 손놈 주문하신 치킨 나옴");
            if (i==max) {
                System.out.println("금일 재료 소진");
                break;
            }

        }
        System.out.println("영업을 종료 합니다.");

        System.out.println("=================");

        //while
        int index = 1; //손님 대기 번호
        while (index<= 50){
            System.out.println(index + "번 손놈 주문하신 치킨 나옴");
            if (index == max) {
                System.out.println("금일 재료가 모두 소진 되었습니다.");
                break;
            }
            index++;
        }
        System.out.println("영업 끝");
    }
}
