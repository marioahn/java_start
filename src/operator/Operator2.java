package operator;

public class Operator2 {

    public static void main(String[] args) {

        //문자열과 문자열 더하기1
        String result1 = "hello " + "world";
        System.out.println(result1);

        //문자열과 문자열 더하기2
        String s1 = "string1";
        String s2 = "string2";
        String result2 = s1 + s2;
        System.out.println(result2);

        //문자열과 숫자 더하기1 -> 숫자가 문자화로 자동형변환돼서 합쳐지게 됨(not 에러)
        String result3 = "a + b = " + 10;
        System.out.println(result3);
    }
}