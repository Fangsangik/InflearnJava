package chap40.compare;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortMain3 {
    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 20);
        MyUser myUser3 = new MyUser("c", 10);

        MyUser[] userArray = {myUser1, myUser2, myUser3};
        System.out.println("기본 데이터");
        System.out.println(Arrays.toString(userArray));

        System.out.println("Comparable 기본 정렬");
        Arrays.sort(userArray);
        System.out.println(Arrays.toString(userArray));

        System.out.println("IdComparator 정렬");
        Arrays.sort(userArray, new IdComparator());
        System.out.println(Arrays.toString(userArray));

        System.out.println("IdComparator().reversed() 정렬");
        Arrays.sort(userArray, new IdComparator().reversed());
        System.out.println(Arrays.toString(userArray));
    }
}
