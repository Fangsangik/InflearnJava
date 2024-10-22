package chap48;

import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class SetMain {
    public static void main(String[] args) {
        Set<Integer> set = new CopyOnWriteArraySet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        System.out.println("set = " + set);

        Set<Integer> skip = new ConcurrentSkipListSet<>();
        skip.add(1);
        skip.add(2);
        skip.add(3);
        System.out.println("skip = " + skip);


    }
}
