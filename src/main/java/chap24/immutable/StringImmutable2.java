package chap24.immutable;

public class StringImmutable2 {
    public static void main(String[] args) {
        String str = "hello";
        String str1 = str.concat("java");
        System.out.println("str = " + str);
        System.out.println("str1 = " + str1);
    }
}
