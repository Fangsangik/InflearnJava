package chap3;

public class Operator1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        int sum = a + b;
        System.out.println("a + b =" + sum);

        int diff = a - b;
        System.out.println("a - b =" + diff);

        int multi = a * b;
        System.out.println("a * b = " + multi);

        //int형 끼리 계산은 int로 출력
        int div = a - b;
        System.out.println("a / b =" + div);

        int mod = a % b;
        System.out.println("a % b =" + mod);
    }
}
