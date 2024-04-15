package chap24.equals;

public class StringEqualsMain2 {
    public static void main(String[] args) {
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        System.out.println("메서드 호출1 = " + isSame(str1, str2));

        System.out.println("리터럴 비교");
        String str3 = "Hello";
        String str4 = "Hello";
        System.out.println("메서드 호출2 = " + isSame(str3, str4));

    }

    public static boolean isSame(String x, String y){
        //return x == y;
        return x.equals(y);
    }
}
