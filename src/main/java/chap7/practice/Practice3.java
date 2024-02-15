package chap7.practice;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("음식 이름을 알려주세요 : ");
        String foodName = sc.nextLine();

        System.out.print("음식의 가격을 알려주세요 : ");
        int foodPrice = sc.nextInt();

        System.out.print("음식의 수량을 알려주세요 : ");
        int foodQuantity = sc.nextInt();

        int totalPrice = foodQuantity * foodPrice;

        System.out.println(foodName + " " + foodQuantity + "를 주문하셨습니다" + "총 각격은 " + totalPrice + "원 입니다");

    }
}
