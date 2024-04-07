package method.ex;

public class MethodEx1Ref {
    public static void main(String[] args) {
        System.out.println("평균값: " + average(1,2,3));
        System.out.println("평균값: " + average(15,25,35));
    }

    public static double average(int a, int b, int c) {
//        int sum = a + b + c;
//        return sum / 3.0;
        return (a+b+c)/3.0; // 이렇게 해도 되네 ㅇㅇ
    }
}