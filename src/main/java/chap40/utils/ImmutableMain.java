package chap40.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableMain {
    public static void main(String[] args) {
        //불변
        List<Integer> list = List.of(1,2,3);
        
        //가변
        ArrayList<Integer> mutable = new ArrayList<>(list);
        mutable.add(4);
        System.out.println("mutable = " + mutable);
        System.out.println("mutable.getClass() = " + mutable.getClass());
        
        //불변 
        List<Integer> list2 = Collections.unmodifiableList(mutable);
        System.out.println("list2.getClass() = " + list2.getClass());
        // list2.add(4); => 불변이기에 변경 불가능
    }
}
