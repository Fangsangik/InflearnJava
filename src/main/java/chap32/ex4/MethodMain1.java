package chap32.ex4;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.objMethod(i);

        System.out.println("명시적 타입 인자 전달");
        Integer rst = GenericMethod.<Integer>genericMethod(i);

        //호출 할때 타입 메서드 지정
        Integer integerVal = GenericMethod.<Integer>numberMethod(10);
        Double doubleVal = GenericMethod.<Double>numberMethod(20.0);

        System.out.println("타입 추론");
        Integer rst1 = GenericMethod.genericMethod(i);
        Integer integerVal1 = GenericMethod.numberMethod(10);
        Double doubleVal1 = GenericMethod.numberMethod(20.0);
    }
}
