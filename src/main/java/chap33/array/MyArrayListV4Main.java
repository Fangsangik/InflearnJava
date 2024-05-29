package chap33.array;

public class MyArrayListV4Main {
    public static void main(String[] args) {
        MyArrayListV4<String> stringList = new MyArrayListV4<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");

        String s = stringList.get(0);
        System.out.println("s = " + s);

        MyArrayListV4<Integer> list = new MyArrayListV4<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Integer integer = list.get(0);
        System.out.println("integer = " + integer);
    }
}
