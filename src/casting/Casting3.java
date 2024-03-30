package casting;

public class    Casting3 {

    public static void main(String[] args) {
        long maxIntValue = 2147483647; //int 최고값 - int로는 이 값까지만 가능
        // long maxIntValue = 2147483648; // Integer number too large에러!
            // 따라서, 아래처럼 L붙여야 함 - long타입지정한다고 ok가 아님.
        long maxIntOver = 2147483648L; //int 최고값 + 1(초과)
        int intValue = 0;

        intValue = (int) maxIntValue; //형변환
        System.out.println("maxIntValue casting=" + intValue);

        intValue = (int) maxIntOver; //형변환
        // 만약, int형으로 바꾼다고 하면? 214748364'8'은 범위 초과이므로 -가 붙게 된다 ㄷㄷ;;
            // 이걸 = overflow라고 한다. 즉, 제일 작은범위부터 다시 시작하는것.
        System.out.println("maxIntOver casting=" + intValue);
    }
}
