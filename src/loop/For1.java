package loop;

public class For1 {

    public static void main(String[] args) {
        // js처럼 -> 초기식; 조건식; 증감식
        int i; int sum;
        sum = 0;
        for (i=1; i<5; i++) {
            sum += i;
            System.out.println("i: " + i);
            System.out.println("sum: " + sum);
        }
    }
}
