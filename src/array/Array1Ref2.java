package array;

public class Array1Ref2 {

    public static void main(String[] args) {
        int[] students; //배열 변수 선언
        students = new int[6]; //배열 생성

        //변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        //변수 값 사용 - 배열.length
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]);
        }
        /*
        학생1 점수: 90
        학생2 점수: 80
        학생3 점수: 70
        학생4 점수: 60
        학생5 점수: 50
        학생6 점수: 0*/

        // length!
        System.out.println(students.length); // 배열은 length만 쓰면 됨
        String str = "abc";
        System.out.println(str.length()); // 이 경우엔 ()써줘야 함
    }
}
