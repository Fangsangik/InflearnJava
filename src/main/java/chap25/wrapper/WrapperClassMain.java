package chap25.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        //Integer newInteger = new Integer(10); // 미래에 삭제 예정, valueOf를 사용해라
        Integer objInteger = Integer.valueOf(10);// -128 ~ 127 자주 사용하는 숫자 값 (풀을 사용)

        Long objLong = Long.valueOf(100);
        Double objDouble = Double.valueOf(10.5);

        //System.out.println("newInteger = " + newInteger);
        System.out.println("objInteger = " + objInteger);

        System.out.println("objLong = " + objLong);
        System.out.println("objDouble = " + objDouble);

        System.out.println("내부 값 읽기");
        int intVal = objInteger.intValue();
        System.out.println("intVal = " + intVal);

        long longVal = objLong.longValue();
        System.out.println("longVal = " + longVal);

        System.out.println("비교");
        //System.out.println("== " + (newInteger == objInteger));
        //System.out.println("== " + (newInteger.equals(objInteger)));


    }
}
