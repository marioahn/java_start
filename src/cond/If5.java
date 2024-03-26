package cond;

public class If5 {
    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0;

        if (price >= 10000) {
            System.out.println("10000원 이상 구매, 1000원 할인");
        }

        if (age <= 10) {
            discount += 1000;
            System.out.println(("어린이 1000원 할인"));
        }
        System.out.println("총할인금액: " + discount + "원");
        // 결과가 한줄이면 중괄호 빼도 됨 - 즉, if문 다음에 실행할 명령이 하나만 있는 경우
        // 근데, 가독성 측면에서 걍 쓰는게 나음 -> 써.라.
        if (true) System.out.println("오~실행되네");
    }
}
