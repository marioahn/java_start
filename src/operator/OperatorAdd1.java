package operator;

public class OperatorAdd1 {

    public static void main(String[] args) {
        int a = 0;

        a = a + 1;
        System.out.println("a = " + a); //1

        a = a + 1;
        System.out.println("a = " + a); //2

        //증감 연산자
        ++a; // a++이 아니구나
        a++; // 아니네 이것도 되네

        System.out.println("a = " + a); //3
        a += 1;
        System.out.println("a = " + a); //4

    }
}
