package chap24.immutable;

public class StringImmutable1 {
    public static void main(String[] args) {
        String str = "hello";
        str.concat("Java");
        System.out.println("str = " + str);
    }
}
