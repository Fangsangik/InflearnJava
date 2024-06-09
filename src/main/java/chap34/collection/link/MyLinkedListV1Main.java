package chap34.collection.link;

public class MyLinkedListV1Main {
    public static void main(String[] args) {
        MyLinkedListV1 list = new MyLinkedListV1();
        System.out.println("데이터 추가");
        list.add("a");
        System.out.println(list);
        list.add("b");
        System.out.println(list);
        list.add("c");
        System.out.println(list);

        System.out.println("다양한 기능");
        System.out.println("list.size() = " + list.size());
        System.out.println("list.get(1) = " + list.get(1));
        System.out.println("list.indexOf(\"c\") = " + list.indexOf("c"));
        System.out.println("list.set(2, \"Z\") = " + list.set(2, "Z"));
        System.out.println(list);

        System.out.println("범위 초과");
        list.add("d");
        list.add("f");
        System.out.println(list);

//        //범위 초과, capacity가 늘어나지 않으면 예외 발생
//        list.add("f");
//        System.out.println(list);
    }
}
