package com.example.first_rest_api.product.api;

import com.example.first_rest_api.product.service.ProductService;
import com.example.first_rest_api.product.support.dto.ProductCreateRequest;
import com.example.first_rest_api.product.support.dto.ProductResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(
        name = "Products",
        description = "Operations related to products"
)
@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @Operation(
            summary = "Create a new product",
            description = "Creates a product and returns its id"
    )
    @ApiResponse(
            responseCode = "200",
            description = "Product created successfully",
            content = @Content(
                    schema = @Schema(implementation = ProductResponse.class)
            )
    )
    @PostMapping
    public ProductResponse create(
            @Valid @RequestBody ProductCreateRequest request
    ) {
        return productService.create(request);
    }

    @Operation(
            summary = "Update product",
            description = "Updates existing product by id"
    )
    @ApiResponse(
            responseCode = "200",
            description = "Product updated successfully",
            content = @Content(
                    schema = @Schema(implementation = ProductResponse.class)
            )
    )
    @ApiResponse(
            responseCode = "404",
            description = "Product not found"
    )
    @PutMapping("/{id}")
    public ProductResponse update(
            @PathVariable Long id,
            @Valid @RequestBody ProductCreateRequest request
    ) {
        return productService.update(id, request);
    }

    @Operation(
            summary = "Get all products",
            description = "Returns list of all products"
    )
    @ApiResponse(
            responseCode = "200",
            description = "Products found"
    )
    @GetMapping
    public List<ProductResponse> getAll() {
        return productService.getAll();
    }

    @Operation(
            summary = "Get product by id",
            description = "Returns product if it exists"
    )
    @ApiResponse(
            responseCode = "200",
            description = "Product found",
            content = @Content(
                    schema = @Schema(implementation = ProductResponse.class)
            )
    )
    @ApiResponse(
            responseCode = "404",
            description = "Product not found"
    )
    @GetMapping("/{id}")
    public ProductResponse getById(@PathVariable Long id) {
        return productService.getById(id);
    }

    @Operation(
            summary = "Delete product",
            description = "Deletes product by id"
    )
    @ApiResponse(
            responseCode = "204",
            description = "Product deleted"
    )
    @ApiResponse(
            responseCode = "404",
            description = "Product not found"
    )
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        productService.delete(id);
    }
}
