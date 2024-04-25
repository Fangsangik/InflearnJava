package chap29.anonymous.ex.ex1;

import java.util.Random;

public class Ex1Main {

    public static void hello(RollDice rollDice){
        System.out.println("프로그램 시작");
        rollDice.run();
        System.out.println("프로그램 종료");
    }

    static class Dice implements RollDice {

        @Override
        public void run() {
            System.out.println("프로그램 시작");
            int random = new Random().nextInt(6) + 1;
            System.out.println("random = " + random);

        }
    }

    static class Sum implements RollDice{

        @Override
        public void run() {
            for (int i = 0; i <=3 ; i++) {
                System.out.println("i = " + i);
            }
        }
    }

    public static void main(String[] args) {
        hello(new Dice());
        hello(new Sum());
    }
}
