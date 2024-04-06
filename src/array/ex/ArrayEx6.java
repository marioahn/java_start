package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
        
    public static void main(String[] args) {
        // 가장 큰수, 작은수 찾기
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력 받을 숫자의 개수를 입력하세요:");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        int minNumber, maxNumber; // 이렇게 선언만 및 여러개 선언 ㅇㅇ, int각각 안 붙여도 되네

        System.out.println(n + "개의 정수를 입력하세요:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        minNumber = maxNumber = numbers[0]; // 먼저 maxN에 초기값이 담기고, 그게 또 minN에 담김. 이게 순서
        // 근데 위처럼은 잘 사용하지는 않음
        for (int i = 1; i < n; i++) {
            if (numbers[i] < minNumber) {
                minNumber = numbers[i];
            }
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }

        System.out.println("가장 작은 정수: " + minNumber);
        System.out.println("가장 큰 정수: " + maxNumber);
    }
}
