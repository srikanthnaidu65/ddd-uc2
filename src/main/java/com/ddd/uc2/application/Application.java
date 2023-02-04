package com.ddd.uc2.application;

import com.ddd.uc2.domain.Cart;
import com.ddd.uc2.domain.Product;

import java.util.List;

/**
 * @author srikanth
 * @since 04/02/2023
 */
public class Application {
    public static void main(String[] args) {
        Cart cart = new Cart();
        Product applePencil = new Product("Apple Pencil");
        cart.add(applePencil);

        Product headphone = new Product("Sony Wireless headphone");
        cart.add(headphone);

        System.out.println("--------------------------------------------------------");
        System.out.println("Cart = " + cart);
        List<Product> products = cart.getProducts();
        System.out.println("products = " + products);
        System.out.println("--------------------------------------------------------");
    }
}
