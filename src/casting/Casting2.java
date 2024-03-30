package casting;

public class Casting2 {

    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

        //intValue = doubleValue; //컴파일 오류 발생: 생각해보셈 버림되니까 1.5->1되는데 0.5가 없으면 안되잖아! 데이터 누실
        // 이러한 컴파일 오류는 문제를 가장 빨리 발견 가능함! 진짜 컴파일 오류 없으면 절대 안되는 그런ㅇㅇ.
        // 에러라고 기피 ㄴㄴ 감사히 여기도록!
        intValue = (int) doubleValue; ///형변환 - 직.접 변환함수 넣어줌
        // = 명시적 형변환 = 직접 변환함수 써줌
        // 단, 파이썬처럼 int(10.5)가 아니라, (int)10.5임
        System.out.println(intValue);
        System.out.println((int)10.5);
    }
}
