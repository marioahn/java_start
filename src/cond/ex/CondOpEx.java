package cond.ex;

public class CondOpEx {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int max = (a>b) ? a : b; // 삼항연산자로 max값! 오우야
        System.out.println("더 큰 숫자는 " + max + "입니다.");
    }
}
