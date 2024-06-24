package chap37;

public class MyHashSetV1Main {
    public static void main(String[] args) {
        MyHashSetV1 set = new MyHashSetV1();
        set.add(1);
        set.add(2);
        set.add(5);
        set.add(8);
        set.add(14);
        set.add(99);
        set.add(9);
        System.out.println("set = " + set);

        //검색
        int searchVal = 9;
        boolean rst = set.contains(searchVal);
        System.out.println("set contains (" + searchVal + ") = " + rst);

        boolean removeRst = set.remove(searchVal);
        System.out.println("removeRst = " + removeRst);
        System.out.println("set = " + set);
    }
}
