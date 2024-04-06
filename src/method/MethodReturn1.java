package method;

public class MethodReturn1 {

    public static void main(String[] args) {
        // 이렇게!
        boolean result = odd(2);
        System.out.println(result);
        boolean result2 = odd(1);
        System.out.println(result2);
    }
    public static boolean odd(int i) {
        if (i % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }
}
