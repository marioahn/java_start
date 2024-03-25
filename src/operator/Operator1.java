package operator;

import java.util.Arrays;

public class Operator1 {

    public static void main(String[] args) {
        //변수 초기화
        int a = 5, b = 2;

        // 덧셈
        int sum = a + b;
        System.out.println("a + b = " + sum); //출력 a + b = 7

        // 뺄셈
        int diff = a - b;
        System.out.println("a - b = " + diff);

        // 곱셈
        int multi = a * b;
        System.out.println("a * b = " + multi);

        // 나눗셈: 2, int이기에 소숫점은 자동으로 날라감버림)
            // '//'가 없음 java는
        int div = a / b; // 이렇게 하면 그냥 자동으로 "몫"이 되긴 하네 ㅎㄷㄷ;
        System.out.println("a / b = " + div);
        

        // 나머지
        int mod = a % b;
        System.out.println("a % b = " + mod);
    }
}
