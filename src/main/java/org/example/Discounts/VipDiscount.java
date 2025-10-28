package org.example.Discounts;

public class VipDiscount implements DiscountPolicy {
    private final double discount = 0.2;

    @Override
    public double getDiscount() {
        return 1 - discount;
    }

    @Override
    public String toString() {
        return "Vip discount: " + discount * 100 + "%";
    }
}
