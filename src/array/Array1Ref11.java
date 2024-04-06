package array;

public class Array1Ref11 {
    public static void main(String[] args) {
        int[] students; // 배열 변수 선언
        students = new int[5]; // int가 5개 있는 리스트 ㅇㅇ.

        students[0] = 91;
        students[1] = 92;
        students[2] = 93;
        students[3] = 94;
        students[4] = 95;

        System.out.println(students); // [I@b4c966a -> b4c966a가 students메모리의 참조값이다 
    }
}
