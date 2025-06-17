package chap_05;

public class _05_ASCII {
    public static void main(String[] args) {
        // 아스키 코드 (ANSI)
        char c = 'A'; // 알파벳 대문자 (A)는
        System.out.println(c);
        System.out.println((int)c);

        c='B';
        System.out.println(c);
        System.out.println((int)c);

        c++;
        System.out.println(c);
        System.out.println((int)c);

        // 세로 크기 10 카로 15 영화관 [아스키코드 버전]
        String[][] seats3 = new String[10][15];
        char ch = 'A';
        for (int i = 0; i < seats3.length; i++) { //세로
            for (int j = 0; j < seats3[i].length; j++) { // 가로
                seats3[i][j] = String.valueOf(ch) + (j + 1);
            }
            ch++;
        }
        for (int i = 0; i < seats3.length; i++) { // 세로
            for (int j = 0; j < seats3[i].length; j++) { //가로
                System.out.print(seats3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
