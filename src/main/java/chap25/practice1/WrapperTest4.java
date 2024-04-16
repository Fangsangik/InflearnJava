package chap25.practice1;

public class WrapperTest4 {
    public static void main(String[] args) {
        String str = "100";

        Integer strNum = Integer.valueOf(str);
        System.out.println("strNum = " + strNum);

        int num1 = strNum;
        System.out.println("num1 = " + num1);

        Integer num2 = num1;
        System.out.println("num2 = " + num2);
    }
}
