package chap7.practice;

import java.util.Scanner;

public class Practice9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int sum = 0;

        while (true) {
            System.out.println("숫자를 입력하세요. :");
            int a = sc.nextInt();
            if (a == -1){
                System.out.println("입력 중단");
                break;
            }
            sum += a;
            cnt++;
            double avg =(double) a / cnt;

            System.out.print("입력한 숫자들의 합계 : " + sum);
            System.out.print("입력한 수들의 평균 : " + avg);
        }
    }
}
