package chap40.compare;

import java.util.Arrays;

public class SortMain1 {
    public static void main(String[] args) {
        Integer[] array = {3, 2, 1};
        System.out.println("array.toString() = " + array.toString());

        System.out.println("기본 정렬 후");
        Arrays.sort(array);
        System.out.println("Arrays.toString(array) = " + Arrays.toString(array));

    }
}
