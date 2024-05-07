package method.ex;

import java.util.Scanner;

public class MethodEx4 {

    public static void main(String[] args) {
        int balance = 0;
        Scanner scanner = new Scanner(System.in);

        // while문으로.
        while (true) {
            System.out.println("---------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("---------------------------------");
            System.out.print("선택: "); // ln이 아니므로 아래 choice랑 같은 줄에 써짐ㅇㅇ

            int choice = scanner.nextInt();
            int amount;
            // if문 대신에 switch문으로 case 1~4경우 해결

            switch (choice) {
                case 1:
                    System.out.print("입금액을 입력하세요: ");
                    amount = scanner.nextInt();
                    balance = deposit(balance, amount);
                    break;
                case 2:
                    System.out.print("출금액을 입력하세요: ");
                    amount = scanner.nextInt();
                    balance = withdraw(balance, amount);
                case 3:
                    System.out.println("현재 잔액: " + balance + "원");
                    break;
                case 4:
                    System.out.println("시스템을 종료합니다.");
                    return;
                default: // 1~4이외의 경우
                    System.out.println("올바른 선택이 아닙니다. 다시 선택해주세요.");
            }

        }

    }

    // main함수랑 동일선상에 있는 것들 ㅇㅇ
    public static int deposit(int balance, int amount) {
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
        return balance;
    }

    public static int withdraw(int balance, int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }

        return balance;
    }

}
