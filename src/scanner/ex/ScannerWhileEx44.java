package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalCast = 0;

        while (true) {
            System.out.println("1. 상품입력, 2. 결제, 3. 프로그램 종료");
            int option = scanner.nextInt(); // 숫자치고 엔터하면 사실상 1\n이다. 아래에서 nextLine을 해줘야 에러안남
            
            if (option == 1) {
                scanner.nextLine(); // 해줘야함! - \n을 처리하고 다음 라인부터 아래 값들을 계속 입력해줘야 하므로

                System.out.println("상품명을 입력");
                String product = scanner.nextLine();

                System.out.println("상품가격을 입력");
                int price = scanner.nextInt();

                System.out.println("구매수량을 입력");
                int quantity = scanner.nextInt();

                totalCast += price*quantity;
                System.out.println("상품명:" + product + "가격:" + price + "수량: " + quantity);

            } else if (option == 2) {
                System.out.println("결제");
                System.out.println(totalCast);
                totalCast = 0; // 결제 끝나면 초기화시켜야지
            } else {
                System.out.println("프로그램을 종료합니다");
                break;
            }
        }
    }
}
