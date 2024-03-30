package loop;

public class Continue1 {
    // continue는 다.음."조건"식으로 이동
    // break가 반복문을 아예 종료시켜버리는 것이라면
    // continue는 지금 과정을 건너뛰고 다음 과정(반복문의)으로 ㄱㄱ
    public static void main(String[] args) {
        int i = 1;

        while(i <= 5) {
            if (i == 3) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
