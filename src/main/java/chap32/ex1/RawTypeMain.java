package chap32.ex1;

public class RawTypeMain {
    public static void main(String[] args) {
        //GenericBox<Object> integerBox = new GenericBox<>(); //권장
        GenericBox integerBox = new GenericBox(); //아무것도 넣지 않으면 Object 값
        integerBox.set(10);
        Integer rst = (Integer) integerBox.get();
        System.out.println("rst = " + rst);

    }
}
