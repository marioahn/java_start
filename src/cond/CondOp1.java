package cond;

public class CondOp1 {

    public static void main(String[] args) {
        int age = 18;
        String status; // 이렇게 변수 선언. String!
        if (age >= 18) {
            status = "성인";
        } else {
            status = "미성년자";
        }
        System.out.println("age = " + age + " status = " + status);
    }
}
