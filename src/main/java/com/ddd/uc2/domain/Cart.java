package com.ddd.uc2.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * @author srikanth
 * @since 04/02/2023
 */
public class Cart {
    private List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "products=" + products +
                '}';
    }
}
