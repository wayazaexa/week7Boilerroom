package org.example.Models;

import org.example.Discounts.DiscountPolicy;

public record Receipt(Cart cart) {

    private double getRawTotalCost() {
        return cart.getCartList().stream()
                .mapToDouble(entry -> entry.product().price() * entry.quantity())
                .sum();
    }

    private double getTotalCost(DiscountPolicy discountPolicy) {
        return getRawTotalCost() * discountPolicy.getDiscount();
    }

    public String toString(DiscountPolicy discountPolicy) {
        String roundedRawTotal = String.format("%.2f", getRawTotalCost());
        String roundedTotal = String.format("%.2f", getTotalCost(discountPolicy));
        return "Receipt:\n"
                + cart +
                "\nCost: " + roundedRawTotal +
                "\nDiscount: " + discountPolicy +
                "\nTotal cost: " + roundedTotal;
    }
}
