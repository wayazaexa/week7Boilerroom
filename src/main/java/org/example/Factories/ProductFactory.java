package org.example.Factories;

import org.example.Exceptions.InvalidPriceException;
import org.example.Models.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProductFactory {
    Logger log = LoggerFactory.getLogger(ProductFactory.class);

    public Product createProduct(String name, double price) {
        try {
            return new Product(name, price);
        } catch (InvalidPriceException e) {
            log.error(e.getMessage());
            return null;
        }
    }
}
