package chap2;

public class Var5 {
    public static void main(String[] args) {
        //변수 선언 동시에 초기화
        int a = 1;
        System.out.println(a);

        //변수 선언 초기화 따로
        int b;
        b = 1;
        System.out.println(b);

        int c = 3, d = 4; //여러 변수 동시 초기화 & 선언 동시
        System.out.println(c);
        System.out.println(d);
    }
}
