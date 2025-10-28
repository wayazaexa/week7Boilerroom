package org.example.Factories;

import org.example.Discounts.DiscountPolicy;
import org.example.Exceptions.InvalidCustomerEmailException;
import org.example.Models.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomerFactory {
    Logger log = LoggerFactory.getLogger(ProductFactory.class);

    public Customer createCustomer(String name, String email, DiscountPolicy discountPolicy) {
        try {
            return new Customer(name, email, discountPolicy);
        } catch (InvalidCustomerEmailException e) {
            log.error(e.getMessage());
            return null;
        }
    }
}
