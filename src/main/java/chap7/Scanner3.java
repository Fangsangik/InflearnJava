package chap7;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자 :");
        int a = sc.nextInt();

        System.out.print("두 번째 숫자 :");
        int b = sc.nextInt();

        if (a > b) {
            System.out.print("더 큰 수는 " + a);
        } else if (a < b){
            System.out.print("더 큰수는 " + b);
        } else {
            System.out.println("두 수 같음");
        }
    }
}
