package chap40.compare;

import java.util.Comparator;

public class DesComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        System.out.println("o1 = " + o1 + " o2 = " + o2);
        //-1을 곱하면 결과가 오름차순과 반대로 출력
        return (o1 < o2) ? -1 : ((o1 == o2) ? 0 : 1) * -1;
    }
}
