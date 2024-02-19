package chap8.practice;

import java.util.Scanner;

public class Practice03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("5개 정수를 입력하세요");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("입력한 정수를 역으로 출력");
        for (int i = arr.length; i >0 ; i--) {
            System.out.println(arr[i]);
            if (i > 0){
                System.out.println(", ");
            }
        }
    }
}
