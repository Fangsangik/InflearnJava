package chap33.array;

public class MyArrayListV3BadMain {
    public static void main(String[] args) {
        MyArrayListV3 list = new MyArrayListV3();

        list.add(1);
        list.add(2);
        list.add("문자");
        System.out.println("list = " + list);

        //Object 반환 -> 다운 캐스팅 필요
        Object o = list.get(0);

        //ClassCastingException 발생
        Object o1 = list.get(2);
        System.out.println("o1 = " + o1);
    }
}
