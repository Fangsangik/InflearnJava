package chap40.compare;

import java.util.Comparator;

public class AscComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        System.out.println("o1 = " + o1 + " o2 = " + o2);
        return (o1 < o2) ? -1 : ((o1 == o2) ? 0 : 1);
    }
}
