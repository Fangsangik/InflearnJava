package chap3;

public class Comp1 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a <= b);
        System.out.println(a >= b);

        //boolean 결과를 변수에 담을 수 있다.
        boolean rst = a == b;
        System.out.println(rst);
    }
}
