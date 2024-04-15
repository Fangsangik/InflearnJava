package chap24.equals;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String str1 = new String("Hello");
        String str2 = new String("Hello");

        System.out.println("equals 비교 = " + (str1.equals(str2)));
        System.out.println("== 비교 = " + (str1 == str2));


        System.out.println("리터럴 비교");
        String str3 = "Hello";
        String str4 = "Hello";

        System.out.println("equals 비교 = " + (str3.equals(str4)));
        System.out.println("== 비교 = " + (str3 == str4));
    }
}
