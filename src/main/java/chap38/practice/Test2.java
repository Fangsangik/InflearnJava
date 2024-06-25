package chap38.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        Set<Integer> set = new LinkedHashSet<>(Arrays.asList(inputArr));

        for (Integer integer : set) {
            System.out.println(integer);
        }
    }
}
