package chap35.test;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("n개의 정수를 입력하세요 (종료 0) : ");

        while (true) {
            int num = sc.nextInt();

            if (num == 0) {
                break;
            }

            list.add(num);
        }

        System.out.print("출력");
        for (Integer integer : list) {
            System.out.println(integer);
            if (integer < list.size() - 1) {
                System.out.println(", ");
            }
        }
    }
}
