package chap37;

import chap37.member.MySet;

public class MyHashSetV3Main {
    public static void main(String[] args) {
        MySet<String> set = new MyHashSetV3<>();

        set.add("A");
        set.add("B");
        set.add("C");
        System.out.println("set = " + set);

        String searchVal = "A";
        boolean contains = set.contains(searchVal);
        System.out.println("set.contains(" + searchVal + ")=" + contains);

    }
}
