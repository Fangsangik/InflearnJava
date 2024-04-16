package chap25.wrapper;

public class AutoboxingMain1 {
    public static void main(String[] args) {
        //primitive -> wrapper
        int val = 7;
        Integer boxedVal = Integer.valueOf(val);

        //wrapper -> primitive
        int unboxedValue = boxedVal.intValue();

        System.out.println("boxedVal = " + boxedVal);
        System.out.println("unboxedValue = " + unboxedValue);
    }
}
