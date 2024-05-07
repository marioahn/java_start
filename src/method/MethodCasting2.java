package method;

public class MethodCasting2 {

    public static void main(String[] args) {
        int number = 100;
        printNumber(number);
    }

    // 이건 문제가 없는게, 더 큰 범위로 바꾸는거니까 ok임 자동형변환 o!
    // Casting1은 더 작은 범위로 바꾸려 해서 안됐던거고
    public static void printNumber(double n) {
        System.out.println("숫자: " + n);
    }

    /*
    - 즉, 메서드를 호출할 때는 전달하는 인수의 타입과 매개변수의 타입이 맞아야 한다
    - 단, 타입이 달라도 자동형변.환이 가능. 한 경우에는 호출 가능!
    */

}
