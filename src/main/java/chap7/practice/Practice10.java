package chap7.practice;

import java.util.Scanner;

public class Practice10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1 :상품입력 , 2: 결제, 3: 프로그램 종료 : ");

        while (true) {
            int menuNum = sc.nextInt();
            int total = 0;

            if (menuNum == 1) {
                sc.nextLine();

                System.out.print("상품명을 입력하세요 : ");
                String productName = sc.nextLine();
                System.out.println();

                System.out.print("상품의 가격을 입력하세요 : ");
                int price = sc.nextInt();
                System.out.println();

                System.out.print("구매 수량을 입력하세요 : ");
                int quantity = sc.nextInt();
                System.out.println();

                total += price * quantity;

                System.out.print("상품명 :" + productName + " 가격 : " + price + " 수량 : " + quantity + " 합계 : " + total);

            } else if (menuNum == 2) {
                System.out.print("총 비용" + total);
                total = 0;

            } else if (menuNum == 3) {
                System.out.println("프로그램을 종료합니다");
                break;
            } else {
                System.out.print("올바른 menu를 선택해주세요");
            }

        }
    }
}
