package chap49.practice;

import java.util.concurrent.ExecutionException;

public class OldOrderServiceMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        String orderNo = "Order#1234"; // 예시 주문 번호
        NewOrderService newOrderService = new NewOrderService();
        newOrderService.order(orderNo);
    }
}