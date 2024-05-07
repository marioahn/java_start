package method;

public class Overloading3 {

    public static void main(String[] args) {
        System.out.println("1: " + add(1,2));
        System.out.println("2: " + add(1.2, 1.5));
    }

    // 반환타입 다르므로 두개는 다른 것 -> ㄴㄴ그게 아니라
    // 매개변.수의 반환타입이 다르기 때문임. 아래 double add는 같은 걸로 취급돼서 에러남 ㅇㅇ.
//    public static double add(int a, int b) {
//        System.out.println("1번 호출");
//        return a + b;
//    }
    public static int add(int a, int b) {
        System.out.println("1번 호출");
        return a + b;
    }

    public static double add(double a, double b) {
        System.out.println("2번 호출");
        return a + b;
    }
}
