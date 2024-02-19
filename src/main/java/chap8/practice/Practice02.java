package chap8.practice;

import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("5개 정수를 입력하세요 :");
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("출력");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            if (i < numbers.length - 1){
                System.out.println(", ");
            }
        }

    }
}
