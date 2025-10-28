package org.example.Repositories;

import org.example.Models.Product;

import java.util.*;

public class ProductRepository {
    private final Map<String, Product> products = new HashMap<>();

    public Map<String, Product> getProducts() { return products; }

    public void addProduct(String name, Product product) {
        if (product != null) {
            products.put(name, product);
        }
    }
}
