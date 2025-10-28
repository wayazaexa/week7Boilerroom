package org.example.Models;

import org.example.Discounts.DiscountPolicy;
import org.example.Exceptions.InvalidCustomerEmailException;

public record Customer(String name, String email, DiscountPolicy discountPolicy) {
    public Customer(String name, String email, DiscountPolicy discountPolicy) {
        this.name = name;
        if (email == null || email.isBlank()) {
            throw new InvalidCustomerEmailException("Customer e-mail cannot be empty");
        }
        this.email = email;
        this.discountPolicy = discountPolicy;
    }
}
