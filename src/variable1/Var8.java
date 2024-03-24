package variable1;

public class Var8 {
    public static void main(String[] args) {
        byte a = 127; // -~128-127
        // byte a2 = 128; // 에러
        short s = 32767;
        long i = 2222211112L; // long은 L붙여야함

        float f1 = 10.1f; // float는 끝에 f붙여야함 & 실무에선 사용거의X(소수점계산 오류 많이 나서 double씀)
        double f2 = 10.5; // f필요없음, float보다 정밀도 높고, 더 큰 범위 수 가능
        String javakign = "hi";
        System.out.println("javakign = " + javakign);
        String a1 = "Hi";
    }
}
