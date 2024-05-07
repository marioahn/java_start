package method;

public class Overloading2 {

    public static void main(String[] args) {
        myMethod(1, 1.2);
        myMethod(1.2, 1);
    }

    // 이렇게 하면 다르게 호출됨. 매개변.수의 순서도 지켜지는 듯 굿굿;;
    // 아래 두 함수는 다.른.것.취급!
    public static void myMethod(int a, double b) {
        System.out.println("int a, double b");
    }

    public static void myMethod(double a, int b) {
        System.out.println("double a, int b");
    }
}
