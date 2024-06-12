package chap36.collection.set;

import java.util.Arrays;

public class HashStart1 {
    public static void main(String[] args) {
        Integer[] inputArray = new Integer[4];
        inputArray[0] = 1;
        inputArray[1] = 2;
        inputArray[2] = 3;
        inputArray[3] = 4;

        System.out.println("Arrays.toString(inputArray) = " + Arrays.toString(inputArray));

        int searchVal = 8;

        for (int inputVal : inputArray) {
            if (inputVal == searchVal){
                System.out.println(inputVal);
            }
        }
     }
}
