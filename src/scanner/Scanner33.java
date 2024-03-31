package scanner;

import java.util.Scanner;

public class Scanner33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        
        if (num1 > num2) {
            System.out.println("num1이 커" + num1);
        } else if (num1 < num2) {
            System.out.println("num2가 커 " + num2);
        } else {
            System.out.println("둘다 같아");
        }


    }
}
