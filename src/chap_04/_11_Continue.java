package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        //Continue

        //치킨 주문 손님중에 노쇼 손님 있다고 가정
        // For
        int max = 20; // 최대 치킨 판매 수량
        int sold = 0; // 현재 치킨 판매 수량
        int noShow = 17;

        for (int i = 1; i < 50; i++) {
            System.out.println(i + "번 손놈 주문하신 치킨 나옴");

            // 손님이 없다면?
            if (i == noShow) {
                System.out.println(i + "번 손놈 노쇼함, 다음새끼");
                continue;
            }

            sold++; //판매처리
            if (sold==max){
                System.out.println("재료 소진!");
                break;
            }
        }
        System.out.println("영업 끝!");

        System.out.println("==================");

        //while문
        sold = 0;
        int index = 1; // 손님 번호
        while (index <= 50){
            System.out.println(index + "번 손님 치킨나옴");

            //손님이 없다면 (noShow)
            if (index == noShow) {
                System.out.println(index + "번 손놈 노쇼, 다음새끼");
                index++;
                continue;
            }

            sold++;
            if (sold==max){
                System.out.println("금일 재료가 모두 소진");
                break;
            }
            index++;

        }
        System.out.println("영업끝");

    }
}
