package method;

public class MethodReturn2 {

    public static void main(String[] args) {
        checkAge(10);
        checkAge(20);
    }

    // 아래처럼도 가능.
    public static void checkAge(int age) {
        if (age < 18) {
            System.out.println(age + "살, 미성년자는 출입이 불가능합니다.");
            return; // 이거 없으면? 미성년자인경우 아래 입장메세지도 떠버리겠지 ㅇㅇ else로 하거나 return으로 하거나!
        }

        System.out.println(age + "살, 입장하세요.");
    }
}
