package chap32.ex1;

public class BoxMain3 {
    public static void main(String[] args) {

        GenericBox<Integer> integerBox = new GenericBox<Integer>(); //생성 시점에 타입이 결정된다.
        integerBox.set(10);
        Integer integer = integerBox.get();
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.set("hello");
        String str = stringBox.get();
        System.out.println("str = " + str);

        //모든 타입 적용 가능
        GenericBox<Double> doubleBox = new GenericBox<>();
        doubleBox.set(1.12);
        Double num = doubleBox.get();
        System.out.println("num = " + num);

        GenericBox<Integer> integerBox2 = new GenericBox<>(); //추론

    }
}
