package chap23.immutable.address;

import chap23.immutable.Address;

public class RefMain1 {
    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유 가능
        ImmutableAddress a = new ImmutableAddress("seoul");
        ImmutableAddress b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

//        b.setValue("부산"); 값 변경 불가능
        b = new ImmutableAddress("부산");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
