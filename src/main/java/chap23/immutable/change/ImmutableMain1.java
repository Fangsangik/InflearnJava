package chap23.immutable.change;

public class ImmutableMain1 {
    public static void main(String[] args) {
        ImmutableObj mutableObj = new ImmutableObj(10);
        ImmutableObj ob = mutableObj.add(20);

        //계산 이후의 값은 사라진다.
        System.out.println("mutableObj = " + mutableObj.getValue());
        System.out.println("ob.getValue() = " + ob.getValue());
    }
}
