package chap_01;

public class _03_Variables {
    public static void main(String[] args){
        String name = "Resom";
        int hour = 15;

        System.out.println(name + "님 배송이 시작되었습니다" + hour + "시 방문예정입니다.");

        double score = 90.5;
        char grade = 'A';
        name = "Resom";
        System.out.println(name +"님의 평균 점수는" + score + "점입니다.");
        System.out.println("학점은" + grade + "입니다");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요?" + pass);

        double d =3.141123456789;
        float f = 3.14123456789F;
        System.out.println(d);
        System.out.println(f);

        Long L = 100000000000000000L;
        System.out.println(L);
        /*
        int 정수
        long 큰범위
        float 실수
        double 정밀한 소수점
        char 하나의 문자
        boolean 참/거짓
         */
    }
}
