package chap8.practice;

import java.util.Scanner;

public class Practice04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("5개의 정수를 입력하세요");
        int[] num = new int[5];

        int totalSum = 0;
        double avg = 0;
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
            totalSum += num[i];
        }
        System.out.println(totalSum);
        avg = (double) totalSum / 5;
        System.out.println(avg);
    }
}
