package chap18.extends1.access.parent;

public class Parent {
    public int publicVal;
    protected int protectedVal;
    int defaultVal;
    protected int privateVal;

    public void publicVal(){
        System.out.println("Parent.publicMethod");
    }

    protected void protectedVal(){
        System.out.println("protectedVal = " + protectedVal);
    }

    void defaultVal(){
        System.out.println("defaultVal = " + defaultVal);
    }

    private void privateMethod(){
        System.out.println("privateVal = " + privateVal);
    }

    public void printParent(){
        System.out.println("Parent 안");
        System.out.println("publicVal = " + publicVal);
        System.out.println("protectedVal = " + protectedVal);
        System.out.println("defaultVal = " + defaultVal);
        System.out.println("privateVal = " + privateVal);

        //부모 메서드 안에서 모두 접근 가능
        defaultVal();
        privateMethod();
    }
}
