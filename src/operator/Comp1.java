package operator;

public class Comp1 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);

        //결과를 boolean 변수에 담을
        boolean result = a == b; // 엥?ㅋㅋ이런 형식도 되네 - python도 됨ㅋㅋㅋㅋ
                        // (a==b) 하는게 더 가독성 좋긴 함
        System.out.println(result);
    }
}
