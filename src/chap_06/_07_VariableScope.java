package chap_06;

public class _07_VariableScope {
    public static void methodA(){
        //System.out.println(number);
    }

    public static void methodB(){
        int result =1; // 지역 변수
    }

    public static void main(String[] args) {
        int number = 3; // 지역 변수
        //System.out.println(result);

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            // i 도 지역 변수
        }
        // System.out.println(i);
        // { } 안에서 만든 변수는 { } 안에서만 사용가능함.

    }
}
