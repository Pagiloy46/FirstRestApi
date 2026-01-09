package com.example.first_rest_api.product.service;

import com.example.first_rest_api.product.domain.Product;
import com.example.first_rest_api.product.repository.ProductRepository;
import com.example.first_rest_api.product.support.dto.ProductCreateRequest;
import com.example.first_rest_api.product.support.dto.ProductResponse;
import com.example.first_rest_api.product.support.exception.ProductNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public ProductResponse create(ProductCreateRequest request) {
        Product product = new Product();
        product.setName(request.getName());

        Product saved = productRepository.save(product);
        return new ProductResponse(saved.getId(), saved.getName());
    }

    public ProductResponse getById(Long id) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException(id));

        return new ProductResponse(product.getId(), product.getName());
    }

    public List<ProductResponse> getAll() {
        return productRepository.findAll()
                .stream()
                .map(p -> new ProductResponse(p.getId(), p.getName()))
                .toList();
    }

    public ProductResponse update(Long id, ProductCreateRequest request) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException(id));

        product.setName(request.getName());
        Product updated = productRepository.save(product);

        return new ProductResponse(updated.getId(), updated.getName());
    }

    public void delete(Long id) {
        if (!productRepository.existsById(id)) {
            throw new ProductNotFoundException(id);
        }
        productRepository.deleteById(id);
    }
}
