package chap33.array;

public class MyArrayListV3Main {
    public static void main(String[] args) {
        MyArrayListV3 list = new MyArrayListV3();

        list.add("a");
        System.out.println("list = " + list);
        list.add("b");
        System.out.println("list = " + list);
        list.add("c");
        System.out.println("list = " + list);

        System.out.println("addLast");
        list.add(3, "addLast");
        System.out.println("list = " + list);

        System.out.println("addFirst");
        list.add(0, "addFirst");
        System.out.println("list = " + list);

        Object remove = list.remove(4);
        System.out.println("remove = " + remove);
        System.out.println("list = " + list);

        Object remove1 = list.remove(0);
        System.out.println("remove1 = " + remove1);
        System.out.println("list = " + list);
    }
}
