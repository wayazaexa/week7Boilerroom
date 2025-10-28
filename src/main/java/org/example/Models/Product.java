package org.example.Models;

import org.example.Exceptions.InvalidPriceException;

public record Product(String name, double price) {
    public Product(String name, double price) {
        this.name = name;
        if (price < 0) {
            throw new InvalidPriceException("Price cannot be negative");
        }
        this.price = price;
    }

    @Override
    public String toString() {
        return name +
                ", " + price +
                " kr";
    }
}
