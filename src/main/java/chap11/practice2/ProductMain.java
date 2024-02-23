package chap11.practice2;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Product[] products = new Product[n];
        for (int i = 0; i < products.length; i++) {
            System.out.print((i + 1) + "번 째 주문 정보를 입력하세요");

            System.out.print("상품명 : " );
            String productName = sc.nextLine();

            System.out.println("가격 : ");
            int price = sc.nextInt();

            System.out.println("수량 : ");
            int quantity = sc.nextInt();
            products[i] = createProduct(productName, price, quantity);
        }

        print(products);
        int total = totalAmount(products);
        System.out.println(total);

    }

    static Product createProduct(String name, int price, int quantity) {
        Product product = new Product();
        product.name = name;
        product.price = price;
        product.quantity = quantity;
        return product;
    }

    static void print(Product[] product) {
        for (Product p : product) {
            if (p != null) {
                System.out.println("상품명 : " + p.name + "가격 : " + p.price + "수량 : " + p.quantity);
            }
        }
    }

    static int totalAmount(Product[] products) {
        int total = 0;
        for (Product product : products) {
            total = product.price * product.quantity;
        }
        return total;
    }
}
