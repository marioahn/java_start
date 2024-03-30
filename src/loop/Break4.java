package loop;

public class Break4 {
    public static void main(String[] args) {
        int sum = 0;

        int i;
        for (i = 1; ; i++) { // 조건식 안 넣어준 경우 - 아래에서 if문으로 넣어야 함
            sum = sum + i;
            System.out.println("음~");
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료: i=" + i + " sum=" + sum);
                break;
            }
        }

        i = 100;
        System.out.println(("new i: " + i));
    }
}
