package chap29.anonymous.ex.ex2;

import java.util.Random;

public class Ex2 {
    public static void hellDice(){
        System.out.println("프로그램 시작");

        int randomVal = new Random().nextInt(6) + 1;
        System.out.println("randomVal = " + randomVal);

        System.out.println("프로그램 종료");
    }

    public static void hellSum() {
        System.out.println("프로그램 시작");

        for (int i = 0; i <= 3; i++) {
            System.out.println("i = " + i);
        }
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        hellDice();
        hellSum();
    }
}
