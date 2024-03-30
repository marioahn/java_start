package scope;

public class Scope1 {

    // 자바의  변수 생.존.범.위는 {}가 기준이다
    // 변.수의 접.근 가능 범위를 스코프({})라고 한다
    public static void main(String[] args) {
        int m = 10; //m 생존 시작
        if (true) {
            int x = 20; //x 생존 시작
            System.out.println("if m = " + m);
            System.out.println("if x = " + x);
        } //x 생존 종료
        //System.out.println("main x = " + x); // 에러
        System.out.println("main m = " + m);
    } //m 생존 종료
}
