package chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        //반복문 Do While
        int distance = 25;
        int move = 0;
        int height = 2;
        while (move + height < distance){
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동거리 : " + move);
            move += 3; //3m이동
        }
        System.out.println("도착했습니다.");

        // 키가 엄청나게 큰사람?
        move = 0;
        height = 25;
        while (move + height < distance){
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동거리 : " + move);
            move += 3; //3m이동
        }
        System.out.println("도착했습니다.");


        System.out.println("======반복문#2======");
        // Do While 반복문
        /*
        do {

        }while (조건)
            */
        do {
            System.out.println("발차기를 계속합니다.");
            System.out.println("현재 이동거리 : " + move);
            move += 3;
        }while (move + height < distance);
        System.out.println("도착했습니다.");
        //적어도 1번은 수행

    }
}
