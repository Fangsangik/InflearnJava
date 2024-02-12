package chap3;

public class Operator6 {
    public static void main(String[] args) {
        //전위
        int a = 1;
        int b = 0;
        b = ++a; //a의 값을 증가 시키고 b에 대입
        System.out.println("a = " + a + " b = " + b);

        //후위
        a = 1;
        b = 0;
        b = a++; //a의 값을 b에 먼저 대입 하고 그 후에 a값 증가
        System.out.println("a = " + a + " b = " + b);
    }
}
