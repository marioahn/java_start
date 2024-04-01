package scanner;

import java.util.Scanner;

public class ScannerWhile1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("문자열을 입력: "); // print하면 아래랑 한 줄에 ㅇㅇ
            String str = scanner.nextLine();
            if (str.equals("exit")) {
                System.out.println("종료");
                break;
            }
            System.out.println("입력: " + str);
        }
    }
}
