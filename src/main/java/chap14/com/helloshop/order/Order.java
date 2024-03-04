package chap14.com.helloshop.order;

import chap14.com.helloshop.product.Product;
import chap14.com.helloshop.user.User;

public class Order {
    User user;
    Product product;

    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
    }
}
