package loop;

public class Break2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        // 초기식,조건식,증감식 모.두 선택이다. 다만, ;는 유지시켜야 한다
        for (; ; ) { // == while (true) {} 랑 같음
            sum = sum + i;
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료: i=" + i + " sum=" + sum);
                break;
            }
            i++;
        }
    }
}
