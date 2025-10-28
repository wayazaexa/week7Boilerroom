package org.example;

import org.example.Discounts.VipDiscount;
import org.example.Models.Cart;
import org.example.Models.Checkout;
import org.example.Models.Customer;
import org.example.Models.Product;

public class App {
    public static void main(String[] args) {
        Product tomato = new Product("tomato", 4.49);
        Product cucumber = new Product("cucumber", 6.99);
        Product avocado = new Product("avocado", 9.99);
        Product bread = new Product("bread", 24.49);

        Customer customer = new Customer("Omar", "omaraman@gmail.com", new VipDiscount());
        Cart cart = new Cart();

        cart.add(tomato, 5);
        cart.add(cucumber, 1);
        cart.add(avocado, 2);
        cart.add(bread, 6);

        Checkout checkout = new Checkout();
        checkout.checkout(cart, customer);
    }
}
