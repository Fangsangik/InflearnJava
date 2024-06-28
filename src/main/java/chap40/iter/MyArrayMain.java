package chap40.iter;

import java.util.Iterator;

public class MyArrayMain {
    public static void main(String[] args) {
        MyArray array = new MyArray(new int[]{1,2,3,4}); //반복 할 수 있는 애다.

        Iterator<Integer> iterator = array.iterator(); //반복자를 반환
        System.out.println("iterator = " + iterator);
        while (iterator.hasNext()){
            Integer next = iterator.next(); //iterator의 next를 호출
            System.out.println("next = " + next);
        }

        System.out.println("for-each 사용");
        for (int val : array) {
            System.out.println("val = " + val);
        }
    }
}
