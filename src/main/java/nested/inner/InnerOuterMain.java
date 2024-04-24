package nested.inner;

public class InnerOuterMain {
    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter();

        //인스턴스에 접근 할 수 있다 -> 인스턴스를 알아야 한다.
        InnerOuter.Inner inner = outer.new Inner();
        inner.print();

        System.out.println("inner.getClass() = " + inner.getClass());
    }
}
