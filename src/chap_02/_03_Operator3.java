package chap_02;

import java.sql.SQLOutput;

public class _03_Operator3 {
    public static void main(String[] args){
        //비교 연산자
        System.out.println(5 > 3); // 5는 3보다 크다.(참이면  ture, 거짓이면 false)
        System.out.println(5 >= 3); // 5는 3보다 크거나 같다.(ture)
        System.out.println(5 >= 5); // 5는 5보다 크거나 같다.(ture)
        System.out.println(5 >= 7); // 5는 7보다 크거나 작다.(false)

        System.out.println(5 < 3); // (false)
        System.out.println(5 <= 3); // (false)

        System.out.println(5 == 5); // true
        System.out.println(5 == 3); // false
        System.out.println(5 != 5); // 5는 5와 같지 않다. false
        System.out.println(5 != 3); // 5는 3과 같지 않다. true

    }
}
