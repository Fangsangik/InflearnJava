package chap3;

public class Comp1 {
    public static void main(String[] args) {
        String str1 = "문자열1";
        String str2 = "문자열2";

        boolean rst1 = "hello".equals("hello");
        boolean rst2 = str1.equals("문자열1");
        boolean rst3 = str1.equals(str2);

        System.out.println("rst3 = " + rst3);
        System.out.println("rst2 = " + rst2);
        System.out.println("rst1 = " + rst1);
    }
}
