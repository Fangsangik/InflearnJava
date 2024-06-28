package chap40.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortMain4 {
    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 20);
        MyUser myUser3 = new MyUser("c", 10);

        List<MyUser> list = new ArrayList<>();
        list.add(myUser1);
        list.add(myUser2);
        list.add(myUser3);
        System.out.println("기본 데이터");
        System.out.println("list = " + list);


        System.out.println("Comparable 기본 정렬");
        list.sort(null); // 비교자 사용 안하려면 null
        //Collections.sort(list);
        System.out.println("list = " + list);

        System.out.println("IdComparator 정렬");
        list.sort(new IdComparator()); //IdComparator 기준으로 정렬
        //Collections.sort(list, new IdComparator());
        System.out.println("list = " + list);
    }
}
