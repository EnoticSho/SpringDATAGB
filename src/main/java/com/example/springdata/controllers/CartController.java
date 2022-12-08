package com.example.springdata.controllers;

import com.example.springdata.entity.Product;
import com.example.springdata.service.CartService;
import com.example.springdata.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @Autowired
    private ProductService productService;

    @GetMapping()
    public List<Product> showCart() {
        return cartService.showcart();
    }

    @GetMapping("/add/{id}")
    public List<Product> addProductToCart(@PathVariable int id) {
        Product product = productService.showProductByID(id);
        cartService.addProduct(product);
        return cartService.showcart();
    }

    @GetMapping("/clear")
    public List<Product> clearCart() {
        cartService.clearCart();
        return cartService.showcart();
    }

    @GetMapping("/remove/{id}")
    public List<Product> removeProductFromCart(@PathVariable int id) {
        cartService.removeProduct(id);
        return cartService.showcart();
    }
}
