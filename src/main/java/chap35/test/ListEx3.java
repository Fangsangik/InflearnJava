package chap35.test;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();

        System.out.print("n개의 정수를 입력하세요 (종료 0) : ");

        while (true) {
            int input = sc.nextInt();

            if (input == 0) {
                break;
            }
            num.add(input);
        }
        int total = 0;
        for (int i = 0; i < num.size(); i++) {
            total += i;
        }

        double average = (double) total / num.size();
        System.out.println("입력한 정수 합계 " + total);
        System.out.println("입력한 정수의 평균 " + average);
    }
}

