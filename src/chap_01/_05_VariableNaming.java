package chap_01;

public class _05_VariableNaming {
    public static void main(String[] args){
        /*
        [변수 이름 짓는 법]
        1. 저장할 값에 어울리는 이름
        2. 밑줄(__), 문자(abc), 숫자(123) 사용가능 (공백사용불가)
        3. 밑줄 또는 문자로 시작 가능
        4. 한단어 또는 2개 이상 단어의 연속
        5. 소문자로 시작, 각 단어의 시작 글자는 대문자 (첫 단어는 제외)
        6. 예약어 사용 불가(public, static, void, int, double, float, ...
         */

        // 입국 신고서 (여행)
        String nationality = "대한민국"; //국적
        String firstName = "동욱"; //이름
        String lastName = "문"; //성
        String dateOfBrith = "2002-01-02"; //생년월일
        String residentialAddress = "UN호텔"; //체류지
        String purposeOfVisit = "관광"; //입국목적
        String flightNo = "UN253"; //항공편명

        int accompany = 2; // 동반 가족 수
        int lengthOfStay = 5; //체류기간

        String item1 = "시계";
        String item2 = "가방";
        //String 3item = "전자제품" ;


        //프로그램의 흐름을위해 필요한 경우 등(이름중요치 않을때)
        int i = 0;
        String s = "";
        String str = "";

        //절대 변하지 않는 상수는 대문자로
        final String CODE ="KR";




    }
}
