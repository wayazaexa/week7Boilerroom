package org.example;

import org.example.Discounts.VipDiscount;
import org.example.Exceptions.InvalidCustomerEmailException;
import org.example.Exceptions.InvalidPriceException;
import org.example.Models.Cart;
import org.example.Models.Checkout;
import org.example.Models.Customer;
import org.example.Models.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    public static void main(String[] args) {
        Logger log = LoggerFactory.getLogger(App.class);
        try {
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
        } catch (InvalidCustomerEmailException | InvalidPriceException e) {
            log.error(e.getMessage());
        }
    }
}
