package chap25.wrapper;

public class AutoboxingMain2 {
    public static void main(String[] args) {
        //primitive -> wrapper
        int val = 7;
        Integer boxedVal = val; //오토 박싱

        //wrapper -> primitive
        int unboxedValue = boxedVal; //오토 언박싱

        System.out.println("boxedVal = " + boxedVal);
        System.out.println("unboxedValue = " + unboxedValue);
    }
}
