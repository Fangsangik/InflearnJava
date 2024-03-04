package chap14.com.helloshop.order;

import chap14.com.helloshop.product.Product;
import chap14.com.helloshop.user.User;

public class OrderService {
    User user = new User();
    Product product = new Product();
    Order order = new Order(user, product);
}
