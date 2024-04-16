package chap25.clazz;

public class ClassCreateMain {
    public static void main(String[] args) throws Exception {
        Class helloClass = Hello.class;
        Class helloClass1 = Class.forName("lang.clazz,Hello");

        Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance();
        String rst = hello.Hello();

        System.out.println("rst = " + rst);
    }
}
