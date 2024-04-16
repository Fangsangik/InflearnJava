package chap25.practice1;

public class WrapperTest1 {
    public static void main(String[] args) {
        String str = "10";
        String str1 = "20";

        int num = Integer.parseInt(str);
        int num1 = Integer.parseInt(str1);

        int sum = num + num1;
        System.out.println(sum);
    }
}
