package scanner;

import java.util.Scanner;

public class ScannerWhile33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자 입력하세요. -1하면 중단됩니다");

        int sum = 0;
        int cnt = 0;
        double avg = 0;
        int input = 0;
/*        while (true) {
            int num = scanner.nextInt();

            if (num == -1) {
                break;
            }
            sum += num;
            cnt++;
        }*/
        // 이걸 아래처럼 하면 더 쉽게 줄여짐
        while ((input = scanner.nextInt()) != -1) {
            sum += input;
            cnt++;
        }

        avg = sum / cnt; // 이렇게 하면 소숫점 다 날라감
        double average = (double) sum / cnt;
        System.out.println(sum);
        System.out.println(avg);
        System.out.println(average);
    }
}
