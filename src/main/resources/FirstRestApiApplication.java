package com.example.first_rest_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
        info = @Info(
                title = "Product API",
                version = "1.0",
                description = "REST API for managing products"
        )
)
@SpringBootApplication
public class FirstRestApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(FirstRestApiApplication.class, args);
    }
}
