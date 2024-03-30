package casting;

public class Casting1 {

    public static void main(String[] args) {
        // 아래 예시처럼, 작은->큰값 전환은 자.동형변환이기 때문에 따로 머 할 필요없음
        // 알아서 해줌 = 자동형변환 = 묵시적형변환 <-> 명시적 형변환
        int intValue = 10;
        long longValue;
        double doubleValue; // int < long < double double이 여기서 젤 큼

        longValue = intValue; //int -> long
        System.out.println("longValue = " + longValue);

        doubleValue = intValue; //int -> double
        // double 실수형이니까 10.0이 됨
        System.out.println("doubleValue = " + doubleValue);

        // long형은 L이 붙음 -> 쨋든 double화 -> 20.0
        doubleValue = 200000000000L; //long -> double
        // 2.0E11 -> 2.0* (10**11) 라는 뜻!
        System.out.println("doubleValue2 = " + doubleValue);
    }
}
