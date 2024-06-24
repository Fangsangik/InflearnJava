package chap37.member;

import chap37.MyHashSetV2;

public class HashAndEqualsMain2 {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);

        MemberOnlyHash m1 = new MemberOnlyHash("A");
        MemberOnlyHash m2 = new MemberOnlyHash("A");
        System.out.println("m1.hasCode() = " + m1.hashCode());
        System.out.println("m2.hasCode() = " + m2.hashCode());
        System.out.println("m1.equals(m2) = " + m1.equals(m2));

        set.add(m1);
        set.add(m2);
        System.out.println("set = " + set);

        //검색 실패
        MemberNoHashNoEq searchVal = new MemberNoHashNoEq("A");
        System.out.println("searchVal.hashCode() = " + searchVal.hashCode());
        boolean contains = set.contains(searchVal);
        System.out.println("contains = " + contains);

    }
}
