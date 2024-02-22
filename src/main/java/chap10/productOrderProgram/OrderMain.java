package chap10.productOrderProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderMain {
    public static void main(String[] args) {
        Order order = new Order();
        order.productName = "두부";
        order.price = 2000;
        order.quantity = 2;

        Order order1 = new Order();
        order1.productName = "김치";
        order1.price = 5000;
        order1.quantity = 1;

        Order order2 = new Order();
        order2.productName = "콜라";
        order2.price = 1500;
        order2.quantity = 2;

        Order[] orders = {order, order1, order2};
        int total = 0;
        for (Order o :
                orders) {
            System.out.println("상품명 : " + o.productName + " 가격 : " + o.price + " 수량 : " + o.quantity);
            total += o.price * o.quantity;
            System.out.println(" 총액 : " + total);
        }
    }
}
