package chap24.method;

public class StringChangeMain1 {
    public static void main(String[] args) {
        String str = "Hello Java welcome to Java";

        System.out.println(str.substring(7));
        System.out.println(str.substring(7, 10));

        System.out.println(str.concat("!!!"));
        System.out.println(str.replace("Java", "World"));
        System.out.println(str.replaceFirst("Java", "World"));
    }
}
