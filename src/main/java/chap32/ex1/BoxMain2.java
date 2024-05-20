package chap32.ex1;

public class BoxMain2 {
    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10); //오토 박싱
        Integer integer = (Integer) integerBox.get();
        System.out.println("integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("Hello");
        String str = (String) stringBox.get();;
        System.out.println("str = " + str);

        // 인수 잘못 전달 시
        integerBox.set("문자 100");
        Integer rst = (Integer) integerBox.get(); //String -> Integer 캐스팅 예외
        System.out.println("rst = " + rst);

        /*
        java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer
        (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
	    at chap32.ex1.BoxMain2.main(BoxMain2.java:17)
         */
    }
}
