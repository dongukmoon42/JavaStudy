package chap_04;

public class _01_If {
    public static void main(String[] args) {
        //조건문 If
        int hour = 15;

        if (hour < 14) { //if문이 한출일때는 {}생략 가능
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료 #0");

        if (hour < 14) { //if 문이 두줄일때는 {} 생략 불가능
            System.out.println("아이스 아메리카노 +1");
            System.out.println("샷 추가");
        }
        System.out.println("커피 주문 완료 #1");

        // 오후 2시 이전, 모닝 커피를 마시지 않는 경우?
        hour = 10;
        boolean moringCoffee = true;
        if (hour <12 && moringCoffee == false){
            System.out.println("아이스아메리카노+1");
        }
        System.out.println("커피 주문 완료 #2");

        // 오루 2시 이거나 모닝 커피를 마신경우
        hour = 15;
        moringCoffee = true;
        // if (hour >= 14 || mornigCoffee) <-이것도 가능함.
        if (hour>= 14 || moringCoffee == true){
            System.out.println("아이스아메리카노(디카페인)"+1);
        }
        System.out.println("커피 주문 완료 #3");


    }
}
