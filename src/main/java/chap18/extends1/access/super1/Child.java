package chap18.extends1.access.super1;

import chap18.extends1.access.super1.Parent;

public class Child extends Parent {
    public String val = "child";

    @Override
    public void hello() {
        System.out.println("Child.hello");
    }

    public void call(){
        System.out.println("this val = " + this.val); //현재 내 타입
        System.out.println("super val = " + super.val); //부모 타입에서 찾는것

        this.hello();
        super.hello();
    }
}
