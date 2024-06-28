package chap40.compare;

import java.util.Arrays;

public class SortMain2 {
    public static void main(String[] args) {
        Integer[] array = {3, 2, 1};
        System.out.println("array.toString() = " + array.toString());

        System.out.println("Comparator 비교");
        Arrays.sort(array, new AscComparator());
        System.out.println("AscComparator : " + Arrays.toString(array));

        Arrays.sort(array, new DesComparator());
        System.out.println("DesComparator : " + Arrays.toString(array));

        Arrays.sort(array, new AscComparator().reversed());
        System.out.println("AscComparator.reversed" + Arrays.toString(array));

        System.out.println("기본 정렬 후");
        Arrays.sort(array);
        System.out.println("Arrays.toString(array) = " + Arrays.toString(array));

    }
}
