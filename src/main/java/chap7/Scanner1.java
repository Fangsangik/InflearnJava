package chap7;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열을 입력하세요 : ");
        String str1 = sc.nextLine(); //입력을 String으로
        System.out.println("입력한 문자열 = " + str1);

        System.out.print("정수를 출력하세요 : ");
        int num = sc.nextInt(); //입력은 int로
        System.out.println("입력한 정수 = " + num);

        System.out.print("실수를 입력하세요 : ");
        double v = sc.nextDouble();
        System.out.println("입력한 실수 = " + v);
    }
}
