package chap36.collection.set;

public class MyHashSetV0Main {
    public static void main(String[] args) {
        MyHashSetV0 set = new MyHashSetV0();
        set.add(1); //O(1)
        set.add(2); //O(n)
        set.add(3); //O(n)
        set.add(4); //O(n)
        set.add(5); //O(n)
        set.add(3); //O(n)

        boolean rst = set.add(4);
        System.out.println("rst = " + rst);
        System.out.println(set);

        //O(n)
        System.out.println("set.contain(3) = " + set.contain(3));
        System.out.println("set.contain(3) = " + set.contain(99));
    }
}
