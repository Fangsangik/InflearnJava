package chap23.immutable;

public class PrimitiveMain {
    public static void main(String[] args) {
        //기본형은 절대로 값을 공유하지 X
        int a = 10;
        int b = a; // a -> b 복사 후 대입

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b = 20;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
