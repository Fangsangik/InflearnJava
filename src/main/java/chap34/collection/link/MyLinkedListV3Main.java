package chap34.collection.link;

public class MyLinkedListV3Main {
    public static void main(String[] args) {
        MyLinkedListV3<String> list = new MyLinkedListV3<>();
        list.add("a");
        list.add("b");
        list.add("c");
        String s = list.get(0);
        System.out.println("s = " + s);

        MyLinkedListV3<Integer> integerList = new MyLinkedListV3<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);

        Integer integer = integerList.get(0);
        System.out.println("integer = " + integer);

    }
}
