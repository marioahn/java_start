package cond;

public class Switch4 {

    public static void main(String[] args) {
        int grade = 2;

        int coupon = switch (grade) { // int coupon이 아래 case에서 결가값에 담김ㅇㅇ.
            // 새 버젼의 switch문! 편리해졌네
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default ->  500;
        };
        System.out.println("발급받은 쿠폰 " + coupon);
    }
}
