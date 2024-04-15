package chap24.lang;

public class StringConcatMain {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "Java";

        String rst1 = a.concat(b);
        String rst2 = a + b;

        System.out.println("rst1 = " + rst1);
        System.out.println("rst2 = " + rst2);
    }
}
