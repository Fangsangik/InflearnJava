package chap18.extends1.access.child;

import chap18.extends1.access.parent.Parent;

public class Child extends Parent {
    public void call(){
        publicVal = 1;
        protectedVal = 1;
        //defaultVal = 1; -> 같은 페키지 안에 있어야 호출 가능
        //privateVal = 1; -> 접근 불가

        publicVal();
        protectedVal();

        printParent(); //public -> 자기 자신 꺼기에 호출 가능

    }
}
