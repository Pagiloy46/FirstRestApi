package com.example.first_rest_api.product.repository;

import com.example.first_rest_api.product.domain.Product;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ProductRepository {

    private final Map<Long, Product> database = new HashMap<>();
    private Long idCounter = 1L;

    public Product save(Product product) {
        product.setId(idCounter);
        database.put(idCounter, product);
        idCounter++;
        return product;
    }

    public Product findById(Long id) {
        return database.get(id);
    }
}
