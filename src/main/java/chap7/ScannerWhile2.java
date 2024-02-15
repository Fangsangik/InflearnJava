package chap7;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번쨰 숫자와 두번쨰 숫자가 0이면 프로그램 종료 ");

        while (true) {
            System.out.print("숫자를 입력하세요 :");
            int a = sc.nextInt();

            System.out.print("숫자를 입력하세요 :");
            int b = sc.nextInt();

            if (a == 0 && b == 0) {
                System.out.print("프로그램을 종료");
                break;
            }

            int sum = a + b;
            System.out.print("숫자의 합은 =" + sum);
        }
    }
}
