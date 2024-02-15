package chap7.practice;

import java.util.Scanner;

public class Practice8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("상품 가격을 입력하세요 : ");
            int price = sc.nextInt();

            if (price == -1){
                System.out.println("프로그램 종료");
                break;
            }

            System.out.println("구매하려는 수량을 입력하세요 : ");
            int quantity = sc.nextInt();

            int totalPrice= price * quantity;
            System.out.println("총 비용 :" + totalPrice);

        }
    }
}
