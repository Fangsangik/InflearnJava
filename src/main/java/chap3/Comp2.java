package chap3;

public class Comp2 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Good Bye";

        boolean rst1 = "hello".equals(str1);
        boolean rst2 = str1.equals(str2);
        boolean rst3 = str1.equals("byebye");

        System.out.println("rst1 = " + rst1);
        System.out.println("rst2 = " + rst2);
        System.out.println("rst3 = " + rst3);
    }
}
