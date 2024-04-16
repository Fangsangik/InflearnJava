package chap25.practice1;

public class WrapperTest3 {
    public static void main(String[] args) {
        String str = "100";

        Integer strInt = Integer.valueOf(str);
        int num = Integer.parseInt(str);
        Integer strInt1 = Integer.valueOf(strInt);

        System.out.println("strInt = " + strInt);
        System.out.println("num = " + num);
        System.out.println("strInt1 = " + strInt1);
    }
}
