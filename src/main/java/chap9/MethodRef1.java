package chap9;

public class MethodRef1 {
    public static void main(String[] args) {
        int sum = add(1, 3);
        int sum2 = add(3, 4);
        System.out.println("sum = " + sum);
        System.out.println("sum2 = " + sum2);
        //메서드만 호출 하고 결과 안받고 사용 가능
        add(1, 2);
    }

    public static int add(int a, int b) {
        System.out.println(a + " + " + b + " = " + "연산수행");
        int sum = a + b;
        return sum;
    }
}
