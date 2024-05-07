package method;

public class MethodValue1 {

    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("1. changeNumber 호출 전, num1: " + num1);
        changeNumber(num1);
        System.out.println("4. changeNumber 호출 후, num1: " + num1);
    }
    String teststr = "hi";

    public static void changeNumber(int num2) { 
        System.out.println("2. changeNumber 변경 전, num2: " + num2);
        num2 = num2 * 2;
        System.out.println("3. changeNumber 변경 후, num2: " + num2);
        String teststr = "h22";
        System.out.println(teststr);
    }

    int num3 = 1;
//    int num3 = 3; 이건 에러 같은 스코프안에 선언되어있기에
}
