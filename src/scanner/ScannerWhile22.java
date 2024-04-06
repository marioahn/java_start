package scanner;

import java.util.Scanner;

public class ScannerWhile22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("상품의 가격 입력하기");
            int price = scanner.nextInt();

            if (price== -1) {
                System.out.println("프로그램 종료");
                break;
            }
            System.out.println("구매량");
            int quantity = scanner.nextInt();
            System.out.println("총비용: " + price*quantity);
        }
    }
}
