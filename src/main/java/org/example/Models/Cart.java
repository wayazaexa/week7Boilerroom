package org.example.Models;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<CartEntry> cartList = new ArrayList<>();

    public Cart(List<CartEntry> cartList) {
        this.cartList = cartList;
    }

    public List<CartEntry> getCartList() {
        return cartList;
    }
}
