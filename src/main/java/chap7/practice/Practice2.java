package chap7.practice;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요");
        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println("입력한 숫자" + num + "는 짝수 입니다");
        } else {
            System.out.println("입력한 숫자" + num + "홀수 입니다");

        }
    }
}
