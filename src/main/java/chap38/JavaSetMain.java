package chap38;

import java.util.*;

public class JavaSetMain {
    public static void main(String[] args) {
        run(new HashSet<>()); //O(1)
        run(new LinkedHashSet<>());// o(1)
        run(new TreeSet<>());//logN
    }

    private static void run(Set<String> set) {
        System.out.println("set.getClass() = " + set.getClass());
        set.add("C");
        set.add("B");
        set.add("A");
        set.add("1");
        set.add("2");

        Iterator<String> iter = set.iterator();
        while (iter.hasNext()){ //다음 데이터가 있는지 확인
            System.out.print(iter.next() + " "); // 다음 데이터 반환
        }
        System.out.println();
    }
}
