package chap23.immutable.address;

import chap23.immutable.Address;

public class MemberMainV1 {
    public static void main(String[] args) {

        Address address = new Address("서울");

        MemberV1 memberA = new MemberV1("황A", address);
        MemberV1 memberB = new MemberV1("황B", address);

        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

        //memberB의 주소를 부산으로 변경
        memberB.getAddress().setValue("부산");
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);
    }
}
