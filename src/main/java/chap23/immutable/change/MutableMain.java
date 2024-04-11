package chap23.immutable.change;

public class MutableMain {
    public static void main(String[] args) {
        MutableObj mutableObj = new MutableObj(10);
        mutableObj.add(20);

        //계산 이후의 값은 사라진다.
        System.out.println("mutableObj.getValue() = " + mutableObj.getValue());
    }
}
