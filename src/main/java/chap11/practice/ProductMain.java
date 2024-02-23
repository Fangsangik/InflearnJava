package chap11.practice;

import java.util.ArrayList;
import java.util.List;

public class ProductMain {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];
        orders[0] = createOrder("두부", 2000, 2);
        orders[1] = createOrder("김치", 5000, 1);
        orders[2] = createOrder("콜라", 1500, 2);

        printOrder(orders);
        int total = getTotalAmount(orders);
        System.out.println("total = " + total);
    }

    public static ProductOrder createOrder(String name, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.name = name;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void printOrder(ProductOrder[] orders) {
        for (ProductOrder order :
                orders) {

            if (order != null) {
                System.out.println("상품명 : " + order.name + "가격 : " + order.price + "수량 : " + order.quantity);
            }
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int total = 0;
        for (ProductOrder order :
                orders) {
            if (order != null) {
                total += order.price * order.quantity;
            }
        }
        return total;
    }
}
