package chap3;

public class Operator2 {
    public static void main(String[] args) {
        String rst = "hello" + "world";
        System.out.println("rst = " + rst);

        String s = "String1";
        String s2 = "String2";
        String rst1 = s + s2;
        System.out.println("rst1 = " + rst1);

        String rst3 = "a + b = " + 18;
        System.out.println("rst3 = " + rst3);

        int num = 20;
        String str = "a + b =";
        String rst4 = str + num;
        System.out.println("rst4 = " + rst4);
    }
}
