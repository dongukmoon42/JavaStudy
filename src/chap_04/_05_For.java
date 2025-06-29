package chap_04;

public class _05_For {
    public static void main(String[] args) {
        // 반복문 For
        // 나고 매장
        System.out.println("어서오세요, 나코입니다.");
        //또다른 손님이 들어오면?
        System.out.println("어서오세요, 나코입니다.");
        System.out.println("어서오세요, 나코입니다.");
        System.out.println("어서오세요, 나코입니다.");
        System.out.println("어서오세요, 나코입니다.");
        // 만약 인사법이 바뀌거나, 매장 이름이 바뀌면 하나하나 다 바꿔야함

        // 반복문 사용 For
        //for (선언;조건;증감){ }
        for (int i = 0 ; i < 10 ; i++){
            // System.out.println("어서오세요 베이토피아입니다." + i);
            // System.out.println("환영합니다. 베이토피아입니다." + i);
            System.out.println("베이토피아입니다." + i);
        }


        // 짝수만 출력
        // 0, 2, 4 6, 8
        for (int i = 0 ; i < 10 ; i += 2){
            System.out.print(i);
        }

        System.out.println(); // 줄바꿈

        // 홀수만 출력
        // 1, 3, 5, 7, 9
        for (int i = 1 ; i < 10; i += 2 ){
            System.out.print(i);
        }

        System.out.println(); // 줄바꿈

        // 거꾸로 숫자
        for (int i = 5; i > 0; i-- ){
            System.out.print(i);
        }

        System.out.println(); // 줄바꿈

        // 1부터 10까지의 수들의 합
        // 1 + 2 + 3 ... + 10 = 55
        int sum = 0;
        for (int i = 1 ; i <= 10 ; i++ ){
            sum += i;
            System.out.println("현재까지 총합은 " + sum + "입니다.");
        }
        System.out.println("1부터 10까지의 모든 수의 총합은 " + sum + "입니다.");
    }
}
