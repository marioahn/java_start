package array.ex;

import java.util.Scanner;

public class ArrayEx22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 아 이렇게 하면 되는구나. 배.열을 사용하면 됨 ㅇㅇ. java에서는
        // 입력과 동시에 배열에 담기
        int[] numbers = new int[5];
        for (int i=0; i<numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("출력: ");
        for (int i=numbers.length-1; i>=0; i--) {
            System.out.print(numbers[i]);
            if (i >= 1) {
                System.out.print(", ");
            }
        }
        
    }
}
