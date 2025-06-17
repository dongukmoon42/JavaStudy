package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        //득수 문자 , 이스케이프 문자
        // \\n \t \\ \" \'
        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재밌어요");

        // \n : 줄바꿈
        System.out.println("자바가\n너무\n재밌어요");

        // \t : 탭
        //해물파전      9000원
        //김치전       8000원
        //부추전       8000원
        System.out.println("해문파전\t\t9000원");
        System.out.println("김치전\t\t8000원");
        System.out.println("부추전\t\t8000원");

        // \\ : 역슬래시
        System.out.println("C:\\ProgramFiles\\Java");

        // \" : 큰 따옴표
        // 단비가 "냐옹" 이라고 했어요
        System.out.println("단비가 \"냐옹\" 이라고 했어요");

        // \' : 작은 따옴표
        char c = 'A';
        c = '\'';

        System.out.println(c);

    }
}
