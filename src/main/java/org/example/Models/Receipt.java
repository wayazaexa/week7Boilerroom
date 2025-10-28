package org.example.Models;

public record Receipt(Cart cart, Customer customer) {

    public double getRawTotalCost() {
        return cart.getCartList().stream()
                .mapToDouble(entry -> entry.product().price() * entry.quantity())
                .sum();
    }

    public double getTotalCost() {
        return getRawTotalCost() * customer.discountPolicy().getDiscount();
    }

    @Override
    public String toString() {
        String roundedTotal = String.format("%.2f", getTotalCost());
        String roundedRawTotal = String.format("%.2f", getRawTotalCost());
        return "Receipt:\n"
                + cart +
                "\nCost: " + roundedRawTotal +
                "\nDiscount: " + customer.discountPolicy() +
                "\nTotal cost: " + roundedTotal;
    }
}
