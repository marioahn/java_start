package loop;

public class While2_3 {

    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int endNum = 3;

        // 자 보자. i는 while문 안에서만 사용하는데, 전역변수로 되어있음
        // while문에서는 조건식에 선언이 안되므로 이렇게 써야하지만,
        // for문으로 바꾸면 for문 (condition)에 condition안에 사용하면 되니 더 깔끔해짐
        // 따라서, while문 사용해야만 하는 경우가 아니면
        // for문으로 하는게 더 굿 - 이런게 쌓이고 쌓여 최적화되는거다
        while (i<= endNum) {
            sum += 1;
            System.out.println(i);
            System.out.println(sum);
            i++;
        }
    }
}
