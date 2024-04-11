package chap23.immutable.address;

import chap23.immutable.Address;

public class MemberMainV2 {
    public static void main(String[] args) {

        ImmutableAddress address = new ImmutableAddress("서울");

        MemberV2 memberA = new MemberV2("황A", address);
        MemberV2 memberB = new MemberV2("황B", address);

        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

        //memberB의 주소를 부산으로 변경
        memberB.setAddress(new ImmutableAddress("부산"));
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);
    }
}
