package method;

public class Method1Ref {

    public static void main(String[] args) {
        //계산1
        int sum1 = add(5, 10);
        System.out.println("결과1 출력: " + sum1);

        //계산2
        int sum2 = add(15, 20);
        System.out.println("결과2 출력:" + sum2);

        int sum3 = add(20,20);
        System.out.println(sum3);
    }

    //add 메서드
    // public: 다른 클래스에서 호출할 수 있는 메서드 - 객체제어 부분에서 다룸
    // static: 객체를 생성치 않고 호출할 수 있는 정.적 메서드라는 뜻 - static
    // 쨋든, public, static 이 둘을 이용해서 메서드를 만든다는 것
    
    // 매개변수 vs 인수 -> 자바에서는 엄밀히 말하면 다른 것임ㅇㅇ
    public static int add(int a, int b) { // 이렇게 함수
        System.out.println("a+b 연산 수행");
        int sum = a+b;
        return sum;
    }
}
