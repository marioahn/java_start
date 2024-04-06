package array.ex;

import java.util.Scanner;

public class ArrayEx77 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] scores = new int[4][3];
        String[] subjects = {"국어", "영어", "수학"}; // 이렇게 하면 string이 담긴 배열!

        for (int i=0; i<4; i++) {
            System.out.println((i+1) + "번 학생의 성적");
            for (int j=0; j<3; j++) {
                System.out.println(subjects[j] + "의 점수");
                scores[i][j] = scanner.nextInt();
            }
        }

        for (int i=0; i<4; i++) {
            int total = 0;
            for (int j=0; j<3; j++) {
                total += scores[i][j];
            }
            double avg = total / 3.0; // 3.0하면 double안써도 되겠지!
            System.out.println((i+1) + "번 학생의 평균" + avg);
        }

    }
}
