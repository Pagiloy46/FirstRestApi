package com.example.first_rest_api.product.service;

import com.example.first_rest_api.product.domain.Product;
import com.example.first_rest_api.product.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product createProduct(String name) {
        Product product = new Product();
        product.setName(name);
        return productRepository.save(product);
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id);
    }
}
