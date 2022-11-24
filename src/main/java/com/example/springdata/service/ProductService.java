package com.example.springdata.service;

import com.example.springdata.entity.Product;
import com.example.springdata.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> showAllProducts() {
        return productRepository.findAll();
    }

    public Product showProductByID(int id) {
        return productRepository.findById(id).orElseThrow();
    }

    public void saveProduct(Product product) {
        productRepository.save(product);
    }

    public void deleteById(int id) {
        productRepository.deleteById(id);
    }
}
