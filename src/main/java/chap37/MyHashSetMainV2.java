package chap37;

import chap37.member.Member;

public class MyHashSetMainV2 {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        Member hi = new Member("hi");
        Member jpa = new Member("JPA");
        Member java = new Member("java");
        Member spring = new Member("spring");

        System.out.println("hi = " + hi.hashCode());
        System.out.println("jpa = " + jpa.hashCode());
        System.out.println("java = " + java.hashCode());
        System.out.println("spring.hashCode() = " + spring.hashCode());

        set.add(hi);
        set.add(jpa);
        set.add(java);
        set.add(spring);
        System.out.println("set = " + set);

        Member searchVal = new Member("JPA");
        boolean rst = set.contains(searchVal);
        System.out.println("set.contains(" + searchVal + ")=" + rst);
    }
}
