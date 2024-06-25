package chap38.practice;

import java.lang.reflect.Array;
import java.util.*;

public class Index {
    public static void main(String[] args) {
        Set<Integer> list1 = new HashSet<>(Arrays.asList(1,2,3,4,5));
        Set<Integer> list2 = new HashSet<>(Arrays.asList(3,4,5,6,7));

        Set<Integer> addAll = new HashSet<>(list1);
        addAll.addAll(list2);

        Set<Integer> diff = new HashSet<>(list1);
        diff.removeAll(list2);

        Set<Integer> retainAll = new HashSet<>(list1);
        retainAll.retainAll(list2);

        System.out.println("addAll = " + addAll);
        System.out.println("diff = " + diff);

    }
}
