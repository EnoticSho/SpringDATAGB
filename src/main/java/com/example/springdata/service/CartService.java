package com.example.springdata.service;

import com.example.springdata.entity.Cart;
import com.example.springdata.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {
    @Autowired
    private Cart cart;


    public void removeProduct(int id) {
        cart.removeProduct(id);
    }

    public void clearCart() {
        cart.clearTheCart();
    }

    public void addProduct(Product product) {
        cart.addProductToCart(product);
    }

    public List<Product> showcart() {
        return cart.getList();
    }
}
