package chap37;

public class MyHashSetV2Main {
    public static void main(String[] args) {
        MyHashSetV2 setV2 = new MyHashSetV2(10);
        setV2.add("A");
        setV2.add("B");
        setV2.add("C");
        setV2.add("AB");
        setV2.add("SET");
        System.out.println("setV2 = " + setV2);

        System.out.println("A.hashCode = " + "A".hashCode());
        System.out.println("B.hashCode = " + "B".hashCode());
        System.out.println("AB.hashCode = " + "AB".hashCode());
        System.out.println("SET.hashCode = " + "SET".hashCode());

        String searchVal = "SET";
        boolean rst = setV2.contains(searchVal);
        System.out.println("set.contains(" + searchVal + ")= " + rst);
    }
}
