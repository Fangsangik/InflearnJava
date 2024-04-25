package chap29.anonymous.ex.ex3;

import chap29.anonymous.ex.ex1.RollDice;

import java.util.Random;

public class Ex3Main {

    public static void hello(RollDice rollDice){
        System.out.println("프로그램 시작");
        rollDice.run();
        System.out.println("프로그램 종료");
    }


    public static void main(String[] args) {
        RollDice rollDice = new RollDice() {
            @Override
            public void run() {
                System.out.println("프로그램 시작");
                int random = new Random().nextInt(6) + 1;
                System.out.println("random = " + random);
            }
        };
        RollDice rollDice1 = new RollDice() {
            @Override
            public void run() {
                for (int i = 0; i <=3 ; i++) {
                    System.out.println("i = " + i);
                }
            }
        };


        hello(rollDice);
        hello(rollDice1);
    }
}
