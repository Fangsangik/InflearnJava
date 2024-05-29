package chap33.array;

import java.util.Arrays;

public class ArrayMain1 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        System.out.println("index 입력");
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        System.out.println(Arrays.toString(arr)); // 참조값 제외하고 출력

        System.out.println("index 변경 ");
        arr[2] = 10;
        System.out.println(Arrays.toString(arr));

        System.out.println("index 조회");
        System.out.println("arr[2] = " + arr[2]);

        System.out.println("배열 검색");
        System.out.println(Arrays.toString(arr));

        //배열에 데이터가 많을 수록 시간 오래 걸린다.
        int val = 10;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr["  + i + " ] " + arr[i]);
            if (arr[i] == val) {
                System.out.println("val = " + val);
                break;
            }
        }
    }
}
