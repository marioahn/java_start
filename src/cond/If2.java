package cond;

public class If2 {

    public static void main(String[] args) {
        int age = 20;

        if (age>=18) { // if문은 condition부분을 ( )로 감싸줘야 에러 안남
            System.out.println("성인");
        } else {
            System.out.println("미성년자");
        }
    }
}
