package loop.ex;

public class NestedEx2 {
    public static void main(String[] args) {
        // ln은 다.음 라인으로 넘긴다는 뜻
        System.out.println("hi1");
        System.out.print("hi2");
        System.out.println("hi3");
//        hi1
//        hi2hi3
        System.out.println();
        int rows = 3;
        for (int i=1;  i<=rows; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
