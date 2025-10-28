package org.example.Models;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cart {
    private final List<CartEntry> cartList = new ArrayList<>();

    public List<CartEntry> getCartList() {
        return cartList;
    }

    public void add(Product product, int quantity) {
        cartList.add(new CartEntry(product, quantity));
    }

    @Override
    public String toString() {
        return cartList.stream()
                .map(CartEntry::toString)
                .collect(Collectors.joining("\n"));
    }
}
