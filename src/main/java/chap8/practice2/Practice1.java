package chap8.practice2;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int cnt = sc.nextInt();

        int[] arr = new int[cnt];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("숫자를 입력하세요");
            arr[i] = sc.nextInt();
        }

        int minNum = Integer.MAX_VALUE;
        int maxNum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minNum){
                minNum = arr[i];
            }

            if (arr[i] > maxNum){
                maxNum = arr[i];
            }
        }

        System.out.print("가장 작은 정수 : " + minNum);
        System.out.println();
        System.out.println("가장 큰 정수 : "  + maxNum);
    }
}
