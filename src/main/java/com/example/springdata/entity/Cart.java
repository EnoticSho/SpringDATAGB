package com.example.springdata.entity;

import com.example.springdata.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("singleton")
public class Cart {
    private final List<Product> list = new ArrayList<>();
    private int amount;

    public List<Product> getList() {
        return list;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void addProductToCart(Product product) {
        amount += product.getCost();
        list.add(product);
    }

    public void clearTheCart() {
        list.clear();
    }

    public void removeProduct(int id) {
        list.removeIf(product -> product.getId() == id);
    }

}
