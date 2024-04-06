package array;

public class ArrayDi4 {

    public static void main(String[] args) {
        // 2x3 2차원 배열을 만든다.
        int[][] arr = new int[10][10];

        // 이렇게 하면 일일이 다 값 입력 안해도 들어가네 편하군
        int i = 1;
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] = i++; // 어우 증감과 할당을 동시에 했네 ㄴㄴ, 아님 할당 후 증감임
//                arr[row][column] = ++i; // 단, 이건 증감먼저 한 후에, 할당이고 위는 할당 후 증감임
            }
        }

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();//한 행이 끝나면 라인을 변경한다.
        }
    }
}
