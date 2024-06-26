package chap39.practice.shopping;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    private Map<Product, Integer> cartMap = new HashMap<>();


    public void add(Product product, int cnt) {
        int quantity = cartMap.getOrDefault(product, 0);
        cartMap.put(product, quantity + cnt);
    }

    public void printAll() {
        for (Map.Entry<Product, Integer> productIntegerEntry : cartMap.entrySet()) {
            System.out.println("상품 " + productIntegerEntry.getKey() + " 수량 " + productIntegerEntry.getValue() );
        }
    }

    public void minus(Product product, int cnt) {
        int minusQuantity = cartMap.getOrDefault(product, 0);

        int newQ = minusQuantity - cnt;

        if (newQ == 0) {
            cartMap.remove(product);
        } else {
            cartMap.put(product, newQ);
        }
    }
}
