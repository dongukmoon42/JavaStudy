package chap_06;

public class _03_Return {
    // 호텔 전화번호
    public static String getPhoneNumber() {
        String phoneNumber = "02-1234-1234";
        return phoneNumber;
    }

    // 호텔 주소
    public static String getAddress(){
        return "서울시 어딘가";
    }

    // 호텔 엑티비티
    public static String getAct(){
        return "당구장, 볼링장, 카지노";

    }


    public static void main(String[] args) { //void= 반환값이 없다는 뜻
        // 반환값, return
        String contactNumber = getPhoneNumber();
        System.out.println("호텧 전화번호:" + contactNumber);

        String address = getAddress();
        System.out.println("호텔 주소:" + address);

        System.out.println("호텔 엑티비티:" + getAct());
    }
}
