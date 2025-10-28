package org.example.Discounts;

public class ElderlyDiscount implements DiscountPolicy {
    private final double discount = 0.15;

    @Override
    public double getDiscount() {
        return 1 - discount;
    }

    @Override
    public String toString() {
        return "Elderly discount: " + discount * 100 + "%";
    }
}
