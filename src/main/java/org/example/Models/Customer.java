package org.example.Models;

import org.example.Discounts.DiscountPolicy;

public record Customer(String name, String email, DiscountPolicy discountPolicy) {
}
