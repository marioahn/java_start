package loop;

public class DoWhile2 {

    public static void main(String[] args) {
        int i = 10;
        // do-while문: 조.건.을 처음부터 만족하지 않아도,
        // 무조건 처음 한번은 출력하고 싶을 때
        // do { 내용 } while (조건); 이게 끝이네
            // while은 {}필요 없고
        // 정리하면: 일단 do-안을 실행하고, .그 다음에 while문 가서,
            // 조건 만족하면 do내용 반복하고, 아니면 cut
        do {
            System.out.println("현재숫자" + i);
             i++;
        } while (i<3);
    }
}
