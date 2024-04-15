package chap24.method;

import java.util.Objects;

public class StringUtilsMain1 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object o = new Object();
        String str = "Hello Java";

        //valueof 메서드
        String numString = String.valueOf(num);
        System.out.println("numString = " + numString);

        String boolString = String.valueOf(bool);
        System.out.println("boolString = " + boolString);

        String objString = String.valueOf(o);
        System.out.println("objString = " + objString);

        String numString2 = "" + num;
        System.out.println("numString2 = " + numString2);


        //toCharArray 메서드
        char[] strCharArray = str.toCharArray();
        System.out.println("strCharArray = " + strCharArray);
        for (char c : strCharArray) {
            System.out.println("c = " + c);
        }
        System.out.println();
     }
}
