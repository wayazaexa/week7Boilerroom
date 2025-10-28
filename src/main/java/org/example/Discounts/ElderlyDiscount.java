package org.example.Discounts;

public class ElderlyDiscount implements DiscountPolicy {
    @Override
    public double discount() {
        return 0.15;
    }
}
