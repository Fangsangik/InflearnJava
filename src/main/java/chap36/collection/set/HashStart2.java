package chap36.collection.set;

import java.util.Arrays;

public class HashStart2 {
    public static void main(String[] args) {
        Integer[] inputArray = new Integer[10];
        inputArray[1] = 1;
        inputArray[2] = 2;
        inputArray[5] = 5;
        inputArray[8] = 8;

        System.out.println("Arrays.toString(inputArray) = " + Arrays.toString(inputArray));

        int searchVal = 8;

        Integer rst = inputArray[searchVal];
        System.out.println(rst);
    }
}
