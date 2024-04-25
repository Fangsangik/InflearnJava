package chap29.anonymous.ex.ex2;

import chap29.anonymous.ex.ex1.RollDice;

import java.util.Random;

public class Ex2Main {

    public static void hello(RollDice rollDice){
        System.out.println("프로그램 시작");
        rollDice.run();
        System.out.println("프로그램 종료");
    }


    public static void main(String[] args) {
         class Dice implements RollDice {

            @Override
            public void run() {
                System.out.println("프로그램 시작");
                int random = new Random().nextInt(6) + 1;
                System.out.println("random = " + random);

            }
        }

        class Sum implements RollDice{

            @Override
            public void run() {
                for (int i = 0; i <=3 ; i++) {
                    System.out.println("i = " + i);
                }
            }
        }

        hello(new Dice());
        hello(new Sum());
    }
}
