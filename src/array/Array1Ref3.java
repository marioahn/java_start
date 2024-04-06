package array;

public class Array1Ref3 {

    public static void main(String[] args) {
        int[] students; //배열 변수 선언
        // 이렇게 초기값 넣어줄 수 있음
            //students new int[5] 대신에 // {}안에 넣네 ㄷㄷ
        students = new int[]{90, 80, 70, 60, 50}; //배열 생성과 초기화}

        //변수 값 사용
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]);
        }
    }
}
