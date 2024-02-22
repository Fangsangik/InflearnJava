package chap9.practice2;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        int balance = 0;
        System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int amount;

        switch (a) {
            case 1:
                System.out.println("입금액을 입력하세요");
                amount = sc.nextInt();
                balance = add(balance, amount);
                break;

            case 2:
                System.out.println("출금액을 입력하세요");
                amount = sc.nextInt();
                balance = withdraw(balance, amount);
                break;

            case 3:
                System.out.println("현 잔액 통장");
                balance = getBalance(balance);
                break;

            case 4:
                System.out.println("프로그램을 종료합니다");
                break;

            default:
                System.out.println("잘 못 입력하셨습니다");
                break;
        }
    }

    public static int add(int balance, int money) {
        balance += money;
        System.out.println(money + "원을 입금하셨습니다. 현재 잔액 : " + balance);
        return balance;
    }

    public static int withdraw(int balance, int money) {
        if (balance < money) {
            return 0;
        }
        System.out.println(money + "원을 출금하셨습니다. 현재 잔액 : " + balance);
        return balance - money;
    }

    public static int getBalance(int balance) {
        System.out.println("현재 잔액 : " + balance);
        return balance;
    }
}
