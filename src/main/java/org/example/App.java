package org.example;

import org.example.Discounts.VipDiscount;
import org.example.Factories.CustomerFactory;
import org.example.Factories.ProductFactory;
import org.example.Models.*;
import org.example.Repositories.CustomerRepository;
import org.example.Repositories.ProductRepository;

public class App {
    public static void main(String[] args) {
        ProductFactory productFactory = new ProductFactory();
        ProductRepository productRepository = new ProductRepository();
        CustomerFactory customerFactory = new CustomerFactory();
        CustomerRepository customerRepository = new CustomerRepository();

        productRepository.addProduct("tomato", productFactory.createProduct("Tomato", 4.49));
        productRepository.addProduct("cucumber", productFactory.createProduct("Cucumber", 6.99));
        productRepository.addProduct("avocado", productFactory.createProduct("Avocado", 9.99));
        productRepository.addProduct("bread", productFactory.createProduct("Bread", 24.49));

        customerRepository.addCustomer(customerFactory.createCustomer("Omar", "omaraman@gmail.com", new VipDiscount()));

        Cart cart = new Cart();
        cart.add(productRepository.getProducts().get("tomato"), 5);
        cart.add(productRepository.getProducts().get("cucumber"), 1);
        cart.add(productRepository.getProducts().get("avocado"), 2);
        cart.add(productRepository.getProducts().get("bread"), 1);

        Checkout checkout = new Checkout();
        checkout.checkout(cart, customerRepository.getCustomers().getFirst());
    }
}
