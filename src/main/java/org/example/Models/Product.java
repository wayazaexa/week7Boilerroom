package org.example.Models;

public record Product(String name, double price) {

    @Override
    public String toString() {
        return name +
                ", " + price +
                " kr";
    }
}
