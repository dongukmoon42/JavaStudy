package chap_05;

public class _04_MultiArrayLoop {
    public static void main(String[] args) {
        // 다차원 배열 순회
        String[][] seats = new String[][] {
                {"A1","A2","A3","A4","A5"},
                {"B1","B2","B3","B4","B5"},
                {"C1","C2","C3","C4","C5"}
        };

        for (int i = 0; i < 3; i++) { // 세로
            for (int j = 0; j < 5; j++) { //가로
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("----------------------");

        String[][] seats2 = {
                {"A1","A2","A3",},
                {"B1","B2","B3","B4"},
                {"C1","C2","C3","C4","C5"}
        };
        for (int i = 0; i < seats2.length; i++) { // 세로
            for (int j = 0; j < seats2[i].length; j++) { //가로
                System.out.print(seats2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("===================");

        // 세로 크기 10 카로 15 영화관
        String[][] seats3 = new String[10][15];
        String[] eng = {"A", "B", "C","D","E", "F","G","H","I","J"};
        for (int i = 0; i < seats3.length; i++) { //세로
            for (int j = 0; j < seats3[i].length; j++) { // 가로
                seats3[i][j] = eng[i] + (j + 1);
            }
        }
        // 표 구매 (H9 H10)
        seats3[7][8] = "--";
        seats3[7][9] = "---";


        // 영화관 좌석 확인
        for (int i = 0; i < seats3.length; i++) { // 세로
            for (int j = 0; j < seats3[i].length; j++) { //가로
                System.out.print(seats3[i][j] + " ");
            }
            System.out.println();
        }

    }
}
