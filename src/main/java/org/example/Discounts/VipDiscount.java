package org.example.Discounts;

public class VipDiscount implements DiscountPolicy {
    @Override
    public double discount() {
        return 0.2;
    }
}
