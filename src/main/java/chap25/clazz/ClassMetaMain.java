package chap25.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMetaMain {
    public static void main(String[] args) throws Exception {
        //클래스 조회
        Class clazz = String.class; //클래스에서 조회
        Class clazz1 = new String().getClass(); //인스턴스 조회
        Class clazz2 = Class.forName("java.lang.String");


        //필드 조회
        Field[] fields = clazz.getFields();
        for (Field field : fields) {
            System.out.println("field = " + field.getType() + " " + field.getName());
        }

        //모든 메서드 출력
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println("declaredMethod = " + declaredMethod);
        }

        //상위 클래스 정보 출력
        System.out.println("clazz = " + clazz.getSuperclass().getName());

        //인터페이스 정보 출력
        Class[] interfaces = clazz.getInterfaces();
        for (Class anInterface : interfaces) {
            System.out.println("anInterface = " + anInterface.getName());
        }
    }
}
