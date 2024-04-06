package array;

public class Array1Ref4 {

    public static void main(String[] args) {
/*
        여기에서 아래처럼 한 줄로!
        int[] students; //배열 변수 선언
        students = new int[5]; //배열 생성
        // 값 직접 대입

        단, int[] students;
        students = {90,80,50}; 이런식으로는 안됨
*/

        int[] students = {90, 80, 70, 60, 50};
        // 아예 이렇게 선언!

        //변수 값 사용
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]);
        }
    }
}
