package loop.ex;

public class ForEx23 {

    public static void main(String[] args) {
        // 와 java는 이런식으로 초기식에 2개를 넣을 수도 있네?!!!!
        // 다.만 깔끔하고 가독성이 좋은가? -> 그건 아님 by 김영한
        // 따라서, 걍 일반적으로 1개만 써주는게 좋아보이긴 함
        for (int num=2, count=1; count<=10; num+=2, count+=1) {
            System.out.println(num);
        }
//        for (int num = 2, count = 1; count <= 10; num += 2, count++) {
//            System.out.println(num);
//        }
    }
}
