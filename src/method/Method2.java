package method;

public class Method2 {

    public static void main(String[] args) {
        printHeader();
        System.out.println("시스템 동작중");
        printFooter();
    }
    public static void printHeader() { // 매개변수 없는 함수
        System.out.println("=프로그램 시작=");
    }
    
    // 참고로 함수는 꼭 return 넣어야 하는데, void인 경우만. return 생략 가능
    public static void printFooter() { // 또한 반환타입없으면 return 없으면 void써야함
        System.out.println("프로그램 종료!");
    }
    public static int testReturn() { // 또한 반환타입없으면 return 없으면 void써야함
        System.out.println("ok!?");
        return 1; // 이거 없으면 에러
    }
}
