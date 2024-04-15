package chap24.changing;

public class MethodChangingMain1 {
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        adder.add(1);
        adder.add(2);
        adder.add(3);

        int rst = adder.getValue();
        System.out.println("rst = " + rst);
    }
}
