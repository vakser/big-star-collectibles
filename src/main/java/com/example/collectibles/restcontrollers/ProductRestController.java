package com.example.collectibles.restcontrollers;

import com.example.collectibles.beans.Product;
import com.example.collectibles.dao.ProductRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductRestController {
    private ProductRepository productRepository;

    public ProductRestController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/bigstar/api/products")
    public List<Product> allProducts(){
        return (List<Product>) productRepository.findAll();

    }

    @GetMapping("/bigstar/api/products/{id}")
    public Product getProductById(@PathVariable("id") String id){
        return productRepository.findById(Integer.valueOf(id)).get();
    }
}
