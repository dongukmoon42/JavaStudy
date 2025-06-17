package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        // 민증 번호 13자리의 숫자로 구성
        // 앞 6자리는 생년월일 정보, 뒷 7자리 중 첫번째 숫자는 성별 정보
        // 입력 데이터는 - 을 포함한 14자리의 문자열 형태

        String id = "901231-1234567";
        System.out.println(id.substring(0, 8));
        // 0위치부터 8위치 직전까지

        id = "030708-4567890";
        System.out.println(id.substring(0,id.indexOf("-") + 2));
        // 0위치부터 하이폰 위치 + 2 직전까지

    }
}
