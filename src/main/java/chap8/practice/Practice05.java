package chap8.practice;

import java.util.Scanner;

public class Practice05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("입력 받을 숫자의 개수를 입력하세요 : ");
        int cnt = sc.nextInt();

        int[] arr = new int[cnt];
        System.out.println(cnt + "개의 정수를 입력하세요 :");
        int total = 0;
        double avg = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] =sc.nextInt();
            total += arr[i];
        }

        System.out.println(total);

        avg = (double) total / cnt;
        System.out.println(avg);
    }
}
