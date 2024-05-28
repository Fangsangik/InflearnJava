package chap32.ex4;

public class GenericMethod {
    public static Object objMethod(Object obj){
        System.out.println("object print: " + obj);
        return obj;
    }

    //특정 타입을 받아서 그대로 사용, 메서드 안에서만 사용하는 한정적
    public static <T> T genericMethod(T t) {
        System.out.println("generic print : " + t);
        return t;
    }

    //특정 타입을 지정, 상한 범위 지정
    public static <T extends Number> T numberMethod(T t){
        System.out.println("bound print : " + t);
        return t;
    }
}
