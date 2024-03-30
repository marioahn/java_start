package cond;

public class CondOp2 {

    public static void main(String[] args) {
        int age = 18;
        // 삼.항.연.산.자! - js랑 똑같네 이건
        String status = (age >= 18) ? "성인" : "미성년자";
        System.out.println("age = " + age + " status = " + status);
    }
}
