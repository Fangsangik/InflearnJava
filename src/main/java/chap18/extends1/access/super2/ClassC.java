package chap18.extends1.access.super2;

public class ClassC extends ClassB{

    //B의 경우 기본생성자 X
    public ClassC(){
        super(10, 20); // 생략 불가능
        System.out.println("ClassC 생성자 ");
    }
}
