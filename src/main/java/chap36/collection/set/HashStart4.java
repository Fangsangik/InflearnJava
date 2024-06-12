package chap36.collection.set;

import java.util.Arrays;

public class HashStart4 {

    private static final int CAPACTIY = 10;

    public static void main(String[] args) {

        System.out.println("hashIndex(1) = " + hashIndex(1));
        System.out.println("hashIndex(1) = " + hashIndex(2));
        System.out.println("hashIndex(1) = " + hashIndex(5));
        System.out.println("hashIndex(1) = " + hashIndex(8));
        System.out.println("hashIndex(1) = " + hashIndex(14));
        System.out.println("hashIndex(1) = " + hashIndex(99));

        Integer[] inputArray = new Integer[CAPACTIY];
        add(inputArray, 1);
        add(inputArray, 2);
        add(inputArray, 5);
        add(inputArray, 8);
        add(inputArray, 14);
        add(inputArray, 99);
        System.out.println("inputArray.toString() = " + Arrays.toString(inputArray));

        int searchVal = 14;
        int hashIndex = hashIndex(searchVal);
        System.out.println("hashIndex = " + hashIndex);
        Integer rst = inputArray[hashIndex];
        System.out.println("rst = " + rst);
    }

    public static void add(Integer[] inputArray, int val) {
        int hashIndex = hashIndex(val);
        inputArray[hashIndex] = val;
    }

    static int hashIndex(int val){
        return val % CAPACTIY;
    }
}
