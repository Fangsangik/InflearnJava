package chap36.collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class HashStart5 {

    private static final int CAPACTIY = 10;

    public static void main(String[] args) {

        //링크드 리스트를 넣을 수 있는 배열 (배열 안에 배열)
        LinkedList<Integer>[] list = new LinkedList[CAPACTIY];
        for (int i = 0; i < CAPACTIY; i++) {
            list[i] = new LinkedList<>();
        }

        add(list, 1);
        add(list, 2);
        add(list, 5);
        add(list, 99);
        add(list, 8);
        add(list, 14);
        add(list, 9);
        System.out.println("list = " + Arrays.toString(list));

        int searchVal = 9;
        boolean contains = contains(list, searchVal);
        System.out.println("list.contains( " + searchVal + ") = " + contains);
    }

    private static boolean contains(LinkedList<Integer>[] list, int searchVal) {
        int hashIndex = hashIndex(searchVal);
        //중복으로 들어갈 수 있게 자료 구조를 넣어주어야 한다.
        LinkedList<Integer> bucket = list[hashIndex];
        return bucket.contains(searchVal);
    }

    public static void add(LinkedList<Integer>[] buckets, int val) {
        int hashIndex = hashIndex(val);
        LinkedList<Integer> bucket = buckets[hashIndex];
        //중복 check
        if (!bucket.contains(val)) {
            bucket.add(val);
        }
    }

    static int hashIndex(int val){
        return val % CAPACTIY;
    }
}
