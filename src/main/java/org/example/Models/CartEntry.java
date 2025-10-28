package org.example.Models;

public record CartEntry(Product product, int quantity) {

    @Override
    public String toString() {
        return product +
                " x" + quantity;
    }
}
