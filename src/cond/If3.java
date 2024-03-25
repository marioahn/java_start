package cond;

public class If3 {

    public static void main(String[] args) {
        int age = 14;

        // else if 안 쓰고 if문 ㅇㅇ
        // 근데 이 if문은 모-든 if문을 검사하게 됨 -> 비효율적임
        // else if를 쓰면 한 조건만 검사하고 넘어감ㅇㅇ!
        if (age <= 7) {
            System.out.println("미취학");
        }
        if (age >= 8 && age <= 13) {
            System.out.println("초등학생");
        }
        if (age >= 14 && age <= 16) {
            System.out.println("중학생");
        }
        if (age >= 17 && age <= 19) {
            System.out.println("고등학생");
        }
        if (age >= 20) {
            System.out.println("성인");
        }
    }
}
