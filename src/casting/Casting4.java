package casting;

public class Casting4 {

    public static void main(String[] args) {
        int div1 = 3 / 2;
        // 이것도 1값이 나오는건 앞에 div1변수가 int형이라서 그런게 아님
        // 그 이전에 3/2연산의 결과에서 이미 정해진것
        System.out.println("div1 = " + div1); //1

        double div2 = 3 / 2; // 이거 1.5가 아니라 1.0이 나온다;;;;
        // 와;; 그냥 double형으로 선.언한다고 되는게 아니구나
        // 같.은 타입의 연산결과는 같.은타입으로 나온.다.!
        // 따라서 (3.0) / 2  or 3/(2.0)이런식으로 ㅇㅇ
        // 이렇게 하면 작은타입은 -> 큰타입으로의 형변환이 되므로!(먹히는 개념)
        System.out.println("div2 = " + div2); //1.0

        double div5 = 3 / 2.0; // 1.5
        System.out.println("div5 = " + div5);

        double div3 = 3.0 / 2; // 이게 1.5가 나옴;;
        System.out.println("div3 = " + div3); //1.5

        double div4 = (double) 3 / 2;
        System.out.println("div4 = " + div4); //1.5

        int a = 3;
        int b = 2;
        double result = (double) a / b; // a가 double형이란 의미임 이건
        System.out.println("result = " + result); //1.5
    }
}
