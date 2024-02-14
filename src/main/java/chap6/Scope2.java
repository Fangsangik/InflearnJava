package chap6;

public class Scope2 {
    public static void main(String[] args) {
        int m = 10;
        for (int i = 0; i < 2; i++) {
            System.out.println("for m = " + m);
            System.out.println("for i = " + i);
        }// i 생존 끝

        //System.out.println("i` = " + i); -> i 접근 불가능
        System.out.println("main m = " + m);
    }
}
