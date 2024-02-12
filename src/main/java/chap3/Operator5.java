package chap3;

public class Operator5 {
    public static void main(String[] args) {
        int a = 0;
        a = a + 1;
        System.out.println("a = " + a);

        //a가 이미 1이 들어가있다
        a = a + 1;
        System.out.println("a = " + a);

        //증감 연산자
        ++a; // a = a + 1
        System.out.println("a = " + a);
        ++a; // a = a+ 1
        System.out.println("a = " + a);
    }
}
