package chap40.compare;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class SortMain5 {
    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 20);
        MyUser myUser3 = new MyUser("c", 10);

        TreeSet<MyUser> tree = new TreeSet<>();
        tree.add(myUser1);
        tree.add(myUser2);
        tree.add(myUser3);
        System.out.println("기본 데이터");
        System.out.println("tree = " + tree);

        TreeSet<MyUser> tree2 = new TreeSet<>(new IdComparator());
        tree2.add(myUser1);
        tree2.add(myUser3);
        System.out.println("IdComparator 정렬");
        System.out.println("tree2 = " + tree2);

    }
}
