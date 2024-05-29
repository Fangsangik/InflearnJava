package chap33.array;

import java.util.Arrays;

public class ArrayMain2 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        System.out.println(Arrays.toString(arr));

        //배열 첫번째 위치에 추가
        System.out.println("배열 첫번째 위치에 3 추가 ");
        int newVal = 3;
        addFirst(arr, newVal);
        System.out.println(Arrays.toString(arr));

        //index 위치에 추가
        //기존 배열의 데이터 한칸씩 뒤로 밀고 배열의 index 위치에 추가
        System.out.println("배열 index(2) 위치에 4 추가");
        int index =3;
        int val = 4;

        addAtIndex(arr, index, val);

        System.out.println("배열의 마지막 위치에 5 추가");
        addLast(arr, 5);
        System.out.println(Arrays.toString(arr));
    }

    private static void addLast(int[] arr, int newVal) {
        arr[arr.length - 1] = newVal;
    }

    private static void addAtIndex(int[] arr, int index, int val) {
        //인덱스 가지만 이동
        for (int i = arr.length - 1; i > index ; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = arr[val];
    }

    public static void addFirst(int[] arr, int newVal){
        //3 -> 2 -> 1 -> 0
        for (int i = arr.length - 1; i > 0 ; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = newVal;
    }
}
