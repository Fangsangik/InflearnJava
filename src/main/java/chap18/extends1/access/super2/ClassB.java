package chap18.extends1.access.super2;

public class ClassB extends ClassA{
    public ClassB(int a){
        this(a, 0);
        System.out.println("a = " + a);
    }

    public ClassB(int a, int b){
        super();
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
