package array;

public class ArrayDi00 {
    public static void main(String[] args) {
        // Di= dimension 차원
        // int[][] arr = new int[2][3]; // 행2, 열3
        int[][] arr = {
                {1, 2, 3, 4, 5}, // 2차원행렬이라 해도 실.제행렬은 아니니까 이렇게 해도 ㅇㅋ. 본뜬거니까 뭐..
                {4,5,6}
        };
        /*
        1 2 3 4 5
        4 5 6
            */
        for (int row=0; row<arr.length; row++) {
            for (int column=0; column<arr[row].length; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println(); // 한 행이 끝나면 라인을 변경
        }
    }
}
