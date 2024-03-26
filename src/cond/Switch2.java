package cond;

public class Switch2 {

    public static void main(String[] args) {
        int grade = 2;

        int coupon;
        // switch문은 항.상 break 꼭 넣어줘야함! (default빼고)
        switch (grade) {
            // case (grade <=1): // 이거 에러. case에는 조건식(불린값반환)은 can't
            case 1:
                coupon = 1000;
                break;
            case 2:
                coupon = 2000;
                break; // 만약, 여기서 break가 없으면 case 2인경우엔 -> 그 다음인 case 3으로 넘어가버림
                // 이상..해보이지만 진실이야.
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
                // break; 마지막 default는 break x
        }
        System.out.println("발급받은 쿠폰 " + coupon);
    }
}
