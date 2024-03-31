package scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Scanner11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("hello\n"); // == println("hello")

        // System.out.println("문자열을 입력하세요: ");
        System.out.print("문자열을 입력하세요: "); // 이건 한 줄에 ㅇㅇ.
        String str = scanner.nextLine(); // 입ㄹ겨을 String으로 가져온다
        System.out.println("입력한 문자열: " + str);

        int intValue = scanner.nextInt(); // line이 string이고,정수입력은 nextInt
        System.out.println(intValue);

        double doubleValue = scanner.nextDouble(); // double은 nextDouble();
        System.out.println(doubleValue);

    }
}
