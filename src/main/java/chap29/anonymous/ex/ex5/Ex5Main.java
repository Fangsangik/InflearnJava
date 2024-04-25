package chap29.anonymous.ex.ex5;

import chap29.anonymous.ex.ex1.RollDice;

import java.util.Random;

public class Ex5Main {

    public static void hello(RollDice rollDice) {
        System.out.println("프로그램 시작");
        rollDice.run();
        System.out.println("프로그램 종료");
    }


    public static void main(String[] args) {
        hello(() -> {
            int random = new Random().nextInt(6) + 1;
            System.out.println("random = " + random);
        });

        hello(() -> {
            for (int i = 0; i <= 3; i++) {
                System.out.println("i = " + i);
            }
        });
    }
}
