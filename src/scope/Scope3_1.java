package scope;

public class Scope3_1 {

    public static void main(String[] args) {
        int m = 10;
        int temp = 0; // 이거는 if문 안에서만 사용하는데, 밖에 main()함수에 전역변수로 둘 이유가 1도 없음!
        if (m > 0) {
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}
