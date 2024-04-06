package array;

public class EnhancedFor11 {
    public static void main(String[] args) {
        //  향상된 포문
        int[] numbers = {1, 2, 3, 4, 5};

        //  일반 포문
        for (int i=0; i<numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // 향상된 포문 = for-each문이라고도 함 - ㄹㅇ개편하네
        // 걍 파이썬 포문같은거네. 혹은 js의 for-in문 
        for (int number: numbers) { // :왼편에는 개별변수, 오른편에는 탐색할 배열을 놓는다
            System.out.println(number);
        }

        // 단, 증가하는 idx값이 필요할 떄는 for-each문을 사용할 수 없다 ㅠ
            // 파이썬에서도 for ele in arr1 하는 반면에,  idx필요하면 걍 for i in range(len(arr1)) 이렇게 하잖아
            // 사용x라기보단 걍 기본 포문 사용하는게 편하고 가독성도 좋지 뭐
    }
}
