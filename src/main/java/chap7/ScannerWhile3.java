package chap7;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (true){
            System.out.print("숫자를 입력하세요 : ");
            int a = sc.nextInt();

            if (a == 0){
                System.out.println("프로그램 종료");
                break;
            }
            sum += a;
        }

        System.out.println("sum = " + sum);
    }
}
