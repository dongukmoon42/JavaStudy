package chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {
        // 배열을 활용하여 쇼핑몰에서 구매 가능한 신발 사이즈 옵션을
        // 출력하는 프로그램을 작성하시오

        /*
        [조건]
        - 신발 사이즈는 250 부터 295 까지 5단위로 증가
        - 신발 사이즈 수는 총 10가지
         */

        // 나의 답변
        String[] shoes = new String[300];
        for (int i = 250; i < shoes.length; i+=5) {
            System.out.println("사이즈"+i+"(재고 있음)");
        }

        // 선생의 답변
        int[] sizeArry = new int[10];
        for (int i = 0; i < sizeArry.length; i++) {
            sizeArry[i] = 250 + (5 * i);
        }
        for (int size: sizeArry){
            System.out.println("사이즈" + size + "(재고있음)");
        }
    }
}
