package chap40.iter;



import java.util.*;

public class JavaIterableMain {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Set<Integer> set = new HashSet<>();
        //HashSet -> keyIterator를 가져온다. 
        set.add(1);
        set.add(2);
        set.add(3);

        printAll(list.iterator());
        printAll(set.iterator());

        foreach(list);
        //list만 받으면 list 전용

        foreach(set);
        //set 전용
        //java에서 foreach가 일어날 수 있는 조건 -> iterable이 적용 되어 있어야 한다.
        //iterable을 받으면 범용성이 높아진다.
    }

    //iterator만 있으면 순환 가능 
    private static void printAll(Iterator<Integer> iterator) {
        System.out.println("iterator.getClass() = " + iterator.getClass());
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    private static void foreach(Iterable<Integer> iterable) {
        System.out.println("iterator.getClass() = " + iterable.getClass());
        for (Integer i : iterable) {
            System.out.println("i = " + i);
        }
    }
}
